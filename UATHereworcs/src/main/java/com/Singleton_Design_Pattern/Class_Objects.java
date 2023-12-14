package com.Singleton_Design_Pattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;

import com.Page_Object_Models.Tracker_Overview;
import com.Page_Object_Models.DailySteps;
import com.Page_Object_Models.Trackeroverview;
import com.Page_Object_Models.Trackersdashboard;
import com.Page_Object_Models.Waistcircumference;
import com.Page_Object_Models.Background;
import com.Page_Object_Models.Home;
import com.Page_Object_Models.Immediate_Needs;
import com.Page_Object_Models.Important_To_Me;
import com.Page_Object_Models.Personal;
import com.Page_Object_Models.best_Support;
import com.Page_Object_Models.Bento_Menu;
import com.Page_Object_Models.BloodPressureTracker;
import com.Page_Object_Models.Circle_Page;
import com.Page_Object_Models.Clinicalcircle;
import com.Page_Object_Models.Clinicaldirectory;
import com.Page_Object_Models.Clinician;
import com.Page_Object_Models.Closing_Page;
import com.Page_Object_Models.CopingStrategy;
import com.Page_Object_Models.Dashboard_Add_Location;
import com.Page_Object_Models.Diary_Add;
import com.Page_Object_Models.Diet;
import com.Page_Object_Models.ExerciseTracker;
import com.Page_Object_Models.Fluid;
import com.Page_Object_Models.Goals;
import com.Page_Object_Models.Healthinfo_Page;
import com.Page_Object_Models.Login;
import com.Page_Object_Models.Login_page;
import com.Page_Object_Models.Medication;
import com.Page_Object_Models.Message_Page;
import com.Page_Object_Models.Mood_Page;
import com.Page_Object_Models.Moodgraph_Page;
import com.Page_Object_Models.MyDiary;
import com.Page_Object_Models.My_Appointment;
import com.Page_Object_Models.My_Fast_Log;
import com.Page_Object_Models.My_Recommended;
import com.Page_Object_Models.My_Tracker_Overview;
import com.Page_Object_Models.My_circle;
import com.Page_Object_Models.Myfasttracker_mood;
import com.Page_Object_Models.Myfasttracker_problem;
import com.Page_Object_Models.Myfasttracker_sleep;
import com.Page_Object_Models.Myfasttracker_pain;
import com.Page_Object_Models.Mytrackeroverview;
import com.Page_Object_Models.Question_Page;
import com.Page_Object_Models.Question_Type;
import com.Page_Object_Models.Resource1_Page;
import com.Page_Object_Models.Resource2_Page;
import com.Page_Object_Models.Resources_Page;
import com.Page_Object_Models.Rolebased_Page;
import com.Page_Object_Models.Saved_Resources;
import com.Page_Object_Models.Signup_pom;
import com.Page_Object_Models.Sleep_Page;
import com.Page_Object_Models.Sleepgraph_Page;
import com.Page_Object_Models.SmartDashboard;
import com.Page_Object_Models.Super_Login;
import com.Page_Object_Models.Tracker_page;
import com.Page_Object_Models.Urgenthelp_Page;
import com.Page_Object_Models.Weight;
//import com.Page_Object_Models.Notification;
import com.Page_Object_Models.messages_Pom;



public class Class_Objects {
	
 WebDriver driver;
        
    private Diet diet;
	private Fluid fluid;
	private Medication medication;
	private Weight weight;
	private Login login;
	private Bento_Menu bentomenu;
	private Clinician clinician;
	private Clinicaldirectory clinicaldirectory;
	private Clinicalcircle clinicalcircle;
	//private Notification notification;
	private Login_page loginn;
	private Tracker_page tracker;
	private Sleep_Page sleep;
	private Sleepgraph_Page graph;
	private Mood_Page mood;
	private Moodgraph_Page Moodgraph;
	private Super_Login superadmin;
	private Question_Page questionnaire;
	private Question_Type Type;
	private Closing_Page closeinfo;
	private Healthinfo_Page health;
	private Message_Page Msg;
	private Resources_Page Resource;
	private Urgenthelp_Page urgenthelp;
	private Rolebased_Page rolebased;
	private Resource1_Page resources;
	private Resource2_Page resources2;
	private Circle_Page mycircle;
	
	private Login_page log_In;
	private Dashboard_Add_Location adding;
	private Diary_Add add_Diary;
	private My_Tracker_Overview tracker_Add;
	private My_Fast_Log fast_log;
	private messages_Pom message;
	private My_Appointment appointment;
	private My_circle circle;
	private My_Recommended recommended;
	private Saved_Resources save;
	private Login log;
	private Signup_pom sgn_up;
	
	private Home home_pg;
	private Personal per_Det;
	private Important_To_Me Impt;
	private best_Support best;
	private Background background;
	private Immediate_Needs immediate;
	
