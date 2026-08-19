from PIL import Image
 
# 밝음 -> 어두움 순서. 원하는 느낌에 따라 골라 쓰세요.
CHARS_LIGHT = " .,'`:;~-+*"          # 흐릿한 스케치 느낌
CHARS_DENSE = " .:-=+*#%@"           # 또렷한 대비
 
RATIO = 0.5   # 콘솔 글자는 세로로 길어서 높이를 절반으로
 
 
def convert(path, width=100, chars=CHARS_LIGHT):
    img = Image.open(path).convert("L")
    h = max(1, int(img.height * width / img.width * RATIO))
    img = img.resize((width, h))
    px = img.load()
    n = len(chars) - 1
    lines = []
    for y in range(h):
        row = "".join(chars[int((255 - px[x, y]) / 255 * n)] for x in range(width))
        lines.append(row.rstrip())
    return "\n".join(lines)
 
 
if __name__ == "__main__":
    jobs = [
        ("chef",  100, CHARS_LIGHT),
        ("chef",   60, CHARS_DENSE),
        ("shop",  100, CHARS_LIGHT),
        ("shop",   60, CHARS_DENSE),
        ("pot",    60, CHARS_DENSE),
    ]
    for name, w, cs in jobs:
        art = convert(f"/home/claude/{name}.png", w, cs)
        tag = "light" if cs is CHARS_LIGHT else "dense"
        out = f"/home/claude/out/{name}_{w}_{tag}.txt"
        with open(out, "w", encoding="utf-8") as f:
            f.write(art)
        print("=" * 70)
        print(out)
        print(art)