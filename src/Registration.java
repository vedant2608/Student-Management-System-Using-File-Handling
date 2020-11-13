
/**
 * @author lenovo
 *
 */
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.io.*;
import java.util.regex.*;





class deleted extends Frame
{
   deleted()
   {
	   setFont(new Font("Helvetica",Font.BOLD,20)); 
		setSize(300,200);
		setLocationRelativeTo(null);
		Label error=new Label("File Deleted",Label.CENTER);
		add(error);
		addWindowListener(new WindowAdapter() {
			 public void windowClosing(WindowEvent e)
			 {
				 dispose();
			 }
		  });
   }
}

class task_asked extends Frame implements ActionListener
{
	deleted deleted;
	File f1;
	Button yes,no;
	String file;
	task_asked(String file_name)
	{
		file=file_name;
		setFont(new Font("Helvetica",Font.BOLD,20)); 
		setSize(700,700);
		setLocationRelativeTo(null);
		setLayout(null);
		Label error=new Label("Are you sure to that you want to delete this file");
		add(error);
		error.setBounds(100,100,500,60);
		yes=new Button("Yes");
		yes.setBounds(200,200,70,30);
		add(yes);
		no=new Button("No");
		no.setBounds(400,200,70,30);
		add(no);
		addWindowListener(new WindowAdapter() {
			 public void windowClosing(WindowEvent e)
			 {
				 dispose();
			 }
		  });
		yes.addActionListener(this);
		no.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==yes)
		{
			f1=new File("..\\src\\Students\\"+file+".txt");
			f1.delete();
			deleted=new deleted();
			deleted.setVisible(true);
			dispose();
			
		}
		else if(ae.getSource()==no)
		{
			dispose();
		}
	}
}
class filenotfound extends Frame
{
	filenotfound()
	{
		setFont(new Font("Helvetica",Font.BOLD,20)); 
		setSize(300,200);
		setLocationRelativeTo(null);
		Label error=new Label("This file does not exists",Label.CENTER);
		add(error);
		addWindowListener(new WindowAdapter() {
			 public void windowClosing(WindowEvent e)
			 {
				 dispose();
			 }
		  });
	}
}
class succesful_written extends Frame
{
	succesful_written()
	{
		setFont(new Font("Helvetica",Font.BOLD,20)); 
		setSize(300,200);
		Label error=new Label("Data is succesfully saved",Label.CENTER);
		add(error);
		addWindowListener(new WindowAdapter() {
			 public void windowClosing(WindowEvent e)
			 {
				 dispose();
			 }
		  });
	}
}
//Wrong EMail
class popupWrongEmail extends Frame
{
	
	
	popupWrongEmail()
	{
		setFont(new Font("Helvetica",Font.BOLD,20)); 
		setSize(300,200);
		Label error=new Label("Invalid email entry",Label.CENTER);
		add(error);
		addWindowListener(new WindowAdapter() {
			 public void windowClosing(WindowEvent e)
			 {
				 dispose();
			 }
		  });
	}
}
//Wrong empty information
class popupEmptyInformation extends Frame
{
	
	popupEmptyInformation()
	{
		setFont(new Font("Helvetica",Font.BOLD,20)); 
		setSize(800,200);
		Label error=new Label("Fill up the all above field/fields",Label.CENTER);
		add(error);
		addWindowListener(new WindowAdapter() {
			 public void windowClosing(WindowEvent e)
			 {
				 dispose();
			 }
		  });
	}
	
}
//invalid mobile
class popupInvalidMobile extends Frame
{
	
	popupInvalidMobile()
	{
		setFont(new Font("Helvetica",Font.BOLD,20)); 
		setSize(800,200);
		Label error=new Label("Enter the correct mobile number",Label.CENTER);
		add(error);
		addWindowListener(new WindowAdapter() {
			 public void windowClosing(WindowEvent e)
			 {
				 dispose();
			 }
		  });
	}
}
class FileExists extends Frame
{
	FileExists()
	{
	 
		setFont(new Font("Helvetica",Font.BOLD,20)); 
		setSize(800,200);
		Label error=new Label("This file already exists",Label.CENTER);
		add(error);
		addWindowListener(new WindowAdapter() {
			 public void windowClosing(WindowEvent e)
			 {
				 dispose();
			 }
		  });
	}
}
class popupInvalidAltMob extends Frame
{
	
	
	popupInvalidAltMob()
	{
		setSize(300,200);
		Label error=new Label("Invalid Alternate Mobile number",Label.CENTER);
		add(error);
		addWindowListener(new WindowAdapter() {
			 public void windowClosing(WindowEvent e)
			 {
				 dispose();
			 }
		  });
	}
}
/*
 * Popups when the showing file is not done
 */
class popupOpenFileNullPointer extends Frame
{
	popupOpenFileNullPointer()
	{
		setFont(new Font("Helvetica",Font.BOLD,20)); 
		setSize(800,200);
		Label error=new Label("File is empty",Label.CENTER);
		add(error);
		addWindowListener(new WindowAdapter() {
			 public void windowClosing(WindowEvent e)
			 {
				 dispose();
			 }
		  });
	}
}

class popupOpenFileIllegalArgument extends Frame
{
	popupOpenFileIllegalArgument()
	{
		setFont(new Font("Helvetica",Font.BOLD,20)); 
		setSize(800,200);
		Label error=new Label("This file does not exists",Label.CENTER);
		add(error);
		addWindowListener(new WindowAdapter() {
			 public void windowClosing(WindowEvent e)
			 {
				 dispose();
			 }
		  });
	}
}

