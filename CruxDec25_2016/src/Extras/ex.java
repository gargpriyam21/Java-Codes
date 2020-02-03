package Extras;

import java.awt.*;

import java.applet.*;



public class ex extends Applet implements Runnable { String msg = " It is a moving Banner. ";

char cha;

boolean stopFlag = true;

Thread t = null;

public void start() {

t = new Thread(this);

stopFlag = false;

t.start();

}

public void run() {

while(true) {

try {

repaint();

Thread.sleep(250);

cha = msg.charAt(0);

msg = msg.substring(1,msg.length());

msg = msg + cha;

if(stopFlag) break;
 
}

catch(InterruptedException e) {}

}

}

public void stop(){

stopFlag = true;

t = null;

}

public void paint(Graphics g) {

g.drawString(msg,60,30);

}

}
