package main;
import java.io.*;
import sun.audio.*;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;


public class Final extends JFrame
{
	//array for the buttons
JButton[] buttons = new JButton[26];
	
static ArrayList<Integer> positions = new ArrayList<Integer>();
	

//sets layout of buttons
	private GridLayout layout = new GridLayout(5, 5, 1, 1);
	
	
	//holds all the buttons
	private Container con = getContentPane();
	
	public Final()
	{
//names button and values button
buttons[0] = new JButton("NOOOOO!");

//give the button its action
{buttons[0].addActionListener(e->
{
	//tells the button to use method
	try {
		no();
		
	//use the exception of the method
	} catch (Exception e1) {
		e1.printStackTrace();
	}
});
}

	
	 buttons[1]= new JButton("FALCON PUNCH");
	{buttons[1].addActionListener(e->
	{
		try {
			FP();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	});
	}
		
	 buttons[2]= new JButton("BRUH");
	{buttons[2].addActionListener(e->
	{
		try {
			BRUH();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	});
	}
	
	 buttons[3]= new JButton("Saxual Saxsation");
	{buttons[3].addActionListener(e->
	{
		try {
			SS();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	});
	}
	
	 buttons[4]= new JButton("Lemme Smash");
	{buttons[4].addActionListener(e->
	{
		try {
			smash();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	});
	}
	
	 buttons[5]= new JButton("OH YES DADDY<3");
	{buttons[5].addActionListener(e->
	{
		try {
			oyd();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	});
	}
	
	 buttons[6]= new JButton("snoopydogg");
	{buttons[6].addActionListener(e->
	{
		try {
			snoop();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	});
	}
	 buttons[7]= new JButton("Suprise MotherF*cker");
	{buttons[7].addActionListener(e->
	{
		try {
			surprise();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	});
	}
	
	 buttons[8]= new JButton("TACTICAL NUKE");
	{buttons[8].addActionListener(e->
	{
		try {
			nuke();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	});
	}
	 buttons[9]= new JButton("MR.MEESEEKS");
	{buttons[9].addActionListener(e->
	{
		try {
			mr();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	});
	}
	 buttons[10]= new JButton("Sparta");
	{buttons[10].addActionListener(e->
	{
		try {
			sparta();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	});
	}
	 buttons[11]= new JButton("Combo Breaker");
	{buttons[11].addActionListener(e->
	{
		try {
			combo();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	});
	}
	 buttons[12]= new JButton("Aerobics");
	{buttons[12].addActionListener(e->
	{
		try {
			fitness();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	});
	}
	 buttons[13]= new JButton("DOH");
	{buttons[13].addActionListener(e->
	{
		try {
			doh();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	});
	}
	 buttons[14]= new JButton("MORTAL KOMBAT");
	{buttons[14].addActionListener(e->
	{
		try {
			finish();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	});
	}
	 buttons[15]= new JButton("Street Fighter");
	{buttons[15].addActionListener(e->
	{
		try {
			srkn();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	});
	}
	 buttons[16]= new JButton("Execute");
	{buttons[16].addActionListener(e->
	{
		try {
			order();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	});
	}
	 buttons[17]= new JButton("whitney");
	{buttons[17].addActionListener(e->
	{
		try {
			luvu();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	});
	}
	
	 buttons[18]= new JButton("Triple");
	{buttons[18].addActionListener(e->
	{
		try {
			triple();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	});
	}
	
	 buttons[19]= new JButton("Shitendo");
	{buttons[19].addActionListener(e->
	{
		try {
			gc();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	});
	}
	
	 buttons[20]= new JButton("BOS");
	{buttons[20].addActionListener(e->
	{
		try {
			BOS();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	});
	}
	 buttons[21]= new JButton("ITS OVER 9000");
	{buttons[21].addActionListener(e->
	{
		try {
			nine();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	});
	}
	 buttons[22]= new JButton("trololololololololollolololololololololololololololololololololololololololololo");
	{buttons[22].addActionListener(e->
	{
		try {
			troll();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	});
	}
	 buttons[23]= new JButton("Annoying Fairy");
	{buttons[23].addActionListener(e->
	{
		try {
			listen();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	});
	}
	 buttons[24]= new JButton("AND HE IS.....");
	{buttons[24].addActionListener(e->
	{
		try {
			jc();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	});
	}
	 buttons[25]= new JButton("press me :) please i dont wanna be here ");
	{buttons[25].addActionListener(e->
	{
		try {
			
			//makes it exit the program for the lawls
			System.exit(0);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	});
	}
	
	// end of button comments. 
	
	
	//tells you how many buttons you will get and what buttons they are. 
	for (int i = 0; i < buttons.length; i++) {
	randomNum();
	}
	//sets the layout of the buttons for how many buttons it was given. 
	con.setLayout(layout);
	
	
	//adds the random amount of buttons.
	for (int i = 0; i < buttons.length; i++) 
	{
		//randomizes the positions of the buttons.
		con.add(buttons[positions.get(i)-1]);
		
	}
		//size of the buttons.
		setSize(200, 200);
		
	}
	
	
	public static void main(String[] args) 
	throws Exception 
	{
		//makes the buttons visible
		Final frame = new Final();
		frame.setVisible(true);
	

	}
	
	
	
	
	//class for random buttons. 
	public static void randomNum()
	{
		Random rand = new Random();

		int  n = rand.nextInt(26) + 1;
		
		if(positions.contains(n))
		{
			
			randomNum();
		}
		
		positions.add(n);
	}
	
	
	
	
	public static void no()
			throws Exception 
			{
				//finds path of file
				Path path = Paths.get("no.wav");
				Path realPath = path.toRealPath(LinkOption.NOFOLLOW_LINKS);
				//makes path into a string
				String place = realPath.toString();
				  String wav_file = place;
				  //string can now be read by filefinder
				InputStream in = new FileInputStream(wav_file);
				
				//plays audio
				  AudioStream audio = new AudioStream(in);
				  AudioPlayer.player.start(audio);
			}



			public static void FP()
			throws Exception 
			{
				Path path = Paths.get("FP.wav");
				Path realPath = path.toRealPath(LinkOption.NOFOLLOW_LINKS);
				String place = realPath.toString();
				  String wav_file = place;
				InputStream in = new FileInputStream(wav_file); 
				  AudioStream audio = new AudioStream(in);
				  AudioPlayer.player.start(audio);
			}
			public static void BRUH()
			throws Exception 
			{
				Path path = Paths.get("BRUH.wav");
				Path realPath = path.toRealPath(LinkOption.NOFOLLOW_LINKS);
				String place = realPath.toString();
				  String wav_file = place;
				InputStream in = new FileInputStream(wav_file);
				  AudioStream audio = new AudioStream(in);
				  AudioPlayer.player.start(audio);
			}

			public static void SS()
			throws Exception 
			{
				Path path = Paths.get("SS.wav");
				Path realPath = path.toRealPath(LinkOption.NOFOLLOW_LINKS);
				String place = realPath.toString();
				  String wav_file = place;
				InputStream in = new FileInputStream(wav_file);
				  AudioStream audio = new AudioStream(in);
				  AudioPlayer.player.start(audio);
			}
			public static void oyd()
			throws Exception 
			{
				Path path = Paths.get("oyd.wav");
				Path realPath = path.toRealPath(LinkOption.NOFOLLOW_LINKS);
				String place = realPath.toString();
				  String wav_file = place;
				InputStream in = new FileInputStream(wav_file);
				  AudioStream audio = new AudioStream(in);
				  AudioPlayer.player.start(audio);
			}
			public static void nine()
			throws Exception 
			{
				Path path = Paths.get("9000.wav");
				Path realPath = path.toRealPath(LinkOption.NOFOLLOW_LINKS);
				String place = realPath.toString();
				  String wav_file = place;
				InputStream in = new FileInputStream(wav_file);
				  AudioStream audio = new AudioStream(in);
				  AudioPlayer.player.start(audio);
			}
			public static void nuke()
			throws Exception 
			{
				Path path = Paths.get("nuke.wav");
				Path realPath = path.toRealPath(LinkOption.NOFOLLOW_LINKS);
				String place = realPath.toString();
				  String wav_file = place;
				InputStream in = new FileInputStream(wav_file);
				  AudioStream audio = new AudioStream(in);
				  AudioPlayer.player.start(audio);
			}
			public static void mr()
			throws Exception 
			{
				Path path = Paths.get("mr.wav");
				Path realPath = path.toRealPath(LinkOption.NOFOLLOW_LINKS);
				String place = realPath.toString();
				  String wav_file = place;
				InputStream in = new FileInputStream(wav_file);
				  AudioStream audio = new AudioStream(in);
				  AudioPlayer.player.start(audio);
			}
			public static void luvu()
			throws Exception 
			{
				Path path = Paths.get("luvu.wav");
				Path realPath = path.toRealPath(LinkOption.NOFOLLOW_LINKS);
				String place = realPath.toString();
				  String wav_file = place;
				InputStream in = new FileInputStream(wav_file);
				  AudioStream audio = new AudioStream(in);
				  AudioPlayer.player.start(audio);
			}
			public static void listen()
			throws Exception 
			{
				Path path = Paths.get("listen.wav");
				Path realPath = path.toRealPath(LinkOption.NOFOLLOW_LINKS);
				String place = realPath.toString();
				  String wav_file = place;
				InputStream in = new FileInputStream(wav_file);
				  AudioStream audio = new AudioStream(in);
				  AudioPlayer.player.start(audio);
			}
			public static void surprise()
			throws Exception 
			{
				Path path = Paths.get("surprise.wav");
				Path realPath = path.toRealPath(LinkOption.NOFOLLOW_LINKS);
				String place = realPath.toString();
				  String wav_file = place;
				InputStream in = new FileInputStream(wav_file);
				  AudioStream audio = new AudioStream(in);
				  AudioPlayer.player.start(audio);
			}
			public static void triple()
			throws Exception 
			{
				Path path = Paths.get("triple.wav");
				Path realPath = path.toRealPath(LinkOption.NOFOLLOW_LINKS);
				String place = realPath.toString();
				  String wav_file = place;
				InputStream in = new FileInputStream(wav_file);
				  AudioStream audio = new AudioStream(in);
				  AudioPlayer.player.start(audio);
			}
			public static void troll()
			throws Exception 
			{
				Path path = Paths.get("troll.wav");
				Path realPath = path.toRealPath(LinkOption.NOFOLLOW_LINKS);
				String place = realPath.toString();
				  String wav_file = place;
				InputStream in = new FileInputStream(wav_file);
				  AudioStream audio = new AudioStream(in);
				  AudioPlayer.player.start(audio);
			}
			public static void combo()
			throws Exception 
			{
				Path path = Paths.get("combo.wav");
				Path realPath = path.toRealPath(LinkOption.NOFOLLOW_LINKS);
				String place = realPath.toString();
				  String wav_file = place;
				InputStream in = new FileInputStream(wav_file);
				  AudioStream audio = new AudioStream(in);
				  AudioPlayer.player.start(audio);
			}
			public static void gc()
			throws Exception 
			{
				Path path = Paths.get("gc.wav");
				Path realPath = path.toRealPath(LinkOption.NOFOLLOW_LINKS);
				String place = realPath.toString();
				  String wav_file = place;
				InputStream in = new FileInputStream(wav_file);
				  AudioStream audio = new AudioStream(in);
				  AudioPlayer.player.start(audio);
			}
			public static void doh()
			throws Exception 
			{
				Path path = Paths.get("doh.wav");
				Path realPath = path.toRealPath(LinkOption.NOFOLLOW_LINKS);
				String place = realPath.toString();
				  String wav_file = place;
				InputStream in = new FileInputStream(wav_file);
				  AudioStream audio = new AudioStream(in);
				  AudioPlayer.player.start(audio);
			}
			public static void sparta()
			throws Exception 
			{
				Path path = Paths.get("sparta.wav");
				Path realPath = path.toRealPath(LinkOption.NOFOLLOW_LINKS);
				String place = realPath.toString();
				  String wav_file = place;
				InputStream in = new FileInputStream(wav_file);
				  AudioStream audio = new AudioStream(in);
				  AudioPlayer.player.start(audio);
			}
			public static void srkn()
			throws Exception 
			{
				Path path = Paths.get("srkn.wav");
				Path realPath = path.toRealPath(LinkOption.NOFOLLOW_LINKS);
				String place = realPath.toString();
				  String wav_file = place;
				InputStream in = new FileInputStream(wav_file);
				  AudioStream audio = new AudioStream(in);
				  AudioPlayer.player.start(audio);
			}
			public static void order()
			throws Exception 
			{
				Path path = Paths.get("order.wav");
				Path realPath = path.toRealPath(LinkOption.NOFOLLOW_LINKS);
				String place = realPath.toString();
				  String wav_file = place;
				InputStream in = new FileInputStream(wav_file);
				  AudioStream audio = new AudioStream(in);
				  AudioPlayer.player.start(audio);
			}
			public static void BOS()
			throws Exception 
			{
				Path path = Paths.get("BOS.wav");
				Path realPath = path.toRealPath(LinkOption.NOFOLLOW_LINKS);
				String place = realPath.toString();
				  String wav_file = place;
				InputStream in = new FileInputStream(wav_file);
				  AudioStream audio = new AudioStream(in);
				  AudioPlayer.player.start(audio);
			}
			public static void finish()
			throws Exception 
			{
				Path path = Paths.get("finish.wav");
				Path realPath = path.toRealPath(LinkOption.NOFOLLOW_LINKS);
				String place = realPath.toString();
				  String wav_file = place;
				InputStream in = new FileInputStream(wav_file);
				  AudioStream audio = new AudioStream(in);
				  AudioPlayer.player.start(audio);
			}
			public static void jc()
			throws Exception 
			{
				Path path = Paths.get("jc.wav");
				Path realPath = path.toRealPath(LinkOption.NOFOLLOW_LINKS);
				String place = realPath.toString();
				  String wav_file = place;
				InputStream in = new FileInputStream(wav_file);
				  AudioStream audio = new AudioStream(in);
				  AudioPlayer.player.start(audio);
			}
			public static void fitness()
			throws Exception 
			{
				Path path = Paths.get("fitness.wav");
				Path realPath = path.toRealPath(LinkOption.NOFOLLOW_LINKS);
				String place = realPath.toString();
				  String wav_file = place;
				InputStream in = new FileInputStream(wav_file);
				  AudioStream audio = new AudioStream(in);
				  AudioPlayer.player.start(audio);
			}
			public static void snoop()
			throws Exception 
			{
				Path path = Paths.get("snoop.wav");
				Path realPath = path.toRealPath(LinkOption.NOFOLLOW_LINKS);
				String place = realPath.toString();
				  String wav_file = place;
				InputStream in = new FileInputStream(wav_file);
				  AudioStream audio = new AudioStream(in);
				  AudioPlayer.player.start(audio);
			}
			public static void smash()
			throws Exception 
			{
				Path path = Paths.get("smash.wav");
				Path realPath = path.toRealPath(LinkOption.NOFOLLOW_LINKS);
				String place = realPath.toString();
				  String wav_file = place;
				InputStream in = new FileInputStream(wav_file);
				  AudioStream audio = new AudioStream(in);
				  AudioPlayer.player.start(audio);
			}
			

			
			
			
			public static void trollbutton()
			{
				
			}
			public static void randomsounds()
			{
				
			}
			//end of sounds comments.

}
