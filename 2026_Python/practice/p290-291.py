def mul(*values):
    output = 1
    for i in range( len(values) ) :
        output *= values[i]
    return output
print(mul(5, 7, 9, 10))

# 실행결과 3150

def function( valueA=10, valueB=20, *values) :
    pass
function(1, 2, 3, 4, 5)