class popupOpenFileIO extends Frame
{
	popupOpenFileIO(String path)
	{
		setFont(new Font("Helvetica",Font.BOLD,20)); 
		setSize(900,200);
		Label error=new Label("Their is no application to open this file.Find this file at:"+path);
		add(error);
		addWindowListener(new WindowAdapter() {
			 public void windowClosing(WindowEvent e)
			 {
				 dispose();
			 }
		  });
	}
}

class popupOpenFileUnsupportedOperation extends Frame
{
	popupOpenFileUnsupportedOperation(String path)
	{
		setFont(new Font("Helvetica",Font.BOLD,20)); 
		setSize(800,200);
		Label error=new Label("Current platform does not support this operation.Find the path at:"+path);
		add(error);
		addWindowListener(new WindowAdapter() {
			 public void windowClosing(WindowEvent e)
			 {
				 dispose();
			 }
		  });
	}
}

/******************************************************************
 * Delete the file
 *****************************************************************/
class delete_file extends Frame implements ActionListener
{
	Label label;
	TextField name;
	Button delete,yes,no;
	popupEmptyInformation p1;
	delete_file()
	{
		setName("Delete the data");
		
		setSize(1000,1000);
		setLayout(null);
		setFont(new Font("Helvetica",Font.BOLD,20));
		addWindowListener(new WindowAdapter() {
			 
	    	 public void windowClosing(WindowEvent e)
		 {
			 dispose();
		 }
	    });
		
     //submit.addActionListener(this);
	    label=new Label("Enter the roll number of student for deletion of record");
	    label.setBounds(300,400,600,30);
	    add(label);
		name=new TextField();
	    name.setBounds(350,450,300,40);
		add(name);
		delete=new Button("Delete");
	    delete.setBounds(400,500,200,50);
	    add(delete);
	    delete.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==delete)
		{
			try
			{
				File f1=new File("..\\src\\Students\\"+name.getText()+".txt");
		        if(f1.exists())
		        {
		        	task_asked tsa=new task_asked(name.getText());
		        	tsa.setVisible(true);
		        }
		        else if((name.getText()).isEmpty())
				{
					 p1=new popupEmptyInformation();
					 p1.setVisible(true);
					 p1.setLocationRelativeTo(null);
				}
				else if(!f1.exists())
				{
					filenotfound fnf=new filenotfound();
					fnf.setVisible(true);
					fnf.setLocationRelativeTo(null);
				}
		        /*******
		         * Check whether deleted or not
		         ******/
		        
		        
			}
			catch(Exception a)
			{
				System.out.println(a);
			}
		}
	}
}


/********************************************************************************
 * Show the record
 *******************************************************************************/
class Show extends Frame implements ActionListener
{
	Label lfilename;
	TextField tshow;
	Button next;
	File file;
	filenotfound fnf;
	show_content show_content;
	Show()
	{
	   setSize(700,700);
	   setLocationRelativeTo(null);
	   setLayout(null);
	   setFont(new Font("Helvetica",Font.BOLD,20)); 
	   addWindowListener(new WindowAdapter() {
			 public void windowClosing(WindowEvent e)
			 {
				 dispose();
			 }
		  });
	   lfilename=new Label("Enter the unique roll number of student");
	   lfilename.setBounds(160,250,700,40);
	   add(lfilename);
	   tshow=new TextField();
	   tshow.setBounds(240,300,250,40);
       add(tshow);
       next=new Button("Find");
       next.setBounds(310,350,90,50);
       add(next);
       next.addActionListener(this);
     }
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==next)
		{
			String file_name;
			try
			{
				file_name=tshow.getText();
;				file=new File("..\\src\\Students\\"+file_name+".txt");	
				if(!file.exists())
				{
					fnf=new filenotfound();
                    fnf.setVisible(true);
				}
				else if(file.exists())
				{
					show_content=new show_content(file_name);
					show_content.setVisible(false);
					show_content.setLocationRelativeTo(null);
				}
			}
			catch (Exception a)
			{
				System.out.println(a);
			}
			
		}
	}
}
class show_content extends Frame
{
	String total;
	Label data;
	show_content(String name)
	{
		
		super("The Data of roll number: "+name);
		String location;
		data=new Label();
		add(data);
		setSize(700,700);
		setLocationRelativeTo(null);
		File f=new File("..\\src\\Students\\"+name+".txt");
    	location=f.getAbsolutePath();
	    //setLayout(null);
	    setFont(new Font("Helvetica",Font.BOLD,20)); 
	    addWindowListener(new WindowAdapter() {
				 public void windowClosing(WindowEvent e)
				 {
					 dispose();
				 }
			  });
	    try 
	    {
	    	Desktop desktop = Desktop.getDesktop();  
	    	desktop.open(f);
	    }
		catch (NullPointerException i)
	    {
			popupOpenFileNullPointer p=new popupOpenFileNullPointer();
			p.setVisible(true);
			p.setLocationRelativeTo(null);
	    }
	    catch(IllegalArgumentException i)
	    {
	    	popupOpenFileIllegalArgument p=new popupOpenFileIllegalArgument();
			p.setVisible(true);
			p.setLocationRelativeTo(null);
	    }
	    catch(IOException i)
	    {
	    	popupOpenFileIO p=new popupOpenFileIO(location);
			p.setVisible(true);
			p.setLocationRelativeTo(null);
	    }
	    catch (UnsupportedOperationException i)
	    {
	    	popupOpenFileUnsupportedOperation p=new popupOpenFileUnsupportedOperation(location);
			p.setVisible(true);
			p.setLocationRelativeTo(null);
	    }
	    
	}
}
/***********************************************************************************
 * 
 * Updated to the file 
 *
 ***********************************************************************************/

