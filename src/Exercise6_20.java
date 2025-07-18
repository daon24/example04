class Exercise6_20
{
    static int[] shuffle(int[] original){
        for(int i=0; i<original.length; i++){
            int index = (int)(Math.random()*9);
            int tmp = original[i];
            original[i] = original[index];
            original[index] = tmp;
        }
        return original;

    }

    public static void main(String[] args) {

        int[] original = {1,2,3,4,5,6,7,8,9};
        System.out.println(java.util.Arrays.toString(original));
        int[] result = shuffle(original);
        System.out.println(java.util.Arrays.toString(result));
    }
}