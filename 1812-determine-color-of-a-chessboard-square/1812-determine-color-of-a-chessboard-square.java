class Solution {
    public boolean squareIsWhite(String coordinates) {
        Map<Character,Integer> characters=new HashMap<Character,Integer>(){{
            put('a',1);put('b',2);put('c',3);put('d',4);put('e',5);put('f',6);put('g',7);put('h',8);
        }};
        int alphabet=characters.get(coordinates.charAt(0));
        int number=Integer.valueOf(coordinates.charAt(1));
        return (alphabet+number)%2==1;
    }
}