class update_info extends Frame implements ActionListener,ItemListener
{
	String name_pass,roll_pass,mob_pass,email_pass,address_pass,altmob_pass,date_pass,month_pass,year_pass,gender_pass;	
	Label name, roll_no, dob, gender, mob, email, address,altmob;
	TextField tname, troll_no, tmob, temail,taltmob;
	Choice  date, month, year;
	Checkbox male, female, others, nottoprefer;
	CheckboxGroup ggender;
	Button submit;
    TextArea Taddress;
    Button save;
    String is_email_valid="no";
    popupWrongEmail emailpopup=new popupWrongEmail();
    popupEmptyInformation emptypopup =new popupEmptyInformation(); 
    popupInvalidMobile InvalidMobPop=new popupInvalidMobile();
    popupInvalidAltMob InvalidAltMobPop=new  popupInvalidAltMob();
   FileExists file=new FileExists();
   succesful_written sw;
	update_info(int bname,int broll_no,int bdob,int bgender,int bmob,int bemail,int baddress,int baltmob,String frame_name,String title)
	{
		super(frame_name);
		tname=new TextField(60);
		troll_no=new TextField(60);
		date=new Choice(); 
		month=new Choice();
		year=new Choice();
		ggender=new CheckboxGroup(); 
		male=new Checkbox("Male",false,ggender);
		female=new Checkbox("Female",false,ggender); 
		others=new Checkbox("Others",false,ggender); 
		nottoprefer=new Checkbox("Prefer not to say",false,ggender); 
		tmob=new TextField(); 
		taltmob=new TextField();
		Taddress=new TextArea();
		temail=new TextField(); 
		File chngd_dta;
		setFont(new Font("Helvetica",Font.BOLD,20)); 
		setSize(1000,1000);
		setLayout(null);
		addWindowListener(new WindowAdapter() {
			 public void windowClosing(WindowEvent e)
			 {
				 dispose();
			 }
		  });
		
		/**************************************************************
		 * 															  *
		 *                         Seetting textfied to editable      *
		 *                                                            *
		 *  														  *	
		 *************************************************************/
		if(bname==1)
		{
			tname.setEditable(true);
		}
	else
	{
		  tname.setEditable(false);
	}
	if(broll_no==1)
	{
		troll_no.setEditable(true);
	}
	else
	{
		troll_no.setEditable(false);
	}
	if(bdob==1)
	{
		date.setEnabled(true);
		month.setEnabled(true);
		year.setEnabled(true);
		////date.select(2);
		//month.select(2);
		//year.select(2);
	}
	else
	{
		date.setEnabled(false);
		month.setEnabled(false);
		year.setEnabled(false);
	}
	if(bgender==1)
	{
		male.setEnabled(true);
		female.setEnabled(true);
		others.setEnabled(true);
		nottoprefer.setEnabled(true);
		//ggender.setSelectedCheckbox(nottoprefer);
	}
	else
	{
		male.setEnabled(false);
		female.setEnabled(false);
		others.setEnabled(false);
		nottoprefer.setEnabled(false);
	}
	
    if(bmob==1)
    {
    	tmob.setEditable(true);
    }
    else
    {
    	tmob.setEditable(false);
    }
    if(bemail==1)
    {
    	temail.setEditable(true);
    }
    else
    {
    	temail.setEditable(false);
    }
    if(baddress==1)
    {
    	Taddress.setEditable(true);
    }
    else
    {
    	Taddress.setEditable(false);	
    }
    if(baltmob==1)
    {
    	taltmob.setEditable(true);
    }
    else
    {
    	taltmob.setEditable(false);	
    }
		/*
		  *
		  *Name label and Name text-field
		  *
		  */
		  name=new Label("Name: "); 
		  add(name); 
		  name.setBounds(200,50,150,30); 
		  tname.setBounds(380,50,250,30); 
		  add(tname);
		  //this.name_pass=name.getText();
		  /*
		   * 
		   * Roll and Roll text-field
		   * 
		   */
		  roll_no=new Label("Unique Roll no: "); 
		  add(roll_no);
		  roll_no.setBounds(200,100,150,30);  
		  troll_no.setBounds(380,100,250,30); 
		  add(troll_no);
		  //this.roll_pass=troll_no.getText();
		  /*
		   * 
		   *Date of birth 
		   */
		  
		  dob=new Label("Date Of Birth:"); 
		  dob.setBounds(200,150,150,30); 
		  add(dob);
		  /*
		   *   Date choice 
		   */
		  
		  for(int i=1;i<=31;i++) 
		  {
		  date.add(String.valueOf(i)); 
		  }
		  add(date); 
		  date.setBounds(380,150,50,30);
		 /*
		  * 
		  *  Month Choice  
		  */
		 
		  String names[]={"January(1)","February(2)","March(3)","April(4)","May(5)","June(6)",
		  "July(7)","August(8)","September(9)","October(10)","November(11)",
		  "December(12)"}; 
		  for(int i=0;i<=11;i++) 
		  { 
			  month.add(names[i]); 
		  } 
		  add(month);
		  month.setBounds(430,150,170,50); 
		  /*
		   *  
		   * Year Choice 
		   * 
		   */
		   
		  for(int i=1990;i<=2050;i++) 
		  { 
			  year.add(String.valueOf(i)); 
		  } 
		  add(year);
		  year.setBounds(600,150,100,50);
		  /*
		   * Additemlistener
		   */
		  
		 date.addItemListener(this);
		  month.addItemListener(this);
		  year.addItemListener(this);
		  /*
		   *   
		   *  Gender Selection
		   *
		   */
		  gender=new Label("Gender :"); 
		  gender.setBounds(200,200,100,50); 
		  add(gender);
		   male.setBounds(380,200,70,50);
		  add(male); 
		  female.setBounds(460,200,90,50); 
		  add(female);
		  others.setBounds(560,200,70,50); 
		  add(others);
		  nottoprefer.setBounds(640,200,300,50); 
		  add(nottoprefer);
		 male.addItemListener(this);
		  female.addItemListener(this);
		  others.addItemListener(this);
		  nottoprefer.addItemListener(this);
		  /*
		   * 
		   *mobile and mobile text field 
		   * 
		   */
		  mob=new Label("Mobile Number: "); 
		  mob.setBounds(200,250,160,50); 
		  add(mob);
		  tmob.setBounds(380,260,250,30); 
		  add(tmob);
		  //mob_pass=tmob.getText();
		  /*
		   * 
		   *altmob and taltmob 
		   * 
		   */
		  altmob=new Label("Alternate Mobile:"); 
		  altmob.setBounds(200,300,170,50);
		  add(altmob); 
		  taltmob.setBounds(380,310,250,30); 
		  add(taltmob); 
		  //altmob_pass=altmob.getText();
		  /*
		   * address and Taddress 
		   * 
		   */
	      address=new Label("Address: ");
	      add(address);
	      address.setBounds(200,350,120,30);
	      add(Taddress);
	      Taddress.setBounds(380,360,420,120);
	      //address_pass=Taddress.getText();
	      /*
	       *  
	       *  email and temail
	       *
	       */
	      email=new Label("Email:");
	      add(email);
	      email.setBounds(200,520,120,30);
	      add(temail);
	      temail.setBounds(380,520,270,30);
	     /*
	      * 
	      * Button 
	      * 
	      */
	      save=new Button("Save");
	      save.setBounds( 490,590,100,50);
	      add(save);
	      
	      save.addActionListener(this);
	      chngd_dta=new File("..\\src\\Students\\"+title+".txt");
	      try
	  	{
	    	String str;
	  		FileReader fr=new FileReader(chngd_dta);	
	  		BufferedReader br=new BufferedReader(fr);
	  		while((str=br.readLine())!=null)
	  		{
	  		   if(str.contains("Name:"))
	  		   {
	  			   String[] a=str.split(":",2);
	  			   tname.setText(a[1]);
	  		   }
	  		   if(str.contains("Roll Number:"))
	  		   {
	  			   String[]	a=str.split(":",2);
	  			   troll_no.setText(a[1]);
	  		   }
	  		   if(str.contains("Mobile Number:"))
	  		   {
	  			   String[] a=str.split(":",2);
 	  			   tmob.setText(a[1]);
	  		   }
	  		   if(str.contains("Alternate mobile number:"))
	  		   {
	  			 String[] a=str.split(":",2);
	  			   taltmob.setText(a[1]);
	  		   }
	  		   if(str.contains("Email:"))	
	  		   {
	  			 String[] a=str.split(":",2);
	  			   temail.setText(a[1]);
	  		   }
	  		   if(str.contains("Address:"))
	  		   {
	  			 String[] a=str.split(":",2);
	  			  Taddress.setText(a[1]);
	  		   }
	  		   if(str.contains("Date of birth:"))
	  		   {
	  			    String[] date_month_year=str.split(":",5);
	  			    date.select((String)date_month_year[1]);
	  			    month.select((String)date_month_year[2]);
	  			    year.select((String)date_month_year[3]);
	  			    date_pass=date.getSelectedItem();
		  			month_pass=month.getSelectedItem();
		  			year_pass=year.getSelectedItem();
	  		   }
	  		   if(str.contains("Gender:"))
	  		   {
	  			   String a[]=str.split(":",2);
	  			   System.out.println(a[1]);
	  			   if(a[1].contains("Male"))
	  			   {
	  				 male.setState(true);
	  				 
	  			   }
	  			   else if(a[1].contains("Female"))
	  			   {
	  				   female.setState(true);
	  			   }
	  			   else if(a[1].contains("Others"))
	  			   {
	  				   others.setState(true);
	  			   }
	  			   else //if(a[1]=="Prefer not to say")
	  			   {
	  				   nottoprefer.setState(true);
	  			   }
	  			 gender_pass=ggender.getSelectedCheckbox().getLabel();

	  			
	  		   }
	  		}
	  		
	  	}
	  	catch(IOException e)
	  	{
	  		System.out.println(e);
	  	}  
	  
	}
	public void itemStateChanged(ItemEvent ie)
	{
		date_pass=date.getSelectedItem();
		month_pass=month.getSelectedItem();
		year_pass=year.getSelectedItem();
		if(male.isEnabled()==true && female.isEnabled()==true&& others.isEnabled()==true&&nottoprefer.isEnabled()==true )
		{
			gender_pass=ggender.getSelectedCheckbox().getLabel();
		}
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==save)
		{
			String check_email=registerDriverCodeForEmail();
			String is_all_filled=registerDriverCodeForFields();
			String is_mob_valid=registerDriverCodeForInvalidMobile();
			String is_altmob_valid=registerDriverCodeForInvalitAltMob();
			if(ae.getSource()==save);
			{
				name_pass=tname.getText();
				roll_pass=troll_no.getText();
				email_pass=temail.getText();
				address_pass=Taddress.getText();
				mob_pass=tmob.getText();
				altmob_pass=taltmob.getText();	
				File student_data=new File("..\\src\\Students\\"+roll_pass+".txt");
				if(is_all_filled=="no")	
				{
					emptypopup.setVisible(true);
					emptypopup.setLocationRelativeTo(null);
				}
				if(temail.isEditable()==false&&check_email=="no")
				{
					emailpopup.setLocationRelativeTo(null);
					emailpopup.setVisible(true);
				}
				if(is_mob_valid=="no")
				{
					InvalidMobPop.setLocationRelativeTo(null);
					InvalidMobPop.setVisible(true);
				}
				if(is_altmob_valid=="no")
				{
					InvalidAltMobPop.setLocationRelativeTo(null);
					InvalidAltMobPop.setVisible(true);
				}
					
					try
			    	{
					  FileWriter filewriter=new FileWriter(student_data,false);
					  BufferedWriter writer=new BufferedWriter(filewriter);
					  writer.write("Name:");
					  writer.write(name_pass);
					  writer.write("\r");
		              writer.write("Roll Number:");
		              writer.write(roll_pass);
		              writer.write("\r");
		              writer.write("Mobile Number:");
		              writer.write(mob_pass);
		              writer.write("\r");
			          writer.write("Alternate mobile number:");
			          writer.write(altmob_pass);
			          writer.write("\r");
		              writer.write("Email:");
		              writer.write(email_pass);
		              writer.write("\r");
		              writer.write("Address:");
		              writer.write(address_pass);
		              writer.write("\r");
		              writer.write("Date of birth:"+date_pass+ ":"+month_pass+":"+year_pass);
		              writer.write("\r");
		              writer.write("Gender:");
		              writer.write(gender_pass);
		              writer.write("\r");
		              writer.flush();
		              writer.close();
		              filewriter.flush();
		              filewriter.close();
				    }
					catch(IOException e)
					{
					}	
					sw=new succesful_written();
		            sw.setVisible(true);
		            sw.setLocationRelativeTo(null);
                    dispose();
		      
	}
	
		}
	}
	
	String registerDriverCodeForEmail() 
	{
		/*
		 * Email validation
		 */
			Pattern entered=Pattern.compile("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$",Pattern.CASE_INSENSITIVE);
			//System.out.println(temail.getText());
			Matcher required=entered.matcher(temail.getText());
			if(required.find())
			{
				is_email_valid="yes";
			}	
			else
			{
				is_email_valid="no";
			}
		return is_email_valid;
	}

	/*
	 * Register driver code for invalid mobile
	 */
	String registerDriverCodeForInvalidMobile()
	{
		String is_mob_valid;
		Pattern entered=Pattern.compile("^\\d{10}$",Pattern.CASE_INSENSITIVE);
		Matcher required=entered.matcher(tmob.getText());
		if(required.find())
		{
		is_mob_valid="yes";
		}
		else
		{
			is_mob_valid="no";
		}
		return is_mob_valid;
	}
	/*
	 * RegisterDrivercode for Invalid alt mobile number
	 */
   String registerDriverCodeForInvalitAltMob()
   {
	   String is_altmob_valid;
		Pattern entered=Pattern.compile("^\\d{10}$",Pattern.CASE_INSENSITIVE);
		Matcher required=entered.matcher(taltmob.getText());
		if(required.find())
		{
		is_altmob_valid="yes";
		}
		else
		{
			is_altmob_valid="no";
		}
		return is_altmob_valid;
   }
   
   /*
	 * Register driver code for field check
	 */
	String registerDriverCodeForFields()
	{   String is_all_filled;
	    if(tname.getText().isEmpty())
		{
			is_all_filled="no";
		}
	    else if(troll_no.getText().isEmpty())
	    {
	    	is_all_filled="no";
	    }else if(tmob.getText().isEmpty())
	    {
	    	is_all_filled="no";
	    }else if(taltmob.getText().isEmpty())
	    {
	    	is_all_filled="no";
	    }else if(Taddress.getText().isEmpty())
	    {
	    	is_all_filled="no";
	    }else if(temail.getText().isEmpty())
	    {
	    	is_all_filled="no";
	    }else
	    {
	    	is_all_filled="else";
	    }
		return is_all_filled;
	}
   
   
   
   
   
}   