	private Home home_Page;
	private Tracker_Overview trackersover;
 
	private BloodPressureTracker Blood_Pressure;
	private ExerciseTracker Exercise_Tracker;
	private Goals goal;
	private CopingStrategy CopStr;
	
	private DailySteps dailystep;
	private Waistcircumference waistcircumference;
	private Trackeroverview trackeroverview;
	private Trackersdashboard trackerDashboard;
    private SmartDashboard smartDashboard;
    private MyDiary mydairy;
    private Mytrackeroverview myTrackeroverview;
    private Myfasttracker_sleep myFasttrackerlog;
    private Myfasttracker_mood myfasttracker_mood;
    private Myfasttracker_problem myfasttracker_problem;
    private Myfasttracker_pain myfasttracker_pain;
 
 			public Class_Objects(WebDriver driver) {
 				this.driver=driver;
 			}
 
 			public Login getlogin() {
 				login = new Login(driver);
 				return login;
 			}
 			
 			public Bento_Menu getbentomenu() {
 				bentomenu = new Bento_Menu(driver);
 				return bentomenu;
 			}
 			
 			
 			public Diet getdiet() {
 				diet = new Diet(driver);
 				return diet;
 			}
 			
 			public Fluid getFluid() {
 				fluid = new Fluid(driver);
 				return fluid;
 			}
 			
 			public Medication getmedication() {
 				medication = new Medication(driver);
 				return medication;
 			}
 		
 			public Weight getWeight() {
 				weight = new Weight(driver);
 				return weight;
 			}
 		
 			public Clinician getcliniciandash() {
 				clinician = new Clinician(driver);
 				return clinician;
 			}
 			
 			public Clinicaldirectory getclinicaldirectory() {
 				clinicaldirectory = new Clinicaldirectory(driver);
 				return clinicaldirectory;
 			}
 			public Clinicalcircle getclinicalcircle() {
 				clinicalcircle = new Clinicalcircle(driver);
 				return clinicalcircle;
 			}
 		/*	public Notification getnotification() {
 				notification = new Notification(driver);
 				return notification;
 			}*/
 			
 			/**************/
 			/*public Login getInstanceLog() {
 				log = new Login(driver);
 				return log;
 			}*/
 			public Signup_pom getInstanceSgn_up() {
 				sgn_up = new Signup_pom(driver);
 				return sgn_up;
 			}
 			
 			
 			
 			/*********/
 		

 			public Login_page getpageLogin() {
 				loginn = new Login_page(driver);
 				return loginn;
 			}

 			public Tracker_page getpageTracker() {
 				tracker = new Tracker_page(driver);
 				return tracker;
 			}

 			public Sleep_Page getpageSleep() {
 				sleep = new Sleep_Page(driver);
 				return sleep;
 			}

 			public Sleepgraph_Page getpageGraph() {
 				graph = new Sleepgraph_Page(driver);
 				return graph;
 			}

 			public Mood_Page getpageMood() {
 				mood = new Mood_Page(driver);
 				return mood;
 			}

 			public Moodgraph_Page getpageMoodgraph() {
 				Moodgraph = new Moodgraph_Page(driver);
 				return Moodgraph;
 			}

 			public Super_Login getpageSuperadmin() {
 				superadmin = new Super_Login(driver);
 				return superadmin;
 			}

 			public Question_Page getpageQuestionnaire() {
 				questionnaire = new Question_Page(driver);
 				return questionnaire;
 			}

 			public Question_Type getpageType() {
 				Type = new Question_Type(driver);
 				return Type;
 			}

 			public Closing_Page getpageCloseinfo() {
 				closeinfo = new Closing_Page(driver);
 				return closeinfo;
 			}

 			public Healthinfo_Page getpageHealth() {
 				health = new Healthinfo_Page(driver);
 				return health;
 			}

 			public Message_Page getpageMsg() {
 				Msg = new Message_Page(driver);
 				return Msg;
 			}

 			public Resources_Page getpageResource() {
 				Resource = new Resources_Page(driver);
 				return Resource;
 			}

 			public Urgenthelp_Page getpageUrgenthelp() {
 				urgenthelp = new Urgenthelp_Page(driver);
 				return urgenthelp;
 			}

 			public Rolebased_Page getpageRolebased() {
 				rolebased = new Rolebased_Page(driver);
 				return rolebased;
 			}

 			public Resource1_Page getpageResources() {
 				resources = new Resource1_Page(driver);
 				return resources;
 			}

 			public Resource2_Page getpageResources2() {
 				resources2 = new Resource2_Page(driver);
 				return resources2;
 			}

