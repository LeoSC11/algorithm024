class Solution {
    public int[] plusOne(int[] digits) {
      int i = digits.length - 1;
      int carry;
      do{
        digits[i]++;
        carry = digits[i] / 10; 
        digits[i] = digits[i] % 10;
        i--;
      }while(i>=0 && carry == 1);
      if(carry == 1){
          digits = new int[digits.length + 1];
        digits[0] = 1;
      }
      return digits;
    }
}