/*
 * 
 * 
 * Finding the main class file for student
 * 
 * 
 * 
 */
class main_find extends Frame implements ActionListener,ItemListener
{   Label task;
	Checkbox name, roll_no, dob, gender, mob, email, address,altmob;
	Button submit;
	update_info update_info;
	int bname=0,broll_no=0,bdob=0,bgender=0,bmob=0,bemail=0,baddress=0,baltmob=0;
	String file_name;
	main_find(String title)
	{
		super("Update Information of "+title);
		file_name=title;
		setSize(1000,1000);
		setLayout(null);
		setFont(new Font("Helvetica",Font.BOLD,20));
		addWindowListener(new WindowAdapter() {
			 
	    	 public void windowClosing(WindowEvent e)
		 {
			 dispose();
		 }
	    });
		
     //submit.addActionListener(this);
	task=new Label("Choose from the following what do you want to update",Label.CENTER);
	name=new Checkbox("Name",false);
	roll_no=new Checkbox("Roll no",false);
	dob=new Checkbox("Date of birth",false);
	gender=new Checkbox("Gender",false);
	mob=new Checkbox("Mobile number",false);
	email=new Checkbox("Email",false);
	address=new Checkbox("Address",false);
	altmob=new Checkbox("Alternate mobile",false);
	task.setBounds(120,130,800,30);
	add(task);
	name.setBounds(120,180,100,30);
	add(name);
	roll_no.setBounds(120,220,100,30);
	add(roll_no);
	dob.setBounds(120,260,200,30);
	add(dob);
	gender.setBounds(120,290,100,30);
	add(gender);
	mob.setBounds(120,330,200,30);
	add(mob);
	email.setBounds(120,370,100,30);
	add(email);
	address.setBounds(120,410,100,30);
	add(address);
	altmob.setBounds(120,450,200,30);
	add(altmob);
	submit=new Button("Next");
	submit.setBounds(420,480,200,70);
	add(submit);
	submit.addActionListener(this);
	altmob.addItemListener(this);
	name.addItemListener(this);
	roll_no.addItemListener(this);
    dob.addItemListener(this);
    gender.addItemListener(this);
    mob.addItemListener(this); 
    email.addItemListener(this); 
    address.addItemListener(this);
  }
	
	
  public void itemStateChanged(ItemEvent isc)
	  {
		if(isc.getSource()==name)
		{
			if(name.getState()==true)    
			{
				this.bname=1;		
			}
			else
			{
				this.bname=1;
			}
		}
		if(isc.getSource()==roll_no)
		{
			if(roll_no.getState()==true)
			{
				this.broll_no=1;
			}
			else
			{

				this.broll_no=0;
			}
		}
		if(isc.getSource()==dob)
		{
			if( dob.getState()==true)
			{
				this.bdob=1;
			}
			else
			{
				this.bdob=0;
			}
		}
		if(isc.getSource()==gender)
		{
			if(gender.getState()==true)
			{
				this.bgender=1;
			}
			else
			{
				this.bgender=0;
			}
		}
		if(isc.getSource()==mob)
		{
			if(mob.getState()==true)
			{
				this.bmob=1;			
			}
			else
			{
				this.bmob=0;
			}
		}
		if(isc.getSource()==altmob)
		{
			if(altmob.getState()==true)
			{
				this.baltmob=1;	
			}
			else
			{
				this.baltmob=0;
			}
			
		}
		if(isc.getSource()==email)
		{
			if(email.getState()==true)
			{
				this.bemail=1;	
			}
			else
			{
				this.bemail=0;
			}
			
		}
		if(isc.getSource()==address) 
		{
			if(address.getState()==true)
			{
				this.baddress=1;	
			}
			else
			{
				this.baddress=0;
			}
		}
	
	  }
	public void actionPerformed(ActionEvent ae)
    {
	  if(ae.getSource()==submit)
	  {
		  update_info=new update_info(this.bname,this.broll_no,this.bdob,this.bgender,this.bmob,this.bemail,this.baddress,this.baltmob,"Write the change",file_name);
		  update_info.setVisible(true);
		  update_info.setLocationRelativeTo(null);
	  }
    }
	
	
	
	
}
/*
 * 
 * Update and register classes
 * 
 */

