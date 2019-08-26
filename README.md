# avaj-launcher
This project is the introduction to the Java world at 42. This is an implementation of an aircraft simulation program based on the class UML diagram.

# Description
Aim of this project is to implement an aircraft simulation program based on the UML class diagram. All classes are required to be implemented respecting every detail provided in the diagram. If necessary, add more classes or include additional attributes, but changing access modifiers and class hireharchy for the classes provided in the diagram are forbidden.\

# UML Diagram
![alt text](/nfs/2018/m/mpas/Downloads/avaj_uml.jpg?raw=true "Title")
# Compile and run
  git clone the project
  cd avaj-launcher/src/

## Before launching make sure that you have Java installed and java & javac commands are available in your terminal. If not, click here to install Java for Mac.
In the root of project folder run the commands given bellow:

find -name *.java > sources.txt

javac -sourcepath @sources.txt

java -cp src com.company.simulator.Simulator  "scenario.txt"



## Or you can use run.sh in the root of project folder. To launch use:
sh run.sh

# Scenario file example
The first line of the file contains a positive integer number. This number represents the number of times the simulation is run. In our case, this will be the number of times a weather change is triggered. Each following line describes an aircraft that will be part of the simulation, with this format: TYPE NAME LONGITUDE LATITUDE HEIGHT.

25<br/>
Baloon B1 2 3 20 <br/>
Baloon B2 1 8 66 <br/>
JetPlane J1 23 44 32 <br/>
Helicopter H1 654 33 20 <br/>
Helicopter H2 22 33 44 <br/>
Helicopter H3 98 68 99 <br/>
Baloon B3 102 22 34 <br/>
JetPlane J2 11 99 768 <br/>
Helicopter H4 223 23 54 <br/>

# Example of output
cat simulation.txt

Tower says: Baloon#B1(1) registered to weather tower. <br/>
Tower says: Baloon#B2(2) registered to weather tower. <br/>
Tower says: JetPlane#J1(3) registered to weather tower. <br/>
Tower says: Helicopter#H1(4) registered to weather tower. <br/>
Tower says: Helicopter#H2(5) registered to weather tower. <br/>
Tower says: Helicopter#H3(6) registered to weather tower.<br/> 
Tower says: Baloon#B3(7) registered to weather tower. <br/>
Tower says: JetPlane#J2(8) registered to weather tower. <br/>
Tower says: Helicopter#H4(9) registered to weather tower. <br/>

Simulation: 1 <br/>
Baloon#B1(1): There is some sun, let's enjoy good weather! <br/>
Baloon#B2(2): There is some sun, let's enjoy good weather! <br/>
JetPlane#J1(3): Gamn fog! <br/>
Helicopter#H1(4): Winter is coming! <br/>
Helicopter#H2(5): I see no ground! <br/>
Helicopter#H3(6): It's so hot! <br/>
Baloon#B3(7): It's rain! It messed up my baloon! <br/>
JetPlane#J2(8): This sun is getting to my eyes! <br/>
Helicopter#H4(9): It's so hot! <br/>

Simulation: 2 <br/>
Baloon#B1(1): I hate fog, I cannot see anything at all! <br/>
Baloon#B2(2): I hate fog, I cannot see anything at all! <br/>
JetPlane#J1(3): This sun is getting to my eyes! <br/>
Helicopter#H1(4): This rain is so depressing... <br/>
Helicopter#H2(5): Winter is coming! <br/>
Helicopter#H3(6): I see no ground! <br/>
Baloon#B3(7): It's rain! It messed up my baloon! <br/>
JetPlane#J2(8): This sun is getting to my eyes! <br/>
Helicopter#H4(9): This rain is so depressing... <br/>

Simulation: 3 <br/>
Baloon#B1(1): It's snowing! We should be more careful! <br/>
Baloon#B2(2): It's snowing! We should be more careful! <br/>
JetPlane#J1(3): Watch out for lightnings! <br/>
Helicopter#H1(4): It's so hot! <br/>
Helicopter#H2(5): I see no ground! <br/>
Helicopter#H3(6): It's so hot! <br/>
Baloon#B3(7): There is some sun, let's enjoy good weather! <br/>
JetPlane#J2(8): We are going to freeze! <br/>
Helicopter#H4(9): This rain is so depressing... <br/>

