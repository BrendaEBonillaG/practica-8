public class Ejem1_3 {

        public static void main(String[] args) {

            Boolean booleanClass = true; //Boxing.
            boolean booleanPrimitive = booleanClass; //Unboxing.
            System.out.println(booleanPrimitive);

            Byte byteClass = 20; //Boxing.
            byte bytePrimitive = byteClass; //Unboxing.
            System.out.println(bytePrimitive);

            Short shortClass = 200;
            short shortPrimitive = shortClass;
            System.out.println(shortPrimitive);

            Character charClass = 'B';
            char charPrimitive = charClass;
            System.out.println(charPrimitive);

            Integer intClass = 2000;
            int intPrimitive = intClass;
            System.out.println(intPrimitive);

            Long longClass = 20000000000L;
            long longPrimitive = longClass;
            System.out.println(longPrimitive);

            Float floatClass = 3.141592F;
            float floatPrimitive = floatClass;
            System.out.println(floatPrimitive);

            Double doubleClass = 10.123456789;
            double doublePrimitive = doubleClass;
            System.out.println(doublePrimitive);


        }

}