class update_record extends Frame implements ActionListener
{
    Label filename;
    TextField tfilename;
    Button find;
	main_find find_the_data;
	String name="";
	popupEmptyInformation p1;
    update_record(String title) 
	{
		super(title);
		addWindowListener(new WindowAdapter() {
		
	    	 public void windowClosing(WindowEvent e)
		 {
			 dispose();
		 }
	    });
		
		setFont(new Font("Helvetica",Font.BOLD,20)); 
		  setLayout(null);
		setSize(1000,1000);
		/*
		 * File name enter to search
		 */
		filename=new Label("Enter the Unique Roll Number of Student");
		tfilename=new TextField();
		find=new Button("find");
		filename.setBounds(300,400,600,30);
		tfilename.setBounds(350,450,300,40);
		find.setBounds(400,500,200,50);
		add(filename);
		add(tfilename);
		add(find);
		find.addActionListener(this);
			 
	}
   public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==find)
		{
			name=tfilename.getText();	
			File student_data=new File("..\\src\\Students\\"+name+".txt");
			if(student_data.exists())
			{
				find_the_data=new main_find(name);	
				find_the_data.setVisible(true);
				find_the_data.setLocationRelativeTo(null);
				tfilename.setText("");
			}
			else if(name.isEmpty())
			{
				 p1=new popupEmptyInformation();
				 p1.setVisible(true);
				 p1.setLocationRelativeTo(null);
			}
			else if(!student_data.exists())
			{
				filenotfound fnf=new filenotfound();
				fnf.setVisible(true);
				fnf.setLocationRelativeTo(null);
			}
			
		}
	}
}

