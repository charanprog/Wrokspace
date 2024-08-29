public class classobj {
    //variables
    //Employeee calss
      int id=89;
    String name ="MIDATHAPALLY CHARAN";
    String job="SOFTWARE DEVELOPER";
    Boolean status= true ;
    // Methods
      void display(){
          System.out.println(id);
          System.out.println(name);
          System.out.println(job);
          System.out.println(status);
      }

    public static void main(String[] args) {
        classobj emp = new classobj();
        emp.display(); 
    }
}
