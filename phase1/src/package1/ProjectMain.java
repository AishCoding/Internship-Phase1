package package1;

import java.util.*;

public class ProjectMain {
	public static void main(String[] args) {
		
		//array of strings
		String[] strArray = {"Karnataka", "Delhi", "Mumbai", "Kolkata", "Chennai"};
		//initialize a mutable list(arraylist) from array using asList method
   		List<String> arrayList = new ArrayList<>(Arrays.asList(strArray));
   			
		MainMenu(arrayList);
		        		    
	}
	

	private static void MainMenuOptions(List<String> arrayList) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        
        int ch;
        
        do {
        ch=sc.nextInt();
        switch(ch) {
        	case 1: DisplayFiles(arrayList);
        			System.out.println();
		       		break;
		     
        	case 2: OtherOptions(arrayList);
		          	break;
		          
        	case 3: System.exit(0);
        	        break;
        	        
        	default:System.out.println("\nIncorrect option, choose 1, 2 or 3"); 
        		    break;
        	
        }
        
        	MainMenu(arrayList);
        	
        }while(ch<4);
        sc.close();
	}


	private static void MainMenu(List<String> arrayList) {
		// TODO Auto-generated method stub
		System.out.println("\nWelcome to LockedMe.In");
        System.out.println("\nDeveloped by Aishwarya");
        System.out.println("\n1. Display current files \n2. Other options \n3. Close Application\n");
        System.out.println("Enter an option: ");
        MainMenuOptions(arrayList);
	}


	private static void OtherOptions(List<String> arrayList) {
		// TODO Auto-generated method stub
         
         System.out.println("\n\t1. Add a new file");
         System.out.println("\t2. Delete an existing file");
         System.out.println("\t3. Search for a file");
         System.out.println("\t4. Go back");
         System.out.println("\nEnter an option : ");
         Scanner sc=new Scanner(System.in);
         int option;
         do {
         option=sc.nextInt();
         switch(option) {
         	case 1: 
         		AddFile(arrayList);
         		System.out.println("\n\nEnter 1 to go back and 2 to add more: ");
        		int input=sc.nextInt();
        		if(input==1)
        			break;
        		else if (input==2)
        			AddFile(arrayList);
        		else
        			System.out.println("Incorrect option");
         		break;
         	case 2:
         		System.out.println("Enter the name of the file to delete: ");
         		String deletename=sc.next();
         		int flag=0;
         		for (int i = 0; i < arrayList.size(); i++) {
         		    if (((String) arrayList.get(i)).contains(deletename)) {
         		    	System.out.println("File named "+deletename+" has been successfully deleted");
         		        arrayList.remove(i);
         		        flag=1;
         		        break;
         		    } 
         		}
         		if(flag==0)
     		    		System.out.println("File Not Found");
     		    		
         		break;
         	case 3:
         		   SearchFile(arrayList);
         		   break;
         	
         	case 4: MainMenu(arrayList);
         	        break;
         		
         	default:System.out.println("\nIncorrect option, choose 1, 2 or 3"); 
         			break;
         			
         }
         System.out.println("\n\t1. Add a new file");
         System.out.println("\t2. Delete an existing file");
         System.out.println("\t3. Search for a file");
         System.out.println("\t4. Go back");
         System.out.println("\nEnter an option : ");
        }while(option<5);
         
         sc.close();
	}

	private static void SearchFile(List<String> arrayList) {
		// TODO Auto-generated method stub
		System.out.println("Enter the name of the file to be searched: ");
		Scanner sc2=new Scanner(System.in);
		String FileName=sc2.nextLine();
		int index = Collections.binarySearch(arrayList, FileName);
			if (index<arrayList.size() && index>=0)
				System.out.println("File Found at index "+index);
			else
				System.out.println("File Not Found");
	
	}


	private static void AddFile(List<String> arrayList) {
		// TODO Auto-generated method stub
		System.out.println("Enter a name for the file: ");
		Scanner sc=new Scanner(System.in);
 		String addname=sc.nextLine();
 		arrayList.add(addname);
 		System.out.println("New file named "+addname+" has been created");
	}

	private static void DisplayFiles(List<String> arrayList) {
		// TODO Auto-generated method stub
		System.out.println("\nCurrent files are: ");
		Collections.sort(arrayList);
		for(String val : arrayList)
	           System.out.print(val + " ");		
   		
 	}

}
