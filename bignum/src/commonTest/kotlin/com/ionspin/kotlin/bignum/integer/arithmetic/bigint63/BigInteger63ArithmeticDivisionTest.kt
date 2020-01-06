/*
 *    Copyright 2019 Ugljesa Jovanovic
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 *
 */

package com.ionspin.kotlin.bignum.integer.arithmetic.bigint63

import com.ionspin.kotlin.bignum.integer.base63.array.BigInteger63Arithmetic
import kotlin.test.Test
import kotlin.test.assertTrue

/**
 * Created by Ugljesa Jovanovic
 * ugljesa.jovanovic@ionspin.com
 * on 10-Oct-2019
 */
@ExperimentalUnsignedTypes
class BigInteger63ArithmeticDivisionTest {

    @Test
    fun testExactDivisionBy3() {
        assertTrue {
            val dividend = ulongArrayOf(999UL)
            val expected = ulongArrayOf(333UL)
            val result = BigInteger63Arithmetic.exactDivideBy3(dividend)
            result.contentEquals(expected)
        }

        assertTrue {
            val dividend = ulongArrayOf(999_999UL)
            val expected = ulongArrayOf(333_333UL)
            val result = BigInteger63Arithmetic.exactDivideBy3(dividend)
            result.contentEquals(expected)
        }

        assertTrue {
            val dividend = ulongArrayOf(0UL, 0UL, 3UL)
            val expected = BigInteger63Arithmetic.parseForBase("85070591730234615865843651857942052864", 10)
            val result = BigInteger63Arithmetic.exactDivideBy3(dividend)
            result.contentEquals(expected)
        }
    }

