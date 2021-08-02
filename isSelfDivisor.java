class Main 
{

   /*   initialize tempNum to number and isDivisor to true
        while num is greater than zero and isDivisor is true
            extract current units digit
            if units digit is zero, set isDivisor to false
            else
              Check if units digit divides number
                if true assign to tempNUm the integer quotient of tempNum and 10
                else set isDivisor to false
        return the current value of isDivisor

    */
   public static boolean isSelfDivisor(int number)
   {
      int tempNum = number;
      boolean isDivisor = true;
      int unitDigit;
      while (tempNum > 0 && isDivisor)
      {
        unitDigit = tempNum % 10;
        if (unitDigit == 0)
        {
          isDivisor = false;
        }
        else if (number % unitDigit == 0)
        {
          tempNum = tempNum / 10;
        }
        else
        {
          isDivisor = false;
        }
          
      } // end of while
      return isDivisor;
     // part A
   }

   /****************/

   public static void main (String[] args)
   {
     System.out.println("222: " + isSelfDivisor(222));
     System.out.println("26: " + isSelfDivisor(26));
     System.out.println("456846548: " + isSelfDivisor(456846548));
     System.out.println("102: " + isSelfDivisor(102));
   }
}
