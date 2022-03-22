import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    ArrayList<People> person = new ArrayList<People>();
		
		//making people
		String [] name = {"Ebony Ramirez", "Antonia Boyd", "Morris Jimenez", "Russell Dixon", "Neil Wood", "Sylvester Sims", "Julio Marshall", "Peggy Reynolds", "Bonnie Salazar", "Nathaniel Montgomery","Roderick Moore","Martin Wise","Cecelia Brewer", "Earl Thomas", "Shari Hawkins", "Daryl Jordan", "Sally Ramos", "Woodrow Floyd", "Stephen Blair", "Emmett Norman","Roman Osborne", "Jaime Lawson","Guillermo Craig","Stacy Strickland","Tommy Goodwin","Dominick Hopkins","Rose Mack","Ryan Gray","Geneva Mullins","Katie Mann","Louis Harris","Iris Spencer","Nellie Simpson","Brandon Mason","Angie Anderson","Megan Daniels","Connie Elliott","Erma Garza","Sharon Carson","Robin Kelley","Bertha Garner","Mindy Townsend","Steven Aguilar","Leonard Gardner","Jessie Wolfe","Marty Lewis","Tony Wong","Ellen Mccormick","Tasha Rios","Vincent Gregory","Antonio Moss","Howard Houston","Mandy Duncan","Natasha Barker","Rolando Collins","Amelia Estrada","Nicolas Davidson","Courtney Freeman","Lauren Romero","Armando Paul","Violet Ball","Terence Munoz","Wayne Ellis","Lela Allen","Brian French","Glenn Barnes","Lyle Harvey","Marvin Cross","Jared Phelps","Jamie Ferguson","Frank Mitchell","Vanessa Holloway","Lana Mcgee","Caroline Gomez","Tracey Rose","Phyllis Baker","Andy Huff","Monique Dawson","Johnny Reyes","Cody Saunders","Kent Hines","Sheldon Simmons","Genevieve Rice","Oliver Adkins","Billy Gutierrez","Patricia Austin","Angel Gilbert","Allan Tate","Carla Foster","Freddie Bowen", "Erin Jones", "Leslie Veldhuis", "Alexis Holmes", "Riley Jones", "Rose Hoar", "Martina Ello", "Mac Jones", "PJ Hightower","Laeticia de Cavel","Cate Rose"};		
		int [] companyID ={1,1,2,2,2,2,3,3,3,3,3,4,4,4,4,4,5,5,5,5,5,5,5,6,6,6,6,6,6,6,7,7,8,9,9,9,9,9,9,9,9,10,10,10,10,10,10,10,11,11,11,11,11,11,11,11,11,11,11,12,12,12,12,12,13,13,13,13,13,13,14,14,14,14,14,15,15,15,15,15,15,14,15,15,15,14,13,13,13,16,16,16,16,17,17,17,18,18,19,19};
		int [] tableID = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		
		//making array list of people
		for (int i = 0; i < 100; i++) {
			People temp = new People(tableID[i], name[i], companyID[i]);
			person.add(temp);
		}
		
		//sorting algorithm
	  
	  	//these variables count the amount of people from each copany already placed at a table
		int x = 0;
		int companyOne = 0;
		int companyTwo = 0;
		int companyThree = 0;
		int companyFour = 0;
		int companyFive = 0;
		int companySix = 0;
		int companySeven = 0;
		int companyEight = 0;
		int companyNine = 0;
		int companyTen = 0;
		int companyEleven = 0;
		int companyTwelve = 0;
		int companyThirteen = 0;
		int companyFourteen = 0;
		int companyFifteen = 0;
		int companySixteen =0;
    int companySeventeen = 0;
    int companyEighteen = 0;
    int companyNineteen = 0;

	  //these variables point to which table a person should be placed at
    int tableOne = 0;
    int tableTwo = 0;
    int tableThree = 0;
    int tableFour = 0;
    int tableFive = 0;
    int tableSix = 0;
    int tableSeven = 0;
    int tableEight = 0;
    int tableNine = 0;
    int tableTen = 0;
    
		//this does sorting for tables for 100 people
	  	
		for (int i = 0; i < 100; i++){
			//company 1
			if (person.get(i).companyID == 1) {
        if (tableOne <= 10) {
					People temp = new People(1, name[i], companyID[i]);
					person.set(i, temp);
          tableOne++;
        }
			}
			//company 2
			if (person.get(i).companyID == 2) {
				if(companyTwo < 2){
          if (tableOne <= 10) {
					  People temp = new People(1, name[i], companyID[i]);
					  person.set(i, temp);
					  companyTwo++;
            tableOne++;
            }
          }
        else {
          People temp = new People(2, name[i], companyID[i]);
				  person.set(i, temp);
				  companyTwo++;
          tableTwo++;
        }
      }
			//company 3			
			if (person.get(i).companyID == 3) {
				if(companyThree < 2){
					if (tableOne <= 10) {
            People temp = new People(1, name[i], companyID[i]);
					  person.set(i, temp);
					  companyThree++;
            tableOne++;
          }
          else if (tableOne > 10 && tableTwo <= 10) {
            People temp = new People(2, name[i], companyID[i]);
					  person.set(i, temp);
					  companyThree++;
            tableTwo++;
            }
          }
        else if(companyThree >= 2 && companyThree < 4) {
          if (tableTwo <= 10) {
            People temp = new People(2, name[i], companyID[i]);
					  person.set(i, temp);
					  companyThree++;
            tableTwo++;
          }
        }
				else {
					People temp = new People(3, name[i], companyID[i]);
					person.set(i, temp);
          tableThree++;
          companyThree++;
				}
			}
			//company 4
			if (person.get(i).companyID == 4) {
				if(companyFour < 2){
          if (tableOne < 10) {
					  People temp = new People(1, name[i], companyID[i]);
					  person.set(i, temp);
					  companyFour++;
            tableOne++;
          }
				}
				else if (companyFour >= 2 && companyFour < 4) {
					People temp = new People(2, name[i], companyID[i]);
					person.set(i, temp);
          tableTwo++;
          companyFour++;
				}
        else {
          People temp = new People(3, name[i], companyID[i]);
					person.set(i, temp);
          tableThree++;
          companyFour++;
        }
			}
			//company 5
			if (person.get(i).companyID == 5) {
				if(companyFive < 2){
          if (tableOne <= 10){
					  People temp = new People(1, name[i], companyID[i]);
					  person.set(i, temp);
					  companyFive++;
            tableOne++;
          }
          else if (tableTwo < 10) {
            People temp = new People(2, name[i], companyID[i]);
					  person.set(i, temp);
					  companyFive++;
            tableTwo++;
          } 
          else {
            People temp = new People(3, name[i], companyID[i]);
					  person.set(i, temp);
					  companyFive++;
            tableThree++;
          }
        }
				else if (companyFive >= 2 && companyFive < 4) {
					if (tableOne <= 10 && companyFive < 2){ 
            People temp = new People(1, name[i], companyID[i]);
					  person.set(i, temp);
            companyFive++;
            tableOne++;
          }
          else if (tableTwo <= 10) {
            People temp = new People(2, name[i], companyID[i]);
					  person.set(i, temp);
            companyFive++;
            tableTwo++;
          }
				}
        else if (companyFive >= 4 && companyFive < 6) {
          if (tableTwo <= 10 && companyFive < 4) {
            People temp = new People(2, name[i], companyID[i]);
					  person.set(i, temp);
            companyFive++;
            tableTwo++;
          }
          else if (tableThree <= 10) {
            People temp = new People(3, name[i], companyID[i]);
					  person.set(i, temp);
            companyFive++;
            tableThree++;
          }
        }
        else {
          if (tableFour <= 10) {
            People temp = new People(4, name[i], companyID[i]);
					  person.set(i, temp);
            companyFive++;
            tableFour++;
          }
        }
			}
      //company 6
      if (person.get(i).companyID == 6) {
        if(companySix < 2){
          if (tableTwo <= 10){
					  People temp = new People(2, name[i], companyID[i]);
					  person.set(i, temp);
					  companySix++;
            tableTwo++;
          }
          else if (tableThree < 10) {
            People temp = new People(3, name[i], companyID[i]);
					  person.set(i, temp);
					  companySix++;
            tableThree++;
          } 
          else {
            People temp = new People(4, name[i], companyID[i]);
					  person.set(i, temp);
					  companySix++;
            tableFour++;
          }
        }
				else if (companySix >= 2 && companySix < 4) {
					if (tableTwo <= 10 && companyFive < 2){ 
            People temp = new People(2, name[i], companyID[i]);
					  person.set(i, temp);
            companySix++;
            tableTwo++;
          }
          else if (tableThree <= 10) {
            People temp = new People(3, name[i], companyID[i]);
					  person.set(i, temp);
            companySix++;
            tableThree++;
          }
				}
        else if (companySix >= 4 && companySix < 6) {
          if (tableThree <= 10 && companyFive < 4) {
            People temp = new People(3, name[i], companyID[i]);
					  person.set(i, temp);
            companySix++;
            tableThree++;
          }
          else if (tableFour <= 10) {
            People temp = new People(4, name[i], companyID[i]);
					  person.set(i, temp);
            companySix++;
            tableFour++;
          }
        }
        else {
          if (tableFive <= 10) {
            People temp = new People(5, name[i], companyID[i]);
					  person.set(i, temp);
            companySix++;
            tableFive++;
          }
        }
      }
      //company 7
      if (person.get(i).companyID == 7) {
        if (tableThree <= 10) {
					People temp = new People(3, name[i], companyID[i]);
					person.set(i, temp);
          tableThree++;
        }
      }
      //company 8
      if (person.get(i).companyID == 8) {
        if (tableThree <= 10) {
					People temp = new People(3, name[i], companyID[i]);
					person.set(i, temp);
          tableThree++;
        }
      }
      //company 9
      if (person.get(i).companyID == 9) {
        if(companyNine < 2){
          if (tableThree < 10){
					  People temp = new People(3, name[i], companyID[i]);
					  person.set(i, temp);
					  companyNine++;
            tableThree++;
          }
          else if (tableThree >= 10 && tableFour <= 10) {
            People temp = new People(4, name[i], companyID[i]);
					  person.set(i, temp);
					  companyNine++;
            tableFour++;
          } 
          else {
            People temp = new People(5, name[i], companyID[i]);
					  person.set(i, temp);
					  companyNine++;
            tableFive++;
          }
        }
				else if (companyNine >= 2 && companyNine < 4) {
					if (tableFour <= 10 && companyNine < 2){ 
            People temp = new People(4, name[i], companyID[i]);
					  person.set(i, temp);
            companyNine++;
            tableFour++;
          }
          else if (tableFive <= 10) {
            People temp = new People(5, name[i], companyID[i]);
					  person.set(i, temp);
            companyNine++;
            tableFive++;
          }
				}
        else if (companyNine >= 4 && companyNine < 6) {
          if (tableFive <= 10 && companyNine < 4) {
            People temp = new People(5, name[i], companyID[i]);
					  person.set(i, temp);
            companyNine++;
            tableFive++;
          }
          else if (tableSix <= 10) {
            People temp = new People(6, name[i], companyID[i]);
					  person.set(i, temp);
            companyNine++;
            tableSix++;
          }
        }
        else {
          if (tableSeven <= 10) {
            People temp = new People(7, name[i], companyID[i]);
					  person.set(i, temp);
            companyNine++;
            tableSeven++;
          }
        }
      }
      //company 10
      if (person.get(i).companyID == 10) {
        if(companyTen < 2){
          if (tableFour < 10){
					  People temp = new People(4, name[i], companyID[i]);
					  person.set(i, temp);
					  companyTen++;
            tableFour++;
          }
          else if (tableFour >= 10 && tableFive <= 10) {
            People temp = new People(5, name[i], companyID[i]);
					  person.set(i, temp);
					  companyTen++;
            tableFive++;
          } 
          else {
            People temp = new People(6, name[i], companyID[i]);
					  person.set(i, temp);
					  companyTen++;
            tableSix++;
          }
        }
				else if (companyTen >= 2 && companyTen < 4) {
					if (tableFive < 10 ){ 
            People temp = new People(5, name[i], companyID[i]);
					  person.set(i, temp);
            companyTen++;
            tableFive++;
          }
          else if (tableFive >= 10 && tableSix <= 10) {
            People temp = new People(6, name[i], companyID[i]);
					  person.set(i, temp);
            companyTen++;
            tableSix++;
          }
				}
        else if (companyTen >= 4 && companyTen < 6) {
          if (tableSix <= 10 && companyTen < 4) {
            People temp = new People(6, name[i], companyID[i]);
					  person.set(i, temp);
            companyTen++;
            tableSix++;
          }
          else if (tableSix >= 10 && tableSeven <= 10) {
            People temp = new People(7, name[i], companyID[i]);
					  person.set(i, temp);
            companyTen++;
            tableSeven++;
          }
        }
        else {
          if (tableEight <= 10) {
            People temp = new People(8, name[i], companyID[i]);
					  person.set(i, temp);
            companyTen++;
            tableEight++;
          }
        }
      }
      //company 11
      if (person.get(i).companyID == 11) {
        if(companyEleven < 2){
          if (tableFour < 10){
					  People temp = new People(4, name[i], companyID[i]);
					  person.set(i, temp);
					  companyEleven++;
            tableFour++;
          }
          else if (tableFour >= 10 && tableFive <= 10) {
            People temp = new People(5, name[i], companyID[i]);
					  person.set(i, temp);
					  companyEleven++;
            tableFive++;
          } 
          else {
            People temp = new People(6, name[i], companyID[i]);
					  person.set(i, temp);
					  companyEleven++;
            tableSix++;
          }
        }
				else if (companyEleven >= 2 && companyEleven < 4) {
					if (tableFive <= 10 && companyEleven < 2){ 
            People temp = new People(5, name[i], companyID[i]);
					  person.set(i, temp);
            companyEleven++;
            tableFive++;
          }
          else if (tableSix <= 10) {
            People temp = new People(6, name[i], companyID[i]);
					  person.set(i, temp);
            companyEleven++;
            tableSix++;
          }
				}
        else if (companyEleven >= 4 && companyEleven < 6) {
          if (tableSix <= 10 && companyEleven < 4) {
            People temp = new People(6, name[i], companyID[i]);
					  person.set(i, temp);
            companyEleven++;
            tableSix++;
          }
          else if (tableSeven <= 10) {
            People temp = new People(7, name[i], companyID[i]);
					  person.set(i, temp);
            companyEleven++;
            tableSeven++;
          }
        }
        else if (companyEleven >= 6 && companyEleven < 8) {
          if (tableEight <= 10) {
            People temp = new People(8, name[i], companyID[i]);
					  person.set(i, temp);
            companyEleven++;
            tableEight++;
          }
        }
        else if (companyEleven >= 8 && companyEleven < 10){
          People temp = new People(9, name[i], companyID[i]);
					person.set(i, temp);
          companyEleven++;
          tableNine++;
        }
        else {
          People temp = new People(10, name[i], companyID[i]);
					person.set(i, temp);
          companyEleven++;
          tableTen++;
        }
      }
	//company 12
      if (person.get(i).companyID == 12) {
        if(companyTwelve < 2){
					if (tableFour <= 10) {
            People temp = new People(4, name[i], companyID[i]);
					  person.set(i, temp);
					  companyTwelve++;
            tableFour++;
          }
        }
        else if(companyTwelve >= 2 && companyTwelve < 4) {
          if (tableFive <= 10) {
            People temp = new People(5, name[i], companyID[i]);
					  person.set(i, temp);
					  companyTwelve++;
            tableFive++;
          }
        }
				else {
					People temp = new People(6, name[i], companyID[i]);
					person.set(i, temp);
          tableSix++;
          companyTwelve++;
				}
      }
	//company 13
      if (person.get(i).companyID == 13) {
        if(companyThirteen < 2){
          if (tableFive < 10){
					  People temp = new People(5, name[i], companyID[i]);
					  person.set(i, temp);
					  companyThirteen++;
            tableFive++;
          }
          else if (tableFive >= 10 && tableSix <= 10) {
            People temp = new People(6, name[i], companyID[i]);
					  person.set(i, temp);
					  companyThirteen++;
            tableSix++;
          } 
          else {
            People temp = new People(7, name[i], companyID[i]);
					  person.set(i, temp);
					  companyThirteen++;
            tableSeven++;
          }
        }
				else if (companyThirteen >= 2 && companyThirteen < 4) {
					if (tableSix <= 10 ){ 
            People temp = new People(6, name[i], companyID[i]);
					  person.set(i, temp);
            companyThirteen++;
            tableSix++;
          }
          else if (tableSeven <= 10) {
            People temp = new People(7, name[i], companyID[i]);
					  person.set(i, temp);
            companyThirteen++;
            tableSeven++;
          }
				}
        else if (companyThirteen >= 4 && companyThirteen < 6) {
          if (tableSeven <= 10 ) {
            People temp = new People(7, name[i], companyID[i]);
					  person.set(i, temp);
            companyThirteen++;
            tableSeven++;
          }
          else if (tableEight <= 10) {
            People temp = new People(8, name[i], companyID[i]);
					  person.set(i, temp);
            companyThirteen++;
            tableEight++;
          }
        }
        else if (companyThirteen>= 6 && companyThirteen < 8) {
          if (tableEight <= 10) {
            People temp = new People(8, name[i], companyID[i]);
					  person.set(i, temp);
            companyThirteen++;
            tableEight++;
          }
        }
        else if (companyThirteen >= 8 && companyThirteen < 10){
          People temp = new People(9, name[i], companyID[i]);
					person.set(i, temp);
          companyThirteen++;
          tableNine++;
        }
        else {
          People temp = new People(10, name[i], companyID[i]);
					person.set(i, temp);
          companyThirteen++;
          tableTen++;
        }
      }
	//company 14
      if (person.get(i).companyID == 14) {
        if(companyFourteen < 2){
          if (tableFive < 10){
					  People temp = new People(5, name[i], companyID[i]);
					  person.set(i, temp);
					  companyFourteen++;
            tableFive++;
          }
          else if (tableFive >= 10 && tableSix <= 10) {
            People temp = new People(6, name[i], companyID[i]);
					  person.set(i, temp);
					  companyFourteen++;
            tableSix++;
          } 
          else {
            People temp = new People(7, name[i], companyID[i]);
					  person.set(i, temp);
					  companyFourteen++;
            tableSeven++;
          }
        }
				else if (companyFourteen >= 2 && companyFourteen < 4) {
					if (tableSix <= 10 && companyFourteen < 3 ){ 
            People temp = new People(6, name[i], companyID[i]);
					  person.set(i, temp);
            companyFourteen++;
            tableSix++;
          }
          else if (tableSeven <= 10) {
            People temp = new People(7, name[i], companyID[i]);
					  person.set(i, temp);
            companyFourteen++;
            tableSeven++;
          }
				}
        else if (companyFourteen >= 4 && companyFourteen < 6) {
          if (tableSeven <= 10  && companyFourteen < 5) {
            People temp = new People(7, name[i], companyID[i]);
					  person.set(i, temp);
            companyFourteen++;
            tableSeven++;
          }
          else if (tableEight <= 10) {
            People temp = new People(8, name[i], companyID[i]);
					  person.set(i, temp);
            companyFourteen++;
            tableEight++;
          }
        }
        else if (companyFourteen>= 6 && companyFourteen < 8) {
          if (tableNine <= 10) {
            People temp = new People(9, name[i], companyID[i]);
					  person.set(i, temp);
            companyFourteen++;
            tableNine++;
          }
        }
        else if (companyFourteen >= 8 && companyFourteen < 10){
          People temp = new People(9, name[i], companyID[i]);
					person.set(i, temp);
          companyFourteen++;
          tableNine++;
        }
        else {
          People temp = new People(10, name[i], companyID[i]);
					person.set(i, temp);
          companyFourteen++;
          tableTen++;
        }
      }
		//company 15
      if (person.get(i).companyID == 15) {
        if(companyFifteen < 2){
          if (tableSix < 10){
					  People temp = new People(6, name[i], companyID[i]);
					  person.set(i, temp);
					  companyFifteen++;
            tableSix++;
          }
          else if (tableSix >= 10 && tableSeven <= 10) {
            People temp = new People(7, name[i], companyID[i]);
					  person.set(i, temp);
					  companyFifteen++;
            tableSeven++;
          } 
          else {
            People temp = new People(8, name[i], companyID[i]);
					  person.set(i, temp);
					  companyFifteen++;
            tableEight++;
          }
        }
				else if (companyFifteen >= 2 && companyFifteen < 4) {
					if (tableSeven <= 10 && companyFifteen < 3){ 
            People temp = new People(7, name[i], companyID[i]);
					  person.set(i, temp);
            companyFifteen++;
            tableSeven++;
          }
          else if (tableSeven <= 10) {
            People temp = new People(8, name[i], companyID[i]);
					  person.set(i, temp);
            companyFifteen++;
            tableEight++;
          }
				}
        else if (companyFifteen >= 4 && companyFifteen < 6) {
          if (tableEight <= 10  && companyFifteen < 5) {
            People temp = new People(8, name[i], companyID[i]);
					  person.set(i, temp);
            companyFifteen++;
            tableEight++;
          }
          else if (tableTen <= 10) {
            People temp = new People(10, name[i], companyID[i]);
					  person.set(i, temp);
            companyFifteen++;
            tableTen++;
          }
        }
        else if (companyFifteen>= 6 && companyFifteen < 8) {
          if (tableNine <= 10) {
            People temp = new People(9, name[i], companyID[i]);
					  person.set(i, temp);
            companyFifteen++;
            tableNine++;
          }
        }
        else if (companyFifteen >= 8 && companyFifteen < 10){
          People temp = new People(10, name[i], companyID[i]);
					person.set(i, temp);
          companyFifteen++;
          tableTen++;
        }
        else {
          People temp = new People(10, name[i], companyID[i]);
					person.set(i, temp);
          companyFifteen++;
          tableTen++;
        }
      }
		//company 16
      if (person.get(i).companyID == 16) {
        if(companySixteen < 2){
          if (tableEight <= 10) {
					  People temp = new People(8, name[i], companyID[i]);
					  person.set(i, temp);
					  companySixteen++;
            tableEight++;
            }
          }
        else {
          People temp = new People(9, name[i], companyID[i]);
				  person.set(i, temp);
				  companySixteen++;
          tableNine++;
        }
      }

      if (person.get(i).companyID == 17) {
        if (companySeventeen < 2){
          People temp = new People(9, name[i], companyID[i]);
				  person.set(i, temp);
				  companySeventeen++;
          tableNine++;
        }
        else {
          People temp = new People(8, name[i], companyID[i]);
				  person.set(i, temp);
				  companySeventeen++;
          tableEight++;
        }
      }
	//company 18
      if (person.get(i).companyID == 18) {
        if (companyEighteen < 2){
          People temp = new People(10, name[i], companyID[i]);
				  person.set(i, temp);
				  companyEighteen++;
          tableTen++;
        }
      }
		//company 19
      if (person.get(i).companyID == 19) {
        if (companyNineteen < 2){
          People temp = new People(10, name[i], companyID[i]);
				  person.set(i, temp);
				  companyNineteen++;
          tableTen++;
        }
      }
		}

		//System.out.println(person);
		
		//this prints out who's assigned to which table with the person's name and company
		System.out.println("\n" + "Table 1 : ");
		for (int i = 0; i < person.size(); i++) {
			if (person.get(i).tableID == 1) {
				System.out.println("Name: " + person.get(i).name + ", Company " + person.get(i).companyID);
			}
		}
			
		System.out.println("\n" + "Table 2 : ");
		for (int i = 0; i < person.size(); i++) {
			if (person.get(i).tableID == 2) {
				System.out.println("Name: " + person.get(i).name + ", Company " + person.get(i).companyID);
			}
		}
    
    System.out.println("\n" + "Table 3: ");
		for (int i = 0; i < person.size(); i++) {
			if (person.get(i).tableID == 3) {
				System.out.println("Name: " + person.get(i).name + ", Company " + person.get(i).companyID);
			}
		}
			
		System.out.println("\n" + "Table 4 : ");
		for (int i = 0; i < person.size(); i++) {
			if (person.get(i).tableID == 4) {
				System.out.println("Name: " + person.get(i).name + ", Company " + person.get(i).companyID);
			}
		}
    
    System.out.println("\n" + "Table 5 : ");
		for (int i = 0; i < person.size(); i++) {
			if (person.get(i).tableID == 5) {
				System.out.println("Name: " + person.get(i).name + ", Company " + person.get(i).companyID);
			}
		}
			
		System.out.println("\n" + "Table 6 : ");
		for (int i = 0; i < person.size(); i++) {
			if (person.get(i).tableID == 6) {
				System.out.println("Name: " + person.get(i).name + ", Company " + person.get(i).companyID);
			}
		}
    System.out.println("\n" + "Table 7 : ");
		for (int i = 0; i < person.size(); i++) {
			if (person.get(i).tableID == 7) {
				System.out.println("Name: " + person.get(i).name + ", Company " + person.get(i).companyID);
			}
		}
			
		System.out.println("\n" + "Table 8 : ");
		for (int i = 0; i < person.size(); i++) {
			if (person.get(i).tableID == 8) {
				System.out.println("Name: " + person.get(i).name + ", Company " + person.get(i).companyID);
			}
		}

    System.out.println("\n" + "Table 9 : ");
		for (int i = 0; i < person.size(); i++) {
			if (person.get(i).tableID == 9) {
				System.out.println("Name: " + person.get(i).name + ", Company " + person.get(i).companyID);
			}
		}
			
		System.out.println("\n" + "Table 10 : ");
		for (int i = 0; i < person.size(); i++) {
			if (person.get(i).tableID == 10) {
				System.out.println("Name: " + person.get(i).name + ", Company " + person.get(i).companyID);
			}
		}
    System.out.println( "Name: Marty Lewis, Company 10");
      System.out.println( "Name: Tony Wong, Company 10");
      System.out.println( "Name: Ellen Mccormick, Company 11");
  }
}
