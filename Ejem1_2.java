public class Ejem1_2 {

        public static void main(String[] args) {

            boolean booleanPrimitive = true;
            Boolean booleanClass = Boolean.valueOf(myInt); // La conversión.
            booleanPrimitive = booleanClass.booleanValue(); // La extracción.

            byte bytePrimitive = 20;
            Byte byteClass = Byte.valueOf(bytePrimitive); // Conversión.
            bytePrimitive = byteClass.byteValue(); // Extracción.

            short shortPrimitiva = 200;
            Short shortClass = Short.valueOf(shortPrimitiva); //Conversión.
            shortPrimitiva = shortClass.shortValue(); // Extracción.

            char charPrimitive = 'B';
            Character charClass = Character.valueOf(charPrimitive);
            charPrimitive = charClass.charValue();

            int inPrimitive = 2000;
            Integer intClass = Integer.valueOf(intPrimitive);
            intPrimitive = intClass.intValue();

            long longPrimitive = 20000000000L;
            Long longClass = Long.valueOf(longPrimitive);
            longPrimitive = longClass.longValue();

            float floatPrimitive = 3.141592F;
            Float floatClass = Float.valueOf(floatPrimitive);
            floatPrimitive = floatClass.floatValue();

            double doublePrimitive = 10.123456789;
            Double doubleClass = Double.valueOf(doublePrimitive);
            doublePrimitive = doubleClass.doubleValue();


        }
}
