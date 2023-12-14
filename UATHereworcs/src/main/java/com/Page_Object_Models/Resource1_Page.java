package com.Page_Object_Models;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Resource1_Page {

	public WebDriver driver;

	@FindBy(xpath = "(//a[normalize-space()='Support'])[1]")
	private WebElement support;

	@FindBy(xpath = "(//input[@id='search'])[1]")
	private WebElement Ssearch;

	@FindBy(xpath = "(//a[contains(text(),'Visit')])[1]")
	private WebElement Svisit;

	@FindBy(xpath = "(//div[@class='block'])[1]")
	private WebElement Ssend;

	@FindBy(xpath = "(//a[normalize-space()='Covid-19'])[1]")
	private WebElement covid;

	@FindBy(xpath = "(//*[name()='svg'][@id='RLCovid--ckwrudqw5004p0ipnkc8zamw0'])[1]")
	private WebElement Cfav;

	@FindBy(xpath = "(//a[@class='mw-btn outline m-2'][normalize-space()='Visit page'])[2]")
	private WebElement Cvisit;

	@FindBy(xpath = "(//div[@class='block'][normalize-space()='SEND'])[2]")
	private WebElement Csend;

	@FindBy(xpath = "(//a[normalize-space()='Tips and self help'])[1]")
	private WebElement Tips;

	@FindBy(xpath = "(//input[@id='search'])[1]")
	private WebElement Tsearch;

	@FindBy(xpath = "(//a[normalize-space()='Visit page'])[1]")
	private WebElement Tvisit;

	@FindBy(xpath = "(//div[@class='block'])[1]")
	private WebElement Tsend;

	@FindBy(xpath = "(//a[contains(text(),'Prostate cancer')])[1]")
	private WebElement Procancer;

	@FindBy(xpath = "/html[1]/body[1]/div[9]/div[2]/div[2]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/*[name()='svg'][1]")
	private WebElement Pfav;

	@FindBy(xpath = "(//a[normalize-space()='https://kwpcsg.co.uk/'])[1]")
	private WebElement Pvisit;

	@FindBy(xpath = "(//div[@class='block'][normalize-space()='SEND'])[1]")
	private WebElement Psend;

	@FindBy(xpath = "(//a[normalize-space()='Colorectal cancer'])[1]")
	private WebElement colo;

	@FindBy(xpath = "(//a[@class='mw-btn outline m-2'][normalize-space()='Visit page'])[3]")
	private WebElement colovisit;

	@FindBy(xpath = "(//div[@class='block'][normalize-space()='SEND'])[3]")
	private WebElement colosend;

	@FindBy(xpath = "(//a[@href='https://www.healthwatch.co.uk/'][normalize-space()='Visit page'])[1]")
	private WebElement Uvisit;

	@FindBy(xpath = "(//a[normalize-space()='Useful links'])[1]")
	private WebElement usefullink;

	@FindBy(xpath = "/html[1]/body[1]/div[9]/div[2]/div[2]/div[2]/div[2]/div[3]/div[6]/div[1]/div[1]/div[1]/div[1]/*[name()='svg'][1]")
	private WebElement Ufav;

	@FindBy(xpath = "(//div[@class='block'][normalize-space()='SEND'])[6]")
	private WebElement Usend;

	@FindBy(xpath = "(//a[normalize-space()='End of life support'])[1]")
	private WebElement End;

	@FindBy(xpath = "(//input[@id='search'])[1]")
	private WebElement Endsearch;

	@FindBy(xpath = "/html[1]/body[1]/div[9]/div[2]/div[2]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/*[name()='svg'][1]")
	private WebElement Endfav;

	@FindBy(xpath = "(//div[@class='block'][normalize-space()='SEND'])[1]")
	private WebElement Endsend;

	@FindBy(xpath = "(//a[normalize-space()='Social prescribing'])[1]")
	private WebElement Social;

	@FindBy(xpath = "(//a[contains(text(),'https://www.onside-advocacy.org.uk/social-prescrib')])[1]")
	private WebElement Slink;

	@FindBy(xpath = "(//*[name()='path'][@id='Path_11125'])[6]")
	private WebElement Sclose;

	@FindBy(xpath = "(//a[normalize-space()='Health A-Z'])[1]")
	private WebElement health;

	@FindBy(xpath = "(//p[@class='back-p'])[1]")
	private WebElement Hsearch;

	@FindBy(xpath = "(//a[normalize-space()='Bereavement support'])[1]")
	private WebElement Bereavement;

	@FindBy(xpath = "(//img[@id='pdfs_articles--ckv0xrl34002n60m9bery44zz'])[2]")
	private WebElement Bfav;

	@FindBy(xpath = "(//p[@class='mw-btn-text'][normalize-space()='SEND'])[1]")
	private WebElement Bsend;

	@FindBy(xpath = "(//a[normalize-space()='Lifestyle'])[1]]")
	private WebElement Life;

	@FindBy(xpath = "/html[1]/body[1]/div[9]/div[2]/div[2]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/*[name()='svg'][1]")
	private WebElement Lifefav;

	@FindBy(xpath = "(//a[@href='https://www.cancerresearchuk.org/about-cancer/find-a-clinical-trial/a-trial-looking-at-exercise-and-healthy-eating-for-women-with-breast-cancer#undefined'][normalize-space()='Visit page'])[1]")
	private WebElement Lifevisit;
	
	@FindBy(xpath = "(//div[@class='block'][normalize-space()='SEND'])[2]")
	private WebElement Lifesend;


	public Resource1_Page(WebDriver resource1pg) {
		this.driver = resource1pg;

		PageFactory.initElements(driver, this);

	}

	public WebElement getSupport() {
		return support;
	}

	public WebElement getSvisit() {
		return Svisit;
	}

	public WebElement getSsearch() {
		return Ssearch;
	}

	public WebElement getSsend() {
		return Ssend;
	}

	public WebElement getCovid() {
		return covid;
	}

	public WebElement getCfav() {
		return Cfav;
	}

	public WebElement getCvisit() {
		return Cvisit;
	}

	public WebElement getCsend() {
		return Csend;
	}

	public WebElement getTips() {
		return Tips;
	}

	public WebElement getTsearch() {
		return Tsearch;
	}

	public WebElement getTvisit() {
		return Tvisit;
	}

	public WebElement getTsend() {
		return Tsend;
	}

	public WebElement getProcancer() {
		return Procancer;
	}

	public WebElement getPfav() {
		return Pfav;
	}

	public WebElement getPvisit() {
		return Pvisit;
	}

	public WebElement getPsend() {
		return Psend;
	}

	public WebElement getColo() {
		return colo;
	}

	public WebElement getColovisit() {
		return colovisit;
	}

	public WebElement getColosend() {
		return colosend;
	}

	public WebElement getUsefullink() {
		return usefullink;
	}

	public WebElement getUfav() {
		return Ufav;
	}

	public WebElement getUvisit() {
		return Uvisit;
	}

	public WebElement getUsend() {
		return Usend;
	}

	public WebElement getEnd() {
		return End;
	}

	public WebElement getEndsearch() {
		return Endsearch;
	}

	public WebElement getEndfav() {
		return Endfav;
	}

	public WebElement getEndsend() {
		return Endsend;
	}

	public WebElement getSocial() {
		return Social;
	}

	public WebElement getSlink() {
		return Slink;
	}

	public WebElement getSclose() {
		return Sclose;
	}

	public WebElement getHealth() {
		return health;
	}

	public WebElement getHsearch() {
		return Hsearch;
	}

	public WebElement getBereavement() {
		return Bereavement;
	}

	public WebElement getBfav() {
		return Bfav;
	}

	public WebElement getBsend() {
		return Bsend;
	}

	public WebElement getLife() {
		return Life;
	}

	public WebElement getLifefav() {
		return Lifefav;
	}

	public WebElement getLifevisit() {
		return Lifevisit;
	}

	public WebElement getLifesend() {
		return Lifesend;
	}

}