Simulation: 4 <br/>
Baloon#B1(1): It's rain! It messed up my baloon! <br/>
Baloon#B2(2): It's snowing! We should be more careful! <br/>
JetPlane#J1(3): Watch out for lightnings! <br/>
Helicopter#H1(4): I see no ground! <br/>
Helicopter#H2(5): It's so hot! <br/>
Helicopter#H3(6): This rain is so depressing... <br/>
Baloon#B3(7): It's snowing! We should be more careful! <br/>
JetPlane#J2(8): Watch out for lightnings! <br/>
Helicopter#H4(9): This rain is so depressing... <br/>

Simulation: 5 <br/>
Baloon#B1(1): There is some sun, let's enjoy good weather! <br/>
Baloon#B2(2): It's rain! It messed up my baloon! <br/>
JetPlane#J1(3): This sun is getting to my eyes! <br/>
Helicopter#H1(4): Winter is coming! <br/>
Tower says: Helicopter#H1(4) unregistered from weather tower. <br/>
Helicopter#H2(5): It's so hot! <br/>
Helicopter#H3(6): This rain is so depressing... <br/>
Baloon#B3(7): I hate fog, I cannot see anything at all! <br/>
JetPlane#J2(8): We are going to freeze! <br/>
Helicopter#H4(9): This rain is so depressing... <br/>

Simulation: 6 <br/>
Baloon#B1(1): There is some sun, let's enjoy good weather! <br/>
Baloon#B2(2): I hate fog, I cannot see anything at all! <br/>
JetPlane#J1(3): This sun is getting to my eyes! <br/>
Helicopter#H2(5): This rain is so depressing... <br/>
Helicopter#H3(6): It's so hot! <br/> 
Baloon#B3(7): There is some sun, let's enjoy good weather! <br/>
JetPlane#J2(8): Watch out for lightnings! <br/>
Helicopter#H4(9): Winter is coming! <br/>

Simulation: 7 <br/>
Baloon#B1(1): It's rain! It messed up my baloon! <br/>
Baloon#B2(2): There is some sun, let's enjoy good weather! <br/>
JetPlane#J1(3): We are going to freeze! <br/>
Helicopter#H2(5): It's so hot! <br/>
Helicopter#H3(6): I see no ground! <br/>
Baloon#B3(7): I hate fog, I cannot see anything at all! <br/>
JetPlane#J2(8): This sun is getting to my eyes! <br/>
Helicopter#H4(9): Winter is coming! <br/>

Simulation: 8 <br/> 
Baloon#B1(1): There is some sun, let's enjoy good weather! <br/>
Baloon#B2(2): There is some sun, let's enjoy good weather! <br/>
JetPlane#J1(3): We are going to freeze! <br/>
Helicopter#H2(5): Winter is coming! <br/>
Helicopter#H3(6): Winter is coming! <br/>
Baloon#B3(7): I hate fog, I cannot see anything at all! <br/>
JetPlane#J2(8): We are going to freeze! <br/>
Helicopter#H4(9): This rain is so depressing... <br/>

Simulation: 9 <br/>
Baloon#B1(1): I hate fog, I cannot see anything at all! <br/>
Baloon#B2(2): It's rain! It messed up my baloon! <br/>
JetPlane#J1(3): Watch out for lightnings! <br/>
Helicopter#H2(5): It's so hot! <br/>
Helicopter#H3(6): I see no ground! <br/>
Baloon#B3(7): It's snowing! We should be more careful! <br/>
Tower says: Baloon#B3(7) unregistered from weather tower. <br/>
JetPlane#J2(8): This sun is getting to my eyes! <br/>
Helicopter#H4(9): This rain is so depressing... <br/>

Simulation: 10 <br/>
Baloon#B1(1): It's rain! It messed up my baloon! <br/>
Tower says: Baloon#B1(1) unregistered from weather tower. <br/>
Baloon#B2(2): It's rain! It messed up my baloon! <br/>
JetPlane#J1(3): We are going to freeze! <br/>
Helicopter#H2(5): I see no ground! <br/>
Helicopter#H3(6): I see no ground! <br/>
JetPlane#J2(8): This sun is getting to my eyes! <br/>
Helicopter#H4(9): Winter is coming! <br/>

