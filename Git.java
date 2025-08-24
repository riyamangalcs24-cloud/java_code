// write a java program to take users input name,ageas input them in single formatted sentence


// import java.util.Scanner;
// class Git{
//         String name;
//         int age;
//         void dispalyUserInfo(String name,int age){
//                 if(name.length()<50 && age<120){
//                         System.out.println("name="+name);
//                 } else{
//                         System.out.println("INVALID");
//                 }
//         }
    
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         Git g = new Git();
//         g.name = sc.nextLine();
//         g.age = sc.nextInt();
//         g.dispalyUserInfo(g.name,g.age);
//     }
// }


// write a java program that takes two num as input and perform arthmetic operation

// import java.util.Scanner;
// class Git{
//     public static void performOperation(int n1, int n2){
//         System.out.println("sum:"+(n1+n2));
//         System.out.println("DIFFERENCE :"+(n1-n2));
//         System.out.println("MUL:"+(n1*n2));
//         if(n2 != 0){
//             System.out.println("QUOTIENT:"+n1/n2);
//         } else{
//             System.out.println("error  division by zero is not allowd");
//         }
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("ENTER A 1 NUM");
//         int a = sc.nextInt();
//         System.out.println("ENTER A 2 NUM");
//         int b = sc.nextInt();
//         performOperation(a,b);
//     }
// }


//  WRITE A JAVA PROGRAM TO CHECK WHETHER A GIVEN NUM IS EVEN OR ODD

// import java.util.Scanner;
// class Git{
//     public static String checkEvenOdd(int n ){
//         if(n % 2 == 0){
//             return "even";
//         } else{
//             return "odd";
//         }
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("ENTER A NUM");
//         int a = sc.nextInt();
//         System.out.println(checkEvenOdd(a));

//     }
// }



//5
// import java.util.Scanner;
// class Git{
//         public static void calculateGrade(int arr[]){
//                 int total = 0;
//                 for(int i=0;i<arr.length;i++){
//                         total += arr[i];
//                 }
//                 int avg = total / arr.length;
//                 System.out.println(total);
//                 System.out.println(avg);
//         }
//         public static void main(String args[]){
//                 Scanner sc = new Scanner(System.in);
//                 int n = 5;
//                 int arr[] = new int[];
//                 for(int i=0;i<n;i++){
//                         arr[i] = sc.nextInt();
//                 }
//                 calculateGrade(int arr[n]);
//         }
// }

//4 // find the largest indLargest(int a , int b, int c){

// import java.util.*;
// class Git{
//         public static int findLargest(int a , int b, int c){
//                 int max = a;
//                 if(max > b){
//                         max = b;
//                 } else{
//                         max = c;
//                 }
//                 return max;
//         }
//         public static void main(String args[]){
//                 Scanner sc = new Scanner(System.in);
//                 int n1 = sc.nextInt();
//                 int n2 = sc.nextInt();
//                 int n3 = sc.nextInt();
//                 Git g = new Git();
//                 System.out.println(g.findLargest(n1,n2,n3));
//         }
// }

// import java.util.Scanner;
// class Git{
//         public static void calculateGrade(int marks[]){
//                 int total = 0;
//                 for(int i=0;i<marks.length;i++){
//                         total += marks[i];
//                 }
//                 int avg = total/marks.length;
//                 System.out.println(total);
//                 System.out.println(avg);


//         }
//         public static void main(String args[]){
//                 Scanner sc = new Scanner(System.in);
//                 int n = 5;
//                 int marks[] = new int[n];
//                 for(int i=0;i<n;i++){
//                         marks[i] = sc.nextInt();
//                 }
//                 calculateGrade(int marks[n]);
//         }
// }