class register_record extends Frame implements ActionListener,ItemListener
{
	String name_pass,roll_pass,mob_pass,email_pass,address_pass,altmob_pass,date_pass,month_pass,year_pass,gender_pass;	
	Label name, roll_no, dob, gender, mob, email, address,altmob;
	TextField tname, troll_no, tmob, temail,taltmob;
	Choice  date, month, year;
	Checkbox male, female, others, nottoprefer;
	CheckboxGroup ggender;
	Button submit;
    TextArea Taddress;
    String is_email_valid="no";
    popupWrongEmail emailpopup=new popupWrongEmail();
    popupEmptyInformation emptypopup =new popupEmptyInformation(); 
    popupInvalidMobile InvalidMobPop=new popupInvalidMobile();
    popupInvalidAltMob InvalidAltMobPop=new  popupInvalidAltMob();
   FileExists file=new FileExists();
   succesful_written sw;
   register_record(String title) 
	{
		super(title);
		/*
		 * when closed from the close tab
		 */
	    addWindowListener(new WindowAdapter() {
		 
	    	 public void windowClosing(WindowEvent e)
		 {
			 dispose();
		 }
	  });
	  
	  setFont(new Font("Helvetica",Font.BOLD,20)); 
	  setLayout(null);
	  setSize(1000,1000);
	  /*
	  *
	  *Name label and Name text-field
	  *
	  */
	  name=new Label("Name: "); 
	  add(name); 
	  name.setBounds(200,50,150,30); 
	  tname=new TextField(60); 
	  tname.setBounds(380,50,250,30); 
	  add(tname);
	  //this.name_pass=name.getText();
	  /*
	   * 
	   * Roll and Roll text-field
	   * 
	   */
	  roll_no=new Label("Unique Roll no: "); 
	  add(roll_no);
	  roll_no.setBounds(200,100,150,30); 
	  troll_no=new TextField(60);
	  troll_no.setBounds(380,100,250,30); 
	  add(troll_no);
	  //this.roll_pass=troll_no.getText();
	  /*
	   * 
	   *Date of birth 
	   */
	  
	  dob=new Label("Date Of Birth:"); 
	  dob.setBounds(200,150,150,30); 
	  add(dob);
	  /*
	   *   Date choice 
	   */
	  date=new Choice(); 
	  for(int i=1;i<=31;i++) 
	  {
	  date.add(String.valueOf(i)); 
	  }
	  add(date); 
	  date.setBounds(380,150,50,30);
	 /*
	  * 
	  *  Month Choice  
	  */
	  month=new Choice();
	  String names[]={"January(1)","February(2)","March(3)","April(4)","May(5)","June(6)",
	  "July(7)","August(8)","September(9)","October(10)","November(11)",
	  "December(12)"}; 
	  for(int i=0;i<=11;i++) 
	  { 
		  month.add(names[i]); 
	  } 
	  add(month);
	  month.setBounds(430,150,170,50); 
	  /*
	   *  
	   * Year Choice 
	   * 
	   */
	  year=new Choice(); 
	  for(int i=1990;i<=2050;i++) 
	  { 
		  year.add(String.valueOf(i)); 
	  } 
	  add(year);
	  year.setBounds(600,150,100,50);
	  /*
	   * Additemlistener
	   */
	  
	  date.addItemListener(this);
	  month.addItemListener(this);
	  year.addItemListener(this);
	  /*
	   *   
	   *  Gender Selection
	   *
	   */
	  gender=new Label("Gender :"); 
	  gender.setBounds(200,200,100,50); 
	  add(gender);
	  ggender=new CheckboxGroup(); 
	  male=new Checkbox("Male",false,ggender);
	  female=new Checkbox("Female",false,ggender); 
	  others=new Checkbox("Others",false,ggender); 
	  nottoprefer=new Checkbox("Prefer not to say",true,ggender); 
	  male.setBounds(380,200,70,50);
	  add(male); 
	  female.setBounds(460,200,90,50); 
	  add(female);
	  others.setBounds(560,200,70,50); 
	  add(others);
	  nottoprefer.setBounds(640,200,300,50); 
	  add(nottoprefer);
	  male.addItemListener(this);
	  female.addItemListener(this);
	  others.addItemListener(this);
	  nottoprefer.addItemListener(this);
	  /*
	   * 
	   *mobile and mobile text field 
	   * 
	   */
	  mob=new Label("Mobile Number: "); 
	  mob.setBounds(200,250,160,50); 
	  add(mob);
	  tmob=new TextField(); 
	  tmob.setBounds(380,260,250,30); 
	  add(tmob);
	  //mob_pass=tmob.getText();
	  /*
	   * 
	   *altmob and taltmob 
	   * 
	   */
	  altmob=new Label("Alternate Mobile:"); 
	  altmob.setBounds(200,300,170,50);
	  add(altmob); 
	  taltmob=new TextField();
	  taltmob.setBounds(380,310,250,30); 
	  add(taltmob); 
	  //altmob_pass=altmob.getText();
	  /*
	   * address and Taddress 
	   * 
	   */
      address=new Label("Address: ");
      add(address);
      address.setBounds(200,350,120,30);
      Taddress=new TextArea();
      add(Taddress);
      Taddress.setBounds(380,360,420,120);
      //address_pass=Taddress.getText();
      /*
       *  
       *  email and temail
       *
       */
      email=new Label("Email:");
      add(email);
      email.setBounds(200,520,120,30);
      temail=new TextField();
      add(temail);
      temail.setBounds(380,520,270,30);
      //email_pass=temail.getText();
      /*
       * 
       * SUBMIT BUTTON
       * 
       */
      submit=new Button("SUBMIT");
      add(submit);
      submit.setBounds( 490,590,100,30);
      submit.addActionListener(this);
  }
    public void itemStateChanged(ItemEvent e)
    {
    	date_pass=date.getSelectedItem();
		month_pass=month.getSelectedItem();
		year_pass=year.getSelectedItem();
		gender_pass=ggender.getSelectedCheckbox().getLabel();
    }
	