Simulation: 11 <br/>
Baloon#B2(2): There is some sun, let's enjoy good weather! <br/>
JetPlane#J1(3): Gamn fog! <br/>
Helicopter#H2(5): Winter is coming! <br/>
Helicopter#H3(6): Winter is coming! <br/>
JetPlane#J2(8): This sun is getting to my eyes! <br/>
Helicopter#H4(9): I see no ground! <br/>

Simulation: 12 <br/>
Baloon#B2(2): There is some sun, let's enjoy good weather! <br/>
JetPlane#J1(3): We are going to freeze! <br/>
Helicopter#H2(5): It's so hot! <br/>
Helicopter#H3(6): It's so hot! <br/>
JetPlane#J2(8): This sun is getting to my eyes! <br/>
Helicopter#H4(9): It's so hot! <br/>

Simulation: 13 <br/>
Baloon#B2(2): I hate fog, I cannot see anything at all! <br/>
JetPlane#J1(3): This sun is getting to my eyes! <br/>
Helicopter#H2(5): It's so hot! <br/>
Helicopter#H3(6): Winter is coming! <br/>
JetPlane#J2(8): This sun is getting to my eyes! <br/>
Helicopter#H4(9): Winter is coming! <br/>

Simulation: 14 <br/>
Baloon#B2(2): There is some sun, let's enjoy good weather! <br/>
JetPlane#J1(3): Gamn fog! <br/>
Helicopter#H2(5): Winter is coming! <br/>
Tower says: Helicopter#H2(5) unregistered from weather tower. <br/>
Helicopter#H3(6): Winter is coming! <br/>
JetPlane#J2(8): We are going to freeze! <br/>
Helicopter#H4(9): Winter is coming! <br/>
Tower says: Helicopter#H4(9) unregistered from weather tower. <br/>

Simulation: 15 <br/>
Baloon#B2(2): There is some sun, let's enjoy good weather! <br/>
JetPlane#J1(3): This sun is getting to my eyes! <br/>
Helicopter#H3(6): It's so hot! <br/>
JetPlane#J2(8): This sun is getting to my eyes! <br/>

Simulation: 16 <br/>
Baloon#B2(2): It's snowing! We should be more careful! <br/>
JetPlane#J1(3): We are going to freeze! <br/>
Helicopter#H3(6): This rain is so depressing... <br/>
JetPlane#J2(8): Gamn fog! <br/>

Simulation: 17 <br/>
Baloon#B2(2): There is some sun, let's enjoy good weather! <br/>
JetPlane#J1(3): We are going to freeze! <br/>
Tower says: JetPlane#J1(3) unregistered from weather tower. <br/>
Helicopter#H3(6): It's so hot! <br/>
JetPlane#J2(8): Gamn fog! <br/>

Simulation: 18 <br/>
Baloon#B2(2): It's rain! It messed up my baloon! <br/>
Helicopter#H3(6): I see no ground! <br/>
JetPlane#J2(8): We are going to freeze! <br/>

Simulation: 19 <br/>
Baloon#B2(2): I hate fog, I cannot see anything at all! <br/>
Helicopter#H3(6): This rain is so depressing... <br/>
JetPlane#J2(8): We are going to freeze! <br/>

Simulation: 20 <br/>
Baloon#B2(2): It's snowing! We should be more careful! <br/>
Helicopter#H3(6): I see no ground! <br/>
JetPlane#J2(8): Watch out for lightnings! <br/>
 
Simulation: 21 <br/>
Baloon#B2(2): I hate fog, I cannot see anything at all! <br/>
Helicopter#H3(6): I see no ground! <br/>
JetPlane#J2(8): Gamn fog! <br/>

Simulation: 22 <br/>
Baloon#B2(2): I hate fog, I cannot see anything at all! <br/>
Tower says: Baloon#B2(2) unregistered from weather tower. <br/>
Helicopter#H3(6): I see no ground! <br/>
JetPlane#J2(8): This sun is getting to my eyes! <br/>

Simulation: 23 <br/>
Helicopter#H3(6): Winter is coming! <br/>
JetPlane#J2(8): Watch out for lightnings! <br/>

Simulation: 24 <br/>
Helicopter#H3(6): It's so hot! <br/>
JetPlane#J2(8): This sun is getting to my eyes! <br/>
 
Simulation: 25 <br/>
Helicopter#H3(6): I see no ground! <br/>
JetPlane#J2(8): This sun is getting to my eyes! <br/>

