package com.narayan.EffectiveJava.JosuaBloch;


import java.math.BigInteger;
import java.time.DayOfWeek;
import java.util.*;
import java.util.List;
import java.util.Iterator;
import java.util.EnumSet;
import java.util.EnumMap;

enum Color
{
    BLUE, GREEN, RED;
}


public class Main{

    public static <E> Set<E> union(Set<E> s1, Set<E> s2) {
        Set<E> result = new HashSet<E>(s1);
        result.addAll(s2);
        return result;
    }
    public BigInteger mod(BigInteger m) {
        if (m.signum() <= 0)
            throw new ArithmeticException("Modulus <= 0: " + m);
        return m;
    }


    public static void main(String[] args) {
        // write your code here

        Elvis elvis= Elvis.getInstance();
        elvis.leaveTheBuilding();

        System.out.println( "FRom main" );
        Time time;
        time = new Time(12,12);

        Time times = new MyTime( 13,54,54 );
      //  MyTime mytimes =(MyTime) new Time(10,10);

          final Complex ZERO = new Complex(0, 0);
        final Complex ONE = new Complex(1, 0);
         final Complex I = new Complex(0, 1);
         Complex  first__Number =  new Complex(  3,4 );
         System.out.println( "First number = " + first__Number.toString() );

         Complex second__number =new Complex( 3, 4 );
        System.out.println( "Second number = " + second__number.toString() );
        System.out.println( "Equality = " + first__Number.equals( second__number ) );

         System.out.println( "multiplcation of two number = " + (first__Number.multiply( second__number )).toString() );

        System.out.println( "Addition of two number = " + (first__Number.add( second__number )).toString() );
        System.out.println( "Addition of two number  through explicit ADD = " +
                ((new  Complex(0,0) ).add(first__Number, second__number )).toString() );

        System.out.println( "Subtraction of two number = " + (first__Number.subtract( second__number )).toString() );
        System.out.println( "Division of two number = " + (first__Number.divide( second__number )).toString() );

        String s1 = "Narayan"; String s2 = "Ratan";

        System.out.printf( "Difference is %s",   (new StringLengthComparator()).compare(s1,s2));

        List<Integer> integerList = Arrays.asList(1, 2, 3);
        GenericsTester. printAll(integerList);
        List<Double> doubleList = Arrays.asList(1.2, 2.3, 3.5);
        GenericsTester. printAll(doubleList);

       // GenericsTester.reverseArray(doubleList,9 );

        NonGenericsTester sss = new NonGenericsTester();
        sss. printAlll (doubleList);
        sss. printAlll ( (List < String >) Arrays.asList( "sss_Narayan", "ratan" , "Jhuma" )  );
        ObjectGenericsTester ssss = new ObjectGenericsTester();
        ssss.printAlll( (List < String >) Arrays.asList( "ssss_Narayan", "ratan" , "Jhuma" )  );
        Set<String> guys = new HashSet<String>(
                Arrays.asList("Tom", "Dick", "Harry"));
        Set<String> stooges = new HashSet<String>(
                Arrays.asList("Larry", "Moe", "Curly"));
        Set<String> aflCio = union(guys, stooges);
        System.out.println(aflCio);



        int[ ] data = {2, 3, 5, 7, 11, 13, 17, 19};
        int[ ] backup, backup1;
        backup = data;
        backup1 = data.clone( );
        for (int datum : data) {
            System.out.print( "  " + datum + " " );

        }
        data[4] = 56;
        for (int datum : backup) {
            System.out.print( "  " + datum + " " );

        }

        for (int datum : backup1) {
            System.out.print( "  " + datum + " " );

        }

        Iterator  itr = integerList.iterator();
        int low = 1;
        int high = 10;

        int mid = (low + high) >>> 1;
        System.out.format( " (L + H ) >>>1 means : Low = %d , High = %d , mid = % d  \n", low , high , mid );

/*
        enumFields   myenumfield = null;
        ArrayList <String> result = enumFields.enumFields();
        Iterator iterator;
        iterator=result.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.print( result );
*/



        Color c1 = Color.RED;
        System.out.println(c1);

        String str = "MONDAY";
        dayIsLike t1 = new dayIsLike(Day.valueOf(str));
        t1.dayIsLike();
        System.out.println(  t1.toString());

        System.out.println( t1.AllString() );
        ArrayList<String> result = t1.AllString();

        EnumSet<Day>  enuset = EnumSet.of( Day.FRIDAY , Day.MONDAY , Day.SUNDAY );
        EnumMap< Day , String>  enumap = new EnumMap <Day, String>( Day.class );
        enumap.put(Day.SUNDAY, String.valueOf( Day.SUNDAY.getIdx() ) );
        enumap.put(Day.FRIDAY, "It is Fri  Fri Day" );
        enumap.put(Day.SATURDAY, String.valueOf( Day.SATURDAY.getId()) );

        System.out.println("EnumMap: " + enumap  + "  EnumSet  " + enuset);

        Planet  planet;

        double mass = Planet.EARTH.getMass();
        double radius  = Planet.EARTH.getRadius();

        for (Planet p : Planet.values())
            System.out.printf("Weight on %s is %f\n",
                    p, p.surfaceWeight(mass));


        Operation op = Operation.DIVIDE;

        System.out.println( op.apply(5.0,6.0));

        try {
              int i = 6/0 ;
            if (i == Double.POSITIVE_INFINITY ||
                    i == Double.NEGATIVE_INFINITY)
                throw new ArithmeticException();

        } catch (  IllegalArgumentException e) {
            System.out.println( "Final Exception" );
        }
        finally {
            System.out.println( "Final Exce----ption" );
        }

//System.out.printf("Big Integre x  is %l , and Y is %l \n", Bigx.mod(Bigx), Bigy.mod(Bigy));
        /************************************
         *  Enter your code in upper line   *
         ***********************************/

    }  // Main end hereS\




}

