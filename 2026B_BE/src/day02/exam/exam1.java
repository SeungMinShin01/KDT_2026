package day02.exam;

public class exam1 {
    public static void main(String[] args) {
         // [1] 자동 타입 변환 : byte -> short -> int -> long -> float
    byte bytevalue = 100;           // byte 타입에 bytevalue 변수명으로 100 리터럴 대입했다.
    short shortvalue = bytevalue;   // [가능] byte -> short [*자료유지, 타입변경]
    int intvalue = shortvalue;      // [가능] short -> int [*자료유지, 타입변경]
    long longvalue = intvalue;      // [가능] int -> long [*자료유지, 타입변경]
    float floatvalue = longvalue;    // [가능] long -> float [*자료유지, 타입변경]
    double doublevalue = floatvalue; // [가능] float -> double [*자료유지, 타입변경]
    
    // * 연산(계산) 중에 자동 타입변환 , byte/short 연산결과 => int
    byte b1 = 10;
    byte b2 = 20;
    int result = b1 + b2; // byte + byte => int

    short s1 = 30; 
    int i1 = 40;
    int result2 = b2 + s1; // byte + sh1ort => int
    int result3 = i1 + i1; // int + int => int
    long l1 = 50L;
    long result4 = i1 + l1; //int + long => l1ong( 더 큰 타입으로 결과 타입 반환 )
    float f1 = 60.1f;
    double d1 = 70.2;
    float result5 = i1 + f1;
    double result6 = i1 + d1;
    
    // [2] 강제(명시적) 타입 변환 : byte <- short <- int <- long <- float <- double, 큰것 -> 작은것, *자료손실*
    double dvalue = 3.14;
    float fvalue = (float)dvalue;
    long lvalue = (long)fvalue;
    int ivalue = (int)lvalue;
    short svalue = (short)ivalue;
    byte bvalue = (byte)svalue;

    }
   
}


/*
    boolean - true false
    char - 문자 1개
    String - 문자열
    byte - -127~128
    short - +- 3만
    int +- 21억
    long  21억이상
    float
    double
*/