	public void actionPerformed(ActionEvent ae)
	{
		
		String check_email=registerDriverCodeForEmail();
		String is_all_filled=registerDriverCodeForFields();
		String is_mob_valid=registerDriverCodeForInvalidMobile();
		String is_altmob_valid=registerDriverCodeForInvalitAltMob();
		if(ae.getSource()==submit);
		{
			name_pass=tname.getText();
			roll_pass=troll_no.getText();
			email_pass=temail.getText();
			address_pass=Taddress.getText();
			mob_pass=tmob.getText();
			altmob_pass=taltmob.getText();	
			File student_data=new File("..\\src\\Students\\"+roll_pass+".txt");
			if(is_all_filled=="no")	
			{
				emptypopup.setVisible(true);
				emptypopup.setLocationRelativeTo(null);
			}
			else if(check_email=="no")
			{
				emailpopup.setLocationRelativeTo(null);
				emailpopup.setVisible(true);
			}
			else if(is_mob_valid=="no")
			{
				InvalidMobPop.setLocationRelativeTo(null);
				InvalidMobPop.setVisible(true);
			}
			else if(is_altmob_valid=="no")
			{
				InvalidAltMobPop.setLocationRelativeTo(null);
				InvalidAltMobPop.setVisible(true);
			}
			else if(student_data.exists())
			{
				file.setVisible(true);
				file.setLocationRelativeTo(null);
			}
			else
			{	
				try
		    	{
				  student_data.createNewFile();
				  FileWriter filewriter=new FileWriter(student_data,true);
				  BufferedWriter writer=new BufferedWriter(filewriter);
				  writer.write("Name:");
				  writer.write(name_pass);
				  writer.write("\r");
	              writer.write("Roll Number:");
	              writer.write(roll_pass);
	              writer.write("\r");
	              writer.write("Mobile Number:");
	              writer.write(mob_pass);
	              writer.write("\r");
		          writer.write("Alternate mobile number:");
		          writer.write(altmob_pass);
		          writer.write("\r");
	              writer.write("Email:");
	              writer.write(email_pass);
	              writer.write("\r");
	              writer.write("Address:");
	              writer.write(address_pass);
	              writer.write("\r");
	              writer.write("Date of birth:"+date_pass+ ":"+month_pass+":"+year_pass);
	              writer.write("\r");
	              writer.write("Gender:");
	              writer.write(gender_pass);
	              writer.write("\r");
	              writer.flush();
	              writer.close();
	              filewriter.flush();
	              filewriter.close();
			    }
				catch(IOException e)
				{
				}	
				sw=new succesful_written();
	            sw.setVisible(true);sw.setLocationRelativeTo(null);
				tname.setText("");
				troll_no.setText(""); 
				tmob.setText("");
				taltmob.setText("");
				Taddress.setText("");
				temail.setText("");
				date.select(0);
				month.select(0);
				year.select(0);
				ggender.setSelectedCheckbox(nottoprefer);
				dispose();
   
			}

		}
	}

