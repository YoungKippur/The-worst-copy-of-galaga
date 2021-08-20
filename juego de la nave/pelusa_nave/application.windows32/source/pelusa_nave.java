import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class pelusa_nave extends PApplet {


int a;
int b;
int c;
int d;
int e;
int f;

int t1;
int t2;
int t3;

int t11;
int t22;
int t33;
int t44;
int t55;
int t66;

int colo;

int c1;
int c2;
int c3;
int c4;
int c5;
int c6;
int c7;
int c8;

int c9;
int c10;
int c11;
int c12;
int c13;
int c14;

int c15;
int c16;

int c17;
int c18;
int c19;

int g1;
int g2;
int g3;

int  v;

public void setup()
{
  
a = 560;
b = 640;
c = 600;  
d = 600;
e = 500;
f = 5;  
  
t1 = 60;
t2 = 140;
t3 = 100;

t11 = 93;
t22 = 107;
t33 = 100;
t44 = 110;
t55 = 100;
t66 = 60;


c1 = 0xffFC1414;
c2 = 0xffFC1414;
c3 = 0xffFC1414;
c4 = 0xffFC1414;
c5 = 0xffFC1414;
c6 = 0xffFC1414;
c7 = 0xffFC1414;
c8 = 0xffFC1414;

c9 = 0xffFCCF14;
c10 = 0xffFCCF14;
c11 = 0xffFCCF14;
c12 = 0xffFCCF14;
c13 = 0xffFCCF14;
c14 = 0xffFCCF14;

c15 = 0xff151414;
c16 = 0xff151414;

c17 = 0xff151414;
c18 = 0xff151414;
c19 = 0xff151414;

g1 = 510; 
g2 = 510;
g3 = 460;

v  = 0;



background(0xff151414);


if ( e < 0){  

e = 470;
  
  
}  
}

public void draw()
{

  
background(0xff151414);

fill(c1);

triangle(t1,t66,t2,t66,t3,t44);

fill(c2);

triangle(t1+100,t66,t2+100,t66,t3+100,t44);

fill(c3);

triangle(t1+200,t66,t2+200,t66,t3+200,t44);

fill(c4);

triangle(t1+300,t66,t2+300,t66,t3+300,t44);

fill(c5);

triangle(t1+700,t66,t2+700,t66,t3+700,t44);

fill(c6);

triangle(t1+800,t66,t2+800,t66,t3+800,t44);

fill(c7);

triangle(t1+900,t66,t2+900,t66,t3+900,t44);

fill(c8);

triangle(t1+1000,t66,t2+1000,t66,t3+1000,t44);



fill(c9);
triangle(t1+50,t66+100,t2+50,t66+100,t3+50,t44+100);

fill(c10);
triangle(t1+150,t66+100,t2+150,t66+100,t3+150,t44+100);

fill(c11);
triangle(t1+250,t66+100,t2+250,t66+100,t3+250,t44+100);

fill(c12);
triangle(t1+750,t66+100,t2+750,t66+100,t3+750,t44+100);

fill(c13);
triangle(t1+850,t66+100,t2+850,t66+100,t3+850,t44+100);

fill(c14);
triangle(t1+950,t66+100,t2+950,t66+100,t3+950,t44+100);



fill(c15);
triangle(t1+400,t66+200,t2+400,t66+200,t3+400,t44+200);

fill(c16);
triangle(t1+600,t66+200,t2+600,t66+200,t3+600,t44+200);



fill(c17);
triangle(t1+430,t66+10,t2+570,t66+10,t3+500,t44+70);

fill(c18);
triangle(t1+780,t66+240,t2+920,t66+240,t3+850,t44+300);

fill(c19);
triangle(t1+80,t66+240,t2+220,t66+240,t3+150,t44+300);



fill(0xffFFFFFF);

triangle(a,g1,b,g2,c,g3);

noStroke();

ellipse(d,e,10,10);

if ( key == 'p' ){

f = 0;  
e = e -10;


}
 
if (d == 100){
if(e == 100) {

c1 = 0xff151414;
  
}
} 
if (d == 200){
if(e == 100) {
  
c2 = 0xff151414;
  
}
} 



if (d == 300){
if(e == 100) {

c3 = 0xff151414;
  
}
} 

if (d == 400){
if(e == 100) {

c4 = 0xff151414;
}
} 

if (d == 800){
if(e == 100) {

c5 = 0xff151414;
}
} 

if (d == 900){
if(e == 100) {

c6 = 0xff151414;
}
} 

if (d == 1000){
if(e == 100) {

c7 = 0xff151414;
}
} 

if (d == 1100){
if(e == 100) {

c8 = 0xff151414;

}
} 

if (d == 150){
if(e == 200) {
  
c9 = 0xff151414;
  
}
} 

if (d == 250){
if(e == 200) {
  
c10 = 0xff151414;
  
}
} 

if (d == 350){
if(e == 200) {
  
c11 = 0xff151414;
  
}
} 

if (d == 850){
if(e == 200) {
  
c12 = 0xff151414;
  
}
} 


if (d == 950){
if(e == 200) {
  
c13 = 0xff151414;
  
}
} 

if (d == 1050){
if(e == 200) {
  
c14 = 0xff151414;
  
}
} 

if (d == 500){
if(e == 300) {
  
c15 = 0xff151414;
  
}
} 

if (d == 700){
if(e == 300) {
  
c16 = 0xff151414;
  
}
} 

if (d == 600){
if (e == 170) {
  
c17 = 0xff151414;
  
}
} 

if (d == 950){
if (e == 400) {
  
c18 = 0xff151414;
  
}
} 

if (d == 250){
if (e == 400) {
  
c19 = 0xff151414;
  
}
} 

if (c1 == 0xff151414){
if (c2 == 0xff151414){
if (c3 == 0xff151414){  
if (c4 == 0xff151414){
if (c5 == 0xff151414){
if (c6 == 0xff151414){
if (c7 == 0xff151414){  
if (c8 == 0xff151414){
if (c9 == 0xff151414){
if (c10 == 0xff151414){
if (c11 == 0xff151414){  
if (c12 == 0xff151414){  
if (c13 == 0xff151414){  
if (c14 == 0xff151414){ 
if (v == 0){
  
v  = 1;  

c1 = 0xff1B91F5;
c2 = 0xff1B91F5;
c3 = 0xff1B91F5;
c4 = 0xff1B91F5;
c5 = 0xff1B91F5;
c6 = 0xff1B91F5;
c7 = 0xff1B91F5;
c8 = 0xff1B91F5;

c9  = 0xff050CB4;
c10 = 0xff050CB4;
c11 = 0xff050CB4;
c12 = 0xff050CB4;
c13 = 0xff050CB4;
c14 = 0xff050CB4;


c15 = 0xff1B91F5;
c16 = 0xff1B91F5;

}
} 
}
}
}
}
}
}
}
}
}
}
}
}
}


if (c1 == 0xff151414){
if (c2 == 0xff151414){
if (c3 == 0xff151414){  
if (c4 == 0xff151414){
if (c5 == 0xff151414){
if (c6 == 0xff151414){
if (c7 == 0xff151414){  
if (c8 == 0xff151414){
if (c9 == 0xff151414){
if (c10 == 0xff151414){
if (c11 == 0xff151414){  
if (c12 == 0xff151414){  
if (c13 == 0xff151414){  
if (c14 == 0xff151414){ 
if (c15 == 0xff151414){  
if (c16 == 0xff151414){ 
if (v == 1){
  
v  = 2;  

c17 = 0xffEA8042;

}
} 
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}

if (c1 == 0xff151414){
if (c2 == 0xff151414){
if (c3 == 0xff151414){  
if (c4 == 0xff151414){
if (c5 == 0xff151414){
if (c6 == 0xff151414){
if (c7 == 0xff151414){  
if (c8 == 0xff151414){
if (c9 == 0xff151414){
if (c10 == 0xff151414){
if (c11 == 0xff151414){  
if (c12 == 0xff151414){  
if (c13 == 0xff151414){  
if (c14 == 0xff151414){ 
if (c15 == 0xff151414){  
if (c16 == 0xff151414){
if (c17 == 0xff151414){
if (v == 2){
  
v  = 3;  

c18 = 0xffEA8042;

}
} 
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}

if (c1 == 0xff151414){
if (c2 == 0xff151414){
if (c3 == 0xff151414){  
if (c4 == 0xff151414){
if (c5 == 0xff151414){
if (c6 == 0xff151414){
if (c7 == 0xff151414){  
if (c8 == 0xff151414){
if (c9 == 0xff151414){
if (c10 == 0xff151414){
if (c11 == 0xff151414){  
if (c12 == 0xff151414){  
if (c13 == 0xff151414){  
if (c14 == 0xff151414){ 
if (c15 == 0xff151414){  
if (c16 == 0xff151414){
if (c17 == 0xff151414){
if (c18 == 0xff151414){
if (v == 3){
  
v  = 4;  

c19 = 0xffEA8042;

}
} 
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}

if (c1 == 0xff151414){
if (c2 == 0xff151414){
if (c3 == 0xff151414){  
if (c4 == 0xff151414){
if (c5 == 0xff151414){
if (c6 == 0xff151414){
if (c7 == 0xff151414){  
if (c8 == 0xff151414){
if (c9 == 0xff151414){
if (c10 == 0xff151414){
if (c11 == 0xff151414){  
if (c12 == 0xff151414){  
if (c13 == 0xff151414){  
if (c14 == 0xff151414){ 
if (c15 == 0xff151414){  
if (c16 == 0xff151414){
if (c17 == 0xff151414){
if (c18 == 0xff151414){
if (c19 == 0xff151414){
if (v == 4){
  
v  = 5;  

g1 = 510; 
g2 = 510;
g3 = 460;

g1 = g1+1;
g2 = g2+1;
g3 = g3+1;

}
} 
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}
}

}


public void keyPressed() {

  if (key == CODED) {
if (keyCode == LEFT) {

f = 10;  
e = 470;  
        
a = a - f;
b = b - f;
c = c - f;
d = d - f;
  
  
}
}
  


if (key == CODED) {
if (keyCode == LEFT) {

f = 10;  
e = 470;  
        
a = a + f;
b = b + f;
c = c + f;
d = d + f;
  
  
}
}
}
  public void settings() { 
size(1200,600); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "pelusa_nave" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
