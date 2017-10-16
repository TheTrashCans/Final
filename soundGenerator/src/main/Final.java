package main;
import java.io.*;
import sun.audio.*;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;


public class Final extends JFrame
{
private JButton b1 = new JButton("NOOOOO!");
{b1.addActionListener(e->
{
	try {
		no();
	} catch (Exception e1) {
		e1.printStackTrace();
	}
});
}
	
	private JButton b2 = new JButton("FALCON PUNCH");
	{b2.addActionListener(e->
	{
		try {
			FP();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	});
	}
		
	private JButton b3 = new JButton("BRUH");
	{b3.addActionListener(e->
	{
		try {
			BRUH();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	});
	}
	
	private JButton b4 = new JButton("Saxual Saxsation");
	{b4.addActionListener(e->
	{
		try {
			SS();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	});
	}
	
	private JButton b5 = new JButton("Lemme Smash");
	{b5.addActionListener(e->
	{
		try {
			smash();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	});
	}
	
	private JButton b6 = new JButton("OH YES DADDY<3");
	{b6.addActionListener(e->
	{
		try {
			oyd();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	});
	}
	
	private JButton b7 = new JButton("snoopydogg");
	{b7.addActionListener(e->
	{
		try {
			snoop();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	});
	}
	private JButton b8 = new JButton("Suprise MotherF*cker");
	{b8.addActionListener(e->
	{
		try {
			surprise();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	});
	}
	
	private JButton b9 = new JButton("TACTICAL NUKE");
	{b9.addActionListener(e->
	{
		try {
			nuke();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	});
	}
	private JButton b10 = new JButton("MR.MEESEEKS");
	{b10.addActionListener(e->
	{
		try {
			mr();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	});
	}
	private JButton b11 = new JButton("Sparta");
	{b11.addActionListener(e->
	{
		try {
			sparta();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	});
	}
	private JButton b12 = new JButton("Combo Breaker");
	{b12.addActionListener(e->
	{
		try {
			combo();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	});
	}
	private JButton b13 = new JButton("Aerobics");
	{b13.addActionListener(e->
	{
		try {
			fitness();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	});
	}
	private JButton b14 = new JButton("DOH");
	{b14.addActionListener(e->
	{
		try {
			doh();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	});
	}
	private JButton b15 = new JButton("MORTAL KOMBAT");
	{b15.addActionListener(e->
	{
		try {
			finish();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	});
	}
	private JButton b16 = new JButton("Street Fighter");
	{b16.addActionListener(e->
	{
		try {
			srkn();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	});
	}
	private JButton b17 = new JButton("Execute");
	{b17.addActionListener(e->
	{
		try {
			order();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	});
	}
	private JButton b18 = new JButton("Coke Addict");
	{b18.addActionListener(e->
	{
		try {
			luvu();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	});
	}
	
	private JButton b19 = new JButton("Triple");
	{b19.addActionListener(e->
	{
		try {
			triple();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	});
	}
	
	private JButton b20 = new JButton("Shitendo");
	{b20.addActionListener(e->
	{
		try {
			gc();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	});
	}
	
	private JButton b21 = new JButton("BOS");
	{b21.addActionListener(e->
	{
		try {
			BOS();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	});
	}
	private JButton b22= new JButton("ITS OVER 9000");
	{b22.addActionListener(e->
	{
		try {
			nine();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	});
	}
	private JButton b23= new JButton("trololololololololollolololololololololololololololololololololololololololololo");
	{b23.addActionListener(e->
	{
		try {
			troll();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	});
	}
	private JButton b24= new JButton("Annoying Fairy");
	{b24.addActionListener(e->
	{
		try {
			listen();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	});
	}
	private JButton b25= new JButton("AND HE IS.....");
	{b25.addActionListener(e->
	{
		try {
			jc();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	});
	}
	
	private GridLayout layout = new GridLayout(5, 5, 1, 1);
	private Container con = getContentPane();
	public Final()
	{
		con.setLayout(layout);
		con.add(b1);
		con.add(b2);
		con.add(b3);
		con.add(b4);
		con.add(b5);
		con.add(b6);
		con.add(b7);
		con.add(b8);
		con.add(b9);
		con.add(b10);
		con.add(b11);
		con.add(b12);
		con.add(b13);
		con.add(b14);
		con.add(b15);
		con.add(b16);
		con.add(b17);
		con.add(b18);
		con.add(b19);
		con.add(b20);
		con.add(b21);
		con.add(b22);
		con.add(b23);
		con.add(b24);
		con.add(b25);
		setSize(200, 200);
		
	}
	public static void main(String[] args) 
	throws Exception 
	{
		Final frame = new Final();
		frame.setVisible(true);
	

		no();
		FP();
		


	}
	public static void no()
			throws Exception 
			{
				
				Path path = Paths.get("no.wav");
				Path realPath = path.toRealPath(LinkOption.NOFOLLOW_LINKS);
				String place = realPath.toString();
				  String wav_file = place;
				InputStream in = new FileInputStream(wav_file);
				  AudioStream audio = new AudioStream(in);
				  AudioPlayer.player.stop(audio);
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
				  AudioPlayer.player.stop(audio);
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
			


}
