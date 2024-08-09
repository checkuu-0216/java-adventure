package wrapper;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {

//        int a = 1;
//        Integer a1 =1;
//
//        long b = 1;
//        Long b1 = 1L;
//
//        double c = 1.1;
//        Double c1 = 1.1;
//
//        boolean d = true;
//        Boolean d1 = true;

        // 코드 Integer 뜯어보기
//        Integer a = new Integer(1);

        Integer a = Integer.valueOf(1);
        Integer b = Integer.valueOf(10);
//캐싱기능 cache values in the range -128 to 127
        Integer a1 = Integer.valueOf(128);
        Integer a2 = Integer.valueOf(128);
        boolean ret = (a1 == a2);
        System.out.println("ret = " + ret);


        int compareTo = a.compareTo(b);
        System.out.println(compareTo);
        boolean equals = a.equals(b);
        System.out.println(equals);
        String string = a.toString();
        System.out.println(string);

        int max = Integer.max(1,2);
        int sum = Integer.sum(1,2);

        //오버플로우 언더 플로우
        int maxValue = Integer.MAX_VALUE;
        System.out.println("maxValue = " + maxValue);

        int minValue = Integer.MIN_VALUE;
        System.out.println("minValue = "+minValue);

        /*
         * 기본형 연산 vs 래퍼 클래스 연산
         */
        long startTime, endTime;
        long n = 100_000_000;

        int primitiveSum = 0;
        startTime =System.currentTimeMillis();
        for(int i = 0; i< n; i++){
            primitiveSum += 1;
        }
        endTime = System.currentTimeMillis();
        long ret1 = (endTime - startTime);
        System.out.println("기본형 연산에 걸린 시간 : "+ ret1 + "ms");

        //래퍼 클래스 연산
        Integer wrapperSum = 0;
        startTime = System.currentTimeMillis();
        for(int i = 0; i <n; i++){
            wrapperSum += 1;
        } endTime = System.currentTimeMillis();
        long ret2 = (endTime - startTime);
        System.out.println("래퍼형 연산에 걸린 시간 : " + ret2 + "ms");

        //커스텀 래퍼 클래스 연산
        IntBox myWrapperSum = new IntBox(0);
        startTime = System.currentTimeMillis();
        for(int i = 0; i<n; i++) {
            IntBox newIntBox = myWrapperSum.increment(1);
            myWrapperSum = newIntBox;
        }
        endTime = System.currentTimeMillis();
        long ret3 = (endTime-startTime);
        System.out.println("커스텀 래퍼형 연산에 걸린 시간 : " +ret3 + "ms");

        // 오토 박싱
        int intValue = 10;
        Integer wrapValue = intValue;

        //오토 언박싱
        int intValue2 = wrapValue;
    }
}
