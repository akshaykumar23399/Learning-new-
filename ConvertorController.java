package com.extraction.converter.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.extraction.converter.Albama.Arabheritagememorialchapel;
import com.extraction.converter.Albama.Davisfhofalabama;
import com.extraction.converter.Arizona.AbbeyfcFuneralHome;
import com.extraction.converter.CA.Ashepherdscarefuneral;
import com.extraction.converter.CA.CaliforniaProjectsConstants;
import com.extraction.converter.CA.CaliforniaProjectsMain;
import com.extraction.converter.CA.Deeganfuneralchapels;
import com.extraction.converter.Colorado.Taborfuneralhome;
import com.extraction.converter.DC.UmiFunerals;
import com.extraction.converter.Delaware.Ambruso;
import com.extraction.converter.Georgia.Asturner;
import com.extraction.converter.Georgia.Asturnerfuneralandcremation;
import com.extraction.converter.Houston.AddisonfuneralhomesProject;
import com.extraction.converter.Houston.OwwileymortuaryProject;
import com.extraction.converter.Idaho.AccentFuneral;
import com.extraction.converter.Illinois.AaraynerandsonsFuneralHomeProject;
import com.extraction.converter.Illinois.HeinenandloschetterfsProject;
import com.extraction.converter.Illinois.IllinoisProjectsConstants;
import com.extraction.converter.Illinois.IllinoisProjectsMain;
import com.extraction.converter.Illinois.McculloughfuneralProject;
import com.extraction.converter.Illinois.RyanParkeProject;
import com.extraction.converter.Illinois.ZimmermanharnettProject;
import com.extraction.converter.Indiana.BoonefuneralhomeProject;
import com.extraction.converter.Indiana.EllisfhProject;
import com.extraction.converter.Iowa.KearnsFuneralService;
import com.extraction.converter.Kentucky.Alliancefuneralhome;
import com.extraction.converter.Kentucky.SunsetmemorialPeoject;
import com.extraction.converter.Kentucky.bassettfuneralservice;
import com.extraction.converter.Louisiana.Ascensionfuneral;
import com.extraction.converter.Maine.Andersfh;
import com.extraction.converter.Maryland.AdamsfamilyfuneralhomeProject;
import com.extraction.converter.Massachusetts.Alfreddthomas;
import com.extraction.converter.Massachusetts.Berubecomeau;
import com.extraction.converter.Michigan.AhPeters;
import com.extraction.converter.Michigan.CapaulFuneralhome;
import com.extraction.converter.Minnesota.KozlakradulovichMain;
import com.extraction.converter.Mississippi.Colemanfuneralhome;
import com.extraction.converter.Missouri.Archwaychapel;
import com.extraction.converter.Missouri.BachyagerMain;
import com.extraction.converter.MixedState.*;
import com.extraction.converter.NJhudson.MclaughlinfhProject;
import com.extraction.converter.NJhudson.armitagewigginshome;
import com.extraction.converter.NV.Autumnfuneral;
import com.extraction.converter.Nebraska_NorthDakota_NH.Bismarckfuneralhome;
import com.extraction.converter.NewMaxico.Affordablecreamationabq;
import com.extraction.converter.NorthCarolina.Albrightfuneralhomeinc;
import com.extraction.converter.NorthCarolina.NorthCarolinaProjectsConstants;
import com.extraction.converter.NorthCarolina.NorthCarolinaProjectsMain;
import com.extraction.converter.Ohio.AnthonychapelsOhio;
import com.extraction.converter.Ohio.AripepiandsonsProject;
import com.extraction.converter.Ohio.ChilesLamanfh;
import com.extraction.converter.Ohio.HillFuneralProject;
import com.extraction.converter.Ohio.Lanefuneralhomes;
import com.extraction.converter.Ohio.Neeldfuneralhome;
import com.extraction.converter.Ohio.Swigarteasterlingfuneralhome;
import com.extraction.converter.Oklahoma.AnthonychapelsOK;
import com.extraction.converter.Oregon.Aasum_dufour;
import com.extraction.converter.PA.AndersfhProject;
import com.extraction.converter.PA.BekavacfuneralhomeProject;
import com.extraction.converter.PA.DavidhenneyfuneralhomeProject;
import com.extraction.converter.PA.KingfuneralhomeProject;
import com.extraction.converter.PA.RobertpkarishfhProject;
import com.extraction.converter.PA.ThomasjgmiterfhProject;
import com.extraction.converter.SouthCarolina.Articobits;
import com.extraction.converter.SouthCarolina.Blizzardfuneralhome;
import com.extraction.converter.Tennessee.Foothillsfh;
import com.extraction.converter.Vermont.Halefuneralhomes;
import com.extraction.converter.arkansas.Essexfuneralhome;
import com.extraction.converter.connecticut.Auroramccarthyfuneralhome;
import com.extraction.converter.dallas.GreenwoodfuneralhomesProject;
import com.extraction.converter.dallas.HughesftcProject;
import com.extraction.converter.entities.OrbitData;
import com.extraction.converter.florida.FloridaProjectsConstants;
import com.extraction.converter.florida.FloridaProjectsMain;
import com.extraction.converter.florida.bpfamilycarefuneralhome;
import com.extraction.converter.jacksonville.AdignifiedalternativeProject;
import com.extraction.converter.jacksonvilleNY.PhillipsmortuaryProject;
import com.extraction.converter.losAngeles.CabotandsonsfhProject;
import com.extraction.converter.losAngeles.GuerragutierrezProject;
import com.extraction.converter.losAngeles.HalleyolsenProject;
import com.extraction.converter.losAngeles.WhiteemersonProject;
import com.extraction.converter.miami.gregglmasonfuneralhome;
import com.extraction.converter.newYork.AfcabProject;
import com.extraction.converter.newYork.AkMacagnaFuneralHomeProject;
import com.extraction.converter.newYork.AndrefBakerFuneralHome;
import com.extraction.converter.newYork.Anthonychapels;
import com.extraction.converter.newYork.CleckleyFuneralServicesProject;
import com.extraction.converter.newYork.FarengafuneralhomeProject;
import com.extraction.converter.newYork.NewYorkProjectsConstants;
import com.extraction.converter.newYork.NewYorkProjectsMain;
import com.extraction.converter.newYork.luciabrosfhfuneralhome;
import com.extraction.converter.newjersey.Adams_perfect;
import com.extraction.converter.newjersey.Boucherfuneralhome;
import com.extraction.converter.newjersey.Oceancountycremationservice;
import com.extraction.converter.newjersey.Poulsonvanhise;
import com.extraction.converter.njEssex.OboylefuneralhomeProject;
import com.extraction.converter.njMiddleSex.SaulfuneralhomesProject;
import com.extraction.converter.nyErie.AmigoneProject;
import com.extraction.converter.nyNassau.MentleyfuneralhomeProject;
import com.extraction.converter.nysuffolk.AlexanderrothwellProject;
import com.extraction.converter.nysuffolk.MoloneyfhProject;
import com.extraction.converter.rhodeIsland.Sansonefuneralhome;
import com.extraction.converter.sanAntonio.DwbrooksfuneralhomeProject;
import com.extraction.converter.sanFrancisco.DriscollsmortuaryProject;
import com.extraction.converter.sandiego.accucarecremationfuneralhome;
import com.extraction.converter.service.DataEntryServiceImpl;
import com.extraction.converter.service.DignityCustomService;
import com.extraction.converter.service.DignityMemorialSerivceImpl;
import com.extraction.converter.service.FileGenerator;
import com.extraction.converter.service.LegacyCustomService;
import com.extraction.converter.service.LegacyFileReaderService;
import com.extraction.converter.service.LegacyServiceImpl;
import com.extraction.converter.southDakota.Andersonandsonsfh;
import com.extraction.converter.tampa.adamsjenningsfuneralhome;
import com.extraction.converter.verginia.Altmeyerfuneralandcremation;
import com.extraction.converter.verginia.Rwbakerfh;
import com.extraction.converter.washington.Asacredmomentfuneralhome;

