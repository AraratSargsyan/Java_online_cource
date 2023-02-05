package chapter3;
/* Դասը հասարակ/պրիմիտիվ/ փոփխակաների կամ տիպերի մասին է*/
public class Lesson1 {
    public static void main(String[] args) {
        System.out.print("Hello World\n");
        System.out.print("Hello World\n");
        //Պրիմիտիվ փոփոխականներ, սրանք մի քանիսն են և գրվում են փոքրատառով։
        //Իրենց արժեքները փոփոխվում են
        //Ամբողջական թվեր կամ բնական թվեր 0-մինչև վերջ և մինուսով -1000
        byte x = 127;
        System.out.println(x);
        short y = 4777;
        System.out.println(y);
        int a = 457777;
        System.out.println(a);
        long b = 457777777L;
        System.out.println(b);
        // Կամայական թիվ Java-ում բիթ է


        //Կետով թվեր, ռացիոնալ՝ 45.8
        float cc= 45.1f;
        double dd=172.45;
        System.out.println(cc);
        System.out.println(dd);

        boolean j = true;
        System.out.println(j);
        j=false;
        System.out.println(j);


        // Մեկ սիմվոլի հետ աշխատելու համար օգտագործվում է char և դրվում է մեկ հատանոց չակերտ 'J':
        char ggg ='$';
        System.out.println(ggg);
        //Մենք կարող ենք նաև սիմվոլի փոխարեն գրել սիմվոլի Unicode օրինակ՝
        char w = '\u0040';
        System.out.println(w);


        //String տիպը օգտագործվում է բառեր, նախադասություններ գրելու համար։ Նա պրիմիտիվ, հասարակ չէ

        String i = "Hello world";
        System.out.println(i);

String firstName = "Ararat";
String lastName = "Sargsyan";
System.out.println(firstName+ " "+lastName);
int k = 95;
System.out.println("k = " + k);

    }

}