    @Test
    fun specificDivide() {
        // val dividend = ulongArrayOf(0U, 0U, 0U, 3U)
        val dividend = ulongArrayOf(5092157428915109767UL, 4266694857304126894UL, 5390724397674103685UL, 9151246733032646738UL, 7791264524191290550UL, 3005773920769462528UL, 5022450607679814120UL, 8914482055250614485UL, 1497154357698590848UL, 4413403823163791387UL, 6152497334707059799UL, 5365643685161103585UL, 3501150039145575859UL, 2355035278622842376UL, 2228676401439384105UL, 2946880907070536609UL, 1715429520896908463UL, 5462412211345805988UL, 4528979641495516646UL, 1374632571917747405UL, 830049926865063206UL, 4330737226810760174UL, 7475509272065667539UL, 5474898567901424598UL, 4694431548167938277UL, 4272180646707901004UL, 1825277693010989236UL, 8339206907644057180UL, 6964647038383228847UL, 2569452627098760988UL, 6812037274673519747UL, 4025134188445106209UL, 6111876746763258936UL, 6911357791861825727UL, 4761334692068466131UL, 5503325027273727428UL, 8829828052967279956UL, 7987123343133209955UL, 2765198044386876452UL, 6936091947014767434UL, 8554671648962177641UL, 7443375318005549302UL, 2677742317901044304UL, 7775808145623490776UL, 1488069007255933146UL, 480045249711228307UL, 3419044497492389305UL, 8350532887166110597UL, 3933818217403140510UL, 250869296089400606UL, 5550642002185600690UL, 3623261078835911358UL, 6462303597145753659UL, 2095454851726106648UL, 3010218128948122264UL, 3272394351062261399UL, 2442054841160335297UL, 4208873668818025904UL, 124344882675865345UL, 5403964051160550405UL, 1569184759361564727UL, 2301135068672088917UL, 5533289247860650517UL, 530321635208672545UL, 7040034360445151039UL, 5932368361477687827UL, 7207722137348107429UL, 189480446123053941UL, 2317798977565158231UL, 4946706443285832937UL, 7208097076502301304UL, 5951719155355991101UL, 7082075022637332769UL, 1012475979560724438UL, 6463743839817446142UL, 6809941653802898115UL, 2567571876772877862UL, 3266034961394586807UL, 7920044217187393995UL, 3173503228651456236UL, 265602150836727767UL, 1467999617477631705UL, 2848959527434519534UL, 487660777855356824UL, 1685024767909823761UL, 2829854410940887669UL, 6098969604326419045UL, 4954150903593165266UL, 5960208966728591567UL, 8802942228278620350UL, 6211170127995775997UL, 2671819503119723840UL, 11439170476781366UL, 6540585062025875829UL, 8859852921337571896UL, 8738043928994333071UL, 2712256293764277892UL, 6485389688699382988UL, 8678389450867576552UL, 6424542318095500685UL, 2585027343887987674UL, 2271615747004904482UL, 2287635042420764850UL, 7428468662547590968UL, 7676533412917739186UL, 7749236082384452890UL, 5107042338531785648UL, 6641692699276898643UL, 8130730152345337738UL, 6414827763486486852UL, 7735723530676390317UL, 1872250922608931581UL, 7104604256741772713UL, 3298849685697644492UL, 3040207037770707255UL, 3006918643483600865UL, 1437004608482325721UL, 1495405628418260268UL, 803282197556871757UL, 2403932202773596907UL, 6727092448265015686UL, 6342878271489223551UL, 2655061380653497312UL, 7183494461311173990UL, 38675807720702947UL, 5466105876484068760UL, 4559751483114861079UL, 8392808004191988367UL, 3808909621158396541UL, 8437794387527022382UL, 7223947788052879034UL, 8283372749495085799UL, 7242172656227592244UL, 6811447605484841520UL, 8546729600085668884UL, 6101173018673577340UL, 8155891757162069UL, 2759132244850062400UL, 8467876433322130899UL, 1370850058695711616UL, 6423798072399324787UL, 6520053481786093182UL, 2270083173481448462UL, 9097102474453240969UL, 5941642161258987247UL, 8492605433896613520UL, 1658367047194337618UL, 1457222546042187164UL, 4416306454641554474UL, 3775392173753828410UL, 1953471144911430243UL, 74839407440583258UL, 5516461129228891768UL, 4225661339435603160UL, 8240279781242689590UL, 1597299195248822751UL, 872899493195830341UL, 3216115542645566016UL, 4512215993139443781UL, 4448587918205031764UL, 3194222959975900309UL, 4522908688233460894UL, 2013026134487349085UL, 743203245340550082UL, 18083644852173571UL, 3400344845527913582UL, 8006689910820863091UL, 5496063231361698145UL, 6688081317928964541UL, 690101040733994918UL, 5348638084135033473UL, 3941669530006322790UL, 1419663740647619674UL, 611087359942227475UL, 8814306669893660946UL, 7508531634684647153UL, 1657920773923434742UL, 5714454090027908832UL, 4106059914003212498UL, 1854511265428777587UL, 1558432040033387203UL, 3704477281158514473UL, 7076822149267214635UL, 8505072049271852564UL, 2182485349507653507UL, 7367001624732535399UL, 9063550971490682524UL, 9090164793846906690UL, 1018428010829951389UL, 4499852827038080809UL, 8456030092058916755UL, 3537399410128448370UL, 1978168152679915075UL, 6640127848208918283UL, 7040841896365910590UL, 3668135626696588884UL, 7976722164757930381UL, 4258504478453300318UL, 6566059904972797406UL, 1385386076858570131UL, 9032873606558837417UL, 8197954506554787612UL, 5550819529916266992UL, 4480512831739909643UL, 3703169441458748663UL, 7532989633621503342UL, 57139374032676337UL, 6440600630359982191UL, 4859538932562684828UL, 5861569151390234881UL, 7236042450387741668UL, 6569077146780063704UL, 8819355205308444430UL, 5597156946903988911UL, 3223863821686274240UL, 6687188703224912286UL, 5771034282673639855UL, 1959304144215019227UL, 1579033793019435055UL, 2742366584369569291UL, 36775388005410803UL, 6310673470094005490UL, 4295115682810441748UL, 805785149312037001UL, 4840872212074331495UL, 5222947414351642581UL, 6217228787599038776UL, 2484646860943039978UL, 2219792559149274361UL, 5122276299510640573UL, 6830739916374522019UL, 8733003763857492106UL, 6427608517896396563UL, 7480563417052367361UL, 3557697848023934605UL, 5499599760905656213UL, 6488709096605885203UL, 1624480435558417145UL, 2783088455309671418UL, 156264743452161971UL, 2824209748479428713UL, 5529953565735350620UL, 6639511475011101711UL, 7006732347046343484UL, 6243973398932143324UL, 7783895215716666693UL, 7188930402670406671UL, 3084433102487973400UL, 8611400836019108842UL, 4013715454641277533UL, 6196772842676962487UL, 9196964095930763722UL, 275924463692334052UL, 1046200284893431222UL, 2314302800360570357UL, 7075690781774853804UL, 8474753671188225661UL, 3837253357130362120UL, 8581239354308751264UL, 4611897944448245512UL, 841083359354214794UL, 89499610017464514UL, 8182995092720338431UL, 7272811551090930488UL, 3395428316853993165UL, 5269054210248675378UL, 3356315498522667404UL, 5488026566995125415UL, 5518219522806433512UL, 3733074737848579672UL, 6440721207259916670UL, 249395092334858207UL, 8895436313533568973UL, 2214491385937218670UL, 4375805128747597513UL, 92786821396931756UL, 115332724147479359UL, 4400909686660673847UL, 1768900675169500570UL, 4409287234308472699UL, 6333724852871924006UL, 3740948159963076003UL, 6656105266339124110UL, 697809511761988575UL, 3137836174417442589UL, 749380679861324206UL, 8271488780315114620UL, 3100952366518828027UL, 7472845765945841174UL, 5013926382496042410UL, 587369257889335060UL, 4835080345728197856UL, 2910007968226034145UL, 2157410092540240444UL, 6910130748366237438UL, 7329162379232662134UL, 3833291561016445580UL, 4887490419858395477UL, 6850516945245654592UL, 5643846802368490543UL, 2651176755764814781UL, 6614857543036907011UL, 8458034388127386517UL, 8152726934747206980UL, 2228822697248223655UL, 3468579901471653846UL, 2105789730935521569UL, 6635083708071166254UL, 7892618839924984445UL, 3953515833350898750UL, 2411039705270816951UL, 5126591657103963877UL, 7016947427309518252UL, 8320735169578097373UL, 24669756958866280UL, 7792755847693144502UL, 3042166374838090604UL, 4527812033085606629UL, 2876959852191669818UL, 8116989234426209924UL, 2126455361057355975UL, 8200550694997681232UL, 362673622283368313UL, 6360939605864279875UL, 7758153106175846607UL, 787470795145052577UL, 315830695478566319UL, 7214159798206099400UL, 2098545616127261655UL, 3874329337803951150UL, 5487221918146897346UL, 1845297149115112422UL, 6933596658894266480UL, 8859986320327765777UL, 5652778064089697174UL, 5473519191006858098UL, 577132876831215411UL, 4313482773961294976UL, 687687616504579836UL, 2365348810388724012UL, 4945442800312207396UL, 585268317058549867UL, 3787429357228510871UL, 4405335853786241038UL, 2192105745474024913UL, 555299938139891552UL, 746418025680974731UL, 8280376503583992319UL, 5268136635024180350UL, 4136129382809840375UL, 3867700354664751400UL, 2810753551789788574UL, 1749587273155083361UL, 4245082584906660985UL, 5959842776076718381UL, 6787069857469290015UL, 8317193096574545438UL, 1322312160597449085UL, 7870640827577488030UL, 1170644275497135917UL, 5188302040275210701UL, 3392469587716332573UL, 5676133609226725465UL, 5524058714889588354UL, 7074874925263592092UL, 3220982732901029694UL, 1647854779050106608UL, 660953846487961902UL, 7391151894178349406UL, 6359062223724267101UL, 907569928125505655UL, 7245488530927966483UL, 3055571923921578738UL, 9101634833851451931UL, 6536453009624565549UL, 34390367254332549UL, 5552132826964904524UL, 8161045000371641843UL, 3671574379952267689UL, 5446814229129732215UL, 6973225219993085283UL, 5928385077436946130UL, 9215877588264663045UL, 4293145948182819687UL, 244480873097177251UL, 4655803404057806192UL, 3003257188499726299UL, 1394197542897449536UL, 2909653363558722799UL, 9130107414228307752UL, 6643626394054740862UL, 8997372219862561500UL, 1746565953985390968UL, 8348371926472399181UL, 1319706912860103002UL, 5851986606189337601UL, 7927588091889040920UL, 345004205098798510UL, 2170749258262561885UL, 7256902404720800713UL, 6805135389759030217UL, 7363370387346040673UL, 2020971312470565338UL, 1430737027736213149UL, 8308246333989283023UL, 9107660512943361846UL, 6031450676881530723UL, 262261587112739550UL, 3524598773543328586UL, 8369141692027976096UL, 7044045506777990183UL, 8441669046316591090UL, 5177392836426469768UL, 4180547911241423716UL, 149824050145192833UL, 3429947504985229471UL, 8046751112003464693UL, 2008204482905213157UL, 4432817090264839285UL, 3763023682238603575UL, 1980397256643222663UL, 2517482887107985700UL, 1777055166157657317UL, 997983657138152731UL, 4602064491590770039UL, 2354388212547951UL, 4134272857119670375UL, 2437533092355903959UL, 5457222595243645154UL, 9073424896432950159UL, 1553734637778497240UL, 8167589248717119325UL, 3536644212085262154UL, 84012656466887256UL, 1369379292177182671UL, 1964736256682798721UL, 706214815179683245UL, 5286824871895087524UL, 8976952231099706419UL, 3214638451482159024UL, 1365426171504026565UL, 5402953689951114645UL, 5120627811012200724UL, 2958091272688559542UL, 2343643499314636758UL, 2698107926785850963UL, 5463572166931033232UL, 3596411381621906168UL, 3996930938326510873UL, 8154565173219898189UL, 8114996408333421776UL, 3192303956366076457UL, 4530099024922295293UL, 1925329548683043066UL, 6900606420511588380UL, 5983281252973967890UL, 7515763749482919353UL, 7244851009556423079UL, 3784205684452573784UL, 1043761487593600790UL, 8893913726793814259UL, 9107205951172409331UL, 533041121930683624UL, 2196291976403117078UL, 4134866187964554372UL, 1220352146221576729UL, 8907117702068359985UL, 7628547462459249198UL, 7341817680975178706UL, 558332134229916189UL, 1870924956664494805UL, 4472866335232924814UL, 396054657082322453UL, 2026055967515407270UL, 7643964729761404403UL, 2588147470844295741UL, 6066484837782844902UL, 8061579921857494514UL, 7190528891763829420UL, 7622774585158724716UL, 4115453788376308475UL, 9202872066414594332UL, 4793169441853933889UL, 3071534352178628564UL, 899148719125094798UL, 661004031597272515UL, 2312134571659608750UL, 1598043289136000163UL, 6464133929372562797UL, 3770579315179988928UL, 2389067675667661192UL, 293146950518993756UL, 3934273797108311921UL, 7822770301534763935UL, 7673785874157937473UL, 6035325591165589782UL, 5406354197171492396UL, 5524929946175519593UL, 4982589787362232059UL, 6210900748742645782UL, 1849168261397582580UL, 4773235694696010224UL, 6981684307070932593UL, 3072976573458386006UL, 6947442464988939207UL, 4839067906378697091UL, 8598346803668100019UL, 2889942701532111740UL, 706022481683131571UL, 2611001660053593842UL, 8199345259287205700UL, 2350844106279799878UL, 3718240889785922109UL, 6427039723037763831UL, 3231289067808176750UL, 2378560025061204535UL, 3788319577954976057UL, 2733058232284284893UL, 3820834566467726679UL, 482184995354378523UL, 1707990532046377795UL, 7559502579191819457UL, 6112178871304919839UL, 8375500261688657430UL, 6375856534984196467UL, 6355860917526929340UL, 3823188036971047609UL, 7461515408993039516UL, 4173577339037042450UL, 702729864188030231UL, 5169343410207170786UL, 7618981459660038776UL, 8021049041309561530UL, 239771060071749127UL, 947982913559270468UL, 8118271508935147908UL, 1823017966137937689UL, 5808727065031429538UL, 7966103703388447816UL, 6628848980404120223UL, 3581624892543575379UL, 7518942884499697706UL, 7936422007648667684UL, 4208476560864146416UL, 1289147540708309279UL, 3804491642617831893UL, 2149226192331690664UL, 3137597208724075671UL, 53774517051664154UL, 7223112438390401676UL, 1308230111724884288UL, 6861631562991696340UL, 8098502421451514564UL, 8784809284343426754UL, 4051580210513331004UL, 427813417298878145UL, 5016023441155749811UL, 6650386368304785379UL, 1351301729955912488UL, 6276647694605880044UL, 8322375266229818046UL, 626340379418927241UL, 6281370741515752118UL, 298017359868086917UL, 2729644214503899462UL, 414399867575895535UL, 4805010145572694546UL, 6620595796411081398UL, 4344472163843007806UL, 8629868517698535133UL, 4843248745270174105UL, 4390104075503598887UL, 3001405746512062724UL, 7693300617261345662UL, 7406731531701404903UL, 1409246088493648284UL, 4409495687504756425UL, 8230038784403100266UL, 3313868331046920413UL, 4666099069592266617UL, 5111462376846909066UL, 865758891572240688UL, 6932928957006784414UL, 3891224754488249624UL, 342985790386771518UL, 1446569948156868565UL, 3368883725537725108UL, 270372815105912221UL, 6926867405423718300UL, 7947514371430939595UL, 5010732222525996927UL, 7430854860337866930UL, 92787448502903478UL, 3189991468696414721UL, 8149979514895332139UL, 6856857028696113918UL, 8944998431484213440UL, 8602869565986431042UL, 6049827775595570897UL, 2136870532323912031UL, 3544537330280621597UL, 3656746188789665487UL, 3774806902903261940UL, 129787612061411955UL, 3258781497467657952UL, 5604693242212275910UL, 5471917020505022716UL, 4282695211001832896UL, 5148759067668570049UL, 1470721255602471332UL, 7284823306310802989UL, 8420607649747689849UL, 663427180568304831UL, 7038029689729366306UL, 1460662980249851550UL, 8207611448493080889UL, 2493075297750601145UL, 7228068155873705837UL, 1278832118697136593UL, 2238546001262071224UL, 2896615486385728813UL, 60320207659366549UL, 5870556620873268488UL, 2096469518111568044UL, 7523988793244290145UL, 5605691546049408591UL, 1393670564649406280UL, 8772869977017156315UL, 8641873306618717882UL, 8959540512717822224UL, 5167931787846902531UL, 8166519463988884052UL, 2373179001070415946UL, 8309690792591385489UL, 4485431781537871261UL, 8544988422473371076UL, 1925475870747694341UL, 3432976237067702625UL, 2726670472324550082UL, 7234427617719049073UL, 4438874361532895UL, 5271310600039281330UL, 6782126049945397896UL, 6254763284399006363UL, 7701056191675108356UL, 5829622192573255100UL, 4206524972052118829UL, 4767302397401339709UL, 5954760973039057840UL, 3237945926319124322UL, 8281088860931641681UL, 9030449734263327448UL, 3020653693281562859UL, 4671814546272354385UL, 5033924869308936582UL, 4151577163048568932UL, 6313530078456924613UL, 2433381910102697498UL, 6407018654867539218UL, 1705653954378713453UL, 8911112373400209036UL, 6832493790192654091UL, 1993816769014240495UL, 5817169697753111678UL, 6658747148552209131UL, 3478818305036431255UL, 5026820798901280668UL, 475351765853918237UL, 5089025741297825957UL, 3080177837990015645UL, 2987842144996872566UL, 4091703206492662597UL, 4433817637645807030UL, 3652184836975133303UL, 7034530160912914216UL, 1532002501407861265UL, 1290389978250125311UL, 6598089119167930350UL, 3977408271670677638UL, 8825288116552966756UL, 2209453588786289527UL, 2203116794101668683UL, 5949111353334050414UL, 101260450250494898UL, 4047473637587382515UL, 1130400681800720820UL, 217002987611452054UL, 7752768303547348502UL, 8349677911511701585UL, 7445787834796557202UL, 1857561207875751832UL, 4662768809851814248UL, 3915974188133130294UL, 4130567081938310721UL, 6710323081022935659UL, 6815027268069153161UL, 3789017142463530015UL, 5233754951414698043UL, 4475537568995137210UL, 2835155436021517220UL, 5043948284991017143UL, 9158000577859565463UL, 4123621187387592125UL, 5854878904992977030UL, 8754558260514383124UL, 8156163252679224712UL, 1046947042882541680UL, 3615391045184883118UL, 2125984027469292456UL, 2120148008324116101UL, 1780950567761671316UL, 2677106458354584078UL, 7642363194851025194UL, 6438230997990796607UL, 5323466630752059802UL, 5275752410842969287UL, 5423158238067314521UL, 5189360968412708896UL, 6180660732460792456UL, 6212520004390403712UL, 6856685712501289182UL, 7430428185208378858UL, 4889398236146564630UL, 7353393395457472279UL, 5367318407357039172UL, 142117159948370237UL, 1955069696469593016UL, 37297213491026548UL, 3933042267824843187UL, 3789887193621363238UL, 7481133243573715617UL, 9201425573062815841UL, 7912648512778189192UL, 5463619055593559397UL, 2433755133707243123UL, 6123105159736386433UL, 8011670981394430892UL, 5126520807924652218UL, 2247515815461719625UL, 595970873944732935UL, 8709033900505908887UL, 7835578247704281586UL, 8471180377779138937UL, 1897733334687780421UL, 2287120896206770410UL, 3401360148441436317UL, 2173252424122510218UL, 6291724928201097423UL, 4123988892943975890UL, 8981462387331079195UL, 3676894284616465259UL, 464468689828443352UL, 3597703167436351151UL, 8740781712739440302UL, 2316350565293901453UL, 4103866119398348373UL, 4891008864578890162UL, 2648843767945620934UL, 5769320761343612669UL, 1393389627047261883UL, 1855318923416031614UL, 69555458861147453UL, 6599772624370821929UL, 1271762690636247952UL, 2491084808599568820UL, 4627320676545175220UL, 6696798016641838073UL, 8518158123061353331UL, 5480730871007991599UL, 3248997583902194019UL, 6845478434955860626UL, 6251840999923989753UL, 2749441203756626636UL, 3066634013125253909UL, 7749245124313901427UL, 710124036565536905UL, 3294078242991062743UL, 9203927428174089928UL, 5799500781900577152UL, 6535046168378753673UL, 2477127065676633617UL, 3235775578185209504UL, 4488727421333257481UL, 993715679455607382UL, 2931968521933441200UL, 2291564119444944723UL, 78299477001131941UL, 2545556275117614506UL, 8832156781218530766UL, 4287016973926896381UL, 4098892422979079589UL, 7445614551967854693UL, 8039536918897813669UL, 835091657938309379UL, 2249504798280311222UL, 1041803563177129281UL, 6516792250584228789UL, 2100271145593358230UL, 5878334536313727652UL, 6819952187591727845UL, 6055078459981613490UL, 8485390727702761870UL, 2102283898909275374UL, 4068593406457919893UL, 5748878812293867223UL, 7562652537177623497UL, 4428949048233708887UL, 8312424400583617815UL)
        exactDivide(dividend)
    }

    fun exactDivide(dividend: ULongArray) {
        val basecaseDivideResult = BigInteger63Arithmetic.divide(dividend, ulongArrayOf(3U))
        val result = BigInteger63Arithmetic.exactDivideBy3(dividend)
        assertTrue(
            "Failed on ulongArrayOf(${dividend.joinToString(separator = ", ") { it.toString() + "UL" }})"
        ) { basecaseDivideResult.first.contentEquals(result) }
    }
}