 			public Circle_Page getpageMycircle() {
 				mycircle = new Circle_Page(driver);
 				return mycircle;
 			}
           /////////////////////////////////////////
 			public Dashboard_Add_Location getInstanceAdding() {
 				adding = new Dashboard_Add_Location(driver);
 				return adding;
 			}

 			public Diary_Add getInstanceAdd_Diary() {
 				add_Diary = new Diary_Add(driver);
 				return add_Diary;
 			}

 			public My_Tracker_Overview getInstanceTracker_Add() {
 				tracker_Add = new My_Tracker_Overview(driver);
 				return tracker_Add;
 			}

 			public messages_Pom getInstanceMessage() {
 			message = new messages_Pom(driver);
 				return message;
 			}

 			public My_Appointment getInstanceAppointment() {
 				appointment = new My_Appointment(driver);
 				return appointment;
 			}

 			public My_circle getInstanceCircle() {
 				circle = new My_circle(driver);
 				return circle;
 			}

 			public My_Recommended getInstanceRecommended() {
 				recommended = new My_Recommended(driver);
 				return recommended;
 			}

 			public Saved_Resources getInstanceSave() {
 				save = new Saved_Resources(driver);
 				return save;
 			}

 			public My_Fast_Log getInstanceFast_log() {
 				fast_log = new My_Fast_Log(driver);
 				return fast_log;
 			}
         
 			
 			
 			
 			public Home getInstanceHome_pg() {
 				home_pg = new Home(driver);
 				return home_pg;
 			}

 			public Personal getInstancePer_Det() {
 				per_Det = new Personal(driver);
 				return per_Det;
 			}

 			public Important_To_Me getInstanceImpt() {
 				Impt = new Important_To_Me(driver);
 				return Impt;
 			}

 			public best_Support getInstanceBest() {
 				best = new best_Support(driver);
 				return best;
 			}

 			public Background getInstanceBackground() {
 				background = new Background(driver);
 				return background;
 			}

 			public Immediate_Needs getInstanceImmediate() {
 				immediate = new Immediate_Needs(driver);
 				return immediate;
 			}
 			
 			
 			
 			public Home getInstanceHome_Page() {
 				home_Page = new Home(driver);
 				return home_Page;
 			}
 			public Tracker_Overview getInstanceTracker() {
 				trackersover = new Tracker_Overview(driver);
 				return trackersover;
 			}
 			/******************/
 			public BloodPressureTracker getInstanceBlood_Pressure() {
 				Blood_Pressure = new BloodPressureTracker(driver);
 				return Blood_Pressure;
 			}
 			
 			public ExerciseTracker getInstanceExercise_Tracker() {
 				Exercise_Tracker = new ExerciseTracker(driver);
 				return Exercise_Tracker;
 			}
 			
 			
 			public Goals getInstancegoal() {
 				goal = new Goals(driver);
 				return goal;
 			}
 			
 			public CopingStrategy getInstanceCopStar() {
 			CopStr = new CopingStrategy(driver);
 			return CopStr;
 		}
 			
 			
 			public DailySteps getDailystep() {
 				dailystep = new DailySteps(driver);
 				return dailystep;
 			}
 			public Waistcircumference getwaistcircumference() {
 				waistcircumference = new Waistcircumference(driver);
 				return waistcircumference;
 			}
 			public Trackeroverview gettrackeroverview() {
 				trackeroverview = new Trackeroverview(driver);
 				return trackeroverview;
 			}
 			public Trackersdashboard gettrackerDashboard() {
 				trackerDashboard = new Trackersdashboard(driver);
 				return trackerDashboard;
 			}
 			
 		//	SmartDashboard_stepDefinition
 			public  SmartDashboard getsmartDashboard() {
 				smartDashboard = new SmartDashboard(driver);
 				return smartDashboard;
 			}
 			
 			public  MyDiary getmydairy() {
 				mydairy = new MyDiary(driver);
 				return mydairy;
 			}
 			
 			public  Mytrackeroverview getmyTrackeroverview() {
 				myTrackeroverview = new Mytrackeroverview(driver);
 				return myTrackeroverview;
 			}
 			
 			public  Myfasttracker_sleep getmyFasttrackerlog() {
 				myFasttrackerlog = new Myfasttracker_sleep(driver);
 				return myFasttrackerlog;
 			}
 			public  Myfasttracker_mood getmyFasttrackerlogmood() {
 				myfasttracker_mood = new Myfasttracker_mood(driver);
 				return myfasttracker_mood;
 			}
 			public  Myfasttracker_problem getMyfasttracker_problem() {
 				myfasttracker_problem = new Myfasttracker_problem(driver);
 				return myfasttracker_problem;
 			}
 			public  Myfasttracker_pain getMyfasttracker_pain() {
 				myfasttracker_pain = new Myfasttracker_pain(driver);
 				return myfasttracker_pain;
 			}
}
