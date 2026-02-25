public class MyArray {
    public static void main(String[] args) {
        String[] students ={"Poonam","Aarav","Akshara"};
        int[] age ={38,14,6};
        System.out.println(students[0]);
        students[0]="Kumar";
        System.out.println(students[0]);
        System.out.println("There are "+students.length+" students in the class");
        for (int i=0;i<students.length;i++)
        {
            System.out.println(students[i]);
        }
    }
}