//import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//@Slf4j
@RestController
@RequestMapping("/convertor")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ConvertorController {
	private static final Logger log = LoggerFactory.getLogger(Taborfuneralhome.class);


	@Autowired
	private DataEntryServiceImpl dataEntryService;

	@Autowired
	private DignityMemorialSerivceImpl dignityService;

	@Autowired
	private LegacyServiceImpl legacyService;

	@Autowired
	private LegacyCustomService legacyCustomService;

	@Autowired
	private DignityCustomService dignityCustomService;

	@Autowired
	private CabotandsonsfhProject cabotandsonsfhService;

	@Autowired
	private GreenwoodfuneralhomesProject greenwoodfuneralhomesService;

	@Autowired
	private FileGenerator fileGenerator;

	@Autowired
	private GuerragutierrezProject guerragutierrezService;

	@Autowired
	private HalleyolsenProject halleyolsenServivce;

	@Autowired
	private HinseyBrown hinseyBrownService;

	@Autowired
	private WhiteemersonProject whiteemersonProject;

	@Autowired
	private OboylefuneralhomeProject oboylefuneralhomeProject;

	@Autowired
	private SaulfuneralhomesProject saulfuneralhomesProject;

	@Autowired
	private AddisonfuneralhomesProject addisonHomesProject;

	@Autowired
	private OwwileymortuaryProject owwileyMortuaryProject;

	@Autowired
	private AmigoneProject amigoneProject;

	@Autowired
	private MentleyfuneralhomeProject mentleyfuneralhomeProject;

	@Autowired
	private HughesftcProject hughesftcProject;

	@Autowired
	private CleckleyFuneralServicesProject cleckleyFuneralServicesProject;

	@Autowired
	private FarengafuneralhomeProject farengafuneralhomeProject;

	@Autowired
	private AkMacagnaFuneralHomeProject akMacagnaFuneralHomeProject;

	@Autowired
	private RyanParkeProject ryanParkeProject;

	@Autowired
	private AndrefBakerFuneralHome andrefBakerFuneralHome;

	@Autowired
	private AlexanderrothwellProject alexanderrothwellProject;

	@Autowired
	private MoloneyfhProject moloneyfhProject;

	@Autowired
	private AfcabProject afcabProject;

	@Autowired
	private DriscollsmortuaryProject driscollsmortuaryProject;

	@Autowired
	private DwbrooksfuneralhomeProject dwbrooksfuneralhomeProject;

	@Autowired
	private AdignifiedalternativeProject adignifiedalternativeProject;

	@Autowired
	private PhillipsmortuaryProject phillipsmortuaryProject;

	@Autowired
	private MclaughlinfhProject mclaughlinfhProject;

	@Autowired
	private luciabrosfhfuneralhome luciabrosfhfuneralhomeProject;

	@Autowired
	private accucarecremationfuneralhome accucarecremationfuneralhomeProject;

	@Autowired
	private adamsjenningsfuneralhome adamsjenningsfuneralhomeProject;

	@Autowired
	private bpfamilycarefuneralhome bpfamilycarefuneralhomeProject;

	@Autowired
	private armitagewigginshome armitagewigginshomeProject;

	@Autowired
	private gregglmasonfuneralhome gregglmasonfuneralhomeProject;

	@Autowired
	private ZimmermanharnettProject zimmermanharnettProject;

	@Autowired
	McculloughfuneralProject mcculloughfuneralProject;

	@Autowired
	private AaraynerandsonsFuneralHomeProject aaraynerandsonsFuneralHomeProject;

	@Autowired
	private HeinenandloschetterfsProject heinenandloschetterfsProject;

	@Autowired
	private BekavacfuneralhomeProject bekavacfuneralhomeProject;

	@Autowired
	private DavidhenneyfuneralhomeProject davidhenneyfuneralhomeProject;

	@Autowired
	private ThomasjgmiterfhProject thomasjgmiterfhProject;

	@Autowired
	private RobertpkarishfhProject robertpkarishfhProject;

	@Autowired
	private KingfuneralhomeProject kingfuneralhomeProject;

	@Autowired
	private AripepiandsonsProject aripepiandsonsProject;

	@Autowired
	private HillFuneralProject hillFuneralProject;

	@Autowired
	private Albrightfuneralhomeinc albrightfuneralhomeinc;

	@Autowired
	private AdamsfamilyfuneralhomeProject adamsfamilyfuneralhomeProject;

	@Autowired
	private AbbeyfcFuneralHome abbeyfcFuneralHome;

	@Autowired
	private Altmeyerfuneralandcremation altmeyerfuneralandcremation;

	@Autowired
	private Asturner asturner;

	@Autowired
	private Asturnerfuneralandcremation asturnerfuneralandcremation;

	@Autowired
	private Auroramccarthyfuneralhome auroramccarthyfuneralhome;

	@Autowired
	private Asacredmomentfuneralhome asacredmomentfuneralhome;

	@Autowired
	private Essexfuneralhome essexfuneralhome;

	@Autowired
	private Davisfhofalabama davisfhofalabam;

	@Autowired
	private BoonefuneralhomeProject boonefuneralhomeProject;

	@Autowired
	private FloridaProjectsMain floridaProjectsMain;

	@Autowired
	private EllisfhProject ellisfhProject;

	@Autowired
	private Arabheritagememorialchapel arabheritagememorialchapel;

	@Autowired
	Anthonychapels anthonychapels;

	@Autowired
	AnthonychapelsOhio anthonychapelsOhio;

	@Autowired
	AnthonychapelsOK anthonychapelsOK;

	@Autowired
	private Rwbakerfh rwbakerfh;

	@Autowired
	private LegacyFileReaderService legacyFileReader;

	@Autowired
	private Taborfuneralhome taborfuneralhome;

	@Autowired
	private TisdalelannmemorialProject tisdalelannmemorialProject;

	@Autowired
	UmiFunerals umiFunerals;

	@Autowired
	Ambruso ambruso;

	@Autowired
	KozlakradulovichMain kozlakradulovichMain;

	@Autowired
	BachyagerMain bachyagerMain;

	@Autowired
	KearnsFuneralService kearnsFuneralService;

	@Autowired
	AccentFuneral accentFuneral;

	@Autowired
	Aasum_dufour aasumdufour;

	@Autowired
	CapaulFuneralhome capaulFuneralhome;

	@Autowired
	Affordablecreamationabq affordablecreamationabq;

	@Autowired
	AndersfhProject andersfhProject;

	@Autowired
	AhPeters ahPeters;

	@Autowired
	Andersfh andersfh;

	@Autowired
	Alfreddthomas alfreddthomas;

	@Autowired
	private IllinoisProjectsMain illinoisProjectsMain;

	@Autowired
	Berubecomeau berubecomeau;

	@Autowired
	Archwaychapel archwaychapel;

	@Autowired
	Alliancefuneralhome alliancefuneralhome;

	@Autowired
	Ascensionfuneral ascensionfuneral;

	@Autowired
	Bismarckfuneralhome bismarckfuneralhome;

	@Autowired
	Ashepherdscarefuneral ashepherdscarefuneral;

	@Autowired
	Sansonefuneralhome sansonefuneralhome;

	@Autowired
	Andersonandsonsfh andersonandsonsfh;

	@Autowired
	Foothillsfh foothillsfh;
	@Autowired
	Blizzardfuneralhome blizzardfuneralhome;

	@Autowired
	Articobits articobits;

	@Autowired
	NorthCarolinaProjectsMain northCarolinaProjectsMain;

	@Autowired
	Colemanfuneralhome colemanfuneralhome;

	@Autowired
	Adams_perfect adamsperfect;

	@Autowired
	Boucherfuneralhome boucherfuneralhome;

	@Autowired
	Poulsonvanhise poulsonvanhise;

	@Autowired
	NewYorkProjectsMain newYorkProjectsMain;

	@Autowired
	Oceancountycremationservice oceancountycremationservice;

	@Autowired
	CaliforniaProjectsMain californiaProjectsMain;

	@Autowired
	ChilesLamanfh chilesLamanfh;

	@Autowired
	Neeldfuneralhome neeldfuneralhome;

	@Autowired
	Deeganfuneralchapels deeganfuneralchapels;

	@Autowired
	Autumnfuneral autumnfuneral;

	@Autowired
	Lanefuneralhomes lanefuneralhomes;

	@Autowired
	Swigarteasterlingfuneralhome swigarteasterlingfuneralhome;

	@Autowired
	SunsetmemorialPeoject sunsetmemorialPeoject;

	@Autowired
	bassettfuneralservice bassettfuneralservices;

	@Autowired
	private AaronsmortuaryProject aaronsmortuaryProject;

	@Autowired
	Halefuneralhomes halefuneralhomes;

	@Autowired
	Garvinandgarvinfuneralhome garvinandgarvinfuneralhome;

	@Autowired
	Graumlichfuneralhome graumlichfuneralhome;

	@Autowired
	Bunchroberts bunchroberts;

	@Autowired
	Cowherdandparrott cowherdandparrott;

	@Autowired
	Chambersandjames chambersandjames;

	@Autowired
	Memorialdesigners memorialdesigners;

	@Autowired
	Claryglenn claryglenn;

	@Autowired
	Flammfh flammfh;

	@Autowired
	Pressleysfuneralhome pressleysfuneralhome;

	@Autowired
	Musicfuneralhome musicfuneralhome;

	@Autowired
	Rawlsfuneralhomes rawlsfuneralhomes;

	@Autowired
	Rossfh rossfh;

	@Autowired
	Shawnchapmanfh shawnchapmanfh;

	@Autowired
	Stephensfuneralhome stephensfuneralhome;

	@Autowired
	Craigfh craigfh;

	@Autowired
	Deringhenson deringhenson;

	@Autowired
	Eleyfuneralhomes eleyfuneralhomes;

	@Autowired
	Rtfunerals rtfunerals;

	@Autowired
	AsasmithProject asasmithProject;

	@Autowired
	Bixbyfuneralservice bixbyfuneralservice;

	@Autowired
	Barkesweaverglick barkesweaverglick;

	@Autowired
	Haverstockfuneralhome haverstockfuneralhome;

	@Autowired
	Georgemasonfuneralhome georgemasonfuneralhome;

	@Autowired
	Gubbiottifh gubbiottifh;

	@Autowired
	Everettfuneral everettfuneral;

	@Autowired
	Deanmemorialfuneralhome deanmemorialfuneralhome;

	@Autowired
	Forbesfuneralhome forbesfuneralhome;

	@Autowired
	Blackburnchapel blackburnchapel;

	@Autowired
	Boyntonmemorial boyntonmemorial;

	@Autowired
	Brownfuneraldirectors brownfuneraldirectors;

	@Autowired
	Dudleymemorial dudleymemorial;

	@Autowired
	Carmanfuneral carmanfuneral;

	@Autowired
	Colonialfunerals colonialfunerals;

	@Autowired
	Larkinandscott larkinandscott;

	@Autowired
	Lomaxfuneralhome lomaxfuneralhome;

	@Autowired
	Manchesterfh manchesterfh;

	@Autowired
	Mckinneydargy mckinneydargy;

	@Autowired
	Pantalone pantalone;

	@Autowired
	Portlandjewishfuneralhome portlandjewishfuneralhome;

	@Autowired
	Redmondfuneralhomeinc redmondfuneralhomeinc;

	@Autowired
	Sellersfuneralhome sellersfuneralhome;

	@Autowired
	Tulocaycemetery tulocaycemetery;

	@Autowired
	Bibbveach bibbveach;

	@Autowired
	Kleinfh kleinfh;

	@Autowired
	Centralpaprofessionalservices centralpaprofessionalservices;

	@Autowired
	Stendebackfamilyfuneralhome stendebackfamilyfuneralhome;

	@Autowired
	Waskoms waskoms;

	@Autowired
	Merlinfuneralhome merlinfuneralhome;

	@Autowired
	Allfaiths866 allfaiths866;

	@Autowired
	Obaughfuneralhome obaughfuneralhome;

	@Autowired
	Whitecolumnsfuneralservice whitecolumnsfuneralservice;

	@Autowired
	Warefh warefh;

	@Autowired
	Wilcoxffh wilcoxffh;

	@Autowired
	Worthingtonfuneralhome worthingtonfuneralhome;

	@Autowired
	Bradleyfhmarlton bradleyfhmarlton;

	@Autowired
	Whitakerfh whitakerfh;

	@Autowired
	Rogersofmccoll rogersofmccoll;

	@Autowired
	Storkefuneralhome storkefuneralhome;

	@Autowired
	Serenityfuneralfresno serenityfuneralfresno;

	@Autowired
	Bryersfh bryersfh;

	@Autowired
	Bauerfh bauerfh;

	@Autowired
	Boardmansmith boardmansmith;

	@Autowired
	Bethanymemorialchapel bethanymemorialchapel;

	@Autowired
	Sunsetmemorial sunsetmemorial;

	@Autowired
	Bakerpostfh bakerpostfh;

	@Autowired
	Tisdalelannmemorialfh tisdalelannmemorialfh;

	@Autowired
	Fausettfh fausettfh;

	@Autowired
	Geraldinefuneralhome geraldinefuneralhome;

	@Autowired
	Christianwayfh christianwayfh;

	@Autowired
	Burnsidefuneralhome burnsidefuneralhome;

	@Autowired
	Journetandboldenfuneralhome journetandboldenfuneralhome;

	@Autowired
	Bowserfh bowserfh;

	@Autowired
	Schwenkebaumgarten schwenkebaumgarten;

	@Autowired
	Squaredealfuneralhome squaredealfuneralhome;

	@Autowired
	Riewertsmemorialhome riewertsmemorialhome;

	@Autowired
	Sunsetmc sunsetmc;

	@Autowired
	Wmsfuneralhome wmsfuneralhome;

	@Autowired
	DignitymemorialThird dignitymemorialThird;

	@Autowired
	Dignitymemorial dignitymemorial;

	@Autowired
	Johnsonmoorefuneralhome johnsonmoorefuneralhome;

	@Autowired
	Josephngarlickfuneralhome josephngarlickfuneralhome;

	@Autowired
	Koupfunerals koupfunerals;

	@Autowired
	Lamortuary lamortuary;

	@Autowired
	Lewisfuneralhome lewisfuneralhome;

	@Autowired
	Mathisfuneralhome mathisfuneralhome;

	@Autowired
	Kellerfuneralhome kellerfuneralhome;

	@Autowired
	Peoplesofwhiteville peoplesofwhiteville;

	@Autowired
	Moapavalleymortuary moapavalleymortuary;

	@Autowired
	Otthaverstock otthaverstock;

	@Autowired
	Porterfuneralhomes porterfuneralhomes;

	@Autowired
	Integrityfuneral integrityfuneral;

	@Autowired
	Hayesfuneralhome hayesfuneralhome;

	@Autowired
	Hopevalleyfuneralservice hopevalleyfuneralservice;

	@Autowired
	Hargettfuneralserviceinc hargettfuneralserviceinc;

	@Autowired
	Jandwfh jandwfh;

	@Autowired
	Griffinfamilyfuneral griffinfamilyfuneral;

	@Autowired
	Coralspringsfuneralhome coralspringsfuneralhome;

	@Autowired
	Fitzpatrickfuneral fitzpatrickfuneral;

	@Autowired
	Wvi wvi;

	@Autowired
	Roydavisfuneralhome roydavisfuneralhome;
	Danielsfuneral danielsfuneral;

	@Autowired
	Eickenhorstfuneral eickenhorstfuneral;

	@Autowired
	Furnessfuneralhome furnessfuneralhome;

	@Autowired
	Andersonandmarshall andersonandmarshall;

	@Autowired
	Bladenfuneralhome bladenfuneralhome;

	@Autowired
	Brooksfh brooksfh;

	Barbarafalowski barbarafalowski;

	@Autowired
	Cardaras cardaras;

	@Autowired
	Cheathamcountyfh cheathamcountyfh;

	@Autowired
	Clpagemortuary clpagemortuary;

	@Autowired
	Fordfuneralhomes fordfuneralhomes;

	@Autowired
	Whittfh whittfh;

	@Autowired
	Russellpicafuneralhome russellpicafuneralhome;

	@Autowired
	Careyandsonfuneralhome careyandsonfuneralhome;

	@Autowired
	Fordfuneralhomess fordfuneralhomess;

	@Scheduled(cron = "0 0 1 * * SAT")
	public void firstRun() throws Exception {
		log.info("----- Saturday Scrapping Started -----");

		careyandsonfuneralhome.saveData();
		bladenfuneralhome.saveData();
		barbarafalowski.saveData();
		hargettfuneralserviceinc.saveData();
		otthaverstock.saveData();
		lamortuary.saveData();
		geraldinefuneralhome.saveData();
		sunsetmemorial.saveData();
		storkefuneralhome.saveData();
		rogersofmccoll.saveData();
		bradleyfhmarlton.saveData();
		worthingtonfuneralhome.saveData();
		allfaiths866.saveData();
		mckinneydargy.saveData();
		tulocaycemetery.saveData();
		pantalone.saveData();
		larkinandscott.saveData();
		dudleymemorial.saveData();
		rtfunerals.saveData();

		log.info("----- Saturday Scrapping Completed -----");
	}

	@Scheduled(cron = "0 0 13 * * SAT")
	public void firstRun1() throws Exception {
		log.info("----- Saturday seccond Scrapping Started -----");

		deringhenson.saveData();
		shawnchapmanfh.saveData();
		claryglenn.saveData();
		rawlsfuneralhomes.saveData();
		rossfh.saveData();
		aaronsmortuaryProject.saveData();
		halefuneralhomes.saveData();
		newYorkProjectsMain.saveData(NewYorkProjectsConstants.ROSSIDITORO_FUNERAL_HOME);
		californiaProjectsMain.saveData(CaliforniaProjectsConstants.MC_NARY_MOORE_FUNERAL_SERVICE);
		californiaProjectsMain.saveData(CaliforniaProjectsConstants.SERENITY_FUNERAL_FRESNO);
		newYorkProjectsMain.saveData(NewYorkProjectsConstants.AJ_CUNNING_HAM_FH);
		newYorkProjectsMain.saveData(NewYorkProjectsConstants.LIBBY_FUNERAL_HOME);
		newYorkProjectsMain.saveData(NewYorkProjectsConstants.WO_LAN_IN_FUNERAL_HOME);
		colemanfuneralhome.saveData();
		blizzardfuneralhome.saveData();
		articobits.saveData();
		rwbakerfh.saveData();
		affordablecreamationabq.saveData();
		andersfhProject.saveData();
		riewertsmemorialhome.saveData();

		log.info("----- Saturday seccond Scrapping Completed -----");
	}

	// Project Count - 38
	@PostMapping(value = "/first")
	public void firstRunapi() throws Exception {
		log.info("----- Saturday Scrapping Started -----");

		careyandsonfuneralhome.saveData();
		bladenfuneralhome.saveData();
		barbarafalowski.saveData();
		hargettfuneralserviceinc.saveData();
		otthaverstock.saveData();
		lamortuary.saveData();
		geraldinefuneralhome.saveData();
		sunsetmemorial.saveData();
		storkefuneralhome.saveData();
		rogersofmccoll.saveData();
		bradleyfhmarlton.saveData();
		worthingtonfuneralhome.saveData();
		allfaiths866.saveData();
		mckinneydargy.saveData();
		tulocaycemetery.saveData();
		pantalone.saveData();
		larkinandscott.saveData();
		dudleymemorial.saveData();
		rtfunerals.saveData();
		deringhenson.saveData();
		shawnchapmanfh.saveData();
		claryglenn.saveData();
		rawlsfuneralhomes.saveData();
		rossfh.saveData();
		aaronsmortuaryProject.saveData();
		halefuneralhomes.saveData();
		newYorkProjectsMain.saveData(NewYorkProjectsConstants.ROSSIDITORO_FUNERAL_HOME);
		californiaProjectsMain.saveData(CaliforniaProjectsConstants.MC_NARY_MOORE_FUNERAL_SERVICE);
		californiaProjectsMain.saveData(CaliforniaProjectsConstants.SERENITY_FUNERAL_FRESNO);
		newYorkProjectsMain.saveData(NewYorkProjectsConstants.AJ_CUNNING_HAM_FH);
		newYorkProjectsMain.saveData(NewYorkProjectsConstants.LIBBY_FUNERAL_HOME);
		newYorkProjectsMain.saveData(NewYorkProjectsConstants.WO_LAN_IN_FUNERAL_HOME);
		colemanfuneralhome.saveData();
		blizzardfuneralhome.saveData();
		articobits.saveData();
		rwbakerfh.saveData();
		affordablecreamationabq.saveData();
		andersfhProject.saveData();
		riewertsmemorialhome.saveData();

		log.info("----- Saturday Scrapping Completed -----");
	}

	@Scheduled(cron = "0 0 2 * * SUN")
	public void secondRun() throws Exception {
		log.info("----- Sunday Scrapping Started -----");

		northCarolinaProjectsMain.saveData(NorthCarolinaProjectsConstants.JACKSON_FUNERAL_SERVICE);
		northCarolinaProjectsMain.saveData(NorthCarolinaProjectsConstants.LO_FLIN_FUNERAL_SERVICE);
		this.guerragutierrezService.saveData();
		this.cabotandsonsfhService.saveData();
		this.halleyolsenServivce.saveData();
		this.greenwoodfuneralhomesService.saveData();
		this.saulfuneralhomesProject.saveData();
		this.oboylefuneralhomeProject.saveData();
		this.whiteemersonProject.saveData();
		this.cleckleyFuneralServicesProject.saveData();
		this.amigoneProject.saveData();
		this.hughesftcProject.saveData();
		this.mentleyfuneralhomeProject.saveData();
		this.farengafuneralhomeProject.saveData();
		this.addisonHomesProject.saveData();
		this.akMacagnaFuneralHomeProject.saveData();
		this.owwileyMortuaryProject.saveData();
		this.andrefBakerFuneralHome.saveData();

		log.info("----- Sunday Scrapping Completed -----");
	}

	@Scheduled(cron = "0 0 14 * * SUN")
	public void secondRun2() throws Exception {
		log.info("----- Sunday second Scrapping Started -----");

		fordfuneralhomess.saveData();
		brooksfh.saveData();
		jandwfh.saveData();
		porterfuneralhomes.saveData();
		schwenkebaumgarten.saveData();
		lewisfuneralhome.saveData();
		christianwayfh.saveData();
		bakerpostfh.saveData();
		ahPeters.saveData();
		andersfh.saveData();
		anthonychapelsOK.saveData();
		alliancefuneralhome.saveData();
		serenityfuneralfresno.saveData();
		whitakerfh.saveData();
		whitecolumnsfuneralservice.saveData();
		waskoms.saveData();
		portlandjewishfuneralhome.saveData();
		lomaxfuneralhome.saveData();
		northCarolinaProjectsMain.saveData(NorthCarolinaProjectsConstants.MCCLURE_FUNERAL_SERVICE);
		northCarolinaProjectsMain.saveData(NorthCarolinaProjectsConstants.DAVIDSON_FUNERAL_HOME);

		log.info("----- Sunday second Scrapping Completed -----");
	}

	// Project Count - 38
	@PostMapping(value = "/second")
	public void secondRunApi() throws Exception {
		log.info("----- Sunday Scrapping Started -----");

		fordfuneralhomess.saveData();
		brooksfh.saveData();
		jandwfh.saveData();
		porterfuneralhomes.saveData();
		schwenkebaumgarten.saveData();
		lewisfuneralhome.saveData();
		christianwayfh.saveData();
		bakerpostfh.saveData();
		ahPeters.saveData();
		andersfh.saveData();
		anthonychapelsOK.saveData();
		alliancefuneralhome.saveData();
		serenityfuneralfresno.saveData();
		whitakerfh.saveData();
		whitecolumnsfuneralservice.saveData();
		waskoms.saveData();
		portlandjewishfuneralhome.saveData();
		lomaxfuneralhome.saveData();
		northCarolinaProjectsMain.saveData(NorthCarolinaProjectsConstants.MCCLURE_FUNERAL_SERVICE);
		northCarolinaProjectsMain.saveData(NorthCarolinaProjectsConstants.DAVIDSON_FUNERAL_HOME);
		northCarolinaProjectsMain.saveData(NorthCarolinaProjectsConstants.JACKSON_FUNERAL_SERVICE);
		northCarolinaProjectsMain.saveData(NorthCarolinaProjectsConstants.LO_FLIN_FUNERAL_SERVICE);
		this.guerragutierrezService.saveData();
		this.cabotandsonsfhService.saveData();
		this.halleyolsenServivce.saveData();
		this.greenwoodfuneralhomesService.saveData();
		this.saulfuneralhomesProject.saveData();
		this.oboylefuneralhomeProject.saveData();
		this.whiteemersonProject.saveData();
		this.cleckleyFuneralServicesProject.saveData();
		this.amigoneProject.saveData();
		this.hughesftcProject.saveData();
		this.mentleyfuneralhomeProject.saveData();
		this.farengafuneralhomeProject.saveData();
		this.addisonHomesProject.saveData();
		this.akMacagnaFuneralHomeProject.saveData();
		this.owwileyMortuaryProject.saveData();
		this.andrefBakerFuneralHome.saveData();

		log.info("----- Sunday Scrapping Completed -----");
	}

	@Scheduled(cron = "0 0 1 * * FRI")
	public void thirdRun() throws Exception {
		log.info("----- Friday Scrapping Started -----");

		whittfh.saveData();
		griffinfamilyfuneral.saveData();
		danielsfuneral.saveData();
		integrityfuneral.saveData();
		dignitymemorial.saveData();
		johnsonmoorefuneralhome.saveData();
		kellerfuneralhome.saveData();
		burnsidefuneralhome.saveData();
		manchesterfh.saveData();
		carmanfuneral.saveData();
		colonialfunerals.saveData();
		blackburnchapel.saveData();
		gubbiottifh.saveData();
		hinseyBrownService.saveData();
		asasmithProject.saveData();
		eleyfuneralhomes.saveData();
		musicfuneralhome.saveData();
		chambersandjames.saveData();

		log.info("----- Friday Scrapping Completed -----");
	}

	@Scheduled(cron = "0 0 13 * * FRI")
	public void thirdRun3() throws Exception {
		log.info("----- Friday second Scrapping Started -----");

		sunsetmemorialPeoject.saveData();
		deeganfuneralchapels.saveData();
		oceancountycremationservice.saveData();
		autumnfuneral.saveData();
		taborfuneralhome.saveData();
		ambruso.saveData();
		kozlakradulovichMain.saveData();
		bachyagerMain.saveData();
		newYorkProjectsMain.saveData(NewYorkProjectsConstants.LS_VP_MEMORIAL_HOME);
		chilesLamanfh.saveData();
		neeldfuneralhome.saveData();
		ashepherdscarefuneral.saveData();
		sansonefuneralhome.saveData();
		andersonandsonsfh.saveData();
		foothillsfh.saveData();
		illinoisProjectsMain.saveData(IllinoisProjectsConstants.OWENS_FUNERAL_HOMES);
		illinoisProjectsMain.saveData(IllinoisProjectsConstants.KAHLE_MOORE);
		berubecomeau.saveData();
		bismarckfuneralhome.saveData();
		umiFunerals.saveData();
		this.driscollsmortuaryProject.saveData();

		log.info("----- Friday second Scrapping Completed -----");
	}
	// Project Count - 39

	@PostMapping(value = "/third")
	public void thirdRunApi() throws Exception {
		log.info("----- Friday Scrapping Started -----");

		whittfh.saveData();
		griffinfamilyfuneral.saveData();
		danielsfuneral.saveData();
		integrityfuneral.saveData();
		dignitymemorial.saveData();
		johnsonmoorefuneralhome.saveData();
		kellerfuneralhome.saveData();
		burnsidefuneralhome.saveData();
		manchesterfh.saveData();
		carmanfuneral.saveData();
		colonialfunerals.saveData();
		blackburnchapel.saveData();
		gubbiottifh.saveData();
		hinseyBrownService.saveData();
		asasmithProject.saveData();
		eleyfuneralhomes.saveData();
		musicfuneralhome.saveData();
		chambersandjames.saveData();
		sunsetmemorialPeoject.saveData();
		deeganfuneralchapels.saveData();
		oceancountycremationservice.saveData();
		autumnfuneral.saveData();
		taborfuneralhome.saveData();
		ambruso.saveData();
		kozlakradulovichMain.saveData();
		bachyagerMain.saveData();
		newYorkProjectsMain.saveData(NewYorkProjectsConstants.LS_VP_MEMORIAL_HOME);
		chilesLamanfh.saveData();
		neeldfuneralhome.saveData();
		ashepherdscarefuneral.saveData();
		sansonefuneralhome.saveData();
		andersonandsonsfh.saveData();
		foothillsfh.saveData();
		illinoisProjectsMain.saveData(IllinoisProjectsConstants.OWENS_FUNERAL_HOMES);
		illinoisProjectsMain.saveData(IllinoisProjectsConstants.KAHLE_MOORE);
		berubecomeau.saveData();
		bismarckfuneralhome.saveData();
		umiFunerals.saveData();
		this.driscollsmortuaryProject.saveData();

		log.info("----- Friday Scrapping Completed -----");
	}

	@Scheduled(cron = "0 0 1 * * THU")
	public void fourthRun() throws Exception {
		log.info("----- Thursday Scrapping Started -----");

		fordfuneralhomes.saveData();
		cardaras.saveData();
		coralspringsfuneralhome.saveData();
		eickenhorstfuneral.saveData();
		hayesfuneralhome.saveData();
		wmsfuneralhome.saveData();
		sunsetmc.saveData();
		journetandboldenfuneralhome.saveData();
		bauerfh.saveData();
		alfreddthomas.saveData();
		bryersfh.saveData();
		kleinfh.saveData();
		bibbveach.saveData();
		warefh.saveData();
		merlinfuneralhome.saveData();
		redmondfuneralhomeinc.saveData();
		georgemasonfuneralhome.saveData();
		haverstockfuneralhome.saveData();

		log.info("----- Thursday Scrapping Completed -----");
	}

	@Scheduled(cron = "0 0 13 * * THU")
	public void fourthRun4() throws Exception {
		log.info("----- Thursday second Scrapping Started -----");

		fordfuneralhomes.saveData();
		cardaras.saveData();
		coralspringsfuneralhome.saveData();
		eickenhorstfuneral.saveData();
		hayesfuneralhome.saveData();
		wmsfuneralhome.saveData();
		sunsetmc.saveData();
		journetandboldenfuneralhome.saveData();
		bauerfh.saveData();
		alfreddthomas.saveData();
		bryersfh.saveData();
		kleinfh.saveData();
		bibbveach.saveData();
		warefh.saveData();
		merlinfuneralhome.saveData();
		redmondfuneralhomeinc.saveData();
		georgemasonfuneralhome.saveData();
		haverstockfuneralhome.saveData();
		barkesweaverglick.saveData();

		log.info("----- Thursday second Scrapping Completed -----");
	}

	// Project Count - 38
	@PostMapping(value = "/fourth")
	public void fourthRunApi() throws Exception {
		log.info("----- Thursday Scrapping Started -----");

		fordfuneralhomes.saveData();
		cardaras.saveData();
		coralspringsfuneralhome.saveData();
		eickenhorstfuneral.saveData();
		hayesfuneralhome.saveData();
		wmsfuneralhome.saveData();
		sunsetmc.saveData();
		journetandboldenfuneralhome.saveData();
		bauerfh.saveData();
		alfreddthomas.saveData();
		bryersfh.saveData();
		kleinfh.saveData();
		bibbveach.saveData();
		warefh.saveData();
		merlinfuneralhome.saveData();
		redmondfuneralhomeinc.saveData();
		georgemasonfuneralhome.saveData();
		haverstockfuneralhome.saveData();
		barkesweaverglick.saveData();
		bixbyfuneralservice.saveData();
		boyntonmemorial.saveData();
		deanmemorialfuneralhome.saveData();
		stephensfuneralhome.saveData();
		this.bpfamilycarefuneralhomeProject.saveData();
		this.zimmermanharnettProject.saveData();
		this.luciabrosfhfuneralhomeProject.saveData();
		this.accucarecremationfuneralhomeProject.saveData();
		this.adamsjenningsfuneralhomeProject.saveData();
		this.armitagewigginshomeProject.saveData();
		this.gregglmasonfuneralhomeProject.saveData();
		this.ryanParkeProject.saveData();
		this.aaraynerandsonsFuneralHomeProject.saveData();
		this.heinenandloschetterfsProject.saveData();
		this.bekavacfuneralhomeProject.saveData();
		this.davidhenneyfuneralhomeProject.saveData();
		this.alexanderrothwellProject.saveData();
		this.afcabProject.saveData();
		this.mclaughlinfhProject.saveData();
		this.phillipsmortuaryProject.saveData();

		log.info("----- Thursday Scrapping Completed -----");
	}

	@Scheduled(cron = "0 0 1 * * TUE")
	public void sixthRun() throws Exception {
		log.info("----- Tuseday Scrapping Started -----");

		russellpicafuneralhome.saveData();
		roydavisfuneralhome.saveData();
		fitzpatrickfuneral.saveData();
		furnessfuneralhome.saveData();
		hopevalleyfuneralservice.saveData();
		mathisfuneralhome.saveData();
		bowserfh.saveData();
		tisdalelannmemorialfh.saveData();
		accentFuneral.saveData();
		archwaychapel.saveData();
		ascensionfuneral.saveData();
		wilcoxffh.saveData();
		obaughfuneralhome.saveData();
		stendebackfamilyfuneralhome.saveData();
		centralpaprofessionalservices.saveData();
		sellersfuneralhome.saveData();
		forbesfuneralhome.saveData();
		brownfuneraldirectors.saveData();
		everettfuneral.saveData();

		log.info("----- Tuseday Scrapping Completed -----");
	}

	@Scheduled(cron = "0 0 13 * * TUE")
	public void sixthRun6() throws Exception {
		log.info("----- Tuseday second Scrapping Started -----");

		flammfh.saveData();
		tisdalelannmemorialProject.saveData();
		memorialdesigners.saveData();
		cowherdandparrott.saveData();
		this.hillFuneralProject.saveData();
		bunchroberts.saveData();
		graumlichfuneralhome.saveData();
		garvinandgarvinfuneralhome.saveData();
		bassettfuneralservices.saveData();
		lanefuneralhomes.saveData();
		swigarteasterlingfuneralhome.saveData();
		boucherfuneralhome.saveData();
		this.adignifiedalternativeProject.saveData();
		this.albrightfuneralhomeinc.saveData();
		this.adamsfamilyfuneralhomeProject.saveData();
		this.thomasjgmiterfhProject.saveData();
		this.kingfuneralhomeProject.saveData();
		this.robertpkarishfhProject.saveData();
		this.aripepiandsonsProject.saveData();

		dignitymemorialThird.saveData();

		josephngarlickfuneralhome.saveData();

		log.info("----- Tuseday second Scrapping Completed -----");
	}

	// Project Count - 37
	// Project Count - 36
	@PostMapping(value = "/fifth")
	public void sixthRunapi() throws Exception {
		log.info("----- Tuseday Scrapping Started -----");

		russellpicafuneralhome.saveData();
		roydavisfuneralhome.saveData();
		fitzpatrickfuneral.saveData();
		furnessfuneralhome.saveData();
		hopevalleyfuneralservice.saveData();
		mathisfuneralhome.saveData();
		bowserfh.saveData();
		tisdalelannmemorialfh.saveData();
		accentFuneral.saveData();
		archwaychapel.saveData();
		ascensionfuneral.saveData();
		wilcoxffh.saveData();
		obaughfuneralhome.saveData();
		stendebackfamilyfuneralhome.saveData();
		centralpaprofessionalservices.saveData();
		sellersfuneralhome.saveData();
		forbesfuneralhome.saveData();
		brownfuneraldirectors.saveData();
		everettfuneral.saveData();
		flammfh.saveData();
		tisdalelannmemorialProject.saveData();
		memorialdesigners.saveData();
		cowherdandparrott.saveData();
		this.hillFuneralProject.saveData();
		bunchroberts.saveData();
		graumlichfuneralhome.saveData();
		garvinandgarvinfuneralhome.saveData();
		bassettfuneralservices.saveData();
		lanefuneralhomes.saveData();
		swigarteasterlingfuneralhome.saveData();
		boucherfuneralhome.saveData();
		this.adignifiedalternativeProject.saveData();
		this.albrightfuneralhomeinc.saveData();
		this.adamsfamilyfuneralhomeProject.saveData();
		this.thomasjgmiterfhProject.saveData();
		this.kingfuneralhomeProject.saveData();
		this.robertpkarishfhProject.saveData();
		this.aripepiandsonsProject.saveData();

		dignitymemorialThird.saveData();

		josephngarlickfuneralhome.saveData();

		log.info("----- Tuseday Scrapping Completed -----");
	}

	@Scheduled(cron = "0 0 1 * * WED")
	public void seventhRun() throws Exception {
		log.info("----- Wednesday Scrapping Started -----");

		clpagemortuary.saveData();
		cheathamcountyfh.saveData();
		wvi.saveData();
		andersonandmarshall.saveData();
		moapavalleymortuary.saveData();
		peoplesofwhiteville.saveData();
		koupfunerals.saveData();
		fausettfh.saveData();
		bethanymemorialchapel.saveData();
		boardmansmith.saveData();
		mcculloughfuneralProject.saveData();
		abbeyfcFuneralHome.saveData();
		asturnerfuneralandcremation.saveData();
		essexfuneralhome.saveData();
		adamsperfect.saveData();
		poulsonvanhise.saveData();
		boonefuneralhomeProject.saveData();
		capaulFuneralhome.saveData();
		aasumdufour.saveData();
		kearnsFuneralService.saveData();

		log.info("----- Wednesday Scrapping Completed -----");
	}

	@Scheduled(cron = "0 0 13 * * WED")
	public void seventhRun7() throws Exception {
		log.info("----- Wednesday second Scrapping Started -----");

		floridaProjectsMain.saveData(FloridaProjectsConstants.A_LIFE_TRIBUTE);
		floridaProjectsMain.saveData(FloridaProjectsConstants.ACREMATION_SERVICE);
		floridaProjectsMain.saveData(FloridaProjectsConstants.ABUNDANT_FAVOUR1);
		anthonychapels.saveData();
		anthonychapelsOhio.saveData();
		ellisfhProject.saveData();
		davisfhofalabam.saveData();
		arabheritagememorialchapel.saveData();
		floridaProjectsMain.saveData(FloridaProjectsConstants.EVAN_SCARTER_FH);
		floridaProjectsMain.saveData(FloridaProjectsConstants.NATIONAL_CREMATION);
		moloneyfhProject.saveData();
		asturner.saveData();
		auroramccarthyfuneralhome.saveData();
		asacredmomentfuneralhome.saveData();
		altmeyerfuneralandcremation.saveData();
		craigfh.saveData();
		dwbrooksfuneralhomeProject.saveData();
		pressleysfuneralhome.saveData();
		squaredealfuneralhome.saveData();

		log.info("----- Wednesday second Scrapping Completed -----");
	}

	// Project Count - 38
	@PostMapping(value = "/sixth")
	public void seventhRunapi() throws Exception {
		log.info("----- Wednesday Scrapping Started -----");

		clpagemortuary.saveData();
		cheathamcountyfh.saveData();
		wvi.saveData();
		andersonandmarshall.saveData();
		moapavalleymortuary.saveData();
		peoplesofwhiteville.saveData();
		koupfunerals.saveData();
		fausettfh.saveData();
		bethanymemorialchapel.saveData();
		boardmansmith.saveData();
		mcculloughfuneralProject.saveData();
		abbeyfcFuneralHome.saveData();
		asturnerfuneralandcremation.saveData();
		essexfuneralhome.saveData();
		adamsperfect.saveData();
		poulsonvanhise.saveData();
		boonefuneralhomeProject.saveData();
		capaulFuneralhome.saveData();
		aasumdufour.saveData();
		kearnsFuneralService.saveData();
		floridaProjectsMain.saveData(FloridaProjectsConstants.A_LIFE_TRIBUTE);
		floridaProjectsMain.saveData(FloridaProjectsConstants.ACREMATION_SERVICE);
		floridaProjectsMain.saveData(FloridaProjectsConstants.ABUNDANT_FAVOUR1);
		anthonychapels.saveData();
		anthonychapelsOhio.saveData();
		ellisfhProject.saveData();
		davisfhofalabam.saveData();
		arabheritagememorialchapel.saveData();
		floridaProjectsMain.saveData(FloridaProjectsConstants.EVAN_SCARTER_FH);
		floridaProjectsMain.saveData(FloridaProjectsConstants.NATIONAL_CREMATION);
		moloneyfhProject.saveData();
		asturner.saveData();
		auroramccarthyfuneralhome.saveData();
		asacredmomentfuneralhome.saveData();
		altmeyerfuneralandcremation.saveData();
		craigfh.saveData();
		dwbrooksfuneralhomeProject.saveData();
		pressleysfuneralhome.saveData();
		squaredealfuneralhome.saveData();

		log.info("----- Wednesday Scrapping Completed -----");
	}

	@PostMapping(value = "/dignity")
	public void getdignityData() throws Exception {
		log.debug("started ----");

		dignityService.saveData();
		log.info("Dignity Finished");

	}

	@PostMapping(value = "/dignityCustom")
	public void getdignityCustomData(@RequestParam(value = "url") String url) throws Exception {
		log.debug("dignity custom started ----");

		dignityCustomService.saveData(url);

		log.info("dignity custom  finished ----");

	}

	@PostMapping(value = "/legacy")
	public void getlegacyData() throws Exception {
		log.debug("started ---- Legacy Data");

		legacyService.saveData();
		log.info("finished ----legacyService");

	}

	@PostMapping(value = "/legacyCustom")
	public void getLegacyCustomData(@RequestParam(value = "url") String url) throws Exception {
		log.debug("started ----legacyCustomService");

		legacyCustomService.saveData(url);
		log.debug("finshed ----legacyCustomService");

	}

	@GetMapping(value = "/retrieve")
	public void getTxtFile() throws Exception {
		log.debug("started ----");

		fileGenerator.retreiveFile();

	}

	@GetMapping(value = "/retrieve/dateRange")
	public void getTxtFilewithDateRange(@RequestParam String dateTo, @RequestParam String dateFrom) throws Exception {
		log.debug("started ----");

		fileGenerator.retreiveFileWithDateRange(dateFrom, dateTo);

	}

	@GetMapping(value = "/createReportWeekly")
	public void createReport() throws Exception {
		log.debug("started ----");

		fileGenerator.createExcelFileWeekly();

	}

	@GetMapping(value = "/createFullReport")
	public void createFullReport(@RequestParam String dateTo, @RequestParam String dateFrom, @RequestParam Integer flag)
			throws Exception {
		log.debug("started ----");

		fileGenerator.createFullExcelFile(dateFrom, dateTo, flag);

	}

	@GetMapping(value = "/legacyFile")
	public void readLegacyFile() throws Exception {
		log.debug("started ----");

		this.legacyFileReader.readLegacyFile();

	}

	@GetMapping(value = "/newRetieve")
	public void createNewReport() throws Exception {
		log.debug("started ----");

		fileGenerator.retreiveFileWithWebsite();

	}

	@GetMapping(value = "/allDataByFlag")
	public void createNewReportWithIncompleteData(@RequestParam Integer flag) throws Exception {
		log.debug("started ----");

		fileGenerator.retreiveFileWithAllData(flag);

	}

	@GetMapping(value = "/retrieveDataWithWebsite")
	public void getTxtFileWithWebsite() throws Exception {
		log.debug("started ----");

		fileGenerator.retreiveFileWithWebsite();

	}

	@GetMapping(value = "/retrieveDataWithWebsiteEdit")
	public void getTxtFileWithWebsiteEdit() throws Exception {
		log.debug("started ----");

		fileGenerator.retreiveFileWithWebsiteEdit();

	}

	@GetMapping(value = "/readUpdatedFile")
	public void getupdatedDataFile() throws Exception {
		log.debug("started ---- reading updated Data file");

		fileGenerator.readUpdatedDataTexTFile();

	}

	@PostMapping(value = "/dataEntry")
	public void dataEntry(@RequestBody OrbitData orbitData) throws Exception {
		dataEntryService.saveData(orbitData);
		log.debug("started ---- Data Entry UI");
	}

	@GetMapping(value = "/getdataEntry")
	public List<OrbitData> dataEntry(@RequestParam String firstDate, @RequestParam String lastDate) throws Exception {
		List<OrbitData> dataList = new ArrayList<>();

		dataList = dataEntryService.getData(firstDate, lastDate);
		log.debug("started ---- Data Entry getdata UI");

		return dataList;

	}

	//////////////////// WebScrapping Project End Points //////////////////////

	@PostMapping(value = "/Guerragutierrez")
	public void getGuerragutierrezData() throws Exception {
		log.debug("started ---- Guerragutierrez");

		guerragutierrezService.saveData();

	}

	@PostMapping(value = "/Zimmermanharnett")
	public void getZimmermanharnettData() throws Exception {
		log.debug("started ---- zimmermanharnettProject");

		zimmermanharnettProject.saveData();

	}

	@PostMapping(value = "/Cabotandsonsfh")
	public void getCabotandsonsData() throws Exception {
		log.debug("started ---- Cabotandsonsfh");

		cabotandsonsfhService.saveData();

	}

	@PostMapping(value = "/Halleyolsen")
	public void getHalleyolsenData() throws Exception {
		log.debug("started ---- Halleyolsen");

		halleyolsenServivce.saveData();

	}

	@PostMapping(value = "/Greenwoodfuneralhomes")
	public void getGreenwoodfuneralhomesData() throws Exception {
		log.debug("started ---- Greenwoodfuneralhomes");

		greenwoodfuneralhomesService.saveData();
	}

	@PostMapping(value = "/SaulfuneralhomesProject")
	public void getSaulfuneralhomesData() throws Exception {
		log.debug("started ---- SaulfuneralhomesProject");

		saulfuneralhomesProject.saveData();
	}

	@PostMapping(value = "/OboylefuneralhomeProject")
	public void getOboylefuneralhomeData() throws Exception {
		log.debug("started ---- OboylefuneralhomeProject");

		oboylefuneralhomeProject.saveData();
	}

	@PostMapping(value = "/whiteemersonProject")
	public void getWhiteemersonData() throws Exception {
		log.debug("started ---- whiteemersonProject");

		whiteemersonProject.saveData();

	}

	@PostMapping(value = "/cleckleyFuneralServicesProject")
	public void getcleckleyFuneralProjectData() throws Exception {
		log.debug("started ---- cleckleyFuneralServicesProject");

		cleckleyFuneralServicesProject.saveData();

	}

	@PostMapping(value = "/AmigoneProject")
	public void getAmigoneData() throws Exception {
		log.debug("started ----");
		amigoneProject.saveData();
	}

	@PostMapping(value = "/mcculloughfuneral")
	public void getmcculloughfuneralData() throws Exception {
		log.debug("started ---- mcculloughfuneralProject");

		mcculloughfuneralProject.saveData();

	}

	@PostMapping(value = "/hughesftcProject")
	public void getHughesftcProjecttData() throws Exception {
		log.debug("started ---- hughesftcProject");

		hughesftcProject.saveData();
	}

	@PostMapping(value = "/mentleyfuneralhomeProject")
	public void getMentleyfuneralhomeData() throws Exception {
		log.debug("started ----");
		mentleyfuneralhomeProject.saveData();
	}

	@PostMapping(value = "/farengaFuneralHomeProject")
	public void getFarengaFuneralHomeProjectData() throws Exception {
		log.debug("started ---- farengaFuneralHomeProject");

		farengafuneralhomeProject.saveData();

	}

	@PostMapping(value = "/addisonHomesProject")
	public void getAddisonHomesProjectProjectData() throws Exception {
		log.debug("started ---- addisonHomesProject");

		addisonHomesProject.saveData();

	}

	@PostMapping(value = "/akMacagnaFuneralHomeProject")
	public void akMacagnaFuneralHomeProject() throws Exception {
		log.debug("started ---- akMacagnaFuneralHomeProject");

		akMacagnaFuneralHomeProject.saveData();

	}

	@PostMapping(value = "/owwileyMortuaryProject")
	public void getOwwileyMortuaryProjectData() throws Exception {
		log.debug("started ---- owwileyMortuaryProject");

		owwileyMortuaryProject.saveData();

	}

	@PostMapping(value = "/andrefBakerFuneralHome")
	public void getandrefBakerFuneralHomeProjectData() throws Exception {
		log.debug("started ----andrefBakerFuneralHome");

		andrefBakerFuneralHome.saveData();

	}

	@PostMapping(value = "/alexanderrothwellProject")
	public void getAlexanderrothwellProjectData() throws Exception {
		log.debug("started ---- alexanderrothwellProject");

		alexanderrothwellProject.saveData();

	}

	@PostMapping(value = "/moloneyfhProject")
	public void getMmoloneyfhProjectData() throws Exception {
		log.debug("started ---- moloneyfhProject");

		moloneyfhProject.saveData();

	}

	@PostMapping(value = "/afcabProject")
	public void getafcabProjectData() throws Exception {
		log.debug("started ---- alexanderrothwellProject");

		afcabProject.saveData();

	}

	@PostMapping(value = "/driscollsmortuaryProject")
	public void getDriscollsmorturaryData() throws Exception {

		log.info("driscollsmortuaryProject started ----");

		this.driscollsmortuaryProject.saveData();
	}

	@PostMapping(value = "/dwbrooksfuneralhomeProject")
	public void getDwbrooksfuneralhomeData() throws Exception {

		log.info("dwbrooksfuneralhomeProject started ----");

		this.dwbrooksfuneralhomeProject.saveData();
	}

	@PostMapping(value = "/adignifiedalternativeProject")
	public void getAdignifiedalternativeData() throws Exception {

		log.info("adignifiedalternativeProject started ----");

		this.adignifiedalternativeProject.saveData();
	}

	@PostMapping(value = "/phillipsmortuaryProject")
	public void getPhillipsmortuaryData() throws Exception {

		log.info("phillipsmortuaryProject started ----");

		this.phillipsmortuaryProject.saveData();
	}

	@PostMapping(value = "/mclaughlinfhProject")
	public void getMclaughlinfhData() throws Exception {

		log.info("mclaughlinfhProject started ----");

		this.mclaughlinfhProject.saveData();
	}

	@PostMapping(value = "/hillfuneralProject")
	public void gethillfuneralData() throws Exception {

		log.info("hillFuneralProject started ----");

		this.hillFuneralProject.saveData();
	}

	@PostMapping(value = "/AdamsfamilyfuneralhomeProject")
	public void getAdamsfamilyfuneralhomeData() throws Exception {

		log.info("adamsfamilyfuneralhomeProject started ----");

		this.adamsfamilyfuneralhomeProject.saveData();
	}

	@PostMapping(value = "/luciabrosfhfuneralhomeProject")
	public void getluciabrosfhfuneralhomeData() throws Exception {
		log.debug("started ---- luciabrosfhfuneralhomeProject");

		luciabrosfhfuneralhomeProject.saveData();
	}

	@PostMapping(value = "/accucarecremationfuneralhomeProject")
	public void getccucarecremationfuneralhomeData() throws Exception {
		log.debug("started ---- accucarecremationfuneralhomeProject");

		accucarecremationfuneralhomeProject.saveData();
	}

	@PostMapping(value = "/adamsjenningsfuneralhomeProject")
	public void getadamsjenningsfuneralhomeData() throws Exception {
		log.debug("started ---- adamsjenningsfuneralhomeProject");

		this.adamsjenningsfuneralhomeProject.saveData();
	}

	@PostMapping(value = "/bpfamilycarefuneralhomeProject")
	public void getbpfamilycarefuneralhomeData() throws Exception {
		log.debug("started ---- bpfamilycarefuneralhomeProject");

		this.bpfamilycarefuneralhomeProject.saveData();
	}

	@PostMapping(value = "/armitagewigginshomeProject")
	public void getarmitagewigginshomeData() throws Exception {
		log.debug("started ---- armitagewigginshomeProject");

		this.armitagewigginshomeProject.saveData();
	}

	@PostMapping(value = "/gregglmasonfuneralhomeProject")
	public void getgregglmasonfuneralhomeData() throws Exception {
		log.debug("started ---- gregglmasonfuneralhomeProject");

		this.gregglmasonfuneralhomeProject.saveData();
	}

	@PostMapping(value = "/ryanParkeProject")
	public void getRyanParkeProjectData() throws Exception {
		log.debug("started ---- ryanParkeProject");

		this.ryanParkeProject.saveData();
	}

	@PostMapping(value = "/aaraynerandsonsFuneralHomeProject")
	public void getAaraynerandsonsFuneralHomeProjectData() throws Exception {
		log.debug("started ----");

		this.aaraynerandsonsFuneralHomeProject.saveData();
	}

	@PostMapping(value = "/shawnchapmanfh")
	public void getShawnchapmanfhProjectData() throws Exception {
		log.debug("started ---- shawnchapmanfh");

		this.shawnchapmanfh.saveData();
	}

	@PostMapping(value = "/rossfh")
	public void getRossfhProjectData() throws Exception {
		log.debug("started ---- rossfh");

		this.rossfh.saveData();
	}

	@PostMapping(value = "/HeinenandloschetterfsProject")
	public void getHeinenandloschetterfsProjectData() throws Exception {
		log.debug("started ----");

		this.heinenandloschetterfsProject.saveData();
	}

	@PostMapping(value = "/bekavacfuneralhomeProject")
	public void getBekavacfuneralhomeProjectData() throws Exception {
		log.debug("started ----");

		this.bekavacfuneralhomeProject.saveData();
	}

	@PostMapping(value = "/davidhenneyfuneralhomeProject")
	public void getDavidhenneyfuneralhomeProjectData() throws Exception {
		log.debug("started ----DavidhenneyfuneralhomeProject");

		this.davidhenneyfuneralhomeProject.saveData();
	}

	@PostMapping(value = "/thomasjgmiterfhProject")
	public void getThomasjgmiterfhProjectData() throws Exception {
		log.debug("started ----thomasjgmiterfhProject");

		this.thomasjgmiterfhProject.saveData();
	}

	@PostMapping(value = "/kingfuneralhomeProject")
	public void getkingfuneralhomeProjectData() throws Exception {
		log.debug("started ----kingfuneralhomeProject");

		this.kingfuneralhomeProject.saveData();
	}

	@PostMapping(value = "/robertpkarishfhProject")
	public void getRobertpkarishfhProjectData() throws Exception {
		log.debug("started ----RobertpkarishfhProject");

		this.robertpkarishfhProject.saveData();
	}

	@PostMapping(value = "/AripepiandsonsProject")
	public void getAripepiandsonsData() throws Exception {

		log.info("AripepiandsonsProject started ----");

		this.aripepiandsonsProject.saveData();
	}

	@PostMapping(value = "/abbeyfuneralhome")
	public void getabbeyfuneralhome() throws Exception {
		log.debug("started for abbeyfuneralhome");

		abbeyfcFuneralHome.saveData();

	}

	@PostMapping(value = "/altmeyerfuneraland")
	public void getaltmeyerfuneralandcremation() throws Exception {
		log.debug("started for altmeyerfuneraland");

		altmeyerfuneralandcremation.saveData();
	}

	@PostMapping(value = "/getasturner")
	public void getasturner() throws Exception {
		log.debug("started getasturner----");
		asturner.saveData();
		asturnerfuneralandcremation.saveData();

	}

	@PostMapping(value = "/getauroramccarthyfuneralhome")
	public void getauroramccarthyfuneralhome() throws Exception {
		log.debug("started auroramccarthyfuneralhome----");
		auroramccarthyfuneralhome.saveData();

	}

	@PostMapping(value = "/getasacredmomentfuneralhome")
	public void getasacredmomentfuneralhome() throws Exception {
		log.debug("started asacredmomentfuneralhome----");
		asacredmomentfuneralhome.saveData();
	}

	@PostMapping(value = "/getessexfuneralhome")
	public void getessexfuneralhome() throws Exception {
		log.debug("started essexfuneralhome----");
		essexfuneralhome.saveData();

	}

	@PostMapping(value = "/getdavisfhofalabama")
	public void getdavisfhofalabama() throws Exception {
		log.debug("started davisfhofalabama----");
		davisfhofalabam.saveData();
	}

	@PostMapping(value = "/boonefuneralhomeProject")
	public void getboonefuneralhomeProject() throws Exception {
		log.debug("started boonefuneralhomeProject----");
		boonefuneralhomeProject.saveData();
	}

	@PostMapping(value = "/getacremationservice")
	public void getacremationservice() throws Exception {
		log.debug("started getacremationservice----");
		floridaProjectsMain.saveData(FloridaProjectsConstants.ACREMATION_SERVICE);
	}

	@PostMapping(value = "/getalifetribute")
	public void getalifetribute() throws Exception {
		log.debug("started getalifetribute----");
		floridaProjectsMain.saveData(FloridaProjectsConstants.A_LIFE_TRIBUTE);
	}

	@PostMapping(value = "/ellisfhProject")
	public void getEllisfhProject() throws Exception {
		log.debug("started EllisfhProject----");
		ellisfhProject.saveData();

	}

	@PostMapping(value = "/arabheritagememorialchapel")
	public void getArabheritagememorialchapel() throws Exception {
		log.debug("started ArabheritagememorialchapelProject----");
		arabheritagememorialchapel.saveData();

	}

	@PostMapping(value = "/getevanscarterfh")
	public void getevanscarterfh() throws Exception {
		log.debug("started getevanscarterfh----");
		floridaProjectsMain.saveData(FloridaProjectsConstants.EVAN_SCARTER_FH);
	}

	@PostMapping(value = "/getabundantfavour")
	public void getabundantfavour() throws Exception {
		log.debug("started getabundantfavour----");
		floridaProjectsMain.saveData(FloridaProjectsConstants.ABUNDANT_FAVOUR1);
	}

	@PostMapping(value = "/getnationalcremation")
	public void getnationalcreamtion() throws Exception {
		log.debug("started getnationalcremation----");
		floridaProjectsMain.saveData(FloridaProjectsConstants.NATIONAL_CREMATION);
	}

	@PostMapping(value = "/getanthonychapels")
	public void getanthonychapels() throws Exception {
		log.debug("started getanthonychapels----");
		anthonychapels.saveData();
		anthonychapelsOhio.saveData();
		anthonychapelsOK.saveData();
	}

	@PostMapping(value = "/getrwbakerfh")
	public void getrwbakerfh() throws Exception {
		log.debug("started getrwbakerfh----");
		rwbakerfh.saveData();
	}

	@PostMapping(value = "/getTaborfuneralhome")
	public void getTaborfuneralhome() throws Exception {
		log.debug("getTaborfuneralhome----");
		taborfuneralhome.saveData();
	}

	@PostMapping(value = "/getkearnsfuneralService")
	public void getkearnsfuneralService() throws Exception {
		log.debug("started getkearnsfuneralService----");
		kearnsFuneralService.saveData();
	}

	@PostMapping(value = "/getaccentfuneral")
	public void getaccentfuneral() throws Exception {
		log.debug("started getaccentfuneral----");
		accentFuneral.saveData();

	}

	@PostMapping(value = "/getaasumdufour")
	public void getaasumdufour() throws Exception {
		log.debug("started getaasumdufour----");
		aasumdufour.saveData();

	}

	@PostMapping(value = "/getcapaulfuneralhome")
	public void getcapaulfuneralhome() throws Exception {
		log.debug("started getcapaulfuneralhome----");
		capaulFuneralhome.saveData();

	}

	@PostMapping(value = "/getaffordablecreamationabq")
	public void getaffordablecreamationabq() throws Exception {
		log.debug("started getaffordablecreamationabq----");
		affordablecreamationabq.saveData();

	}

	@PostMapping(value = "/getandersfhProject")
	public void getandersfhProject() throws Exception {
		log.debug("started getandersfhProject----");
		andersfhProject.saveData();
	}

	@PostMapping(value = "/getahpeters")
	public void getahpeters() throws Exception {
		log.debug("started getahpeters----");
		ahPeters.saveData();

	}

	@PostMapping(value = "/getarchwaychapel")
	public void getarchwaychapel() throws Exception {
		log.debug("started getarchwaychapel----");
		archwaychapel.saveData();
	}

	@PostMapping(value = "/getalliancefuneralhome")
	public void getalliancefuneralhome() throws Exception {
		log.debug("started getalliancefuneralhome----");
		alliancefuneralhome.saveData();

	}

	@PostMapping(value = "/getascensionfuneral")
	public void getascensionfuneral() throws Exception {
		log.debug("started getascensionfuneral----");
		ascensionfuneral.saveData();
	}

	@PostMapping(value = "/getandersfh")
	public void getandersfh() throws Exception {
		log.debug("started getandersfh----");
		andersfh.saveData();

	}

	@PostMapping(value = "/getalfreddthomas")
	public void getalfreddthomas() throws Exception {
		log.debug("started getalfreddthomas----");
		alfreddthomas.saveData();

	}

	@PostMapping(value = "/getowensfuneralhomes")
	public void getowensfuneralhomes() throws Exception {
		log.debug("started getowensfuneralhomes----");
		illinoisProjectsMain.saveData(IllinoisProjectsConstants.OWENS_FUNERAL_HOMES);
	}

	@PostMapping(value = "/getkahlemoore")
	public void getkahlemoore() throws Exception {
		log.debug("started getkahlemoore----");
		illinoisProjectsMain.saveData(IllinoisProjectsConstants.KAHLE_MOORE);
	}

	@PostMapping(value = "/getberubecomeau")
	public void getberubecomeau() throws Exception {
		log.debug("started getberubecomeau----");
		berubecomeau.saveData();
	}

	@PostMapping(value = "/getbismarckfuneralhome")
	public void getbismarckfuneralhome() throws Exception {
		log.debug("started getbismarckfuneralhome----");
		bismarckfuneralhome.saveData();
	}

	@PostMapping(value = "/getumifunerals")
	public void getumifunerals() throws Exception {
		log.debug("started getumifunerals----");
		umiFunerals.saveData();

	}

	@PostMapping(value = "/getambruso")
	public void getambruso() throws Exception {
		log.debug("started getambruso----");
		ambruso.saveData();
	}

	@PostMapping(value = "/getkozlakradulovich")
	public void getkozlakradulovich() throws Exception {
		log.debug("started getkozlakradulovich----");
		kozlakradulovichMain.saveData();
	}

	@PostMapping(value = "/getbachyager")
	public void getbachyager() throws Exception {
		log.debug("started getbachyager----");
		bachyagerMain.saveData();
	}

	@PostMapping(value = "/getashepherdscarefuneral")
	public void getashepherdscarefuneral() throws Exception {
		log.debug("started getbachyager----");
		ashepherdscarefuneral.saveData();
	}

	@PostMapping(value = "/getsansonefuneralhome")
	public void getsansonefuneralhome() throws Exception {
		log.debug("started getsansonefuneralhome----");
		sansonefuneralhome.saveData();
	}

	@PostMapping(value = "/getandersonandsonsfh")
	public void getandersonandsonsfh() throws Exception {
		log.debug("started getandersonandsonsfh----");
		andersonandsonsfh.saveData();
	}

	@PostMapping(value = "/getfoothillsfh")
	public void getfoothillsfh() throws Exception {
		log.debug("started getfoothillsfh----");
		foothillsfh.saveData();
	}

	@PostMapping(value = "/getSouthCarolinaData")
	public void getSouthCarolinaData() throws Exception {
		log.debug("started getSouthCarolinaData----");

		blizzardfuneralhome.saveData();
		articobits.saveData();
	}

	@PostMapping(value = "/getmcclurefuneralservice")
	public void getmcclurefuneralservice() throws Exception {
		log.debug("started getmcclurefuneralservice----");
		northCarolinaProjectsMain.saveData(NorthCarolinaProjectsConstants.MCCLURE_FUNERAL_SERVICE);
	}

	@PostMapping(value = "/getdavidsonfuneralhome")
	public void getdavidsonfuneralhome() throws Exception {
		log.debug("started getdavidsonfuneralhome----");
		northCarolinaProjectsMain.saveData(NorthCarolinaProjectsConstants.DAVIDSON_FUNERAL_HOME);
	}

	@PostMapping(value = "/getjacksonfuneralservice")
	public void getjacksonfuneralservice() throws Exception {
		log.debug("started getjacksonfuneralservice----");
		northCarolinaProjectsMain.saveData(NorthCarolinaProjectsConstants.JACKSON_FUNERAL_SERVICE);
	}

	@PostMapping(value = "/getloflinfuneralservice")
	public void getloflinfuneralservice() throws Exception {
		log.debug("started getloflinfuneralservice----");
		northCarolinaProjectsMain.saveData(NorthCarolinaProjectsConstants.LO_FLIN_FUNERAL_SERVICE);

	}

	@PostMapping(value = "/getPoulsonvanhise")
	public void getpoulsonvanhise() throws Exception {
		log.debug("started getpoulsonvanhise----");

		poulsonvanhise.saveData();

	}

	@PostMapping(value = "/getOceancountycremation")
	public void getoceancountycremation() throws Exception {

		oceancountycremationservice.saveData();
	}

	@PostMapping(value = "/getBoucherfuneral")
	public void getboucherfuneralhome() throws Exception {
		log.debug("started getboucherfuneralhome----");
		boucherfuneralhome.saveData();

	}

	@PostMapping(value = "/getAdamsperfect")
	public void getadamsperfect() throws Exception {
		log.debug("started getNewJerseyData----");

		adamsperfect.saveData();

	}

	@PostMapping(value = "/getajcunninghamfh")
	public void getajcunninghamfh() throws Exception {
		log.debug("started getajcunninghamfh----");
		newYorkProjectsMain.saveData(NewYorkProjectsConstants.AJ_CUNNING_HAM_FH);
	}

	@PostMapping(value = "/getlibbyfuneralhome")
	public void getlibbyfuneralhome() throws Exception {
		log.debug("started getlibbyfuneralhome----");
		newYorkProjectsMain.saveData(NewYorkProjectsConstants.LIBBY_FUNERAL_HOME);
	}

	@PostMapping(value = "/getwolaninfuneralhome")
	public void getwolaninfuneralhome() throws Exception {
		log.debug("started getwolaninfuneralhome----");
		newYorkProjectsMain.saveData(NewYorkProjectsConstants.WO_LAN_IN_FUNERAL_HOME);
	}

	@PostMapping(value = "/getColemanfuneralhome")
	public void getColemanfuneralhome() throws Exception {
		log.debug("started getColemanfuneralhomeservice----");
		colemanfuneralhome.saveData();

	}

	@PostMapping(value = "/getDeeganfuneralchapels")
	public void getDeeganfuneralchapels() throws Exception {
		log.debug("started getColemanfuneralhomeservice----");
		deeganfuneralchapels.saveData();

	}

	@PostMapping(value = "/getAutumnfuneral")
	public void getDeeganAutumnfuneral() throws Exception {
		log.debug("started getColemanfuneralhomeservice----");
		autumnfuneral.saveData();

	}

	@PostMapping(value = "/getlsvpmemorialhome")
	public void getlsvpmemorialhome() throws Exception {
		log.debug("started getlsvpmemorialhome----");
		newYorkProjectsMain.saveData(NewYorkProjectsConstants.LS_VP_MEMORIAL_HOME);
	}

	@PostMapping(value = "/getrossiditorofuneralhome")
	public void getrossiditorofuneralhome() throws Exception {
		log.debug("started getrossiditorofuneralhome----");
		newYorkProjectsMain.saveData(NewYorkProjectsConstants.ROSSIDITORO_FUNERAL_HOME);
	}

	@PostMapping(value = "/getmcnarymoorefuneralservice")
	public void getmcnarymoorefuneralservice() throws Exception {
		log.debug("started getmcnarymoorefuneralservice----");
		californiaProjectsMain.saveData(CaliforniaProjectsConstants.MC_NARY_MOORE_FUNERAL_SERVICE);
	}

	@PostMapping(value = "/getserenityfuneralfresno")
	public void getserenityfuneralfresno() throws Exception {
		log.debug("started getserenityfuneralfresno----");
		californiaProjectsMain.saveData(CaliforniaProjectsConstants.SERENITY_FUNERAL_FRESNO);
	}

	@PostMapping(value = "/getOhioFuneralHomeData")

	public void getOhioFuneralHomeData() throws Exception {
		log.debug("started getOhioFuneralHomeData----");
		chilesLamanfh.saveData();
		neeldfuneralhome.saveData();
		lanefuneralhomes.saveData();
		swigarteasterlingfuneralhome.saveData();
	}

	@PostMapping(value = "/getSunsetmemorialData")
	public void getSunsetmemorialData() throws Exception {
		log.debug("started getSunsetmemorialData----");
		sunsetmemorialPeoject.saveData();

	}

	@PostMapping(value = "/getbassettfuneralservice")
	public void getbassettfuneralserviceData() throws Exception {
		log.debug("started getbassettfuneralservice----");
		bassettfuneralservices.saveData();

	}

	@PostMapping(value = "/getaaronsmortuary")
	public void getaaronsmortuaryData() throws Exception {
		log.debug("started getaaronsmortuary----");
		aaronsmortuaryProject.saveData();
		log.info("Completed");

	}

	@PostMapping(value = "/getHalefuneralhomes")
	public void getHalefuneralhomesData() throws Exception {
		log.debug("started getHalefuneralhomes----");
		halefuneralhomes.saveData();
	}

	@PostMapping(value = "/getGarvinandgarvinfuneralhome")
	public void getGarvinandgarvinfuneralhome() throws Exception {
		log.debug("started getGarvinandgarvinfuneralhome----");
		garvinandgarvinfuneralhome.saveData();

	}

	@PostMapping(value = "/getGraumlichfuneralhome")
	public void getGraumlichfuneralhome() throws Exception {
		log.debug("started getGraumlichfuneralhome----");
		graumlichfuneralhome.saveData();

	}

	@PostMapping(value = "/getBunchroberts")
	public void getBunchroberts() throws Exception {
		log.debug("started getBunchroberts----");
		bunchroberts.saveData();

	}

	@PostMapping(value = "/getChambersandjames")
	public void getChambersandjames() throws Exception {
		log.debug("started getChambersandjames----");
		chambersandjames.saveData();

	}

	@PostMapping(value = "/getCowherdandparrott")
	public void getCowherdandparrott() throws Exception {
		log.debug("started getCowherdandparrott----");
		cowherdandparrott.saveData();

	}

	@PostMapping(value = "/getMemorialdesigners")
	public void getMemorialdesigners() throws Exception {
		log.debug("started getMemorialdesigners----");
		memorialdesigners.saveData();

	}

	@PostMapping(value = "/getMusicFuneralHome")
	public void getMusicFuneralHome() throws Exception {
		log.debug("started getMusicFuneralHome----");
		musicfuneralhome.saveData();

	}

	@PostMapping(value = "/getFlammfh")
	public void getFlammfh() throws Exception {
		log.debug("started getFlammfh----");
		flammfh.saveData();

	}

	@PostMapping(value = "/getPressleysfuneralhome")
	public void ggetPressleysfuneralhome() throws Exception {
		log.debug("started getPressleysfuneralhome----");
		pressleysfuneralhome.saveData();

	}

	@PostMapping(value = "/getClaryGlenn")
	public void getClaryGlenn() throws Exception {
		log.debug("started getClaryGlenn----");
		claryglenn.saveData();

	}

	@PostMapping(value = "/getRawlsfuneralhomes")
	public void getRawlsfuneralhomes() throws Exception {
		log.debug("started getRawlsfuneralhomes----");
		rawlsfuneralhomes.saveData();

	}

	@PostMapping(value = "/gettisdalelannmemorial")
	public void getTisdalelannmemorial() throws Exception {
		log.debug("started Tisdalelannmemorial----");
		tisdalelannmemorialProject.saveData();

	}

	@PostMapping(value = "/getStephensfuneralhome")
	public void getStephensfuneralhome() throws Exception {
		log.debug("started Stephensfuneralhome----");
		stephensfuneralhome.saveData();
	}

	@PostMapping(value = "/craigfhProject")
	public void getCraigfhProject() throws Exception {
		log.info("started ---- craigfhProject");

		craigfh.saveData();
		log.info("completed ---- craigfhProject");

	}

	@PostMapping(value = "/getDeringHenson")
	public void getDeringHenson() throws Exception {
		log.info("started getDeringHenson----");
		deringhenson.saveData();
		log.info("Completed getDeringHenson");
	}

	@PostMapping(value = "/getEleyfuneralhomes")
	public void getEleyfuneralhomes() throws Exception {
		log.info("started getEleyfuneralhomes----");
		eleyfuneralhomes.saveData();
		log.info("Completed getEleyfuneralhomes");
	}

	@PostMapping(value = "/rtfuneralsProject")
	public void getRtfuneralsProject() throws Exception {
		log.info("started ---- rtfuneralsProject");

		rtfunerals.saveData();
		log.info("completed ---- rtfuneralsProject");

	}

	@PostMapping(value = "/getAsasmithProject")
	public void getAsasmithProject() throws Exception {
		log.info("started ---- getAsasmithProject");

		asasmithProject.saveData();
		log.info("completed ---- getAsasmithProject");

	}

	@PostMapping(value = "/getAlbrightfuneralhomeinc")
	public void getAlbrightfuneralhomeinc() throws Exception {
		log.info("started ---- getAlbrightfuneralhomeincProject");

		albrightfuneralhomeinc.saveData();
		log.info("completed ---- getAlbrightfuneralhomeincProject");

	}

	@PostMapping(value = "/getBixbyfuneralserviceProject")
	public void getBixbyfuneralserviceProject() throws Exception {
		log.info("started ---- getBixbyfuneralserviceProject");

		bixbyfuneralservice.saveData();
		log.info("completed ---- getBixbyfuneralserviceProject");

	}

	@PostMapping(value = "/getBarkesweaverglickProject")
	public void getBarkesweaverglickProject() throws Exception {
		log.info("started ---- getBarkesweaverglickProject");

		barkesweaverglick.saveData();
		log.info("completed ---- getBarkesweaverglickProject");

	}

	@PostMapping(value = "/gethaverstockfuneralhome")
	public void gethaverstockfuneralhome() throws Exception {
		log.info("started ---- gethaverstockfuneralhome");

		haverstockfuneralhome.saveData();
		log.info("completed ---- gethaverstockfuneralhome");
	}

	@PostMapping(value = "/getHinseyBrown")
	public void getHinseyBrownProject() throws Exception {
		log.info("started ---- getHinseyBrownProject");

		hinseyBrownService.saveData();
		log.info("completed ---- getHinseyBrownProject");

	}

	@PostMapping(value = "/getGeorgemasonfuneralhome")
	public void getGeorgemasonfuneralhome() throws Exception {
		log.info("started ---- getGeorgemasonfuneralhome");

		georgemasonfuneralhome.saveData();
		log.info("completed ---- getGeorgemasonfuneralhome");

	}

	@PostMapping(value = "/getGubbiottifh")
	public void getGubbiottifh() throws Exception {
		log.info("started ---- getGubbiottifh");

		gubbiottifh.saveData();
		log.info("completed ---- getGubbiottifh");

	}

	@PostMapping(value = "/getEverettfuneral")
	public void getEverettfuneral() throws Exception {
		log.info("started ---- getEverettfuneral");

		everettfuneral.saveData();
		log.info("completed ---- getEverettfuneral");

	}

	@PostMapping(value = "/getDeanmemorialfuneralhome")
	public void getDeanmemorialfuneralhome() throws Exception {
		log.info("started ---- getDeanmemorialfuneralhome");

		deanmemorialfuneralhome.saveData();
		log.info("completed ---- getDeanmemorialfuneralhome");

	}

	@PostMapping(value = "/getForbesfuneralhome")
	public void getForbesfuneralhome() throws Exception {
		log.info("started ---- getForbesfuneralhome");

		forbesfuneralhome.saveData();
		log.info("completed ---- getForbesfuneralhome");

	}

	@PostMapping(value = "/getBlackburnchapel")
	public void getBlackburnchapel() throws Exception {
		log.info("started ---- getBlackburnchapel");

		blackburnchapel.saveData();
		log.info("completed ---- getBlackburnchapel");

	}

	@PostMapping(value = "/getBoyntonmemorial")
	public void getBoyntonmemorial() throws Exception {
		log.info("started ---- getBoyntonmemorial");

		boyntonmemorial.saveData();
		log.info("completed ---- getBoyntonmemorial");

	}

	@PostMapping(value = "/getBrownfuneraldirectors")
	public void getBrownfuneraldirectors() throws Exception {
		log.info("started ---- getBrownfuneraldirectors");

		brownfuneraldirectors.saveData();
		log.info("completed ---- getBrownfuneraldirectors");

	}

	@PostMapping(value = "/getDudleymemorial")
	public void getDudleymemorial() throws Exception {
		log.info("started ---- getDudleymemorial");

		dudleymemorial.saveData();
		log.info("completed ---- getDudleymemorial");

	}

	@PostMapping(value = "/getCarmanfuneral")
	public void getCarmanfuneral() throws Exception {
		log.info("started ---- getCarmanfuneral");

		carmanfuneral.saveData();
		log.info("completed ---- getCarmanfuneral");

	}

	@PostMapping(value = "/getColonialfunerals")
	public void getColonialfunerals() throws Exception {
		log.info("started ---- getColonialfunerals");

		colonialfunerals.saveData();
		log.info("completed ---- getColonialfunerals");

	}

	@PostMapping(value = "/getLarkinandscott")
	public void getLarkinandscott() throws Exception {
		log.info("started ---- getLarkinandscott");

		larkinandscott.saveData();
		log.info("completed ---- getLarkinandscott");

	}

	@PostMapping(value = "/getLomaxfuneralhome")
	public void getLomaxfuneralhome() throws Exception {
		log.info("started ---- getLomaxfuneralhome");

		lomaxfuneralhome.saveData();
		log.info("completed ---- getLomaxfuneralhome");

	}

	@PostMapping(value = "/getManchesterfh")
	public void getManchesterfh() throws Exception {
		log.info("started ---- getManchesterfh");

		manchesterfh.saveData();
		log.info("completed ---- getManchesterfh");

	}

	@PostMapping(value = "/getMckinneydargy")
	public void getMckinneydargy() throws Exception {
		log.info("started ---- getMckinneydargy");

		mckinneydargy.saveData();
		log.info("completed ---- getMckinneydargy");

	}

	@PostMapping(value = "/getPantalone")
	public void getPantalone() throws Exception {
		log.info("started ---- getPantalone");

		pantalone.saveData();
		log.info("completed ---- getPantalone");

	}

	@PostMapping(value = "/getPortlandjewishfuneralhome")
	public void getPortlandjewishfuneralhome() throws Exception {
		log.info("started ---- getPortlandjewishfuneralhome");

		portlandjewishfuneralhome.saveData();
		log.info("completed ---- getPortlandjewishfuneralhome");

	}

	@PostMapping(value = "/getRedmondfuneralhomeinc")
	public void getRedmondfuneralhomeinc() throws Exception {
		log.info("started ---- getRedmondfuneralhomeinc");

		redmondfuneralhomeinc.saveData();
		log.info("completed ---- getRedmondfuneralhomeinc");

	}

	@PostMapping(value = "/getSellersfuneralhome")
	public void getSellersfuneralhome() throws Exception {
		log.info("started ---- getSellersfuneralhome");

		sellersfuneralhome.saveData();
		log.info("completed ---- getSellersfuneralhome");

	}

	@PostMapping(value = "/getCentralpaprofessionalservices")
	public void getCentralpaprofessionalservices() throws Exception {
		log.info("started ---- getCentralpaprofessionalservices");

		centralpaprofessionalservices.saveData();
		log.info("completed ---- getCentralpaprofessionalservices");

	}

	@PostMapping(value = "/getStendebackfamilyfuneralhome")
	public void getStendebackfamilyfuneralhome() throws Exception {
		log.info("started ---- getStendebackfamilyfuneralhome");

		stendebackfamilyfuneralhome.saveData();
		log.info("completed ---- getStendebackfamilyfuneralhome");

	}

	@PostMapping(value = "/getTulocaycemetery")
	public void getTulocaycemetery() throws Exception {
		log.info("started ---- getTulocaycemetery");

		tulocaycemetery.saveData();
		log.info("completed ---- getTulocaycemetery");

	}

	@PostMapping(value = "/getBibbveach")
	public void getBibbveach() throws Exception {
		log.info("started ---- getBibbveach");

		bibbveach.saveData();
		log.info("completed ---- getBibbveach");

	}

	@PostMapping(value = "/getKleinfh")
	public void getKleinfh() throws Exception {
		log.info("started ---- getKleinfh");

		kleinfh.saveData();
		log.info("completed ---- getKleinfh");

	}

	@PostMapping(value = "/getWaskoms")
	public void getWaskoms() throws Exception {
		log.info("started ---- getWaskoms");

		waskoms.saveData();
		log.info("completed ---- getWaskoms");
	}

	@PostMapping(value = "/getMerlinfuneralhome")
	public void getMerlinfuneralhome() throws Exception {
		log.info("started ---- getMerlinfuneralhome");

		merlinfuneralhome.saveData();
		log.info("completed ---- getMerlinfuneralhome");
	}

	@PostMapping(value = "/getObaughfuneralhome")
	public void getObaughfuneralhome() throws Exception {
		log.info("started ---- getObaughfuneralhome");

		obaughfuneralhome.saveData();
		log.info("completed ---- getObaughfuneralhome");
	}

	@PostMapping(value = "/getAllfaiths866")
	public void getAllfaiths866() throws Exception {
		log.info("started ---- getAllfaiths866");

		allfaiths866.saveData();
		log.info("completed ---- getAllfaiths866");
	}

	@PostMapping(value = "/getWhitecolumnsfuneralservice")
	public void getWhitecolumnsfuneralservice() throws Exception {
		log.info("started ---- getWhitecolumnsfuneralservice");

		whitecolumnsfuneralservice.saveData();
		log.info("completed ---- getWhitecolumnsfuneralservice");
	}

	@PostMapping(value = "/getWarefh")
	public void getWarefh() throws Exception {
		log.info("started ---- getWarefh");

		warefh.saveData();
		log.info("completed ---- getWarefh");
	}

	@PostMapping(value = "/getWilcoxffh")
	public void getWilcoxffh() throws Exception {
		log.info("started ---- getWilcoxffh");

		wilcoxffh.saveData();
		log.info("completed ---- getWilcoxffh");
	}

	@PostMapping(value = "/getWorthingtonfuneralhome")
	public void getWorthingtonfuneralhome() throws Exception {
		log.info("started ---- getWorthingtonfuneralhome");

		worthingtonfuneralhome.saveData();
		log.info("completed ---- getWorthingtonfuneralhome");
	}

	@PostMapping(value = "/getBradleyfhmarlton")
	public void getBradleyfhmarlton() throws Exception {
		log.info("started ---- getBradleyfhmarlton");

		bradleyfhmarlton.saveData();
		log.info("completed ---- getBradleyfhmarlton");

	}

	@PostMapping(value = "/getWhitakerfh")
	public void getWhitakerfh() throws Exception {
		log.info("started ---- getWhitakerfh");

		whitakerfh.saveData();
		log.info("completed ---- getWhitakerfh");

	}

	@PostMapping(value = "/getRogersofmccoll")
	public void getRogersofmccoll() throws Exception {
		log.info("started ---- getRogersofmccoll");

		rogersofmccoll.saveData();
		log.info("completed ---- getRogersofmccoll");

	}

	@PostMapping(value = "/getStorkefuneralhome")
	public void getStorkefuneralhome() throws Exception {
		log.info("started ---- getStorkefuneralhome");

		storkefuneralhome.saveData();
		log.info("completed ---- getStorkefuneralhome");
	}

	@PostMapping(value = "/getSerenityfuneralfresno")
	public void getSerenityfuneralfresno() throws Exception {
		log.info("starte ---- getSerenityfuneralfresno");

		serenityfuneralfresno.saveData();
		log.info("completed ---- getSerenityfuneralfresno");
	}

	@PostMapping(value = "/getBryersfh")
	public void getBryersfh() throws Exception {
		log.info("starte ---- getBryersfh");

		bryersfh.saveData();
		log.info("completed ---- getBryersfh");
	}

	@PostMapping(value = "/getBauerfh")
	public void getBauerfh() throws Exception {
		log.info("starte ---- getBauerfh");

		bauerfh.saveData();
		log.info("completed ---- getBauerfh");
	}

	@PostMapping(value = "/getBoardmansmith")
	public void getboardmansmith() throws Exception {
		log.info("starte ---- getBoardmansmith");

		boardmansmith.saveData();
		log.info("completed ---- getBoardmansmith");
	}

	@PostMapping(value = "/getBethanymemorialchapel")
	public void getbethanymemorialchapel() throws Exception {
		log.info("starte ----getBethanymemorialchapel");

		bethanymemorialchapel.saveData();
		log.info("completed ---- getBethanymemorialchapel");
	}

	@PostMapping(value = "/getsunsetmemorial")
	public void getsunsetmemorial() throws Exception {
		log.info("starte ----getsunsetmemorial");

		sunsetmemorial.saveData();
		log.info("completed ---- getsunsetmemorial");

	}

	@PostMapping(value = "/getBakerpostfh")
	public void getbakerpostfh() throws Exception {
		log.info("starte ----getbakerpostfh");

		bakerpostfh.saveData();
		log.info("completed ---- getbakerpostfh");
	}

	@PostMapping(value = "/getTisdalelannmemorialfh")
	public void getTisdalelannmemorialfh() throws Exception {
		log.info("starte ----getTisdalelannmemorialfh");

		tisdalelannmemorialfh.saveData();
		log.info("completed ---- getTisdalelannmemorialfh");
	}

	@PostMapping(value = "/getFausettfh")
	public void getFausettfh() throws Exception {
		log.info("starte ----getFausettfh");

		fausettfh.saveData();
		log.info("completed ---- getFausettfh");
	}

	@PostMapping(value = "/getGeraldinefuneralhome")
	public void getGeraldinefuneralhome() throws Exception {
		log.info("starte ----getGeraldinefuneralhome");

		geraldinefuneralhome.saveData();
		log.info("completed ---- getGeraldinefuneralhome");
	}

	@PostMapping(value = "/getChristianwayfh")
	public void getChristianwayfh() throws Exception {
		log.info("starte ----getChristianwayfh");

		christianwayfh.saveData();
		log.info("completed ---- getChristianwayfh");
	}

	@PostMapping(value = "/getBurnsidefuneralhome")
	public void getBurnsidefuneralhome() throws Exception {
		log.info("starte ----getBurnsidefuneralhome");

		burnsidefuneralhome.saveData();
		log.info("completed ---- getBurnsidefuneralhome");
	}

	@PostMapping(value = "/getJournetandboldenfuneralhome")
	public void getJournetandboldenfuneralhome() throws Exception {
		log.info("starte ----getJournetandboldenfuneralhome");

		journetandboldenfuneralhome.saveData();
		log.info("completed ---- getJournetandboldenfuneralhome");
	}

	@PostMapping(value = "/getBowserfh")
	public void getBowserfh() throws Exception {
		log.info("starte ----getBowserfh");

		bowserfh.saveData();
		log.info("completed ---- getBowserfh");
	}

	// new
	@PostMapping(value = "/getSchwenkebaumgarten")
	public void getSchwenkebaumgarten() throws Exception {
		log.info("starte ----getSchwenkebaumgarten");

		schwenkebaumgarten.saveData();
		log.info("completed ---- getSchwenkebaumgarten");

	}

	// new
	@PostMapping(value = "/getSquaredealfuneralhome")
	public void getSquaredealfuneralhome() throws Exception {
		log.info("starte ----getSquaredealfuneralhome");

		squaredealfuneralhome.saveData();
		log.info("completed ---- getSquaredealfuneralhome");
	}

	// new
	@PostMapping(value = "/getRiewertsmemorialhome")
	public void getRiewertsmemorialhome() throws Exception {
		log.info("starte ----getRiewertsmemorialhome");

		riewertsmemorialhome.saveData();
		log.info("completed ---- getRiewertsmemorialhome");

	}

	// new
	@PostMapping(value = "/getSunsetmc")
	public void getSunsetmc() throws Exception {
		log.info("starte ----getSunsetmc");

		sunsetmc.saveData();
		log.info("completed ---- getSunsetmc");

	}

	// new
	@PostMapping(value = "/getWmsfuneralhome")
	public void getWmsfuneralhome() throws Exception {
		log.info("starte ----getWmsfuneralhome");

		wmsfuneralhome.saveData();
		log.info("completed ---- getWmsfuneralhome");

	}

	// new
	@PostMapping(value = "/getDignitymemorialThird")
	public void getDignitymemorialThird() throws Exception {
		log.info("starte ----getDignitymemorialThird ");

		dignitymemorialThird.saveData();
		log.info("completed ---- getDignitymemorialThird ");

	}

	// NEW
	@PostMapping(value = "/getDignitymemorial")
	public void getDignitymemorial() throws Exception {
		log.info("starte ----getDignitymemorial");

		dignitymemorial.saveData();
		log.info("starte ----getDignitymemorial");

	}

	// new
	@PostMapping(value = "/getJohnsonmoorefuneralhome")
	public void getjohnsonmoorefuneralhome() throws Exception {
		log.info("starte ----Johnsonmoorefuneralhome");

		johnsonmoorefuneralhome.saveData();
		log.info("starte ----Johnsonmoorefuneralhome");
	}

	// new
	@PostMapping(value = "/getJosephngarlickfuneralhome")
	public void getjosephngarlickfuneralhome() throws Exception {
		log.info("starte ----josephngarlickfuneralhome");

		josephngarlickfuneralhome.saveData();
		log.info("starte ----josephngarlickfuneralhome");

	}

	// new
	@PostMapping(value = "/getKoupfunerals")
	public void getkoupfunerals() throws Exception {
		log.info("starte ----Koupfunerals");

		koupfunerals.saveData();
		log.info("starte ----Koupfunerals");

	}

	// new
	@PostMapping(value = "/getLamortuary")
	public void getlamortuary() throws Exception {
		log.info("starte ----Lamortuary");

		lamortuary.saveData();
		log.info("starte ---Lamortuary");

	}

	// new
	@PostMapping(value = "/getLewisfuneralhome")
	public void getlewisfuneralhome() throws Exception {
		log.info("starte ----Lewisfuneralhome");

		lewisfuneralhome.saveData();
		log.info("starte ----Lewisfuneralhome");
	}

	// new
	@PostMapping(value = "/getKellerfuneralhome")
	public void getkellerfuneralhome() throws Exception {
		log.info("starte ----Kellerfuneralhome");

		kellerfuneralhome.saveData();
		log.info("starte ----Kellerfuneralhome");
	}

	// new
	@PostMapping(value = "/getMathisfuneralhome")
	public void getmathisfuneralhome() throws Exception {
		log.info("starte ----Mathisfuneralhome");

		mathisfuneralhome.saveData();
		log.info("starte ---Mathisfuneralhome");

	}

	// new
	@PostMapping(value = "/getPeoplesofwhiteville")
	public void getPeoplesofwhiteville() throws Exception {
		log.info("starte ----Peoplesofwhiteville");

		peoplesofwhiteville.saveData();
		log.info("starte ---Peoplesofwhiteville");

	}

	// new
	@PostMapping(value = "/getMoapavalleymortuary")
	public void getMoapavalleymortuary() throws Exception {
		log.info("starte ----Moapavalleymortuary");

		moapavalleymortuary.saveData();
		log.info("starte ---Moapavalleymortuary");

	}// new

	@PostMapping(value = "/getOtthaverstock")
	public void getOtthaverstock() throws Exception {
		log.info("starte ----Otthaverstock");

		otthaverstock.saveData();
		log.info("starte ---Otthaverstock");

	}
	// new

	@PostMapping(value = "/getPorterfuneralhomes")
	public void getPorterfuneralhomes() throws Exception {
		log.info("starte ----Porterfuneralhomes");

		porterfuneralhomes.saveData();
		log.info("starte ---Porterfuneralhomes");

	}
	// new

	@PostMapping(value = "/getIntegrityfuneral")
	public void getIntegrityfuneral() throws Exception {
		log.info("starte ----Integrityfuneral");

		integrityfuneral.saveData();
		log.info("starte ---Integrityfuneral");

	}
	// new

	@PostMapping(value = "/getHayesfuneralhome")
	public void getHayesfuneralhome() throws Exception {
		log.info("starte ----Hayesfuneralhome");

		hayesfuneralhome.saveData();
		log.info("starte ---Hayesfuneralhome");

	}
	// new

	@PostMapping(value = "/getHopevalleyfuneralservice")
	public void getHopevalleyfuneralservice() throws Exception {
		log.info("starte ----Hopevalleyfuneralservice");

		hopevalleyfuneralservice.saveData();
		log.info("starte ---Hopevalleyfuneralservice");

	}
	// new

	@PostMapping(value = "/getHargettfuneralserviceinc")
	public void getHargettfuneralserviceinc() throws Exception {
		log.info("starte ----Hargettfuneralserviceinc");

		hargettfuneralserviceinc.saveData();
		log.info("starte ---Hargettfuneralserviceinc");

	}
	// new

	@PostMapping(value = "/getJandwfh")
	public void getJandwfh() throws Exception {
		log.info("starte ----Jandwfh");

		jandwfh.saveData();
		log.info("starte ---Jandwfh");

	}

	// new

	@PostMapping(value = "/getGriffinfamilyfuneral")
	public void getGriffinfamilyfuneral() throws Exception {
		log.info("starte ----Griffinfamilyfuneral");

		griffinfamilyfuneral.saveData();
		log.info("starte ---Griffinfamilyfuneral");

	}
	// new

	@PostMapping(value = "/getCoralspringsfuneralhome")
	public void getCoralspringsfuneralhome() throws Exception {
		log.info("starte ----Coralspringsfuneralhome");

		coralspringsfuneralhome.saveData();
		log.info("starte ---Coralspringsfuneralhome");

	}
	// new

	@PostMapping(value = "/getFitzpatrickfuneral")
	public void getFitzpatrickfuneral() throws Exception {
		log.info("starte ----Fitzpatrickfuneral");

		fitzpatrickfuneral.saveData();
		log.info("starte ---Fitzpatrickfuneral");

	}
	// new

	@PostMapping(value = "/getWvi")
	public void getWvi() throws Exception {
		log.info("starte ----Wvi");

		wvi.saveData();
		log.info("starte ---Wvi");

	}
	// new

	@PostMapping(value = "/getRoydavisfuneralhome")
	public void getRoydavisfuneralhome() throws Exception {
		log.info("starte ----Roydavisfuneralhome");

		roydavisfuneralhome.saveData();
		log.info("starte ---Roydavisfuneralhome");

	}

	// new
	@PostMapping(value = "/getDanielsfuneral")
	public void getDanielsfuneral() throws Exception {
		log.info("starte ----Danielsfuneral");

		danielsfuneral.saveData();
		log.info("starte ----Danielsfuneral");
	}

	// new
	@PostMapping(value = "/getEickenhorstfuneral")
	public void getEickenhorstfuneral() throws Exception {
		log.info("starte ----Eickenhorstfuneral");

		eickenhorstfuneral.saveData();
		log.info("starte ----Eickenhorstfuneral");
	}

	// new
	@PostMapping(value = "/getfurnessfuneralhome")
	public void getfurnessfuneralhome() throws Exception {
		log.info("starte ----Furnessfuneralhome");

		furnessfuneralhome.saveData();
		log.info("starte ----furnessfuneralhome");
	}

	// new
	@PostMapping(value = "/getandersonandmarshall")
	public void getandersonandmarshall() throws Exception {
		log.info("starte ----Andersonandmarshall");

		andersonandmarshall.saveData();
		log.info("starte ----Andersonandmarshall");
	}

// new
	@PostMapping(value = "/getBladenfuneralhome")
	public void getBladenfuneralhome() throws Exception {
		log.info("starte ----Bladenfuneralhome");

		bladenfuneralhome.saveData();
		log.info("starte ----Bladenfuneralhome");
	}

	// new
	@PostMapping(value = "/getBrooksfh")
	public void getBrooksfh() throws Exception {
		log.info("starte ----Brooksfh");

		brooksfh.saveData();
		log.info("starte ----Brooksfh");
	}

	// new
	@PostMapping(value = "/getbarbarafalowski")
	public void getbarbarafalowski() throws Exception {
		log.info("starte ----Barbarafalowski");

		barbarafalowski.saveData();
		log.info("starte ----Barbarafalowski");
	}

	// new
	@PostMapping(value = "/getCardaras")
	public void getCardaras() throws Exception {
		log.info("starte ----Cardaras");

		cardaras.saveData();
		log.info("starte ----Cardaras");
	}

	// new
	@PostMapping(value = "/getCheathamcountyfh")
	public void getCheathamcountyfh() throws Exception {
		log.info("starte ----Cheathamcountyfh");

		cheathamcountyfh.saveData();
		log.info("starte ----Cheathamcountyfh");
	}

	// new
	@PostMapping(value = "/getClpagemortuary")
	public void getClpagemortuary() throws Exception {
		log.info("starte ----Clpagemortuary");

		clpagemortuary.saveData();
		log.info("starte ----Clpagemortuary");
	}

	// new
	@PostMapping(value = "/getFordfuneralhomes")
	public void getFordfuneralhomes() throws Exception {
		log.info("starte ----Fordfuneralhomes");

		fordfuneralhomes.saveData();
		log.info("starte ----Fordfuneralhomes");
	}

	// new
	@PostMapping(value = "/getWhittfh")
	public void getWhittfh() throws Exception {
		log.info("starte ----Whittfh");

		whittfh.saveData();
		log.info("starte ----Whittfh");
	}

	// new
	@PostMapping(value = "/getRussellpicafuneralhome")
	public void getRussellpicafuneralhome() throws Exception {
		log.info("starte ----Whittfh");

		russellpicafuneralhome.saveData();
		log.info("starte ----Russellpicafuneralhome");
	}

	// new
	@PostMapping(value = "/getCareyandsonfuneralhome")
	public void getCareyandsonfuneralhome() throws Exception {
		log.info("starte ----Whittfh");

		careyandsonfuneralhome.saveData();
		log.info("starte ----Careyandsonfuneralhome");
	}

	// new
	@PostMapping(value = "/getFordfuneralhomess")
	public void getFordfuneralhomess() throws Exception {
		log.info("starte ----Fordfuneralhomess");

		fordfuneralhomess.saveData();
		log.info("starte ----Fordfuneralhomess");
	}

}