	/*
	 * Register driver code for field check
	 */
	String registerDriverCodeForFields()
	{   String is_all_filled;
	    if(tname.getText().isEmpty())
		{
			is_all_filled="no";
		}
	    else if(troll_no.getText().isEmpty())
	    {
	    	is_all_filled="no";
	    }else if(tmob.getText().isEmpty())
	    {
	    	is_all_filled="no";
	    }else if(taltmob.getText().isEmpty())
	    {
	    	is_all_filled="no";
	    }else if(Taddress.getText().isEmpty())
	    {
	    	is_all_filled="no";
	    }else if(temail.getText().isEmpty())
	    {
	    	is_all_filled="no";
	    }else
	    {
	    	is_all_filled="else";
	    }
		return is_all_filled;
	}
	String registerDriverCodeForEmail() 
	{
		/*
		 * Email validation
		 */
			Pattern entered=Pattern.compile("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$",Pattern.CASE_INSENSITIVE);
			Matcher required=entered.matcher(temail.getText());
			if(required.find())
			{
				is_email_valid="yes";
			}	
			else
			{
				is_email_valid="no";
			}
		return is_email_valid;
	}

	/*
	 * Register driver code for invalid mobile
	 */
	String registerDriverCodeForInvalidMobile()
	{
		String is_mob_valid;
		Pattern entered=Pattern.compile("^\\d{10}$",Pattern.CASE_INSENSITIVE);
		Matcher required=entered.matcher(tmob.getText());
		if(required.find())
		{
		is_mob_valid="yes";
		}
		else
		{
			is_mob_valid="no";
		}
		return is_mob_valid;
	}
	/*
	 * RegisterDrivercode for Invalid alt mobile number
	 */
   String registerDriverCodeForInvalitAltMob()
   {
	   String is_altmob_valid;
		Pattern entered=Pattern.compile("^\\d{10}$",Pattern.CASE_INSENSITIVE);
		Matcher required=entered.matcher(taltmob.getText());
		if(required.find())
		{
		is_altmob_valid="yes";
		}
		else
		{
			is_altmob_valid="no";
		}
		return is_altmob_valid;
   }
}   


//Register
public class Registration extends Applet implements ActionListener
{

	Button submit, find,delete,show;
	update_record update_record;
	register_record register_record;
	delete_file del;
	Show Show;
	public void init() 
	{
		setName("Welcome to Student Management System");
		setSize(5000, 5000);
		setLayout(null);
		update_record = new update_record("Update the Student Record");
		register_record = new register_record("Register the student");
		register_record.setLocationRelativeTo(null);
		update_record.setLocationRelativeTo(null);
		setFont(new Font("Serif", Font.BOLD, 50));
		submit = new Button("Register new record");
		find = new Button("Update the existing record");
		delete=new Button("Delete the existing record");
		show=new Button("Show the existing record");
		submit.setBounds(700, 400, 600, 60);
		find.setBounds(700, 500, 600, 60);
		delete.setBounds(700,600,600,60);
		show.setBounds(700,700,600,60);
		add(submit);
		add(find);
		add(delete);
		add(show);
		find.addActionListener(this);
		submit.addActionListener(this);
		delete.addActionListener(this);
		show.addActionListener(this);
	}

	public void actionPerformed(ActionEvent ae) 
	{
		if (ae.getSource() == find) 
		{
			update_record.setVisible(true);
		} 
		else if (ae.getSource() == submit) 
		{
			register_record.setVisible(true);
		}
		else if(ae.getSource()==delete)
		{
			del=new delete_file();		
			del.setVisible(true);
			del.setLocationRelativeTo(null);
		}
		else if(ae.getSource()==show)
		{
			Show=new Show();
			Show.setVisible(true);
			Show.setLocationRelativeTo(null);
		}

	}
    
 }
