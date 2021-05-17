import a.class_18;
import a.class_19;
import a.class_20;
import a.class_21;
import a.class_22;
import a.a.class_0;
import a.a.GameApplet;
import a.a.class_11;
import a.a.class_13;
import a.a.Scene;
import a.a.ClientStream;
import a.a.class_8;
import a.a.class_9;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

public class mudclient extends GameApplet {

   // $FF: renamed from: bq boolean
   public boolean field_69;
   // $FF: renamed from: br java.math.BigInteger
   public BigInteger rsaExponent;
   // $FF: renamed from: bs java.math.BigInteger
   public BigInteger rsaModulus;
   // $FF: renamed from: bt boolean
   boolean field_72;
   // $FF: renamed from: bu boolean
   boolean field_73;
   // $FF: renamed from: bv boolean
   boolean field_74;
   // $FF: renamed from: bw boolean
   public boolean appletMode;
   // $FF: renamed from: bx int
   int field_76;
   // $FF: renamed from: by int
   int field_77;
   // $FF: renamed from: bz int
   int mouseButtonClick;
   // $FF: renamed from: bA int
   int field_79;
   // $FF: renamed from: bB int[]
   int[] field_80;
   // $FF: renamed from: bC int[]
   int[] field_81;
   // $FF: renamed from: bD int
   int field_82;
   // $FF: renamed from: bE int[]
   int[] field_83;
   // $FF: renamed from: bF int[]
   int[] field_84;
   // $FF: renamed from: bG int
   int field_85;
   // $FF: renamed from: bH int
   int field_86;
   // $FF: renamed from: bI int
   int field_87;
   // $FF: renamed from: bJ int
   int field_88;
   // $FF: renamed from: bK int
   int field_89;
   // $FF: renamed from: bL int
   int field_90;
   // $FF: renamed from: bM java.awt.Graphics
   Graphics graphics;
   // $FF: renamed from: bN a.a.j
   class_8 scene;
   // $FF: renamed from: bO d
   class_10 surface;
   // $FF: renamed from: bP int
   int magicLoc;
   // $FF: renamed from: bQ int
   int loggedIn;
   // $FF: renamed from: bR int
   int field_96;
   // $FF: renamed from: bS int
   int gameHeight;
   // $FF: renamed from: bT int
   int field_98;
   // $FF: renamed from: bU int
   int field_99;
   // $FF: renamed from: bV int
   int field_100;
   // $FF: renamed from: bW int
   int field_101;
   // $FF: renamed from: bX int
   int field_102;
   // $FF: renamed from: bY int
   int field_103;
   // $FF: renamed from: bZ int
   int field_104;
   // $FF: renamed from: ca int
   int field_105;
   // $FF: renamed from: cb int
   int field_106;
   // $FF: renamed from: cc int
   int field_107;
   // $FF: renamed from: cd int
   int field_108;
   // $FF: renamed from: ce int
   int field_109;
   // $FF: renamed from: cf int
   int field_110;
   // $FF: renamed from: cg int
   int field_111;
   // $FF: renamed from: ch int
   int field_112;
   // $FF: renamed from: ci int
   int field_113;
   // $FF: renamed from: cj int
   int field_114;
   // $FF: renamed from: ck int
   int field_115;
   // $FF: renamed from: cl int
   int field_116;
   // $FF: renamed from: cm f
   class_14 world;
   // $FF: renamed from: cn int
   int planeWidth;
   // $FF: renamed from: co int
   int planeHeight;
   // $FF: renamed from: cp int
   int planeMultiplier;
   // $FF: renamed from: cq int
   int lastHeightOffset;
   // $FF: renamed from: cr int
   int regionX;
   // $FF: renamed from: cs int
   int regionY;
   // $FF: renamed from: ct int
   int planeIndex;
   // $FF: renamed from: cu int
   int regionToLoadXNeg;
   // $FF: renamed from: cv int
   int regionToLoadYNeg;
   // $FF: renamed from: cw int
   int regionToLoadXPositive;
   // $FF: renamed from: cx int
   int regionToLoadYPositive;
   // $FF: renamed from: cy int
   int cameraZoom;
   // $FF: renamed from: cz boolean
   boolean fogOfWar;
   // $FF: renamed from: cA int
   int cameraAutoRotatePlayerY;
   // $FF: renamed from: cB int
   int cameraAutoRotatePlayerX;
   // $FF: renamed from: cC int
   int field_133;
   // $FF: renamed from: cD int
   int field_134;
   // $FF: renamed from: cE int
   int field_135;
   // $FF: renamed from: cF int
   int field_136;
   // $FF: renamed from: cG int
   int field_137;
   // $FF: renamed from: cH int
   int playerCount;
   // $FF: renamed from: cI int
   int field_139;
   // $FF: renamed from: cJ int
   int spriteCount;
   // $FF: renamed from: cK c[]
   class_7[] field_141;
   // $FF: renamed from: cL c[]
   class_7[] players;
   // $FF: renamed from: cM c[]
   class_7[] field_143;
   // $FF: renamed from: cN c
   class_7 localPlayer;
   // $FF: renamed from: cO int
   int localRegionX;
   // $FF: renamed from: cP int
   int localRegionY;
   // $FF: renamed from: cQ int
   int localPlayerServerIndex;
   // $FF: renamed from: cR int
   int field_148;
   // $FF: renamed from: cS int
   int field_149;
   // $FF: renamed from: cT int
   int field_150;
   // $FF: renamed from: cU int
   int field_151;
   // $FF: renamed from: cV c[]
   class_7[] field_152;
   // $FF: renamed from: cW c[]
   class_7[] field_153;
   // $FF: renamed from: cX c[]
   class_7[] field_154;
   // $FF: renamed from: cY int[]
   int[] field_155;
   // $FF: renamed from: cZ int
   int field_156;
   // $FF: renamed from: da int
   int psize;
   // $FF: renamed from: db int[]
   int[] groundItemX;
   // $FF: renamed from: dc int[]
   int[] groundItemY;
   // $FF: renamed from: dd int[]
   int[] groundItemId;
   // $FF: renamed from: de int[]
   int[] field_161;
   // $FF: renamed from: df int
   int field_162;
   // $FF: renamed from: dg int
   int field_163;
   // $FF: renamed from: dh a.a.f[]
   Scene[] field_164;
   // $FF: renamed from: di int[]
   int[] field_165;
   // $FF: renamed from: dj int[]
   int[] field_166;
   // $FF: renamed from: dk int[]
   int[] field_167;
   // $FF: renamed from: dl int[]
   int[] field_168;
   // $FF: renamed from: dm a.a.f[]
   Scene[] field_169;
   // $FF: renamed from: dn boolean[]
   boolean[] field_170;
   // $FF: renamed from: dp int
   int field_171;
   // $FF: renamed from: dq int
   int field_172;
   // $FF: renamed from: dr a.a.f[]
   Scene[] field_173;
   // $FF: renamed from: ds int[]
   int[] field_174;
   // $FF: renamed from: dt int[]
   int[] field_175;
   // $FF: renamed from: du int[]
   int[] field_176;
   // $FF: renamed from: dv int[]
   int[] field_177;
   // $FF: renamed from: dw boolean[]
   boolean[] field_178;
   // $FF: renamed from: dx int
   int field_179;
   // $FF: renamed from: dy int
   int field_180;
   // $FF: renamed from: dz int
   int inventorySize;
   // $FF: renamed from: dA int[]
   int[] inventoryItemId;
   // $FF: renamed from: dB int[]
   int[] inventoryAmounts;
   // $FF: renamed from: dC int[]
   int[] inventoryEquipped;
   // $FF: renamed from: dD int
   int field_185;
   // $FF: renamed from: dE java.lang.String
   String field_186;
   // $FF: renamed from: dF int[]
   int[] field_187;
   // $FF: renamed from: dG int
   final int field_188;
   // $FF: renamed from: dH int[]
   int[] playerStatCurrent;
   // $FF: renamed from: dI int[]
   int[] playerStatBase;
   // $FF: renamed from: dJ int[]
   int[] field_191;
   // $FF: renamed from: dK int[]
   int[] field_192;
   // $FF: renamed from: dL int
   int field_193;
   // $FF: renamed from: dM int
   int field_194;
   // $FF: renamed from: dN int
   int field_195;
   // $FF: renamed from: dO java.lang.String[]
   String[] field_196;
   // $FF: renamed from: dP java.lang.String[]
   String[] field_197;
   // $FF: renamed from: dQ java.lang.String[]
   String[] field_198;
   // $FF: renamed from: dR int
   int field_199;
   // $FF: renamed from: dS int
   int field_200;
   // $FF: renamed from: dT a.a.e
   class_11 field_201;
   // $FF: renamed from: dU int
   int field_202;
   // $FF: renamed from: dV int
   int field_203;
   // $FF: renamed from: dW int
   int field_204;
   // $FF: renamed from: dX a.a.e
   class_11 field_205;
   // $FF: renamed from: dY int
   int field_206;
   // $FF: renamed from: dZ int
   int field_207;
   // $FF: renamed from: ea long
   long field_208;
   // $FF: renamed from: eb a.a.e
   class_11 field_209;
   // $FF: renamed from: ec int
   int field_210;
   // $FF: renamed from: ed int
   int field_211;
   // $FF: renamed from: ee int
   int field_212;
   // $FF: renamed from: ef java.lang.String[]
   String[] field_213;
   // $FF: renamed from: eg boolean[]
   boolean[] field_214;
   // $FF: renamed from: eh boolean[]
   boolean[] field_215;
   // $FF: renamed from: ei boolean
   boolean field_216;
   // $FF: renamed from: ej boolean
   boolean optionCAmeraModeAuto;
   // $FF: renamed from: ek boolean
   boolean field_218;
   // $FF: renamed from: el boolean
   boolean field_219;
   // $FF: renamed from: em boolean
   boolean field_220;
   // $FF: renamed from: en int
   int field_221;
   // $FF: renamed from: eo int
   int field_222;
   // $FF: renamed from: ep int
   int field_223;
   // $FF: renamed from: eq int
   int field_224;
   // $FF: renamed from: er int
   int field_225;
   // $FF: renamed from: es int
   int field_226;
   // $FF: renamed from: et java.lang.String[]
   String[] field_227;
   // $FF: renamed from: eu java.lang.String[]
   String[] field_228;
   // $FF: renamed from: ev int[]
   int[] field_229;
   // $FF: renamed from: ew int[]
   int[] field_230;
   // $FF: renamed from: ex int[]
   int[] field_231;
   // $FF: renamed from: ey int[]
   int[] field_232;
   // $FF: renamed from: ez int[]
   int[] field_233;
   // $FF: renamed from: eA int[]
   int[] field_234;
   // $FF: renamed from: eB int[]
   int[] field_235;
   // $FF: renamed from: eC int
   int field_236;
   // $FF: renamed from: eD int
   int field_237;
   // $FF: renamed from: eE int
   int field_238;
   // $FF: renamed from: eF int
   int field_239;
   // $FF: renamed from: eG a.a.e
   class_11 panelMessageTabs;
   // $FF: renamed from: eH int
   int controlTextListChat;
   // $FF: renamed from: eI int
   int field_242;
   // $FF: renamed from: eJ int
   int controlTextListQuest;
   // $FF: renamed from: eK int
   int controlTextListPrivate;
   // $FF: renamed from: eL int
   int messageTabSelected;
   // $FF: renamed from: eM int
   int field_246;
   // $FF: renamed from: eN java.lang.String[]
   String[] field_247;
   // $FF: renamed from: eO int[]
   int[] field_248;
   // $FF: renamed from: eP boolean
   boolean field_249;
   // $FF: renamed from: eQ java.lang.String
   String field_250;
   // $FF: renamed from: eR int
   int field_251;
   // $FF: renamed from: eS int[]
   int[] field_252;
   // $FF: renamed from: eT int[]
   int[] field_253;
   // $FF: renamed from: eU int
   int field_254;
   // $FF: renamed from: eV int[]
   int[] field_255;
   // $FF: renamed from: eW int[]
   int[] field_256;
   // $FF: renamed from: eX boolean
   boolean field_257;
   // $FF: renamed from: eY boolean
   boolean field_258;
   // $FF: renamed from: eZ boolean
   boolean field_259;
   // $FF: renamed from: fa boolean
   boolean field_260;
   // $FF: renamed from: fb boolean
   boolean field_261;
   // $FF: renamed from: fc boolean
   boolean field_262;
   // $FF: renamed from: fd boolean
   boolean field_263;
   // $FF: renamed from: fe boolean
   boolean field_264;
   // $FF: renamed from: ff long
   long field_265;
   // $FF: renamed from: fg int
   int field_266;
   // $FF: renamed from: fh int[]
   int[] field_267;
   // $FF: renamed from: fi int[]
   int[] field_268;
   // $FF: renamed from: fj int
   int field_269;
   // $FF: renamed from: fk int[]
   int[] field_270;
   // $FF: renamed from: fl int[]
   int[] field_271;
   // $FF: renamed from: fm int
   int field_272;
   // $FF: renamed from: fn int
   int field_273;
   // $FF: renamed from: fo int
   int field_274;
   // $FF: renamed from: fp int
   int field_275;
   // $FF: renamed from: fq boolean
   boolean field_276;
   // $FF: renamed from: fr java.lang.String
   String field_277;
   // $FF: renamed from: fs int
   int field_278;
   // $FF: renamed from: ft int[]
   int[] field_279;
   // $FF: renamed from: fu int[]
   int[] field_280;
   // $FF: renamed from: fv int
   int field_281;
   // $FF: renamed from: fw int[]
   int[] field_282;
   // $FF: renamed from: fx int[]
   int[] field_283;
   // $FF: renamed from: fy boolean
   boolean field_284;
   // $FF: renamed from: fz boolean
   boolean field_285;
   // $FF: renamed from: fA int
   int mouseButtonDownTime;
   // $FF: renamed from: fB int
   int mouseButtonItemCountIncrement;
   // $FF: renamed from: fC long
   long field_288;
   // $FF: renamed from: fD boolean
   boolean field_289;
   // $FF: renamed from: fE boolean
   boolean field_290;
   // $FF: renamed from: fF int
   int field_291;
   // $FF: renamed from: fG int[]
   int[] field_292;
   // $FF: renamed from: fH int[]
   int[] field_293;
   // $FF: renamed from: fI int
   int field_294;
   // $FF: renamed from: fJ int[]
   int[] field_295;
   // $FF: renamed from: fK int[]
   int[] field_296;
   // $FF: renamed from: fL boolean
   boolean field_297;
   // $FF: renamed from: fM int
   int field_298;
   // $FF: renamed from: fN int
   int field_299;
   // $FF: renamed from: fO int[]
   int[] field_300;
   // $FF: renamed from: fP int[]
   int[] field_301;
   // $FF: renamed from: fQ int[]
   int[] field_302;
   // $FF: renamed from: fR int
   int field_303;
   // $FF: renamed from: fS int
   int field_304;
   // $FF: renamed from: fT boolean
   boolean field_305;
   // $FF: renamed from: fU int
   int field_306;
   // $FF: renamed from: fV int[]
   int[] field_307;
   // $FF: renamed from: fW int[]
   int[] field_308;
   // $FF: renamed from: fX int
   int field_309;
   // $FF: renamed from: fY int[]
   int[] field_310;
   // $FF: renamed from: fZ int[]
   int[] field_311;
   // $FF: renamed from: ga int
   int field_312;
   // $FF: renamed from: gb int
   int field_313;
   // $FF: renamed from: gc int
   int field_314;
   // $FF: renamed from: gd int
   int field_315;
   // $FF: renamed from: ge boolean
   boolean field_316;
   // $FF: renamed from: gf int
   int field_317;
   // $FF: renamed from: gg java.lang.String[]
   String[] field_318;
   // $FF: renamed from: gh int
   int field_319;
   // $FF: renamed from: gi int
   int field_320;
   // $FF: renamed from: gj int
   int showDialogReportAbuseStep;
   // $FF: renamed from: gk int
   int field_322;
   // $FF: renamed from: gl int
   int field_323;
   // $FF: renamed from: gm java.lang.String
   String field_324;
   // $FF: renamed from: gn java.lang.String
   String field_325;
   // $FF: renamed from: go boolean
   boolean field_326;
   // $FF: renamed from: gp boolean
   boolean showDialogServermessage;
   // $FF: renamed from: gq int
   int field_328;
   // $FF: renamed from: gr java.lang.String
   String field_329;
   // $FF: renamed from: gs int
   int field_330;
   // $FF: renamed from: gt int
   int field_331;
   // $FF: renamed from: gu int
   int field_332;
   // $FF: renamed from: gv boolean
   boolean field_333;
   // $FF: renamed from: gw boolean
   boolean showDialogMessage;
   // $FF: renamed from: gx java.lang.String
   String field_335;
   // $FF: renamed from: gy int
   int logoutTimeout;
   // $FF: renamed from: gz int
   int combatTimeout;
   // $FF: renamed from: gA int
   int deathScreenTimeout;
   // $FF: renamed from: gB int
   int field_339;
   // $FF: renamed from: gC boolean
   boolean loadingArea;
   // $FF: renamed from: gD int
   int field_341;
   // $FF: renamed from: gE a.a.e
   class_11 field_342;
   // $FF: renamed from: gF int
   int field_343;
   // $FF: renamed from: gG int
   int field_344;
   // $FF: renamed from: gH a.a.e
   class_11 field_345;
   // $FF: renamed from: gI int
   int field_346;
   // $FF: renamed from: gJ int
   int field_347;
   // $FF: renamed from: gK int
   int field_348;
   // $FF: renamed from: gL int
   int field_349;
   // $FF: renamed from: gM int
   int field_350;
   // $FF: renamed from: gN int
   int field_351;
   // $FF: renamed from: gO int
   int field_352;
   // $FF: renamed from: gP a.a.e
   class_11 field_353;
   // $FF: renamed from: gQ int
   int field_354;
   // $FF: renamed from: gR int
   int field_355;
   // $FF: renamed from: gS int
   int field_356;
   // $FF: renamed from: gT int
   int field_357;
   // $FF: renamed from: gU int
   int field_358;
   // $FF: renamed from: gV int
   int field_359;
   // $FF: renamed from: gW java.lang.String
   String field_360;
   // $FF: renamed from: gX java.lang.String
   String field_361;
   // $FF: renamed from: gY java.lang.String
   String username;
   // $FF: renamed from: gZ java.lang.String
   String password;
   // $FF: renamed from: ha a.a.e
   class_11 field_364;
   // $FF: renamed from: hb int
   int field_365;
   // $FF: renamed from: hc int
   int field_366;
   // $FF: renamed from: hd int
   int field_367;
   // $FF: renamed from: he int
   int field_368;
   // $FF: renamed from: hf int
   int field_369;
   // $FF: renamed from: hg int
   int field_370;
   // $FF: renamed from: hh int
   int field_371;
   // $FF: renamed from: hi int
   int field_372;
   // $FF: renamed from: hj int
   int field_373;
   // $FF: renamed from: hk int
   int field_374;
   // $FF: renamed from: hl int
   int field_375;
   // $FF: renamed from: hm int
   int field_376;
   // $FF: renamed from: hn int
   int field_377;
   // $FF: renamed from: ho boolean
   boolean field_378;
   // $FF: renamed from: hp a.a.e
   class_11 field_379;
   // $FF: renamed from: hq int
   int field_380;
   // $FF: renamed from: hr int
   int field_381;
   // $FF: renamed from: hs int
   int field_382;
   // $FF: renamed from: ht int[]
   int[] field_383;
   // $FF: renamed from: hu int[]
   int[] field_384;
   // $FF: renamed from: hv int[]
   int[] field_385;
   // $FF: renamed from: hw int[]
   int[] field_386;
   // $FF: renamed from: hx int[]
   int[] field_387;
   // $FF: renamed from: hy java.lang.String[]
   String[] field_388;
   // $FF: renamed from: hz boolean
   boolean field_389;
   // $FF: renamed from: hA a.a.e
   class_11 field_390;
   // $FF: renamed from: hB int
   int field_391;
   // $FF: renamed from: hC int
   int field_392;
   // $FF: renamed from: hD int
   int field_393;
   // $FF: renamed from: hE int
   int field_394;
   // $FF: renamed from: hF int
   int field_395;
   // $FF: renamed from: hG int
   int field_396;
   // $FF: renamed from: hH int
   int field_397;
   // $FF: renamed from: hI int[]
   int[] field_398;
   // $FF: renamed from: hJ int[]
   int[] field_399;
   // $FF: renamed from: hK boolean
   boolean field_400;
   // $FF: renamed from: hL a.a.e
   class_11 field_401;
   // $FF: renamed from: hM int
   int field_402;
   // $FF: renamed from: hN int
   int field_403;
   // $FF: renamed from: hO int
   int field_404;
   // $FF: renamed from: hP int
   int field_405;
   // $FF: renamed from: hQ int
   int field_406;
   // $FF: renamed from: hR int
   int field_407;
   // $FF: renamed from: hS int
   int field_408;
   // $FF: renamed from: hT java.lang.String[]
   String[] field_409;
   // $FF: renamed from: hU int[]
   int[] field_410;
   // $FF: renamed from: hV int[]
   int[] field_411;
   // $FF: renamed from: hW int[]
   int[] field_412;
   // $FF: renamed from: hX int[]
   int[] field_413;
   // $FF: renamed from: hY int
   int field_414;
   // $FF: renamed from: hZ int[]
   int[] field_415;
   // $FF: renamed from: ia int[]
   int[] field_416;
   // $FF: renamed from: ib int[]
   int[] field_417;
   // $FF: renamed from: ic int[]
   int[] field_418;
   // $FF: renamed from: id int
   int field_419;
   // $FF: renamed from: ie int[]
   int[] field_420;
   // $FF: renamed from: ig int[]
   int[] field_421;
   // $FF: renamed from: ih int[]
   int[] field_422;
   // $FF: renamed from: ii int
   int field_423;
   // $FF: renamed from: ij int
   int field_424;
   // $FF: renamed from: ik int[][]
   int[][] field_425;
   // $FF: renamed from: il boolean
   boolean showAppearanceChange;
   // $FF: renamed from: im int
   int field_427;
   // $FF: renamed from: in int
   int field_428;
   // $FF: renamed from: io int
   int field_429;
   // $FF: renamed from: ip int
   int field_430;
   // $FF: renamed from: iq int
   int field_431;
   // $FF: renamed from: ir int
   int field_432;
   // $FF: renamed from: is int
   int field_433;
   // $FF: renamed from: it int
   int field_434;
   // $FF: renamed from: iu int[]
   public int[] field_435;
   // $FF: renamed from: iv int[]
   public int[] field_436;
   // $FF: renamed from: iw int[]
   public int[] field_437;
   // $FF: renamed from: ix int[]
   int[] field_438;
   // $FF: renamed from: iy int[]
   int[] field_439;
   // $FF: renamed from: iz int[]
   int[] field_440;
   // $FF: renamed from: iA byte[]
   byte[] field_441;
   // $FF: renamed from: iB a.a.d
   class_13 field_442;
   // $FF: renamed from: iC int
   int field_443;
   // $FF: renamed from: iD int[]
   int[] field_444;
   // $FF: renamed from: iE int[]
   int[] field_445;
   // $FF: renamed from: iF int[]
   int[] field_446;
   // $FF: renamed from: iG int[]
   int[] field_447;
   // $FF: renamed from: iH boolean
   boolean isSleeping;
   // $FF: renamed from: iI java.lang.String
   String sleepingStatusText;
   // $FF: renamed from: iJ java.lang.String[]
   String[] field_450;


   public static void main(String[] var0) {
      mudclient var1 = new mudclient();
      var1.appletMode = false;
      if(var0.length > 0 && var0[0].equals("members")) {
         var1.field_69 = true;
      }

      if(var0.length > 1) {
         var1.address = var0[1];
      }

      if(var0.length > 2) {
         var1.port = Integer.parseInt(var0[2]);
      }

      // BEGIN INAUTHENTIC COMMAND LINE ARGUMENTS
		 if(var0.length > 3) {
			 var1.rsaExponent = new BigInteger(var0[3]);
		 }

		 if(var0.length > 4) {
			 var1.rsaModulus = new BigInteger(var0[4]);
		 }
		 // END INAUTHENTIC COMMAND LINE ARGUMENTS

      var1.method_7(var1.field_96, var1.gameHeight + 11, "Runescape by Andrew Gower", false);
      var1.field_32 = 10;
   }

   // $FF: renamed from: a () void
   public void method_2() {
      if(this.appletMode) {
         String var1 = this.getDocumentBase().getHost().toLowerCase();
         if(!var1.endsWith("jagex.com") && !var1.endsWith("jagex.co.uk") && !var1.endsWith("runescape.com") && !var1.endsWith("runescape.co.uk") && !var1.endsWith("runescape.net") && !var1.endsWith("runescape.org") && !var1.endsWith("penguin") && !var1.endsWith("puffin")) {
            this.field_72 = true;
            return;
         }
      }

      this.method_24(this.rsaExponent, this.rsaModulus);
      int var7 = 0;
      int var2 = 0;
      int var3;
      int var4;
      if(class_4.field_563 != 0) {
         var3 = var2 + 1;
         var4 = (int)((double)var3 + 300.0D * Math.pow(2.0D, (double)var3 / 7.0D));
         var7 += var4;
         this.field_187[var2] = var7 & 268435452;
         ++var2;
      }

      while(var2 < 99) {
         var3 = var2 + 1;
         var4 = (int)((double)var3 + 300.0D * Math.pow(2.0D, (double)var3 / 7.0D));
         var7 += var4;
         this.field_187[var2] = var7 & 268435452;
         ++var2;
      }

      String readParam;
      try {
         readParam = this.getParameter("member");
         var4 = Integer.parseInt(readParam);
         if(var4 == 1) {
            this.field_69 = true;
         }
      } catch (Exception var6) {
         ;
      }

      if(this.appletMode) {
         super.port = '\uaa4a';
      }

      super.field_11 = 0;
      GameApplet.field_46 = 1000;
      GameApplet.clientVersion = class_12.clientVer;

      try {
         readParam = this.getParameter("poff");
         var4 = Integer.parseInt(readParam);
         super.port += var4;
         System.out.println("Offset: " + var4); // authentic System.out.println
      } catch (Exception var5) {
         ;
      }

      this.method_52();
      if(!this.field_74) {
         this.field_99 = 2000;
         this.field_100 = this.field_99 + 100;
         this.field_101 = this.field_100 + 50;
         this.field_105 = this.field_101 + 1000;
         this.field_102 = this.field_105 + 10;
         this.field_103 = this.field_102 + 50;
         this.field_104 = this.field_103 + 10;
         this.graphics = this.getGraphics();
         this.method_9(50);
         this.surface = new class_10(this.field_96, this.gameHeight + 12, 4000, this);
         this.surface.field_760 = this;
         this.surface.method_220(0, 0, this.field_96, this.gameHeight + 12);
         class_11.field_801 = false;
         class_11.field_802 = this.field_100;
         this.field_201 = new class_11(this.surface, 5);
         var3 = this.surface.field_723 - 199;
         byte var9 = 36;
         this.field_202 = this.field_201.method_300(var3, var9 + 24, 196, 90, 1, 500, true);
         this.field_205 = new class_11(this.surface, 5);
         this.field_206 = this.field_205.method_300(var3, var9 + 40, 196, 126, 1, 500, true);
         this.field_209 = new class_11(this.surface, 5);
         this.field_210 = this.field_209.method_300(var3, var9 + 24, 196, 251, 1, 500, true);
         this.method_53();
         if(!this.field_74) {
            this.method_54();
            if(!this.field_74) {
               this.scene = new class_8(this.surface, 15000, 15000, 1000);
               this.scene.method_182(this.field_96 / 2, this.gameHeight / 2, this.field_96 / 2, this.gameHeight / 2, this.field_96, this.field_98);
               this.scene.field_647 = 2400;
               this.scene.field_648 = 2400;
               this.scene.field_649 = 1;
               this.scene.field_650 = 2300;
               this.scene.method_210(-50, -10, -50);
               this.world = new class_14(this.scene, this.surface);
               this.world.field_824 = this.field_99;
               this.method_55();
               if(!this.field_74) {
                  this.method_56();
                  if(!this.field_74) {
                     this.method_57();
                     if(!this.field_74) {
                        if(this.field_69) {
                           this.method_58();
                        }

                        if(!this.field_74) {
                           this.method_16(100, "Starting game...");
                           this.method_59();
                           this.method_75();
                           this.method_65();
                           this.method_72();
                           this.method_68();
                           this.method_69();
                           this.method_61();
                           this.method_6();
                           this.method_77();
                        }
                     }
                  }
               }
            }
         }
      }
   }

   // $FF: renamed from: u () void
   public void method_52() {
      byte[] var1 = this.method_19("config" + class_12.field_809 + ".jag", "Configuration", 10);
      if(var1 == null) {
         this.field_74 = true;
      } else {
         class_4.method_140(var1, this.field_69);
         byte[] var2 = this.method_19("filter" + class_12.field_816 + ".jag", "Chat system", 15);
         if(var2 == null) {
            this.field_74 = true;
         } else {
            byte[] var3 = class_21.method_460("fragmentsenc.txt", 0, var2);
            byte[] var4 = class_21.method_460("badenc.txt", 0, var2);
            byte[] var5 = class_21.method_460("hostenc.txt", 0, var2);
            byte[] var6 = class_21.method_460("tldlist.txt", 0, var2);
            class_19 var10000 = new class_19(var3);
            class_19 var10001 = new class_19(var4);
            class_19 var10002 = new class_19(var5);
            class_19 var10003 = new class_19(var6);
            class_20.method_411(var10000, var10001, var10002, var10003);
         }
      }
   }

   // $FF: renamed from: v () void
   public void method_53() {
      int var8 = class_4.field_563;
      byte[] var1 = this.method_19("media" + class_12.field_811 + ".jag", "2d graphics", 20);
      if(var1 == null) {
         this.field_74 = true;
      } else {
         byte[] var2 = class_21.method_460("index.dat", 0, var1);
         this.surface.method_236(this.field_99, class_21.method_460("inv1.dat", 0, var1), var2, 1);
         this.surface.method_236(this.field_99 + 1, class_21.method_460("inv2.dat", 0, var1), var2, 6);
         this.surface.method_236(this.field_99 + 9, class_21.method_460("bubble.dat", 0, var1), var2, 1);
         this.surface.method_236(this.field_99 + 10, class_21.method_460("runescape.dat", 0, var1), var2, 1);
         this.surface.method_236(this.field_99 + 11, class_21.method_460("splat.dat", 0, var1), var2, 3);
         this.surface.method_236(this.field_99 + 14, class_21.method_460("icon.dat", 0, var1), var2, 8);
         this.surface.method_236(this.field_99 + 22, class_21.method_460("hbar.dat", 0, var1), var2, 1);
         this.surface.method_236(this.field_99 + 23, class_21.method_460("hbar2.dat", 0, var1), var2, 1);
         this.surface.method_236(this.field_99 + 24, class_21.method_460("compass.dat", 0, var1), var2, 1);
         this.surface.method_236(this.field_99 + 25, class_21.method_460("buttons.dat", 0, var1), var2, 2);
         this.surface.method_236(this.field_100, class_21.method_460("scrollbar.dat", 0, var1), var2, 2);
         this.surface.method_236(this.field_100 + 2, class_21.method_460("corners.dat", 0, var1), var2, 4);
         this.surface.method_236(this.field_100 + 6, class_21.method_460("arrows.dat", 0, var1), var2, 2);
         this.surface.method_236(this.field_102, class_21.method_460("projectile.dat", 0, var1), var2, class_4.field_541);
         int var3 = class_4.field_473;
         int var4 = 1;
         int var5;
         if(var8 != 0 || var3 > 0) {
            do {
               var5 = var3;
               var3 -= 30;
               if(var5 > 30) {
                  var5 = 30;
               }

               this.surface.method_236(this.field_101 + (var4 - 1) * 30, class_21.method_460("objects" + var4 + ".dat", 0, var1), var2, var5);
               ++var4;
            } while(var3 > 0);
         }

         this.surface.method_239(this.field_99);
         this.surface.method_239(this.field_99 + 9);
         var5 = 11;
         if(var8 != 0) {
            this.surface.method_239(this.field_99 + var5);
            ++var5;
         }

         while(var5 <= 26) {
            this.surface.method_239(this.field_99 + var5);
            ++var5;
         }

         int var6 = 0;
         if(var8 != 0 || var6 < class_4.field_541) {
            do {
               this.surface.method_239(this.field_102 + var6);
               ++var6;
            } while(var6 < class_4.field_541);
         }

         int var7 = 0;
         if(var8 != 0 || var7 < class_4.field_473) {
            do {
               this.surface.method_239(this.field_101 + var7);
               ++var7;
            } while(var7 < class_4.field_473);

         }
      }
   }

   // $FF: renamed from: w () void
   public void method_54() {
      int var12 = class_4.field_563;
      Object var1 = null;
      Object var2 = null;
      byte[] var13 = this.method_19("entity" + class_12.field_814 + ".jag", "people and monsters", 30);
      if(var13 == null) {
         this.field_74 = true;
      } else {
         byte[] var14 = class_21.method_460("index.dat", 0, var13);
         byte[] var3 = null;
         byte[] var4 = null;
         if(this.field_69) {
            var3 = this.method_19("entity" + class_12.field_814 + ".mem", "member graphics", 45);
            if(var3 == null) {
               this.field_74 = true;
               return;
            }

            var4 = class_21.method_460("index.dat", 0, var3);
         }

         int var6 = 0;
         this.field_423 = 0;
         this.field_424 = this.field_423;
         int var7 = 0;
         if(var12 == 0 && var7 >= class_4.field_507) {
            System.out.println("Loaded: " + var6 + " frames of animation"); // authentic System.out.println
         } else {
            do {
               label84: {
                  String var8 = class_4.field_508[var7];
                  int var9 = 0;
                  if(var12 != 0) {
                     if(class_4.field_508[var9].equalsIgnoreCase(var8)) {
                        class_4.field_513[var7] = class_4.field_513[var9];
                        if(var12 == 0) {
                           break label84;
                        }
                     }

                     ++var9;
                  }

                  while(true) {
                     if(var9 >= var7) {
                        byte[] var10 = class_21.method_460(var8 + ".dat", 0, var13);
                        byte[] var5 = var14;
                        if(var10 == null && this.field_69) {
                           var10 = class_21.method_460(var8 + ".dat", 0, var3);
                           var5 = var4;
                        }

                        if(var10 != null) {
                           this.surface.method_236(this.field_424, var10, var5, 15);
                           var6 += 15;
                           byte[] var11;
                           if(class_4.field_511[var7] == 1) {
                              var11 = class_21.method_460(var8 + "a.dat", 0, var13);
                              var5 = var14;
                              if(var11 == null && this.field_69) {
                                 var11 = class_21.method_460(var8 + "a.dat", 0, var3);
                                 var5 = var4;
                              }

                              this.surface.method_236(this.field_424 + 15, var11, var5, 3);
                              var6 += 3;
                           }

                           if(class_4.field_512[var7] == 1) {
                              var11 = class_21.method_460(var8 + "f.dat", 0, var13);
                              var5 = var14;
                              if(var11 == null && this.field_69) {
                                 var11 = class_21.method_460(var8 + "f.dat", 0, var3);
                                 var5 = var4;
                              }

                              this.surface.method_236(this.field_424 + 18, var11, var5, 9);
                              var6 += 9;
                           }

                           if(class_4.field_510[var7] != 0) {
                              int var15 = this.field_424;
                              if(var12 != 0) {
                                 this.surface.method_239(var15);
                                 ++var15;
                              }

                              while(var15 < this.field_424 + 27) {
                                 this.surface.method_239(var15);
                                 ++var15;
                              }
                           }
                        }

                        class_4.field_513[var7] = this.field_424;
                        this.field_424 += 27;
                        break;
                     }

                     if(class_4.field_508[var9].equalsIgnoreCase(var8)) {
                        class_4.field_513[var7] = class_4.field_513[var9];
                        if(var12 == 0) {
                           break;
                        }
                     }

                     ++var9;
                  }
               }

               ++var7;
            } while(var7 < class_4.field_507);

            System.out.println("Loaded: " + var6 + " frames of animation"); // authentic System.out.println
         }
      }
   }

   // $FF: renamed from: x () void
   public void method_55() {
      int var10 = class_4.field_563;
      byte[] var1 = this.method_19("textures" + class_12.field_813 + ".jag", "Textures", 50);
      if(var1 == null) {
         this.field_74 = true;
      } else {
         byte[] var2 = class_21.method_460("index.dat", 0, var1);
         this.scene.method_204(class_4.field_504, 7, 11);
         int var3 = 0;
         if(var10 != 0 || var3 < class_4.field_504) {
            do {
               String var4 = class_4.field_505[var3];
               byte[] var5 = class_21.method_460(var4 + ".dat", 0, var1);
               this.surface.method_236(this.field_103, var5, var2, 1);
               this.surface.method_227(0, 0, 128, 128, 16711935);
               this.surface.method_242(0, 0, this.field_103);
               int var6 = this.surface.field_740[this.field_103];
               String var7 = class_4.field_506[var3];
               if(var7 != null && var7.length() > 0) {
                  var5 = class_21.method_460(var7 + ".dat", 0, var1);
                  this.surface.method_236(this.field_103, var5, var2, 1);
                  this.surface.method_242(0, 0, this.field_103);
               }

               this.surface.method_241(this.field_104 + var3, 0, 0, var6, var6);
               int var8 = var6 * var6;
               int var9 = 0;
               if(var10 != 0) {
                  if(this.surface.field_733[this.field_104 + var3][var9] == '\uff00') {
                     this.surface.field_733[this.field_104 + var3][var9] = 16711935;
                  }

                  ++var9;
               }

               for(; var9 < var8; ++var9) {
                  if(this.surface.field_733[this.field_104 + var3][var9] == '\uff00') {
                     this.surface.field_733[this.field_104 + var3][var9] = 16711935;
                  }
               }

               this.surface.method_238(this.field_104 + var3);
               this.scene.method_205(var3, this.surface.field_734[this.field_104 + var3], this.surface.field_735[this.field_104 + var3], var6 / 64 - 1);
               ++var3;
            } while(var3 < class_4.field_504);

         }
      }
   }

   // $FF: renamed from: y () void
   public void method_56() {
      int var4 = class_4.field_563;
      class_4.method_135("torcha2");
      class_4.method_135("torcha3");
      class_4.method_135("torcha4");
      class_4.method_135("skulltorcha2");
      class_4.method_135("skulltorcha3");
      class_4.method_135("skulltorcha4");
      class_4.method_135("firea2");
      class_4.method_135("firea3");
      class_4.method_135("fireplacea2");
      class_4.method_135("fireplacea3");
      class_4.method_135("firespell2");
      class_4.method_135("firespell3");
      class_4.method_135("lightning2");
      class_4.method_135("lightning3");
      class_4.method_135("clawspell2");
      class_4.method_135("clawspell3");
      class_4.method_135("clawspell4");
      class_4.method_135("clawspell5");
      class_4.method_135("spellcharge2");
      class_4.method_135("spellcharge3");
      Scene[] var10000;
      if(this.method_8()) {
         byte[] var5 = this.method_19("models" + class_12.field_812 + ".jag", "3d models", 60);
         if(var5 == null) {
            this.field_74 = true;
         } else {
            int var2 = 0;
            if(var4 != 0 || var2 < class_4.field_557) {
               do {
                  label33: {
                     int var3 = class_21.method_458(class_4.field_558[var2] + ".ob3", var5);
                     if(var3 != 0) {
                        var10000 = this.field_169;
                        var10000[var2] = new Scene(var5, var3, true);
                        if(var4 == 0) {
                           break label33;
                        }
                     }

                     var10000 = this.field_169;
                     var10000[var2] = new Scene(1, 1);
                  }

                  if(class_4.field_558[var2].equals("giantcrystal")) {
                     this.field_169[var2].field_882 = true;
                  }

                  ++var2;
               } while(var2 < class_4.field_557);

            }
         }
      } else {
         this.method_16(70, "Loading 3d models");
         int var1 = 0;
         if(var4 != 0 || var1 < class_4.field_557) {
            do {
               var10000 = this.field_169;
               var10000[var1] = new Scene("../gamedata/models/" + class_4.field_558[var1] + ".ob2");
               if(class_4.field_558[var1].equals("giantcrystal")) {
                  this.field_169[var1].field_882 = true;
               }

               ++var1;
            } while(var1 < class_4.field_557);

         }
      }
   }

   // $FF: renamed from: z () void
   public void method_57() {
      this.world.field_829 = this.method_19("maps" + class_12.field_810 + ".jag", "map", 70);
      if(this.field_69) {
         this.world.field_831 = this.method_19("maps" + class_12.field_810 + ".mem", "members map", 75);
      }

      this.world.field_828 = this.method_19("land" + class_12.field_810 + ".jag", "landscape", 80);
      if(this.field_69) {
         this.world.field_830 = this.method_19("land" + class_12.field_810 + ".mem", "members landscape", 85);
      }

   }

   // $FF: renamed from: A () void
   public void method_58() {
      try {
         this.field_441 = this.method_19("sounds" + class_12.field_815 + ".mem", "Sound effects", 90);
         this.field_442 = new class_13();
      } catch (Throwable var2) {
         System.out.println("Unable to init sounds:" + var2); // authentic System.out.println
      }
   }

   // $FF: renamed from: B () void
   public void method_59() {
      this.panelMessageTabs = new class_11(this.surface, 10);
      this.controlTextListChat = this.panelMessageTabs.method_297(5, 269, 502, 56, 1, 20, true);
      this.field_242 = this.panelMessageTabs.method_298(7, 324, 498, 14, 1, 80, false, true);
      this.controlTextListQuest = this.panelMessageTabs.method_297(5, 269, 502, 56, 1, 20, true);
      this.controlTextListPrivate = this.panelMessageTabs.method_297(5, 269, 502, 56, 1, 20, true);
      this.panelMessageTabs.method_311(this.field_242);
   }

   // $FF: renamed from: b () void
   public void method_3() {
      if(!this.field_72) {
         if(!this.field_73) {
            if(!this.field_74) {
               try {
                  ++this.field_76;
                  if(this.loggedIn == 0) {
                     super.lastMouseAction = 0;
                     this.method_78();
                  }

                  if(this.loggedIn == 1) {
                     ++super.lastMouseAction;
                     this.handleGameInput();
                  }

                  super.lastMouseButtonDown = 0;
                  super.field_38 = 0;
                  ++this.field_89;
                  if(this.field_89 > 500) {
                     this.field_89 = 0;
                     int var1 = (int)(Math.random() * 4.0D);
                     if((var1 & 1) == 1) {
                        this.field_85 += this.field_86;
                     }

                     if((var1 & 2) == 2) {
                        this.field_87 += this.field_88;
                     }
                  }

                  if(this.field_85 < -50) {
                     this.field_86 = 2;
                  }

                  if(this.field_85 > 50) {
                     this.field_86 = -2;
                  }

                  if(this.field_87 < -50) {
                     this.field_88 = 2;
                  }

                  if(this.field_87 > 50) {
                     this.field_88 = -2;
                  }

                  if(this.field_236 > 0) {
                     --this.field_236;
                  }

                  if(this.field_237 > 0) {
                     --this.field_237;
                  }

                  if(this.field_238 > 0) {
                     --this.field_238;
                  }

                  if(this.field_239 > 0) {
                     --this.field_239;
                     return;
                  }
               } catch (OutOfMemoryError var2) {
                  this.method_60();
                  this.field_73 = true;
               }

            }
         }
      }
   }

   // $FF: renamed from: d () void
   public void method_5() {
      Graphics var1;
      if(this.field_74) {
         var1 = this.getGraphics();
         var1.setColor(Color.black);
         var1.fillRect(0, 0, 512, 356);
         var1.setFont(new Font("Helvetica", 1, 16));
         var1.setColor(Color.yellow);
         byte var2 = 35;
         var1.drawString("Sorry, an error has occured whilst loading RuneScape", 30, var2);
         int var4 = var2 + 50;
         var1.setColor(Color.white);
         var1.drawString("To fix this try the following (in order):", 30, var4);
         var4 += 50;
         var1.setColor(Color.white);
         var1.setFont(new Font("Helvetica", 1, 12));
         var1.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, var4);
         var4 += 30;
         var1.drawString("2: Try clearing your web-browsers cache from tools->internet options", 30, var4);
         var4 += 30;
         var1.drawString("3: Try using a different game-world", 30, var4);
         var4 += 30;
         var1.drawString("4: Try rebooting your computer", 30, var4);
         var4 += 30;
         var1.drawString("5: Try selecting a different version of Java from the play-game menu", 30, var4);
         this.method_9(1);
      } else if(this.field_72) {
         var1 = this.getGraphics();
         var1.setColor(Color.black);
         var1.fillRect(0, 0, 512, 356);
         var1.setFont(new Font("Helvetica", 1, 20));
         var1.setColor(Color.white);
         var1.drawString("Error - unable to load game!", 50, 50);
         var1.drawString("To play RuneScape make sure you play from", 50, 100);
         var1.drawString("http://www.runescape.com", 50, 150);
         this.method_9(1);
      } else if(this.field_73) {
         var1 = this.getGraphics();
         var1.setColor(Color.black);
         var1.fillRect(0, 0, 512, 356);
         var1.setFont(new Font("Helvetica", 1, 20));
         var1.setColor(Color.white);
         var1.drawString("Error - out of memory!", 50, 50);
         var1.drawString("Close ALL unnecessary programs", 50, 100);
         var1.drawString("and windows before loading the game", 50, 150);
         var1.drawString("RuneScape needs about 48meg of spare RAM", 50, 200);
         this.method_9(1);
      } else {
         try {
            if(this.loggedIn == 0) {
               this.surface.loggedIn = false;
               this.method_76();
            }

            if(this.loggedIn == 1) {
               this.surface.loggedIn = true;
               this.drawGame();
               return;
            }
         } catch (OutOfMemoryError var3) {
            this.method_60();
            this.field_73 = true;
         }

      }
   }

   // $FF: renamed from: c () void
   public void method_4() {
      this.confirmLogout();
      this.method_60();
      if(this.field_442 != null) {
         this.field_442.method_318();
      }

   }

   // $FF: renamed from: C () void
   public void method_60() {
      try {
         if(this.surface != null) {
            this.surface.method_235();
            this.surface.field_729 = null;
            this.surface = null;
         }

         if(this.scene != null) {
            this.scene.method_172();
            this.scene = null;
         }

         this.field_169 = null;
         this.field_164 = null;
         this.field_173 = null;
         this.field_141 = null;
         this.players = null;
         this.field_152 = null;
         this.field_153 = null;
         this.localPlayer = null;
         if(this.world != null) {
            this.world.field_848 = null;
            this.world.gameModelArrayArray1 = null;
            this.world.gameModelArrayArray2 = null;
            this.world.field_851 = null;
            this.world = null;
         }

         System.gc();
      } catch (Exception var1) {
         ;
      }
   }

   // $FF: renamed from: b (int) void
   public void method_11(int var1) {
      if(this.loggedIn == 0) {
         if(this.field_341 == 0) {
            this.field_342.method_277(var1);
         }

         if(this.field_341 == 1) {
            this.field_345.method_277(var1);
         }

         if(this.field_341 == 2) {
            this.field_353.method_277(var1);
         }

         if(this.field_341 == 3) {
            this.field_390.method_277(var1);
         }
      }

      if(this.loggedIn == 1) {
         if(this.showAppearanceChange) {
            this.field_364.method_277(var1);
            return;
         }

         if(this.field_378) {
            if(this.field_382 == -1) {
               this.field_379.method_277(var1);
            }

            return;
         }

         if(this.field_400) {
            this.field_401.method_277(var1);
            return;
         }

         if(this.field_323 == 0 && this.field_320 == 0 && this.showDialogReportAbuseStep == 0 && !this.isSleeping) {
            this.panelMessageTabs.method_277(var1);
         }

         if(this.field_323 == 3 || this.field_323 == 4 || this.field_323 == 5 || this.field_323 == 7) {
            this.field_323 = 0;
         }
      }

   }

   // $FF: renamed from: a (int, int, int) void
   public void method_12(int var1, int var2, int var3) {
      int var10 = class_4.field_563;
      this.field_83[this.field_82] = var2;
      this.field_84[this.field_82] = var3;
      this.field_82 = this.field_82 + 1 & 8191;
      int var4 = 10;
      if(var10 != 0 || var4 < 4000) {
         do {
            int var5 = this.field_82 - var4 & 8191;
            if(this.field_83[var5] == var2 && this.field_84[var5] == var3) {
               boolean var6 = false;
               int var7 = 1;
               if(var10 != 0 || var7 < var4) {
                  do {
                     int var8 = this.field_82 - var7 & 8191;
                     int var9 = var5 - var7 & 8191;
                     if(this.field_83[var9] != var2 || this.field_84[var9] != var3) {
                        var6 = true;
                     }

                     if(this.field_83[var8] != this.field_83[var9] || this.field_84[var8] != this.field_84[var9]) {
                        break;
                     }

                     if(var7 == var4 - 1 && var6 && this.combatTimeout == 0 && this.logoutTimeout == 0) {
                        this.sendLogout();
                        return;
                     }

                     ++var7;
                  } while(var7 < var4);
               }
            }

            ++var4;
         } while(var4 < 4000);

      }
   }

   // $FF: renamed from: D () void
   public void method_61() {
      this.loggedIn = 0;
      this.field_341 = 0;
      this.username = "";
      this.password = "";
      this.field_360 = "Please enter a username:";
      this.field_361 = "*" + this.username + "*";
      this.playerCount = 0;
      this.field_150 = 0;
   }

   // $FF: renamed from: E () void
   public void method_62() {
      super.field_42 = "";
      super.field_43 = "";
   }

   // $FF: renamed from: F () void
   public void sendLogout() {
      if(this.loggedIn != 0) {
         if(this.combatTimeout > 450) {
            this.displayMessage("@cya@You can\'t logout during combat!", 3);
         } else if(this.combatTimeout > 0) {
            this.displayMessage("@cya@You can\'t logout for 10 seconds after combat", 3);
         } else {
            super.clientStream.newPacket(6, 156);
            super.clientStream.flushPacket_();
            this.logoutTimeout = 1000;
         }
      }
   }

   // $FF: renamed from: e (java.lang.String) void
   public void method_64(String var1) {
      if(this.field_442 != null) {
         if(!this.field_219) {
            this.field_442.method_319(this.field_441, class_21.method_458(var1 + ".pcm", this.field_441), class_21.method_459(var1 + ".pcm", this.field_441));
         }
      }
   }

   // $FF: renamed from: G () void
   public void method_65() {
      this.field_379 = new class_11(this.surface, 100);
      byte var1 = 8;
      this.field_380 = this.field_379.method_293(256, var1, "@yel@Please provide 5 security questions in case you lose your password", 1, true);
      int var3 = var1 + 22;
      this.field_379.method_293(256, var3, "If you ever lose your password, you will need these to prove you own your account.", 1, true);
      var3 += 13;
      this.field_379.method_293(256, var3, "Your answers are encrypted and are ONLY used for password recovery purposes.", 1, true);
      var3 += 22;
      this.field_379.method_293(256, var3, "@ora@IMPORTANT:@whi@ To recover your password you must give the EXACT same answers you", 1, true);
      var3 += 13;
      this.field_379.method_293(256, var3, "give here. If you think you might forget an answer, or someone else could guess the", 1, true);
      var3 += 13;
      this.field_379.method_293(256, var3, "answer, then press the \'different question\' button to get a better question.", 1, true);
      var3 += 35;
      int var2 = 0;
      if(class_4.field_563 == 0 && var2 >= 5) {
         this.field_379.method_311(this.field_384[0]);
         var3 += 10;
         this.field_379.method_294(256, var3, 250, 30);
         this.field_379.method_293(256, var3, "Click here when finished", 4, true);
         this.field_381 = this.field_379.method_301(256, var3, 250, 30);
      } else {
         do {
            this.field_379.method_294(170, var3, 310, 30);
            this.field_388[var2] = this.field_450[this.field_387[var2]];
            this.field_383[var2] = this.field_379.method_293(170, var3 - 7, var2 + 1 + ": " + this.field_450[this.field_387[var2]], 1, true);
            this.field_384[var2] = this.field_379.method_299(170, var3 + 7, 310, 30, 1, 80, false, true);
            this.field_379.method_294(370, var3, 80, 30);
            this.field_379.method_293(370, var3 - 7, "Different", 1, true);
            this.field_379.method_293(370, var3 + 7, "Question", 1, true);
            this.field_385[var2] = this.field_379.method_301(370, var3, 80, 30);
            this.field_379.method_294(455, var3, 80, 30);
            this.field_379.method_293(455, var3 - 7, "Enter own", 1, true);
            this.field_379.method_293(455, var3 + 7, "Question", 1, true);
            this.field_386[var2] = this.field_379.method_301(455, var3, 80, 30);
            var3 += 35;
            ++var2;
         } while(var2 < 5);

         this.field_379.method_311(this.field_384[0]);
         var3 += 10;
         this.field_379.method_294(256, var3, 250, 30);
         this.field_379.method_293(256, var3, "Click here when finished", 4, true);
         this.field_381 = this.field_379.method_301(256, var3, 250, 30);
      }
   }

   // $FF: renamed from: H () void
   public void method_66() {
      int var8 = class_4.field_563;
      if(this.field_382 != -1) {
         if(super.field_43.length() > 0) {
            this.field_388[this.field_382] = super.field_43;
            this.field_379.updateText(this.field_383[this.field_382], this.field_382 + 1 + ": " + this.field_388[this.field_382]);
            this.field_379.updateText(this.field_384[this.field_382], "");
            this.field_382 = -1;
         }

      } else {
         this.field_379.method_275(super.mouseX, super.mouseY, super.lastMouseButtonDown, super.field_35);
         int var1 = 0;
         int var3;
         if(var8 != 0 || var1 < 5) {
            do {
               if(this.field_379.method_276(this.field_385[var1])) {
                  boolean var2 = false;
                  if(var8 != 0 || !var2) {
                     do {
                        this.field_387[var1] = (this.field_387[var1] + 1) % this.field_450.length;
                        var2 = true;
                        var3 = 0;
                        if(var8 != 0 || var3 < 5) {
                           do {
                              if(var3 != var1 && this.field_387[var3] == this.field_387[var1]) {
                                 var2 = false;
                              }

                              ++var3;
                           } while(var3 < 5);
                        }
                     } while(!var2);
                  }

                  this.field_388[var1] = this.field_450[this.field_387[var1]];
                  this.field_379.updateText(this.field_383[var1], var1 + 1 + ": " + this.field_450[this.field_387[var1]]);
                  this.field_379.updateText(this.field_384[var1], "");
               }

               ++var1;
            } while(var1 < 5);
         }

         int var9 = 0;
         if(var8 != 0) {
            if(this.field_379.method_276(this.field_386[var9])) {
               this.field_382 = var9;
               super.field_42 = "";
               super.field_43 = "";
            }

            ++var9;
         }

         for(; var9 < 5; ++var9) {
            if(this.field_379.method_276(this.field_386[var9])) {
               this.field_382 = var9;
               super.field_42 = "";
               super.field_43 = "";
            }
         }

         if(this.field_379.method_276(this.field_381)) {
            var3 = 0;
            if(var8 != 0 || var3 < 5) {
               do {
                  String var4 = this.field_379.method_308(this.field_384[var3]);
                  if(var4 == null || var4.length() < 3) {
                     this.field_379.updateText(this.field_380, "@yel@Please provide a longer answer to question: " + (var3 + 1));
                     return;
                  }

                  ++var3;
               } while(var3 < 5);
            }

            int var10 = 0;
            int var6;
            String var7;
            if(var8 != 0 || var10 < 5) {
               do {
                  String var5 = this.field_379.method_308(this.field_384[var10]);
                  var6 = 0;
                  if(var8 == 0 && var6 >= var10) {
                     ++var10;
                  } else {
                     do {
                        var7 = this.field_379.method_308(this.field_384[var6]);
                        if(var5.equalsIgnoreCase(var7)) {
                           this.field_379.updateText(this.field_380, "@yel@Each question must have a different answer");
                           return;
                        }

                        ++var6;
                     } while(var6 < var10);

                     ++var10;
                  }
               } while(var10 < 5);
            }

            super.clientStream.newPacket(208, 457);
            int var11 = 0;
            if(var8 != 0 || var11 < 5) {
               do {
                  String var12 = this.field_388[var11];
                  if(var12 == null || var12.length() == 0) {
                     var12 = String.valueOf(var11 + 1);
                  }

                  if(var12.length() > 50) {
                     var12 = var12.substring(0, 50);
                  }

                  var7 = this.field_379.method_308(this.field_384[var11]);
                  var7 = class_21.method_454(var7, 50);
                  super.clientStream.putByte(var12.length());
                  super.clientStream.putUnterminatedString(var12);
                  super.clientStream.putByte(var7.length());
                  super.clientStream.putPassword(var7, super.sessionId, this.rsaExponent, this.rsaModulus);
                  ++var11;
               } while(var11 < 5);
            }

            super.clientStream.flushPacket_();
            var6 = 0;
            if(var8 != 0 || var6 < 5) {
               do {
                  this.field_387[var6] = var6;
                  this.field_388[var6] = this.field_450[this.field_387[var6]];
                  this.field_379.updateText(this.field_384[var6], "");
                  this.field_379.updateText(this.field_383[var6], var6 + 1 + ": " + this.field_388[var6]);
                  ++var6;
               } while(var6 < 5);
            }

            this.surface.method_223();
            this.field_378 = false;
         }

      }
   }

   // $FF: renamed from: I () void
   public void method_67() {
      this.surface.field_747 = false;
      this.surface.method_223();
      this.field_379.method_278();
      if(this.field_382 != -1) {
         short var1 = 150;
         this.surface.method_227(26, var1, 460, 60, 0);
         this.surface.method_228(26, var1, 460, 60, 16777215);
         int var2 = var1 + 22;
         this.surface.drawstringCenter("Please enter your question", 256, var2, 4, 16777215);
         var2 += 25;
         this.surface.drawstringCenter(super.field_42 + "*", 256, var2, 4, 16777215);
      }

      this.surface.method_242(0, this.gameHeight, this.field_99 + 22);
      this.surface.draw(this.graphics, 0, 0);
   }

   // $FF: renamed from: J () void
   public void method_68() {
      this.field_390 = new class_11(this.surface, 100);
      byte var1 = 10;
      this.field_391 = this.field_390.method_293(256, var1, "@yel@To prove this is your account please provide the answers to", 1, true);
      int var3 = var1 + 15;
      this.field_392 = this.field_390.method_293(256, var3, "@yel@your security questions. You will then be able to reset your password", 1, true);
      var3 += 35;
      int var2 = 0;
      if(class_4.field_563 != 0) {
         this.field_390.method_294(256, var3, 410, 30);
         this.field_398[var2] = this.field_390.method_293(256, var3 - 7, var2 + 1 + ": question?", 1, true);
         this.field_399[var2] = this.field_390.method_299(256, var3 + 7, 310, 30, 1, 80, true, true);
         var3 += 35;
         ++var2;
      }

      while(var2 < 5) {
         this.field_390.method_294(256, var3, 410, 30);
         this.field_398[var2] = this.field_390.method_293(256, var3 - 7, var2 + 1 + ": question?", 1, true);
         this.field_399[var2] = this.field_390.method_299(256, var3 + 7, 310, 30, 1, 80, true, true);
         var3 += 35;
         ++var2;
      }

      this.field_390.method_311(this.field_399[0]);
      this.field_390.method_294(256, var3, 410, 30);
      this.field_390.method_293(256, var3 - 7, "If you know it, enter a previous password used on this account", 1, true);
      this.field_393 = this.field_390.method_299(256, var3 + 7, 310, 30, 1, 80, true, true);
      var3 += 35;
      this.field_390.method_294(151, var3, 200, 30);
      this.field_390.method_293(151, var3 - 7, "Choose a NEW password", 1, true);
      this.field_394 = this.field_390.method_299(146, var3 + 7, 200, 30, 1, 80, true, true);
      this.field_390.method_294(361, var3, 200, 30);
      this.field_390.method_293(361, var3 - 7, "Confirm new password", 1, true);
      this.field_395 = this.field_390.method_299(366, var3 + 7, 200, 30, 1, 80, true, true);
      var3 += 35;
      this.field_390.method_294(201, var3, 100, 30);
      this.field_390.method_293(201, var3, "Submit", 4, true);
      this.field_396 = this.field_390.method_301(201, var3, 100, 30);
      this.field_390.method_294(311, var3, 100, 30);
      this.field_390.method_293(311, var3, "Cancel", 4, true);
      this.field_397 = this.field_390.method_301(311, var3, 100, 30);
   }

   // $FF: renamed from: K () void
   public void method_69() {
      this.field_401 = new class_11(this.surface, 100);
      short var1 = 256;
      short var2 = 400;
      byte var3 = 25;
      this.field_402 = this.field_401.method_293(256, var3, "@yel@Please supply your contact details", 5, true);
      int var4 = var3 + 30;
      this.field_401.method_293(256, var4, "We need this information to provide an efficient customer support service ", 1, true);
      var4 += 15;
      this.field_401.method_293(256, var4, "and also to work out where to locate future RuneScape servers.", 1, true);
      var4 += 25;
      this.field_401.method_293(256, var4, "We know some people are concerned about entering their email address on", 1, true);
      var4 += 15;
      this.field_401.method_293(255, var4, "websites, and for this reason we take our users privacy very seriously.", 1, true);
      var4 += 15;
      this.field_401.method_293(256, var4, "For our full policy please click the relevant link below this game window", 1, true);
      var4 += 40;
      this.field_401.method_294(var1, var4, var2, 30);
      this.field_401.method_293(var1, var4 - 7, "Full name", 1, true);
      this.field_403 = this.field_401.method_299(var1, var4 + 7, var2, 30, 1, 80, false, true);
      var4 += 35;
      this.field_401.method_294(var1, var4, var2, 30);
      this.field_401.method_293(var1, var4 - 7, "Postcode/Zipcode", 1, true);
      this.field_404 = this.field_401.method_299(var1, var4 + 7, var2, 30, 1, 80, false, true);
      var4 += 35;
      this.field_401.method_294(var1, var4, var2, 30);
      this.field_401.method_293(var1, var4 - 7, "Country", 1, true);
      this.field_405 = this.field_401.method_299(var1, var4 + 7, var2, 30, 1, 80, false, true);
      var4 += 35;
      this.field_401.method_294(var1, var4, var2, 30);
      this.field_401.method_293(var1, var4 - 7, "Email address", 1, true);
      this.field_406 = this.field_401.method_299(var1, var4 + 7, var2, 30, 1, 80, false, true);
      var4 += 35;
      this.field_401.method_294(var1, var4, 100, 30);
      this.field_401.method_293(var1, var4, "Submit", 4, true);
      this.field_407 = this.field_401.method_301(var1, var4, 100, 30);
      this.field_401.method_311(this.field_403);
   }

   // $FF: renamed from: L () void
   public void method_70() {
      this.surface.field_747 = false;
      this.surface.method_223();
      this.field_401.method_278();
      this.surface.method_242(0, this.gameHeight, this.field_99 + 22);
      this.surface.draw(this.graphics, 0, 0);
   }

   // $FF: renamed from: M () void
   public void method_71() {
      this.field_401.method_275(super.mouseX, super.mouseY, super.lastMouseButtonDown, super.field_35);
      if(this.field_401.method_276(this.field_403)) {
         this.field_401.method_311(this.field_404);
      }

      if(this.field_401.method_276(this.field_404)) {
         this.field_401.method_311(this.field_405);
      }

      if(this.field_401.method_276(this.field_405)) {
         this.field_401.method_311(this.field_406);
      }

      if(this.field_401.method_276(this.field_406)) {
         this.field_401.method_311(this.field_403);
      }

      if(this.field_401.method_276(this.field_407)) {
         String var1 = this.field_401.method_308(this.field_403);
         String var2 = this.field_401.method_308(this.field_404);
         String var3 = this.field_401.method_308(this.field_405);
         String var4 = this.field_401.method_308(this.field_406);
         if(var1 == null || var1.length() == 0 || var2 == null || var2.length() == 0 || var3 == null || var3.length() == 0 || var4 == null || var4.length() == 0) {
            this.field_401.updateText(this.field_402, "@yel@Please fill in all the requested details");
            return;
         }

         super.clientStream.newPacket(253, 155);
         super.clientStream.putByte(var1.length());
         super.clientStream.putUnterminatedString(var1);
         super.clientStream.putByte(var2.length());
         super.clientStream.putUnterminatedString(var2);
         super.clientStream.putByte(var3.length());
         super.clientStream.putUnterminatedString(var3);
         super.clientStream.putByte(var4.length());
         super.clientStream.putUnterminatedString(var4);
         super.clientStream.flushPacket_();
         this.surface.method_223();
         this.field_400 = false;
      }

   }

   // $FF: renamed from: N () void
   public void method_72() {
      this.field_364 = new class_11(this.surface, 100);
      this.field_364.method_293(256, 10, "Please design Your Character", 4, true);
      short var1 = 140;
      byte var2 = 34;
      int var4 = var1 + 116;
      int var5 = var2 - 10;
      this.field_364.method_293(var4 - 55, var5 + 110, "Front", 3, true);
      this.field_364.method_293(var4, var5 + 110, "Side", 3, true);
      this.field_364.method_293(var4 + 55, var5 + 110, "Back", 3, true);
      byte var3 = 54;
      var5 += 145;
      this.field_364.method_295(var4 - var3, var5, 53, 41);
      this.field_364.method_293(var4 - var3, var5 - 8, "Head", 1, true);
      this.field_364.method_293(var4 - var3, var5 + 8, "Type", 1, true);
      this.field_364.method_296(var4 - var3 - 40, var5, class_11.field_802 + 7);
      this.field_365 = this.field_364.method_301(var4 - var3 - 40, var5, 20, 20);
      this.field_364.method_296(var4 - var3 + 40, var5, class_11.field_802 + 6);
      this.field_366 = this.field_364.method_301(var4 - var3 + 40, var5, 20, 20);
      this.field_364.method_295(var4 + var3, var5, 53, 41);
      this.field_364.method_293(var4 + var3, var5 - 8, "Hair", 1, true);
      this.field_364.method_293(var4 + var3, var5 + 8, "Color", 1, true);
      this.field_364.method_296(var4 + var3 - 40, var5, class_11.field_802 + 7);
      this.field_367 = this.field_364.method_301(var4 + var3 - 40, var5, 20, 20);
      this.field_364.method_296(var4 + var3 + 40, var5, class_11.field_802 + 6);
      this.field_368 = this.field_364.method_301(var4 + var3 + 40, var5, 20, 20);
      var5 += 50;
      this.field_364.method_295(var4 - var3, var5, 53, 41);
      this.field_364.method_293(var4 - var3, var5, "Gender", 1, true);
      this.field_364.method_296(var4 - var3 - 40, var5, class_11.field_802 + 7);
      this.field_369 = this.field_364.method_301(var4 - var3 - 40, var5, 20, 20);
      this.field_364.method_296(var4 - var3 + 40, var5, class_11.field_802 + 6);
      this.field_370 = this.field_364.method_301(var4 - var3 + 40, var5, 20, 20);
      this.field_364.method_295(var4 + var3, var5, 53, 41);
      this.field_364.method_293(var4 + var3, var5 - 8, "Top", 1, true);
      this.field_364.method_293(var4 + var3, var5 + 8, "Color", 1, true);
      this.field_364.method_296(var4 + var3 - 40, var5, class_11.field_802 + 7);
      this.field_371 = this.field_364.method_301(var4 + var3 - 40, var5, 20, 20);
      this.field_364.method_296(var4 + var3 + 40, var5, class_11.field_802 + 6);
      this.field_372 = this.field_364.method_301(var4 + var3 + 40, var5, 20, 20);
      var5 += 50;
      this.field_364.method_295(var4 - var3, var5, 53, 41);
      this.field_364.method_293(var4 - var3, var5 - 8, "Skin", 1, true);
      this.field_364.method_293(var4 - var3, var5 + 8, "Color", 1, true);
      this.field_364.method_296(var4 - var3 - 40, var5, class_11.field_802 + 7);
      this.field_373 = this.field_364.method_301(var4 - var3 - 40, var5, 20, 20);
      this.field_364.method_296(var4 - var3 + 40, var5, class_11.field_802 + 6);
      this.field_374 = this.field_364.method_301(var4 - var3 + 40, var5, 20, 20);
      this.field_364.method_295(var4 + var3, var5, 53, 41);
      this.field_364.method_293(var4 + var3, var5 - 8, "Bottom", 1, true);
      this.field_364.method_293(var4 + var3, var5 + 8, "Color", 1, true);
      this.field_364.method_296(var4 + var3 - 40, var5, class_11.field_802 + 7);
      this.field_375 = this.field_364.method_301(var4 + var3 - 40, var5, 20, 20);
      this.field_364.method_296(var4 + var3 + 40, var5, class_11.field_802 + 6);
      this.field_376 = this.field_364.method_301(var4 + var3 + 40, var5, 20, 20);
      var5 += 82;
      var5 -= 35;
      this.field_364.method_294(var4, var5, 200, 30);
      this.field_364.method_293(var4, var5, "Accept", 4, false);
      this.field_377 = this.field_364.method_301(var4, var5, 200, 30);
   }

   // $FF: renamed from: O () void
   public void handleAppearancePanelControls() {
      this.surface.field_747 = false;
      this.surface.method_223();
      this.field_364.method_278();
      short var1 = 140;
      byte var2 = 50;
      int var3 = var1 + 116;
      int var4 = var2 - 25;
      this.surface.method_246(var3 - 32 - 55, var4, 64, 102, class_4.field_513[this.field_429], this.field_435[this.field_432]);
      this.surface.method_258(var3 - 32 - 55, var4, 64, 102, class_4.field_513[this.field_428], this.field_435[this.field_431], this.field_437[this.field_433], 0, false);
      this.surface.method_258(var3 - 32 - 55, var4, 64, 102, class_4.field_513[this.field_427], this.field_436[this.field_430], this.field_437[this.field_433], 0, false);
      this.surface.method_246(var3 - 32, var4, 64, 102, class_4.field_513[this.field_429] + 6, this.field_435[this.field_432]);
      this.surface.method_258(var3 - 32, var4, 64, 102, class_4.field_513[this.field_428] + 6, this.field_435[this.field_431], this.field_437[this.field_433], 0, false);
      this.surface.method_258(var3 - 32, var4, 64, 102, class_4.field_513[this.field_427] + 6, this.field_436[this.field_430], this.field_437[this.field_433], 0, false);
      this.surface.method_246(var3 - 32 + 55, var4, 64, 102, class_4.field_513[this.field_429] + 12, this.field_435[this.field_432]);
      this.surface.method_258(var3 - 32 + 55, var4, 64, 102, class_4.field_513[this.field_428] + 12, this.field_435[this.field_431], this.field_437[this.field_433], 0, false);
      this.surface.method_258(var3 - 32 + 55, var4, 64, 102, class_4.field_513[this.field_427] + 12, this.field_436[this.field_430], this.field_437[this.field_433], 0, false);
      this.surface.method_242(0, this.gameHeight, this.field_99 + 22);
      this.surface.draw(this.graphics, 0, 0);
   }

   // $FF: renamed from: P () void
   public void method_74() {
      int var1 = class_4.field_563;
      this.field_364.method_275(super.mouseX, super.mouseY, super.lastMouseButtonDown, super.field_35);
      if(this.field_364.method_276(this.field_365)) {
         do {
            do {
               this.field_427 = (this.field_427 - 1 + class_4.field_507) % class_4.field_507;
            } while((class_4.field_510[this.field_427] & 3) != 1);
         } while((class_4.field_510[this.field_427] & 4 * this.field_434) == 0);
      }

      if(this.field_364.method_276(this.field_366)) {
         do {
            do {
               this.field_427 = (this.field_427 + 1) % class_4.field_507;
            } while((class_4.field_510[this.field_427] & 3) != 1);
         } while((class_4.field_510[this.field_427] & 4 * this.field_434) == 0);
      }

      if(this.field_364.method_276(this.field_367)) {
         this.field_430 = (this.field_430 - 1 + this.field_436.length) % this.field_436.length;
      }

      if(this.field_364.method_276(this.field_368)) {
         this.field_430 = (this.field_430 + 1) % this.field_436.length;
      }

      if(this.field_364.method_276(this.field_369) || this.field_364.method_276(this.field_370)) {
         this.field_434 = 3 - this.field_434;
         if(var1 != 0) {
            this.field_427 = (this.field_427 + 1) % class_4.field_507;
         }

         while((class_4.field_510[this.field_427] & 3) != 1 || (class_4.field_510[this.field_427] & 4 * this.field_434) == 0) {
            this.field_427 = (this.field_427 + 1) % class_4.field_507;
         }

         if(var1 != 0) {
            this.field_428 = (this.field_428 + 1) % class_4.field_507;
         }

         while((class_4.field_510[this.field_428] & 3) != 2 || (class_4.field_510[this.field_428] & 4 * this.field_434) == 0) {
            this.field_428 = (this.field_428 + 1) % class_4.field_507;
         }
      }

      if(this.field_364.method_276(this.field_371)) {
         this.field_431 = (this.field_431 - 1 + this.field_435.length) % this.field_435.length;
      }

      if(this.field_364.method_276(this.field_372)) {
         this.field_431 = (this.field_431 + 1) % this.field_435.length;
      }

      if(this.field_364.method_276(this.field_373)) {
         this.field_433 = (this.field_433 - 1 + this.field_437.length) % this.field_437.length;
      }

      if(this.field_364.method_276(this.field_374)) {
         this.field_433 = (this.field_433 + 1) % this.field_437.length;
      }

      if(this.field_364.method_276(this.field_375)) {
         this.field_432 = (this.field_432 - 1 + this.field_435.length) % this.field_435.length;
      }

      if(this.field_364.method_276(this.field_376)) {
         this.field_432 = (this.field_432 + 1) % this.field_435.length;
      }

      if(this.field_364.method_276(this.field_377)) {
         super.clientStream.newPacket(236, 65);
         super.clientStream.putByte(this.field_434);
         super.clientStream.putByte(this.field_427);
         super.clientStream.putByte(this.field_428);
         super.clientStream.putByte(this.field_429);
         super.clientStream.putByte(this.field_430);
         super.clientStream.putByte(this.field_431);
         super.clientStream.putByte(this.field_432);
         super.clientStream.putByte(this.field_433);
         super.clientStream.flushPacket_();
         this.surface.method_223();
         this.showAppearanceChange = false;
      }

   }

   // $FF: renamed from: Q () void
   public void method_75() {
      class_11 var10001;
      byte var1;
      label11: {
         this.field_342 = new class_11(this.surface, 50);;
         var1 = 40;
         if(!this.field_69) {
            this.field_342.method_293(256, 200 + var1, "Click on an option", 5, true);
            this.field_342.method_294(156, 240 + var1, 120, 35);
            this.field_342.method_294(356, 240 + var1, 120, 35);
            this.field_342.method_293(156, 240 + var1, "New User", 5, false);
            this.field_342.method_293(356, 240 + var1, "Existing User", 5, false);
            this.field_343 = this.field_342.method_301(156, 240 + var1, 120, 35);
            this.field_344 = this.field_342.method_301(356, 240 + var1, 120, 35);
            if(class_4.field_563 == 0) {
               break label11;
            }
         }

         this.field_342.method_293(256, 200 + var1, "Welcome to RuneScape", 4, true);
         this.field_342.method_293(256, 215 + var1, "You need a member account to use this server", 4, true);
         this.field_342.method_294(256, 250 + var1, 200, 35);
         this.field_342.method_293(256, 250 + var1, "Click here to login", 5, false);
         this.field_344 = this.field_342.method_301(256, 250 + var1, 200, 35);
      }

      this.field_345 = new class_11(this.surface, 50);
      var1 = 70;
      this.field_346 = this.field_345.method_293(256, var1 + 8, "To create an account please enter all the requested details", 4, true);
      int var2 = var1 + 25;
      this.field_345.method_294(256, var2 + 17, 250, 34);
      this.field_345.method_293(256, var2 + 8, "Choose a Username", 4, false);
      this.field_349 = this.field_345.method_299(256, var2 + 25, 200, 40, 4, 12, false, false);
      this.field_345.method_311(this.field_349);
      var2 += 40;
      this.field_345.method_294(141, var2 + 17, 220, 34);
      this.field_345.method_293(141, var2 + 8, "Choose a Password", 4, false);
      this.field_350 = this.field_345.method_299(141, var2 + 25, 220, 40, 4, 20, true, false);
      this.field_345.method_294(371, var2 + 17, 220, 34);
      this.field_345.method_293(371, var2 + 8, "Confirm Password", 4, false);
      this.field_351 = this.field_345.method_299(371, var2 + 25, 220, 40, 4, 20, true, false);
      var2 += 40;
      var2 += 20;
      this.field_352 = this.field_345.method_302(60, var2, 14);
      this.field_345.method_292(75, var2, "I have read and agree to your terms and conditions", 4, true);
      var2 += 15;
      this.field_345.method_293(256, var2, "(to view these click the relevant link below this game window)", 4, true);
      var2 += 20;
      this.field_345.method_294(156, var2 + 17, 150, 34);
      this.field_345.method_293(156, var2 + 17, "Submit", 5, false);
      this.field_348 = this.field_345.method_301(156, var2 + 17, 150, 34);
      this.field_345.method_294(356, var2 + 17, 150, 34);
      this.field_345.method_293(356, var2 + 17, "Cancel", 5, false);
      this.field_347 = this.field_345.method_301(356, var2 + 17, 150, 34);
      this.field_353 = new class_11(this.surface, 50);
      short var3 = 230;
      this.field_354 = this.field_353.method_293(256, var3 - 10, "Please enter your username and password", 4, true);
      var2 = var3 + 28;
      this.field_353.method_294(140, var2, 200, 40);
      this.field_353.method_293(140, var2 - 10, "Username:", 4, false);
      this.field_355 = this.field_353.method_299(140, var2 + 10, 200, 40, 4, 12, false, false);
      var2 += 47;
      this.field_353.method_294(190, var2, 200, 40);
      this.field_353.method_293(190, var2 - 10, "Password:", 4, false);
      this.field_356 = this.field_353.method_299(190, var2 + 10, 200, 40, 4, 20, true, false);
      var2 -= 55;
      this.field_353.method_294(410, var2, 120, 25);
      this.field_353.method_293(410, var2, "Ok", 4, false);
      this.field_357 = this.field_353.method_301(410, var2, 120, 25);
      var2 += 30;
      this.field_353.method_294(410, var2, 120, 25);
      this.field_353.method_293(410, var2, "Cancel", 4, false);
      this.field_358 = this.field_353.method_301(410, var2, 120, 25);
      var2 += 30;
      this.field_353.method_294(410, var2, 160, 25);
      this.field_353.method_293(410, var2, "I\'ve lost my password", 4, false);
      this.field_359 = this.field_353.method_301(410, var2, 160, 25);
      this.field_353.method_311(this.field_355);
   }

   // $FF: renamed from: R () void
   public void method_76() {
      int var2 = class_4.field_563;
      this.field_326 = false;
      this.surface.field_747 = false;
      this.surface.method_223();
      if(this.field_341 == 0 || this.field_341 == 2) {
         label51: {
            int var1 = this.field_76 * 2 % 3072;
            if(var1 < 1024) {
               this.surface.method_242(0, 10, this.field_105);
               if(var1 <= 768) {
                  break label51;
               }

               this.surface.method_244(0, 10, this.field_105 + 1, var1 - 768);
               if(var2 == 0) {
                  break label51;
               }
            }

            if(var1 < 2048) {
               this.surface.method_242(0, 10, this.field_105 + 1);
               if(var1 <= 1792) {
                  break label51;
               }

               this.surface.method_244(0, 10, this.field_99 + 10, var1 - 1792);
               if(var2 == 0) {
                  break label51;
               }
            }

            this.surface.method_242(0, 10, this.field_99 + 10);
            if(var1 > 2816) {
               this.surface.method_244(0, 10, this.field_105, var1 - 2816);
            }
         }
      }

      if(this.field_341 == 0) {
         this.field_342.method_278();
      }

      if(this.field_341 == 1) {
         this.field_345.method_278();
      }

      if(this.field_341 == 2) {
         this.field_353.method_278();
      }

      if(this.field_341 == 3) {
         this.field_390.method_278();
      }

      this.surface.method_242(0, this.gameHeight, this.field_99 + 22);
      this.surface.draw(this.graphics, 0, 0);
   }

   // $FF: renamed from: S () void
   public void method_77() {
      int var15 = class_4.field_563;
      byte var1 = 0;
      byte var2 = 50;
      byte var3 = 50;
      this.world.method_348(var2 * 48 + 23, var3 * 48 + 23, var1);
      this.world.method_352(this.field_169);
      short var4 = 9728;
      short var5 = 6400;
      short var6 = 1100;
      short var7 = 888;
      this.scene.field_647 = 4100;
      this.scene.field_648 = 4100;
      this.scene.field_649 = 1;
      this.scene.field_650 = 4000;
      this.scene.method_199(var4, -this.world.getElevation(var4, var5), var5, 912, var7, 0, var6 * 2);
      this.scene.method_187();
      this.surface.fade2black();
      this.surface.fade2black();
      this.surface.method_227(0, 0, 512, 6, 0);
      int var8 = 6;
      if(var15 != 0) {
         this.surface.method_233(0, var8, 0, var8, 512, 8);
         --var8;
      }

      while(var8 >= 1) {
         this.surface.method_233(0, var8, 0, var8, 512, 8);
         --var8;
      }

      this.surface.method_227(0, 194, 512, 20, 0);
      int var9 = 6;
      if(var15 != 0 || var9 >= 1) {
         do {
            this.surface.method_233(0, var9, 0, 194 - var9, 512, 8);
            --var9;
         } while(var9 >= 1);
      }

      this.surface.method_242(15, 15, this.field_99 + 10);
      this.surface.method_241(this.field_105, 0, 0, 512, 200);
      this.surface.method_238(this.field_105);
      var4 = 9216;
      var5 = 9216;
      var6 = 1100;
      var7 = 888;
      this.scene.field_647 = 4100;
      this.scene.field_648 = 4100;
      this.scene.field_649 = 1;
      this.scene.field_650 = 4000;
      this.scene.method_199(var4, -this.world.getElevation(var4, var5), var5, 912, var7, 0, var6 * 2);
      this.scene.method_187();
      this.surface.fade2black();
      this.surface.fade2black();
      this.surface.method_227(0, 0, 512, 6, 0);
      int var10 = 6;
      if(var15 != 0) {
         this.surface.method_233(0, var10, 0, var10, 512, 8);
         --var10;
      }

      while(var10 >= 1) {
         this.surface.method_233(0, var10, 0, var10, 512, 8);
         --var10;
      }

      this.surface.method_227(0, 194, 512, 20, 0);
      int var11 = 6;
      if(var15 != 0 || var11 >= 1) {
         do {
            this.surface.method_233(0, var11, 0, 194 - var11, 512, 8);
            --var11;
         } while(var11 >= 1);
      }

      this.surface.method_242(15, 15, this.field_99 + 10);
      this.surface.method_241(this.field_105 + 1, 0, 0, 512, 200);
      this.surface.method_238(this.field_105 + 1);
      int var12 = 0;
      if(var15 != 0) {
         this.scene.freeModel(this.world.gameModelArrayArray2[0][var12]);
         this.scene.freeModel(this.world.gameModelArrayArray1[1][var12]);
         this.scene.freeModel(this.world.gameModelArrayArray2[1][var12]);
         this.scene.freeModel(this.world.gameModelArrayArray1[2][var12]);
         this.scene.freeModel(this.world.gameModelArrayArray2[2][var12]);
         ++var12;
      }

      while(var12 < 64) {
         this.scene.freeModel(this.world.gameModelArrayArray2[0][var12]);
         this.scene.freeModel(this.world.gameModelArrayArray1[1][var12]);
         this.scene.freeModel(this.world.gameModelArrayArray2[1][var12]);
         this.scene.freeModel(this.world.gameModelArrayArray1[2][var12]);
         this.scene.freeModel(this.world.gameModelArrayArray2[2][var12]);
         ++var12;
      }

      var4 = 11136;
      var5 = 10368;
      var6 = 500;
      var7 = 376;
      this.scene.field_647 = 4100;
      this.scene.field_648 = 4100;
      this.scene.field_649 = 1;
      this.scene.field_650 = 4000;
      this.scene.method_199(var4, -this.world.getElevation(var4, var5), var5, 912, var7, 0, var6 * 2);
      this.scene.method_187();
      this.surface.fade2black();
      this.surface.fade2black();
      this.surface.method_227(0, 0, 512, 6, 0);
      int var13 = 6;
      if(var15 != 0 || var13 >= 1) {
         do {
            this.surface.method_233(0, var13, 0, var13, 512, 8);
            --var13;
         } while(var13 >= 1);
      }

      this.surface.method_227(0, 194, 512, 20, 0);
      int var14 = 6;
      if(var15 != 0) {
         this.surface.method_233(0, var14, 0, 194, 512, 8);
         --var14;
      }

      while(var14 >= 1) {
         this.surface.method_233(0, var14, 0, 194, 512, 8);
         --var14;
      }

      this.surface.method_242(15, 15, this.field_99 + 10);
      this.surface.method_241(this.field_99 + 10, 0, 0, 512, 200);
      this.surface.method_238(this.field_99 + 10);
   }

   // $FF: renamed from: T () void
   public void method_78() {
      int var8 = class_4.field_563;
      if(super.field_67 > 0) {
         --super.field_67;
      }

      if(this.field_341 == 0) {
         this.field_342.method_275(super.mouseX, super.mouseY, super.lastMouseButtonDown, super.field_35);
         if(this.field_342.method_276(this.field_343)) {
            this.field_341 = 1;
            this.field_345.updateText(this.field_349, "");
            this.field_345.updateText(this.field_350, "");
            this.field_345.updateText(this.field_351, "");
            this.field_345.method_311(this.field_349);
            this.field_345.method_314(this.field_352, 0);
            this.field_345.updateText(this.field_346, "To create an account please enter all the requested details");
         }

         if(this.field_342.method_276(this.field_344)) {
            this.field_341 = 2;
            this.field_353.updateText(this.field_354, "Please enter your username and password");
            this.field_353.updateText(this.field_355, "");
            this.field_353.updateText(this.field_356, "");
            this.field_353.method_311(this.field_355);
            return;
         }
      } else {
         String var1;
         String var2;
         if(this.field_341 == 1) {
            this.field_345.method_275(super.mouseX, super.mouseY, super.lastMouseButtonDown, super.field_35);
            if(this.field_345.method_276(this.field_349)) {
               this.field_345.method_311(this.field_350);
            }

            if(this.field_345.method_276(this.field_350)) {
               this.field_345.method_311(this.field_351);
            }

            if(this.field_345.method_276(this.field_351)) {
               this.field_345.method_311(this.field_349);
            }

            if(this.field_345.method_276(this.field_347)) {
               this.field_341 = 0;
            }

            if(this.field_345.method_276(this.field_348)) {
               if(this.field_345.method_308(this.field_349) != null && this.field_345.method_308(this.field_349).length() != 0 && this.field_345.method_308(this.field_350) != null && this.field_345.method_308(this.field_350).length() != 0) {
                  if(!this.field_345.method_308(this.field_350).equalsIgnoreCase(this.field_345.method_308(this.field_351))) {
                     this.field_345.updateText(this.field_346, "@yel@The two passwords entered are not the same as each other!");
                     return;
                  }

                  if(this.field_345.method_308(this.field_350).length() < 5) {
                     this.field_345.updateText(this.field_346, "@yel@Your password must be at least 5 letters long");
                     return;
                  }

                  if(this.field_345.method_308(this.field_350).trim().equalsIgnoreCase(this.field_345.method_308(this.field_349).trim())) {
                     this.field_345.updateText(this.field_346, "@yel@Your password must not be the same as your username!");
                     return;
                  }

                  if(this.field_345.method_312(this.field_352) == 0) {
                     this.field_345.updateText(this.field_346, "@yel@You must agree to the terms+conditions to continue");
                     return;
                  }

                  this.field_345.updateText(this.field_346, "Please wait... Creating new account");
                  this.method_76();
                  this.method_10();
                  var1 = this.field_345.method_308(this.field_349);
                  var2 = this.field_345.method_308(this.field_350);
                  this.method_30(var1, var2);
                  return;
               }

               this.field_345.updateText(this.field_346, "@yel@Please fill in ALL requested information to continue!");
               return;
            }
         } else {
            int var3;
            String var5;
            ClientStream var10001;
            if(this.field_341 == 2) {
               this.field_353.method_275(super.mouseX, super.mouseY, super.lastMouseButtonDown, super.field_35);
               if(this.field_353.method_276(this.field_358)) {
                  this.field_341 = 0;
               }

               if(this.field_353.method_276(this.field_355)) {
                  this.field_353.method_311(this.field_356);
               }

               if(this.field_353.method_276(this.field_356) || this.field_353.method_276(this.field_357)) {
                  this.username = this.field_353.method_308(this.field_355);
                  this.password = this.field_353.method_308(this.field_356);
                  this.login(this.username, this.password, false);
               }

               if(this.field_353.method_276(this.field_359)) {
                  this.username = this.field_353.method_308(this.field_355);
                  this.username = class_21.method_453(this.username, 20);
                  if(this.username.trim().length() == 0) {
                     this.method_43("You must enter your username to recover your password", "");
                     return;
                  }

                  this.method_43(GameApplet.loginResponses[6], GameApplet.loginResponses[7]);

                  try {
                     super.clientStream = new ClientStream(this.connect(super.address, super.port), this);
                     super.clientStream.field_591 = GameApplet.field_46;
                     super.clientStream.readInt();
                     super.clientStream.newPacket(4, 848);
                     super.clientStream.putLong(class_21.hashUsername(this.username));
                     super.clientStream.flushPacket();
                     super.clientStream.read();
                     super.clientStream.read();
                     int var11 = super.clientStream.read();
                     var11 = super.clientStream.method_161(var11, GameApplet.field_68);
                     System.out.println("Getpq response: " + var11); // authentic System.out.println
                     if(var11 == 0) {
                        this.method_43("Sorry, the recovery questions for this user have not been set", "");
                        return;
                     }

                     int var12 = 0;
                     byte[] var4;
                     if(var8 != 0) {
                        var3 = super.clientStream.read();
                        var4 = new byte[5000];
                        super.clientStream.method_151(var3, var4);
                        var5 = new String(var4, 0, var3);
                        this.field_390.updateText(this.field_398[var12], var5);
                        ++var12;
                     }

                     while(var12 < 5) {
                        var3 = super.clientStream.read();
                        var4 = new byte[5000];
                        super.clientStream.method_151(var3, var4);
                        var5 = new String(var4, 0, var3);
                        this.field_390.updateText(this.field_398[var12], var5);
                        ++var12;
                     }

                     if(this.field_389) {
                        this.method_43("Sorry, you have already attempted 1 recovery, try again later", "");
                        return;
                     }

                     this.field_341 = 3;
                     this.field_390.updateText(this.field_391, "@yel@To prove this is your account please provide the answers to");
                     this.field_390.updateText(this.field_392, "@yel@your security questions. You will then be able to reset your password");
                     var3 = 0;
                     if(var8 != 0) {
                        this.field_390.updateText(this.field_399[var3], "");
                        ++var3;
                     }

                     while(var3 < 5) {
                        this.field_390.updateText(this.field_399[var3], "");
                        ++var3;
                     }

                     this.field_390.updateText(this.field_393, "");
                     this.field_390.updateText(this.field_394, "");
                     this.field_390.updateText(this.field_395, "");
                     return;
                  } catch (Exception var9) {
                     this.method_43(GameApplet.loginResponses[12], GameApplet.loginResponses[13]);
                     return;
                  }
               }
            } else if(this.field_341 == 3) {
               this.field_390.method_275(super.mouseX, super.mouseY, super.lastMouseButtonDown, super.field_35);
               if(this.field_390.method_276(this.field_396)) {
                  var1 = this.field_390.method_308(this.field_394);
                  var2 = this.field_390.method_308(this.field_395);
                  if(!var1.equalsIgnoreCase(var2)) {
                     this.method_43("@yel@The two new passwords entered are not the same as each other!", "");
                     return;
                  }

                  if(var1.length() < 5) {
                     this.method_43("@yel@Your new password must be at least 5 letters long", "");
                     return;
                  }

                  this.method_43(GameApplet.loginResponses[6], GameApplet.loginResponses[7]);

                  try {
                     super.clientStream = new ClientStream(this.connect(super.address, super.port), this);
                     super.clientStream.field_591 = GameApplet.field_46;
                     var3 = super.clientStream.readInt();
                     String var13 = class_21.method_453(this.field_390.method_308(this.field_393), 20);
                     var5 = class_21.method_453(this.field_390.method_308(this.field_394), 20);
                     super.clientStream.newPacket(8, 121);
                     super.clientStream.putLong(class_21.hashUsername(this.username));
                     super.clientStream.putInt(this.getRandomDat());
                     super.clientStream.putPassword(var13 + var5, var3, this.rsaExponent, this.rsaModulus);
                     int var6 = 0;
                     String var7;
                     if(var8 != 0) {
                        var7 = this.field_390.method_308(this.field_399[var6]);
                        var7 = class_21.method_454(var7, 50);
                        super.clientStream.putByte(var7.length());
                        super.clientStream.putPassword(var7, var3, this.rsaExponent, this.rsaModulus);
                        ++var6;
                     }

                     while(var6 < 5) {
                        var7 = this.field_390.method_308(this.field_399[var6]);
                        var7 = class_21.method_454(var7, 50);
                        super.clientStream.putByte(var7.length());
                        super.clientStream.putPassword(var7, var3, this.rsaExponent, this.rsaModulus);
                        ++var6;
                     }

                     super.clientStream.flushPacket();
                     super.clientStream.read();
                     int var14 = super.clientStream.read();
                     var14 = super.clientStream.method_161(var14, GameApplet.field_68);
                     System.out.println("Recover response: " + var14); // authentic System.out.println
                     if(var14 == 0) {
                        this.field_341 = 2;
                        this.method_43("Sorry, recovery failed. You may try again in 1 hour", "");
                        this.field_389 = true;
                        return;
                     }

                     if(var14 == 1) {
                        this.field_341 = 2;
                        this.method_43("Your pass has been reset. You may now use the new pass to login", "");
                        return;
                     }

                     this.field_341 = 2;
                     this.method_43("Recovery failed! Attempts exceeded?", "");
                     return;
                  } catch (Exception var10) {
                     this.method_43(GameApplet.loginResponses[12], GameApplet.loginResponses[13]);
                  }
               }

               if(this.field_390.method_276(this.field_397)) {
                  this.field_341 = 0;
               }
            }
         }
      }

   }

   // $FF: renamed from: d (java.lang.String, java.lang.String) void
   public void method_43(String var1, String var2) {
      if(this.field_341 == 1) {
         this.field_345.updateText(this.field_346, var1 + " " + var2);
      }

      if(this.field_341 == 2) {
         this.field_353.updateText(this.field_354, var1 + " " + var2);
      }

      if(this.field_341 == 3) {
         this.field_390.updateText(this.field_391, var1);
         this.field_390.updateText(this.field_392, var2);
      }

      this.field_361 = var2;
      this.method_76();
      this.method_10();
   }

   // $FF: renamed from: r () void
   public void method_47() {
      this.logoutTimeout = 0;
      this.displayMessage("@cya@Sorry, you can\'t logout at the moment", 3);
   }

   // $FF: renamed from: l () void
   public void method_28() {
      if(this.logoutTimeout != 0) {
         this.method_46();
      } else {
         super.method_28();
      }
   }

   // $FF: renamed from: q () void
   public void method_46() {
      this.field_341 = 0;
      this.loggedIn = 0;
      this.logoutTimeout = 0;
   }

   // $FF: renamed from: p () void
   public void method_45() {
      int var8 = class_4.field_563;
      this.field_319 = 0;
      this.logoutTimeout = 0;
      this.field_341 = 0;
      this.loggedIn = 1;
      this.method_62();
      this.surface.method_223();
      this.surface.draw(this.graphics, 0, 0);
      int var1 = 0;
      if(var8 != 0) {
         this.scene.freeModel(this.field_164[var1]);
         this.world.method_327(this.field_165[var1], this.field_166[var1], this.field_167[var1]);
         ++var1;
      }

      while(var1 < this.field_163) {
         this.scene.freeModel(this.field_164[var1]);
         this.world.method_327(this.field_165[var1], this.field_166[var1], this.field_167[var1]);
         ++var1;
      }

      int var2 = 0;
      if(var8 != 0 || var2 < this.field_172) {
         do {
            this.scene.freeModel(this.field_173[var2]);
            this.world.method_325(this.field_174[var2], this.field_175[var2], this.field_176[var2], this.field_177[var2]);
            ++var2;
         } while(var2 < this.field_172);
      }

      this.field_163 = 0;
      this.field_172 = 0;
      this.psize = 0;
      this.playerCount = 0;
      int var3 = 0;
      if(var8 != 0) {
         this.field_141[var3] = null;
         ++var3;
      }

      while(var3 < this.field_136) {
         this.field_141[var3] = null;
         ++var3;
      }

      int var4 = 0;
      if(var8 != 0 || var4 < this.field_137) {
         do {
            this.players[var4] = null;
            ++var4;
         } while(var4 < this.field_137);
      }

      this.field_150 = 0;
      int var5 = 0;
      if(var8 != 0) {
         this.field_152[var5] = null;
         ++var5;
      }

      while(var5 < this.field_148) {
         this.field_152[var5] = null;
         ++var5;
      }

      int var6 = 0;
      if(var8 != 0 || var6 < this.field_149) {
         do {
            this.field_153[var6] = null;
            ++var6;
         } while(var6 < this.field_149);
      }

      int var7 = 0;
      if(var8 != 0) {
         this.field_215[var7] = false;
         ++var7;
      }

      while(var7 < 50) {
         this.field_215[var7] = false;
         ++var7;
      }

      this.mouseButtonClick = 0;
      super.lastMouseButtonDown = 0;
      super.field_35 = 0;
      this.field_297 = false;
      this.field_305 = false;
      this.isSleeping = false;
   }

   // $FF: renamed from: s () void
   public void method_48() {
      String username = this.field_345.method_308(this.field_349);
      String password = this.field_345.method_308(this.field_350);
      this.field_341 = 2;
      this.field_353.updateText(this.field_354, "Please enter your username and password");
      this.field_353.updateText(this.field_355, username);
      this.field_353.updateText(this.field_356, password);
      this.method_76();
      this.method_10();
      this.login(username, password, false);
   }

   // $FF: renamed from: U () void
   public void handleGameInput() {
      int var9 = class_4.field_563;
      this.checkConnection();
      if(this.logoutTimeout > 0) {
         --this.logoutTimeout;
      }

      if(super.lastMouseAction > 4500 && this.combatTimeout == 0 && this.logoutTimeout == 0) {
         super.lastMouseAction -= 500;
         this.sendLogout();
      } else {
         if(this.localPlayer.animationCurrent == 8 || this.localPlayer.animationCurrent == 9) {
            this.combatTimeout = 500;
         }

         if(this.combatTimeout > 0) {
            --this.combatTimeout;
         }

         if(this.showAppearanceChange) {
            this.method_74();
         } else if(this.field_378) {
            this.method_66();
         } else if(this.field_400) {
            this.method_71();
         } else {
            int var1 = 0;
            class_7 mob;
            int var3;
            byte var4;
            int var5;
            int var6;
            int var7;
            if(var9 != 0) {
               label726: {
                  mob = this.players[var1];
                  var3 = (mob.waypointCurrent + 1) % 10;
                  if(mob.movingStep != var3) {
                     label738: {
                        var4 = -1;
                        var5 = mob.movingStep;
                        if(var5 < var3) {
                           var6 = var3 - var5;
                           if(var9 == 0) {
                              break label738;
                           }
                        }

                        var6 = 10 + var3 - var5;
                     }

                     var7 = 4;
                     if(var6 > 2) {
                        var7 = (var6 - 1) * 4;
                     }

                     label955: {
                        if(mob.waypointsX[var5] - mob.currentX > this.magicLoc * 3 || mob.waypointsY[var5] - mob.currentY > this.magicLoc * 3 || mob.waypointsX[var5] - mob.currentX < -this.magicLoc * 3 || mob.waypointsY[var5] - mob.currentY < -this.magicLoc * 3 || var6 > 8) {
                           mob.currentX = mob.waypointsX[var5];
                           mob.currentY = mob.waypointsY[var5];
                           if(var9 == 0) {
                              break label955;
                           }
                        }

                        label774: {
                           if(mob.currentX < mob.waypointsX[var5]) {
                              mob.currentX += var7;
                              ++mob.field_613;
                              var4 = 2;
                              if(var9 == 0) {
                                 break label774;
                              }
                           }

                           if(mob.currentX > mob.waypointsX[var5]) {
                              mob.currentX -= var7;
                              ++mob.field_613;
                              var4 = 6;
                           }
                        }

                        if(mob.currentX - mob.waypointsX[var5] < var7 && mob.currentX - mob.waypointsX[var5] > -var7) {
                           mob.currentX = mob.waypointsX[var5];
                        }

                        label796: {
                           if(mob.currentY < mob.waypointsY[var5]) {
                              mob.currentY += var7;
                              ++mob.field_613;
                              if(var4 == -1) {
                                 var4 = 4;
                                 if(var9 == 0) {
                                    break label796;
                                 }
                              }

                              if(var4 == 2) {
                                 var4 = 3;
                                 if(var9 == 0) {
                                    break label796;
                                 }
                              }

                              var4 = 5;
                              if(var9 == 0) {
                                 break label796;
                              }
                           }

                           if(mob.currentY > mob.waypointsY[var5]) {
                              label915: {
                                 mob.currentY -= var7;
                                 ++mob.field_613;
                                 if(var4 == -1) {
                                    var4 = 0;
                                    if(var9 == 0) {
                                       break label915;
                                    }
                                 }

                                 if(var4 == 2) {
                                    var4 = 1;
                                    if(var9 == 0) {
                                       break label915;
                                    }
                                 }

                                 var4 = 7;
                              }
                           }
                        }

                        if(mob.currentY - mob.waypointsY[var5] < var7 && mob.currentY - mob.waypointsY[var5] > -var7) {
                           mob.currentY = mob.waypointsY[var5];
                        }
                     }

                     if(var4 != -1) {
                        mob.animationCurrent = var4;
                     }

                     if(mob.currentX != mob.waypointsX[var5] || mob.currentY != mob.waypointsY[var5]) {
                        break label726;
                     }

                     mob.movingStep = (var5 + 1) % 10;
                     if(var9 == 0) {
                        break label726;
                     }
                  }

                  mob.animationCurrent = mob.animationNext;
               }

               if(mob.messageTimer > 0) {
                  --mob.messageTimer;
               }

               if(mob.bubbleTimer > 0) {
                  --mob.bubbleTimer;
               }

               if(mob.combatTimeout > 0) {
                  --mob.combatTimeout;
               }

               if(this.deathScreenTimeout > 0) {
                  --this.deathScreenTimeout;
                  if(this.deathScreenTimeout == 0) {
                     this.displayMessage("You have been granted another life. Be more careful this time!", 3);
                  }

                  if(this.deathScreenTimeout == 0) {
                     this.displayMessage("You retain your skills. Your objects land where you died", 3);
                  }
               }

               ++var1;
            }

            for(; var1 < this.playerCount; ++var1) {
               label721: {
                  mob = this.players[var1];
                  var3 = (mob.waypointCurrent + 1) % 10;
                  if(mob.movingStep != var3) {
                     label672: {
                        var4 = -1;
                        var5 = mob.movingStep;
                        if(var5 < var3) {
                           var6 = var3 - var5;
                           if(var9 == 0) {
                              break label672;
                           }
                        }

                        var6 = 10 + var3 - var5;
                     }

                     var7 = 4;
                     if(var6 > 2) {
                        var7 = (var6 - 1) * 4;
                     }

                     label957: {
                        if(mob.waypointsX[var5] - mob.currentX > this.magicLoc * 3 || mob.waypointsY[var5] - mob.currentY > this.magicLoc * 3 || mob.waypointsX[var5] - mob.currentX < -this.magicLoc * 3 || mob.waypointsY[var5] - mob.currentY < -this.magicLoc * 3 || var6 > 8) {
                           mob.currentX = mob.waypointsX[var5];
                           mob.currentY = mob.waypointsY[var5];
                           if(var9 == 0) {
                              break label957;
                           }
                        }

                        label700: {
                           if(mob.currentX < mob.waypointsX[var5]) {
                              mob.currentX += var7;
                              ++mob.field_613;
                              var4 = 2;
                              if(var9 == 0) {
                                 break label700;
                              }
                           }

                           if(mob.currentX > mob.waypointsX[var5]) {
                              mob.currentX -= var7;
                              ++mob.field_613;
                              var4 = 6;
                           }
                        }

                        if(mob.currentX - mob.waypointsX[var5] < var7 && mob.currentX - mob.waypointsX[var5] > -var7) {
                           mob.currentX = mob.waypointsX[var5];
                        }

                        label694: {
                           if(mob.currentY < mob.waypointsY[var5]) {
                              mob.currentY += var7;
                              ++mob.field_613;
                              if(var4 == -1) {
                                 var4 = 4;
                                 if(var9 == 0) {
                                    break label694;
                                 }
                              }

                              if(var4 == 2) {
                                 var4 = 3;
                                 if(var9 == 0) {
                                    break label694;
                                 }
                              }

                              var4 = 5;
                              if(var9 == 0) {
                                 break label694;
                              }
                           }

                           if(mob.currentY > mob.waypointsY[var5]) {
                              label943: {
                                 mob.currentY -= var7;
                                 ++mob.field_613;
                                 if(var4 == -1) {
                                    var4 = 0;
                                    if(var9 == 0) {
                                       break label943;
                                    }
                                 }

                                 if(var4 == 2) {
                                    var4 = 1;
                                    if(var9 == 0) {
                                       break label943;
                                    }
                                 }

                                 var4 = 7;
                              }
                           }
                        }

                        if(mob.currentY - mob.waypointsY[var5] < var7 && mob.currentY - mob.waypointsY[var5] > -var7) {
                           mob.currentY = mob.waypointsY[var5];
                        }
                     }

                     if(var4 != -1) {
                        mob.animationCurrent = var4;
                     }

                     if(mob.currentX != mob.waypointsX[var5] || mob.currentY != mob.waypointsY[var5]) {
                        break label721;
                     }

                     mob.movingStep = (var5 + 1) % 10;
                     if(var9 == 0) {
                        break label721;
                     }
                  }

                  mob.animationCurrent = mob.animationNext;
               }

               if(mob.messageTimer > 0) {
                  --mob.messageTimer;
               }

               if(mob.bubbleTimer > 0) {
                  --mob.bubbleTimer;
               }

               if(mob.combatTimeout > 0) {
                  --mob.combatTimeout;
               }

               if(this.deathScreenTimeout > 0) {
                  --this.deathScreenTimeout;
                  if(this.deathScreenTimeout == 0) {
                     this.displayMessage("You have been granted another life. Be more careful this time!", 3);
                  }

                  if(this.deathScreenTimeout == 0) {
                     this.displayMessage("You retain your skills. Your objects land where you died", 3);
                  }
               }
            }

            int var10 = 0;
            int var14;
            if(var9 != 0 || var10 < this.field_150) {
               do {
                  class_7 var11;
                  label642: {
                     var11 = this.field_153[var10];
                     var14 = (var11.waypointCurrent + 1) % 10;
                     if(var11.movingStep != var14) {
                        byte var12;
                        label631: {
                           var12 = -1;
                           var6 = var11.movingStep;
                           if(var6 < var14) {
                              var7 = var14 - var6;
                              if(var9 == 0) {
                                 break label631;
                              }
                           }

                           var7 = 10 + var14 - var6;
                        }

                        int var8 = 4;
                        if(var7 > 2) {
                           var8 = (var7 - 1) * 4;
                        }

                        label956: {
                           if(var11.waypointsX[var6] - var11.currentX > this.magicLoc * 3 || var11.waypointsY[var6] - var11.currentY > this.magicLoc * 3 || var11.waypointsX[var6] - var11.currentX < -this.magicLoc * 3 || var11.waypointsY[var6] - var11.currentY < -this.magicLoc * 3 || var7 > 8) {
                              var11.currentX = var11.waypointsX[var6];
                              var11.currentY = var11.waypointsY[var6];
                              if(var9 == 0) {
                                 break label956;
                              }
                           }

                           label614: {
                              if(var11.currentX < var11.waypointsX[var6]) {
                                 var11.currentX += var8;
                                 ++var11.field_613;
                                 var12 = 2;
                                 if(var9 == 0) {
                                    break label614;
                                 }
                              }

                              if(var11.currentX > var11.waypointsX[var6]) {
                                 var11.currentX -= var8;
                                 ++var11.field_613;
                                 var12 = 6;
                              }
                           }

                           if(var11.currentX - var11.waypointsX[var6] < var8 && var11.currentX - var11.waypointsX[var6] > -var8) {
                              var11.currentX = var11.waypointsX[var6];
                           }

                           label608: {
                              if(var11.currentY < var11.waypointsY[var6]) {
                                 var11.currentY += var8;
                                 ++var11.field_613;
                                 if(var12 == -1) {
                                    var12 = 4;
                                    if(var9 == 0) {
                                       break label608;
                                    }
                                 }

                                 if(var12 == 2) {
                                    var12 = 3;
                                    if(var9 == 0) {
                                       break label608;
                                    }
                                 }

                                 var12 = 5;
                                 if(var9 == 0) {
                                    break label608;
                                 }
                              }

                              if(var11.currentY > var11.waypointsY[var6]) {
                                 label922: {
                                    var11.currentY -= var8;
                                    ++var11.field_613;
                                    if(var12 == -1) {
                                       var12 = 0;
                                       if(var9 == 0) {
                                          break label922;
                                       }
                                    }

                                    if(var12 == 2) {
                                       var12 = 1;
                                       if(var9 == 0) {
                                          break label922;
                                       }
                                    }

                                    var12 = 7;
                                 }
                              }
                           }

                           if(var11.currentY - var11.waypointsY[var6] < var8 && var11.currentY - var11.waypointsY[var6] > -var8) {
                              var11.currentY = var11.waypointsY[var6];
                           }
                        }

                        if(var12 != -1) {
                           var11.animationCurrent = var12;
                        }

                        if(var11.currentX != var11.waypointsX[var6] || var11.currentY != var11.waypointsY[var6]) {
                           break label642;
                        }

                        var11.movingStep = (var6 + 1) % 10;
                        if(var9 == 0) {
                           break label642;
                        }
                     }

                     var11.animationCurrent = var11.animationNext;
                     if(var11.field_612 == 43) {
                        ++var11.field_613;
                     }
                  }

                  if(var11.messageTimer > 0) {
                     --var11.messageTimer;
                  }

                  if(var11.bubbleTimer > 0) {
                     --var11.bubbleTimer;
                  }

                  if(var11.combatTimeout > 0) {
                     --var11.combatTimeout;
                  }

                  ++var10;
               } while(var10 < this.field_150);
            }

            var3 = 0;
            class_7 var15;
            if(var9 != 0) {
               var15 = this.players[var3];
               if(var15.field_637 > 0) {
                  --var15.field_637;
               }

               ++var3;
            }

            for(; var3 < this.playerCount; ++var3) {
               var15 = this.players[var3];
               if(var15.field_637 > 0) {
                  --var15.field_637;
               }
            }

            label954: {
               if(this.field_216) {
                  if(this.cameraAutoRotatePlayerY - this.localPlayer.currentX >= -500 && this.cameraAutoRotatePlayerY - this.localPlayer.currentX <= 500 && this.cameraAutoRotatePlayerX - this.localPlayer.currentY >= -500 && this.cameraAutoRotatePlayerX - this.localPlayer.currentY <= 500) {
                     break label954;
                  }

                  this.cameraAutoRotatePlayerY = this.localPlayer.currentX;
                  this.cameraAutoRotatePlayerX = this.localPlayer.currentY;
                  if(var9 == 0) {
                     break label954;
                  }
               }

               if(this.cameraAutoRotatePlayerY - this.localPlayer.currentX < -500 || this.cameraAutoRotatePlayerY - this.localPlayer.currentX > 500 || this.cameraAutoRotatePlayerX - this.localPlayer.currentY < -500 || this.cameraAutoRotatePlayerX - this.localPlayer.currentY > 500) {
                  this.cameraAutoRotatePlayerY = this.localPlayer.currentX;
                  this.cameraAutoRotatePlayerX = this.localPlayer.currentY;
               }

               if(this.cameraAutoRotatePlayerY != this.localPlayer.currentX) {
                  this.cameraAutoRotatePlayerY += (this.localPlayer.currentX - this.cameraAutoRotatePlayerY) / (16 + (this.cameraZoom - 500) / 15);
               }

               if(this.cameraAutoRotatePlayerX != this.localPlayer.currentY) {
                  this.cameraAutoRotatePlayerX += (this.localPlayer.currentY - this.cameraAutoRotatePlayerX) / (16 + (this.cameraZoom - 500) / 15);
               }

               if(this.optionCAmeraModeAuto) {
                  label567: {
                     var14 = this.field_133 * 32;
                     var5 = var14 - this.field_135;
                     byte var13 = 1;
                     if(var5 != 0) {
                        label926: {
                           ++this.field_134;
                           if(var5 > 128) {
                              var13 = -1;
                              var5 = 256 - var5;
                              if(var9 == 0) {
                                 break label926;
                              }
                           }

                           if(var5 > 0) {
                              var13 = 1;
                              if(var9 == 0) {
                                 break label926;
                              }
                           }

                           if(var5 < -128) {
                              var13 = 1;
                              var5 += 256;
                              if(var9 == 0) {
                                 break label926;
                              }
                           }

                           if(var5 < 0) {
                              var13 = -1;
                              var5 = -var5;
                           }
                        }

                        this.field_135 += (this.field_134 * var5 + 255) / 256 * var13;
                        this.field_135 &= 255;
                        if(var9 == 0) {
                           break label567;
                        }
                     }

                     this.field_134 = 0;
                  }
               }
            }

            if(this.isSleeping) {
               if(super.inputTextFinal.length() > 0) {
                  label928: {
                     if(super.inputTextFinal.equalsIgnoreCase("::lostcon") && !this.appletMode) {
                        super.clientStream.method_143();
                        if(var9 == 0) {
                           break label928;
                        }
                     }

                     if(super.inputTextFinal.equalsIgnoreCase("::closecon") && !this.appletMode) {
                        this.confirmLogout();
                        if(var9 == 0) {
                           break label928;
                        }
                     }

                     super.clientStream.newPacket(193, 127);
                     super.clientStream.putUnterminatedString(super.inputTextFinal);
                     super.clientStream.flushPacket_();
                     super.inputTextCurrent = "";
                     super.inputTextFinal = "";
                     this.sleepingStatusText = "Please wait...";
                  }
               }

               if(super.lastMouseButtonDown == 1 && super.mouseY > 275 && super.mouseY < 310 && super.mouseX > 56 && super.mouseX < 456) {
                  super.clientStream.newPacket(193, 127);
                  super.clientStream.putUnterminatedString("-null-");
                  super.clientStream.flushPacket_();
                  super.inputTextCurrent = "";
                  super.inputTextFinal = "";
                  this.sleepingStatusText = "Please wait...";
               }

               super.lastMouseButtonDown = 0;
            } else {
               if(super.mouseY > this.gameHeight - 4) {
                  if(super.mouseX > 15 && super.mouseX < 96 && super.lastMouseButtonDown == 1) {
                     this.messageTabSelected = 0;
                  }

                  if(super.mouseX > 110 && super.mouseX < 194 && super.lastMouseButtonDown == 1) {
                     this.messageTabSelected = 1;
                     this.panelMessageTabs.controlFlashText[this.controlTextListChat] = 999999;
                  }

                  if(super.mouseX > 215 && super.mouseX < 295 && super.lastMouseButtonDown == 1) {
                     this.messageTabSelected = 2;
                     this.panelMessageTabs.controlFlashText[this.controlTextListQuest] = 999999;
                  }

                  if(super.mouseX > 315 && super.mouseX < 395 && super.lastMouseButtonDown == 1) {
                     this.messageTabSelected = 3;
                     this.panelMessageTabs.controlFlashText[this.controlTextListPrivate] = 999999;
                  }

                  if(super.mouseX > 417 && super.mouseX < 497 && super.lastMouseButtonDown == 1) {
                     this.showDialogReportAbuseStep = 1;
                     this.field_322 = 0;
                     super.inputTextCurrent = "";
                     super.inputTextFinal = "";
                  }

                  super.lastMouseButtonDown = 0;
                  super.field_35 = 0;
               }

               this.panelMessageTabs.method_275(super.mouseX, super.mouseY, super.lastMouseButtonDown, super.field_35);
               if(this.messageTabSelected > 0 && super.mouseX >= 494 && super.mouseY >= this.gameHeight - 66) {
                  super.lastMouseButtonDown = 0;
               }

               if(this.panelMessageTabs.method_276(this.field_242)) {
                  label544: {
                     String var16 = this.panelMessageTabs.method_308(this.field_242);
                     this.panelMessageTabs.updateText(this.field_242, "");
                     if(var16.startsWith("::")) {
                        if(var16.equalsIgnoreCase("::lostcon") && !this.appletMode) {
                           super.clientStream.method_143();
                           if(var9 == 0) {
                              break label544;
                           }
                        }

                        if(var16.equalsIgnoreCase("::closecon") && !this.appletMode) {
                           this.confirmLogout();
                           if(var9 == 0) {
                              break label544;
                           }
                        }

                        this.sendCommandString(var16.substring(2));
                        if(var9 == 0) {
                           break label544;
                        }
                     }

                     var5 = class_22.prepareToSendChat(var16);
                     this.sendChat(class_22.field_1010, var5);
                     var16 = class_22.readChatString(class_22.field_1010, 0, var5);
                     var16 = class_20.formatChat(var16);
                     this.localPlayer.messageTimer = 150;
                     this.localPlayer.messageSent = var16;
                     this.displayMessage(this.localPlayer.username + ": " + var16, 2);
                  }
               }

               if(this.messageTabSelected == 0) {
                  var14 = 0;
                  if(var9 != 0 || var14 < this.field_246) {
                     do {
                        if(this.field_248[var14] > 0) {
                           --this.field_248[var14];
                        }

                        ++var14;
                     } while(var14 < this.field_246);
                  }
               }

               if(this.deathScreenTimeout != 0) {
                  super.lastMouseButtonDown = 0;
               }

               label952: {
                  if(this.field_276 || this.field_249) {
                     label492: {
                        if(super.field_35 != 0) {
                           ++this.mouseButtonDownTime;
                           if(var9 == 0) {
                              break label492;
                           }
                        }

                        this.mouseButtonDownTime = 0;
                     }

                     if(this.mouseButtonDownTime > 600) {
                        this.mouseButtonItemCountIncrement += 5000;
                        if(var9 == 0) {
                           break label952;
                        }
                     }

                     if(this.mouseButtonDownTime > 450) {
                        this.mouseButtonItemCountIncrement += 500;
                        if(var9 == 0) {
                           break label952;
                        }
                     }

                     if(this.mouseButtonDownTime > 300) {
                        this.mouseButtonItemCountIncrement += 50;
                        if(var9 == 0) {
                           break label952;
                        }
                     }

                     if(this.mouseButtonDownTime > 150) {
                        this.mouseButtonItemCountIncrement += 5;
                        if(var9 == 0) {
                           break label952;
                        }
                     }

                     if(this.mouseButtonDownTime > 50) {
                        ++this.mouseButtonItemCountIncrement;
                        if(var9 == 0) {
                           break label952;
                        }
                     }

                     if(this.mouseButtonDownTime <= 20 || (this.mouseButtonDownTime & 5) != 0) {
                        break label952;
                     }

                     ++this.mouseButtonItemCountIncrement;
                     if(var9 == 0) {
                        break label952;
                     }
                  }

                  this.mouseButtonDownTime = 0;
                  this.mouseButtonItemCountIncrement = 0;
               }

               label487: {
                  if(super.lastMouseButtonDown == 1) {
                     this.mouseButtonClick = 1;
                     if(var9 == 0) {
                        break label487;
                     }
                  }

                  if(super.lastMouseButtonDown == 2) {
                     this.mouseButtonClick = 2;
                  }
               }

               label933: {
                  this.scene.method_178(super.mouseX, super.mouseY);
                  super.lastMouseButtonDown = 0;
                  if(this.optionCAmeraModeAuto) {
                     if(this.field_134 != 0 && !this.field_216) {
                        break label933;
                     }

                     if(super.field_26) {
                        this.field_133 = this.field_133 + 1 & 7;
                        super.field_26 = false;
                        if(!this.fogOfWar) {
                           if((this.field_133 & 1) == 0) {
                              this.field_133 = this.field_133 + 1 & 7;
                           }

                           var14 = 0;
                           if(var9 != 0 || var14 < 8) {
                              while(!this.method_84(this.field_133)) {
                                 this.field_133 = this.field_133 + 1 & 7;
                                 ++var14;
                                 if(var14 >= 8) {
                                    break;
                                 }
                              }
                           }
                        }
                     }

                     if(!super.field_27) {
                        break label933;
                     }

                     this.field_133 = this.field_133 + 7 & 7;
                     super.field_27 = false;
                     if(this.fogOfWar) {
                        break label933;
                     }

                     if((this.field_133 & 1) == 0) {
                        this.field_133 = this.field_133 + 7 & 7;
                     }

                     var14 = 0;
                     if(var9 != 0 || var14 < 8) {
                        do {
                           if(this.method_84(this.field_133)) {
                              break label933;
                           }

                           this.field_133 = this.field_133 + 7 & 7;
                           ++var14;
                        } while(var14 < 8);
                     }

                     if(var9 == 0) {
                        break label933;
                     }
                  }

                  if(super.field_26) {
                     this.field_135 = this.field_135 + 2 & 255;
                     if(var9 == 0) {
                        break label933;
                     }
                  }

                  if(super.field_27) {
                     this.field_135 = this.field_135 - 2 & 255;
                  }
               }

               label438: {
                  if(this.fogOfWar && this.cameraZoom > 550) {
                     this.cameraZoom -= 4;
                     if(var9 == 0) {
                        break label438;
                     }
                  }

                  if(!this.fogOfWar && this.cameraZoom < 750) {
                     this.cameraZoom += 4;
                  }
               }

               label432: {
                  if(this.field_114 > 0) {
                     --this.field_114;
                     if(var9 == 0) {
                        break label432;
                     }
                  }

                  if(this.field_114 < 0) {
                     ++this.field_114;
                  }
               }

               this.scene.method_208(17);
               ++this.field_107;
               if(this.field_107 > 5) {
                  this.field_107 = 0;
                  this.field_108 = (this.field_108 + 1) % 3;
                  this.field_109 = (this.field_109 + 1) % 4;
                  this.field_110 = (this.field_110 + 1) % 5;
               }

               var14 = 0;
               if(var9 != 0 || var14 < this.field_163) {
                  do {
                     var5 = this.field_165[var14];
                     var6 = this.field_166[var14];
                     if(var5 >= 0 && var6 >= 0 && var5 < 96 && var6 < 96 && this.field_167[var14] == 74) {
                        this.field_164[var14].method_375(1, 0, 0);
                     }

                     ++var14;
                  } while(var14 < this.field_163);
               }

               var5 = 0;
               if(var9 != 0 || var5 < this.field_443) {
                  do {
                     ++this.field_446[var5];
                     if(this.field_446[var5] > 50) {
                        --this.field_443;
                        var6 = var5;
                        if(var9 != 0 || var5 < this.field_443) {
                           do {
                              this.field_444[var6] = this.field_444[var6 + 1];
                              this.field_445[var6] = this.field_445[var6 + 1];
                              this.field_446[var6] = this.field_446[var6 + 1];
                              this.field_447[var6] = this.field_447[var6 + 1];
                              ++var6;
                           } while(var6 < this.field_443);
                        }
                     }

                     ++var5;
                  } while(var5 < this.field_443);

               }
            }
         }
      }
   }

   // $FF: renamed from: b (java.lang.String, int) void
   public void displayMessage(String var1, int var2) {
      int var3;
      int var8;
      label172: {
         var8 = class_4.field_563;
         if(var2 != 2 && var2 != 4) {
            if(var2 != 6) {
               break label172;
            }

            if(var8 != 0) {
               var1 = var1.substring(5);
            }
         }

         while(true) {
            String var4;
            long var5;
            int var7;
            if(var1.length() <= 5) {
               var3 = var1.indexOf(":");
               if(var3 != -1) {
                  var4 = var1.substring(0, var3);
                  var5 = class_21.hashUsername(var4);
                  var7 = 0;
                  if(var8 != 0 || var7 < super.ignoreListCount) {
                     do {
                        if(super.ignoreListAccNames[var7] == var5) {
                           return;
                        }

                        ++var7;
                     } while(var7 < super.ignoreListCount);
                  }
               }
               break;
            }

            if(var1.charAt(0) != 64 || var1.charAt(4) != 64) {
               var3 = var1.indexOf(":");
               if(var3 != -1) {
                  var4 = var1.substring(0, var3);
                  var5 = class_21.hashUsername(var4);
                  var7 = 0;
                  if(var8 != 0 || var7 < super.ignoreListCount) {
                     do {
                        if(super.ignoreListAccNames[var7] == var5) {
                           return;
                        }

                        ++var7;
                     } while(var7 < super.ignoreListCount);
                  }
               }
               break;
            }

            var1 = var1.substring(5);
         }
      }

      if(var2 == 2) {
         var1 = "@yel@" + var1;
      }

      if(var2 == 3 || var2 == 4) {
         var1 = "@whi@" + var1;
      }

      if(var2 == 6) {
         var1 = "@cya@" + var1;
      }

      if(this.messageTabSelected != 0) {
         if(var2 == 4 || var2 == 3) {
            this.field_236 = 200;
         }

         if(var2 == 2 && this.messageTabSelected != 1) {
            this.field_237 = 200;
         }

         if(var2 == 5 && this.messageTabSelected != 2) {
            this.field_238 = 200;
         }

         if(var2 == 6 && this.messageTabSelected != 3) {
            this.field_239 = 200;
         }

         if(var2 == 3 && this.messageTabSelected != 0) {
            this.messageTabSelected = 0;
         }

         if(var2 == 6 && this.messageTabSelected != 3 && this.messageTabSelected != 0) {
            this.messageTabSelected = 0;
         }
      }

      var3 = this.field_246 - 1;
      if(var8 != 0) {
         this.field_247[var3] = this.field_247[var3 - 1];
         this.field_248[var3] = this.field_248[var3 - 1];
         --var3;
      }

      while(var3 > 0) {
         this.field_247[var3] = this.field_247[var3 - 1];
         this.field_248[var3] = this.field_248[var3 - 1];
         --var3;
      }

      this.field_247[0] = var1;
      this.field_248[0] = 300;
      if(var2 == 2) {
         label93: {
            if(this.panelMessageTabs.controlFlashText[this.controlTextListChat] == this.panelMessageTabs.field_769[this.controlTextListChat] - 4) {
               this.panelMessageTabs.method_306(this.controlTextListChat, var1, true);
               if(var8 == 0) {
                  break label93;
               }
            }

            this.panelMessageTabs.method_306(this.controlTextListChat, var1, false);
         }
      }

      if(var2 == 5) {
         label87: {
            if(this.panelMessageTabs.controlFlashText[this.controlTextListQuest] == this.panelMessageTabs.field_769[this.controlTextListQuest] - 4) {
               this.panelMessageTabs.method_306(this.controlTextListQuest, var1, true);
               if(var8 == 0) {
                  break label87;
               }
            }

            this.panelMessageTabs.method_306(this.controlTextListQuest, var1, false);
         }
      }

      if(var2 == 6) {
         if(this.panelMessageTabs.controlFlashText[this.controlTextListPrivate] == this.panelMessageTabs.field_769[this.controlTextListPrivate] - 4) {
            this.panelMessageTabs.method_306(this.controlTextListPrivate, var1, true);
            return;
         }

         this.panelMessageTabs.method_306(this.controlTextListPrivate, var1, false);
      }

   }

   // $FF: renamed from: d (java.lang.String) void
   public void displayMessage(String var1) {
      if(var1.startsWith("@bor@")) {
         this.displayMessage(var1, 4);
      } else if(var1.startsWith("@que@")) {
         this.displayMessage("@whi@" + var1, 5);
      } else if(var1.startsWith("@pri@")) {
         this.displayMessage(var1, 6);
      } else {
         this.displayMessage(var1, 3);
      }
   }

   // $FF: renamed from: b (int, int, int, int) c
   public class_7 method_81(int var1, int var2, int var3, int var4) {
      int var9 = class_4.field_563;
      if(this.field_141[var1] == null) {
         class_7[] var10000 = this.field_141;
         var10000[var1] = new class_7();
         this.field_141[var1].field_608 = var1;
         this.field_141[var1].appearanceId = 0;
      }

      class_7 var5 = this.field_141[var1];
      boolean var6 = false;
      int var7 = 0;
      if(var9 != 0 || var7 < this.field_139) {
         do {
            if(this.field_143[var7].field_608 == var1) {
               var6 = true;
               if(var9 == 0) {
                  break;
               }
            }

            ++var7;
         } while(var7 < this.field_139);
      }

      label24: {
         if(var6) {
            var5.animationNext = var4;
            int var8 = var5.waypointCurrent;
            if(var2 == var5.waypointsX[var8] && var3 == var5.waypointsY[var8]) {
               break label24;
            }

            var5.waypointCurrent = var8 = (var8 + 1) % 10;
            var5.waypointsX[var8] = var2;
            var5.waypointsY[var8] = var3;
            if(var9 == 0) {
               break label24;
            }
         }

         var5.field_608 = var1;
         var5.movingStep = 0;
         var5.waypointCurrent = 0;
         var5.waypointsX[0] = var5.currentX = var2;
         var5.waypointsY[0] = var5.currentY = var3;
         var5.animationNext = var5.animationCurrent = var4;
         var5.field_613 = 0;
      }

      this.players[this.playerCount++] = var5;
      return var5;
   }

   // $FF: renamed from: a (int, int, int, int, int) c
   public class_7 method_82(int var1, int var2, int var3, int var4, int var5) {
      int var10 = class_4.field_563;
      if(this.field_152[var1] == null) {
         class_7[] var10000 = this.field_152;
         var10000[var1] = new class_7();
         this.field_152[var1].field_608 = var1;
      }

      class_7 var6 = this.field_152[var1];
      boolean var7 = false;
      int var8 = 0;
      if(var10 != 0 || var8 < this.field_151) {
         do {
            if(this.field_154[var8].field_608 == var1) {
               var7 = true;
               if(var10 == 0) {
                  break;
               }
            }

            ++var8;
         } while(var8 < this.field_151);
      }

      label24: {
         if(var7) {
            var6.field_612 = var5;
            var6.animationNext = var4;
            int var9 = var6.waypointCurrent;
            if(var2 == var6.waypointsX[var9] && var3 == var6.waypointsY[var9]) {
               break label24;
            }

            var6.waypointCurrent = var9 = (var9 + 1) % 10;
            var6.waypointsX[var9] = var2;
            var6.waypointsY[var9] = var3;
            if(var10 == 0) {
               break label24;
            }
         }

         var6.field_608 = var1;
         var6.movingStep = 0;
         var6.waypointCurrent = 0;
         var6.waypointsX[0] = var6.currentX = var2;
         var6.waypointsY[0] = var6.currentY = var3;
         var6.field_612 = var5;
         var6.animationNext = var6.animationCurrent = var4;
         var6.field_613 = 0;
      }

      this.field_153[this.field_150++] = var6;
      return var6;
   }

   // $FF: renamed from: a (int, int, byte[]) void
   public void method_49(int opcode, int var2, byte[] data) {
      int var19 = class_4.field_563;

      int updateIndex;
      try {
         int updateSize;
         int var8;
         int var9;
         int reuseableVar1;
         int i;
         int var13;
         int var14;
         int var15;
         byte var22;
         int newIndex;
         int j;
         boolean var29;
         if(opcode == 255) { // PLAYER_COORDS
            this.field_139 = this.playerCount;
            updateSize = 0;
            if(var19 != 0 || updateSize < this.field_139) {
               do {
                  this.field_143[updateSize] = this.players[updateSize];
                  ++updateSize;
               } while(updateSize < this.field_139);
            }

            var22 = 8;
            this.localRegionX = class_21.readBits(data, var22, 11);
            newIndex = var22 + 11;
            this.localRegionY = class_21.readBits(data, newIndex, 13);

            newIndex += 13;
            updateIndex = class_21.readBits(data, newIndex, 4); // animation
            newIndex += 4;
            boolean var7 = this.loadNextRegion(this.localRegionX, this.localRegionY);
            this.localRegionX -= this.regionX;
            this.localRegionY -= this.regionY;
            var8 = this.localRegionX * this.magicLoc + 64;
            var9 = this.localRegionY * this.magicLoc + 64;
            if(var7) {
               this.localPlayer.waypointCurrent = 0;
               this.localPlayer.movingStep = 0;
               this.localPlayer.currentX = this.localPlayer.waypointsX[0] = var8;
               this.localPlayer.currentY = this.localPlayer.waypointsY[0] = var9;
            }

            this.playerCount = 0;
            this.localPlayer = this.method_81(this.localPlayerServerIndex, var8, var9, updateIndex);
            reuseableVar1 = class_21.readBits(data, newIndex, 8); // number of players
            newIndex += 8;
            i = 0;
            int var16;
            if(var19 != 0 || i < reuseableVar1) {
               do {
                  label1467: {
                     class_7 var12 = this.field_143[i + 1];
                     var13 = class_21.readBits(data, newIndex, 1); // needs update
                     ++newIndex;
                     if(var13 != 0) {
                        label1599: {
                           var14 = class_21.readBits(data, newIndex, 1); // update type
                           ++newIndex;
                           if(var14 == 0) {
                              var15 = class_21.readBits(data, newIndex, 3); // animation type
                              newIndex += 3;
                              var16 = var12.waypointCurrent;
                              int var17 = var12.waypointsX[var16];
                              int var18 = var12.waypointsY[var16];
                              if(var15 == 2 || var15 == 1 || var15 == 3) {
                                 var17 += this.magicLoc;
                              }

                              if(var15 == 6 || var15 == 5 || var15 == 7) {
                                 var17 -= this.magicLoc;
                              }

                              if(var15 == 4 || var15 == 3 || var15 == 5) {
                                 var18 += this.magicLoc;
                              }

                              if(var15 == 0 || var15 == 1 || var15 == 7) {
                                 var18 -= this.magicLoc;
                              }

                              var12.animationNext = var15;
                              var12.waypointCurrent = var16 = (var16 + 1) % 10;
                              var12.waypointsX[var16] = var17;
                              var12.waypointsY[var16] = var18;
                              if(var19 == 0) {
                                 break label1599;
                              }
                           }

                           // mob removal
                           var15 = class_21.readBits(data, newIndex, 4);
                           if((var15 & 12) == 12) {
                              newIndex += 2;
                              if(var19 == 0) {
                                 break label1467;
                              }
                           }

                           var12.animationNext = class_21.readBits(data, newIndex, 4);
                           newIndex += 4;
                        }
                     }

                     this.players[this.playerCount++] = var12;
                  }

                  ++i;
               } while(i < reuseableVar1);
            }

            j = 0;
            if(var19 != 0 || newIndex + 24 < var2 * 8) {
               do {
                  var13 = class_21.readBits(data, newIndex, 11);
                  newIndex += 11;
                  var14 = class_21.readBits(data, newIndex, 5);
                  newIndex += 5;
                  if(var14 > 15) {
                     var14 -= 32;
                  }

                  var15 = class_21.readBits(data, newIndex, 5);
                  newIndex += 5;
                  if(var15 > 15) {
                     var15 -= 32;
                  }

                  updateIndex = class_21.readBits(data, newIndex, 4);
                  newIndex += 4;
                  var16 = class_21.readBits(data, newIndex, 1);
                  ++newIndex;
                  var8 = (this.localRegionX + var14) * this.magicLoc + 64;
                  var9 = (this.localRegionY + var15) * this.magicLoc + 64;
                  this.method_81(var13, var8, var9, updateIndex);
                  if(var16 == 0) {
                     this.field_155[j++] = var13;
                  }
               } while(newIndex + 24 < var2 * 8);
            }

            if(j > 0) {
               super.clientStream.newPacket(254, 120);
               super.clientStream.putShort(j);
               var13 = 0;
               if(var19 == 0 && var13 >= j) {
                  super.clientStream.flushPacket_();
                  var29 = false;
                  return;
               }

               do {
                  class_7 var32 = this.field_141[this.field_155[var13]];
                  super.clientStream.putShort(var32.field_608);
                  super.clientStream.putShort(var32.appearanceId);
                  ++var13;
               } while(var13 < j);

               super.clientStream.flushPacket_();
               var29 = false;
               return;
            }
         } else {
            int userForIdx;
            if(opcode == 254) { // SEND_GROUND_ITEM_HANDLER
               updateSize = 1;
               if(var19 == 0 && updateSize >= var2) {
                  return;
               }

               do {
                  if(class_21.getUnsignedByte(data[updateSize]) == 255) {
                     newIndex = 0;
                     updateIndex = this.localRegionX + data[updateSize + 1] >> 3;
                     userForIdx = this.localRegionY + data[updateSize + 2] >> 3;
                     updateSize += 3;
                     var8 = 0;
                     if(var19 != 0 || var8 < this.psize) {
                        do {
                           var9 = (this.groundItemX[var8] >> 3) - updateIndex;
                           reuseableVar1 = (this.groundItemY[var8] >> 3) - userForIdx;
                           if(var9 != 0 || reuseableVar1 != 0) {
                              if(var8 != newIndex) {
                                 this.groundItemX[newIndex] = this.groundItemX[var8];
                                 this.groundItemY[newIndex] = this.groundItemY[var8];
                                 this.groundItemId[newIndex] = this.groundItemId[var8];
                                 this.field_161[newIndex] = this.field_161[var8];
                              }

                              ++newIndex;
                           }

                           ++var8;
                        } while(var8 < this.psize);
                     }

                     this.psize = newIndex;
                     if(var19 == 0) {
                        continue;
                     }
                  }

                  newIndex = class_21.readUnsignedShort(data, updateSize);
                  updateSize += 2;
                  updateIndex = this.localRegionX + data[updateSize++];
                  userForIdx = this.localRegionY + data[updateSize++];
                  if((newIndex & '\u8000') == 0) {
                     this.groundItemX[this.psize] = updateIndex;
                     this.groundItemY[this.psize] = userForIdx;
                     this.groundItemId[this.psize] = newIndex;
                     this.field_161[this.psize] = 0;
                     var8 = 0;
                     if(var19 != 0 || var8 < this.field_163) {
                        do {
                           if(this.field_165[var8] == updateIndex && this.field_166[var8] == userForIdx) {
                              this.field_161[this.psize] = class_4.field_523[this.field_167[var8]];
                              if(var19 == 0) {
                                 break;
                              }
                           }

                           ++var8;
                        } while(var8 < this.field_163);
                     }

                     ++this.psize;
                     if(var19 == 0) {
                        continue;
                     }
                  }

                  newIndex &= 32767;
                  var8 = 0;
                  var9 = 0;
                  if(var19 == 0 && var9 >= this.psize) {
                     this.psize = var8;
                  } else {
                     do {
                        label1703: {
                           if(this.groundItemX[var9] != updateIndex || this.groundItemY[var9] != userForIdx || this.groundItemId[var9] != newIndex) {
                              if(var9 != var8) {
                                 this.groundItemX[var8] = this.groundItemX[var9];
                                 this.groundItemY[var8] = this.groundItemY[var9];
                                 this.groundItemId[var8] = this.groundItemId[var9];
                                 this.field_161[var8] = this.field_161[var9];
                              }

                              ++var8;
                              if(var19 == 0) {
                                 break label1703;
                              }
                           }

                           newIndex = -123;
                        }

                        ++var9;
                     } while(var9 < this.psize);

                     this.psize = var8;
                  }
               } while(updateSize < var2);

               return;
            }

            if(opcode == 253) { // SEND_SCENERY_HANDLER
               updateSize = 1;
               if(var19 == 0 && updateSize >= var2) {
                  return;
               }

               do {
                  if(class_21.getUnsignedByte(data[updateSize]) == 255) {
                     newIndex = 0;
                     updateIndex = this.localRegionX + data[updateSize + 1] >> 3;
                     userForIdx = this.localRegionY + data[updateSize + 2] >> 3;
                     updateSize += 3;
                     var8 = 0;
                     if(var19 != 0 || var8 < this.field_163) {
                        do {
                           label1683: {
                              var9 = (this.field_165[var8] >> 3) - updateIndex;
                              reuseableVar1 = (this.field_166[var8] >> 3) - userForIdx;
                              if(var9 != 0 || reuseableVar1 != 0) {
                                 if(var8 != newIndex) {
                                    this.field_164[newIndex] = this.field_164[var8];
                                    this.field_164[newIndex].field_883 = newIndex;
                                    this.field_165[newIndex] = this.field_165[var8];
                                    this.field_166[newIndex] = this.field_166[var8];
                                    this.field_167[newIndex] = this.field_167[var8];
                                    this.field_168[newIndex] = this.field_168[var8];
                                 }

                                 ++newIndex;
                                 if(var19 == 0) {
                                    break label1683;
                                 }
                              }

                              this.scene.freeModel(this.field_164[var8]);
                              this.world.method_327(this.field_165[var8], this.field_166[var8], this.field_167[var8]);
                           }

                           ++var8;
                        } while(var8 < this.field_163);
                     }

                     this.field_163 = newIndex;
                     if(var19 == 0) {
                        continue;
                     }
                  }

                  newIndex = class_21.readUnsignedShort(data, updateSize);
                  updateSize += 2;
                  updateIndex = this.localRegionX + data[updateSize++];
                  userForIdx = this.localRegionY + data[updateSize++];
                  var8 = 0;
                  var9 = 0;
                  if(var19 != 0) {
                     label1704: {
                        if(this.field_165[var9] != updateIndex || this.field_166[var9] != userForIdx) {
                           if(var9 != var8) {
                              this.field_164[var8] = this.field_164[var9];
                              this.field_164[var8].field_883 = var8;
                              this.field_165[var8] = this.field_165[var9];
                              this.field_166[var8] = this.field_166[var9];
                              this.field_167[var8] = this.field_167[var9];
                              this.field_168[var8] = this.field_168[var9];
                           }

                           ++var8;
                           if(var19 == 0) {
                              break label1704;
                           }
                        }

                        this.scene.freeModel(this.field_164[var9]);
                        this.world.method_327(this.field_165[var9], this.field_166[var9], this.field_167[var9]);
                     }

                     ++var9;
                  }

                  for(; var9 < this.field_163; ++var9) {
                     if(this.field_165[var9] != updateIndex || this.field_166[var9] != userForIdx) {
                        if(var9 != var8) {
                           this.field_164[var8] = this.field_164[var9];
                           this.field_164[var8].field_883 = var8;
                           this.field_165[var8] = this.field_165[var9];
                           this.field_166[var8] = this.field_166[var9];
                           this.field_167[var8] = this.field_167[var9];
                           this.field_168[var8] = this.field_168[var9];
                        }

                        ++var8;
                        if(var19 == 0) {
                           continue;
                        }
                     }

                     this.scene.freeModel(this.field_164[var9]);
                     this.world.method_327(this.field_165[var9], this.field_166[var9], this.field_167[var9]);
                  }

                  this.field_163 = var8;
                  if(newIndex != '\uea60') {
                     label1684: {
                        reuseableVar1 = this.world.method_341(updateIndex, userForIdx);
                        if(reuseableVar1 == 0 || reuseableVar1 == 4) {
                           i = class_4.field_520[newIndex];
                           j = class_4.field_521[newIndex];
                           if(var19 == 0) {
                              break label1684;
                           }
                        }

                        j = class_4.field_520[newIndex];
                        i = class_4.field_521[newIndex];
                     }

                     var13 = (updateIndex + updateIndex + i) * this.magicLoc / 2;
                     var14 = (userForIdx + userForIdx + j) * this.magicLoc / 2;
                     var15 = class_4.field_519[newIndex];
                     Scene var39 = this.field_169[var15].method_390();
                     this.scene.method_170(var39);
                     var39.field_883 = this.field_163;
                     var39.method_375(0, reuseableVar1 * 32, 0);
                     var39.method_377(var13, -this.world.getElevation(var13, var14), var14);
                     var39.method_371(true, 48, 48, -50, -10, -50);
                     this.world.method_326(updateIndex, userForIdx, newIndex);
                     if(newIndex == 74) {
                        var39.method_377(0, -480, 0);
                     }

                     this.field_165[this.field_163] = updateIndex;
                     this.field_166[this.field_163] = userForIdx;
                     this.field_167[this.field_163] = newIndex;
                     this.field_168[this.field_163] = reuseableVar1;
                     this.field_164[this.field_163++] = var39;
                  }
               } while(updateSize < var2);

               return;
            }

            byte var21;
            if(opcode == 252) { // SEND_INVENTORY
               var21 = 1;
               updateSize = var21 + 1; // updateSize here is reused for dataOffset
               this.inventorySize = data[var21] & 255;
               newIndex = 0;
               if(var19 == 0 && newIndex >= this.inventorySize) {
                  return;
               }

               do {
                  label1247: {
                     updateIndex = class_21.readUnsignedShort(data, updateSize);
                     updateSize += 2;
                     this.inventoryItemId[newIndex] = updateIndex & 32767;
                     this.inventoryEquipped[newIndex] = updateIndex / '\u8000';
                     if(class_4.itemStackable[updateIndex & 32767] == 0) {
                        this.inventoryAmounts[newIndex] = class_21.readUnsignedByteInt(data, updateSize);
                        if(this.inventoryAmounts[newIndex] >= 128) {
                           updateSize += 4;
                           if(var19 == 0) {
                              break label1247;
                           }
                        }

                        ++updateSize;
                        if(var19 == 0) {
                           break label1247;
                        }
                     }

                     this.inventoryAmounts[newIndex] = 1;
                  }

                  ++newIndex;
               } while(newIndex < this.inventorySize);

               return;
            }

            class_7 mob;
            if(opcode == 250) { // SEND_UPDATE_PLAYERS
               updateSize = class_21.readUnsignedShort(data, 1);
               newIndex = 3;
               updateIndex = 0;
               if(var19 == 0 && updateIndex >= updateSize) {
                  return;
               }

               do {
                  label1618: {
                     userForIdx = class_21.readUnsignedShort(data, newIndex);
                     newIndex += 2;
                     mob = this.field_141[userForIdx];
                     byte updateType = data[newIndex];
                     ++newIndex;
                     if(updateType == 0) { // Bubble overhead
                        reuseableVar1 = class_21.readUnsignedShort(data, newIndex);
                        newIndex += 2;
                        if(mob == null) {
                           break label1618;
                        }

                        mob.bubbleTimer = 150;
                        mob.bubbleItemId = reuseableVar1;
                        if(var19 == 0) {
                           break label1618;
                        }
                     }

                     byte messageLength;
                     String message;
                     if(updateType == 1) { // Chat message
                        messageLength = data[newIndex];
                        ++newIndex;
                        if(mob != null) {
                           message = class_20.formatChat(class_22.readChatString(data, newIndex, messageLength));
                           var29 = false;
                           var13 = 0;
                           if(var19 != 0 || var13 < super.ignoreListCount) {
                              do {
                                 if(super.ignoreListAccNames[var13] == mob.usernameHash) {
                                    var29 = true;
                                 }

                                 ++var13;
                              } while(var13 < super.ignoreListCount);
                           }

                           if(!var29) { // if (!ignored)
                              mob.messageTimer = 150;
                              mob.messageSent = message;
                              this.displayMessage(mob.username + ": " + mob.messageSent, 2);
                           }
                        }

                        newIndex += messageLength;
                        if(var19 == 0) {
                           break label1618;
                        }
                     }

                     if(updateType == 2) { // Damage update
                        reuseableVar1 = class_21.getUnsignedByte(data[newIndex]);
                        ++newIndex;
                        i = class_21.getUnsignedByte(data[newIndex]);
                        ++newIndex;
                        j = class_21.getUnsignedByte(data[newIndex]);
                        ++newIndex;
                        if(mob == null) {
                           break label1618;
                        }

                        mob.damageTaken = reuseableVar1;
                        mob.healthCurrent = i;
                        mob.healthMax = j;
                        mob.combatTimeout = 200;
                        if(mob != this.localPlayer) {
                           break label1618;
                        }

                        this.playerStatCurrent[3] = i;
                        this.playerStatBase[3] = j;
                        this.showDialogServermessage = false;
                        this.showDialogMessage = false;
                        if(var19 == 0) {
                           break label1618;
                        }
                     }

                     if(updateType == 3) { // Projectile Update
                        reuseableVar1 = class_21.readUnsignedShort(data, newIndex);
                        newIndex += 2;
                        i = class_21.readUnsignedShort(data, newIndex);
                        newIndex += 2;
                        if(mob == null) {
                           break label1618;
                        }

                        mob.field_634 = reuseableVar1;
                        mob.field_636 = i;
                        mob.field_635 = -1;
                        mob.field_637 = this.field_106;
                        if(var19 == 0) {
                           break label1618;
                        }
                     }

                     if(updateType == 4) { // Projectile Update
                        reuseableVar1 = class_21.readUnsignedShort(data, newIndex);
                        newIndex += 2;
                        i = class_21.readUnsignedShort(data, newIndex);
                        newIndex += 2;
                        if(mob == null) {
                           break label1618;
                        }

                        mob.field_634 = reuseableVar1;
                        mob.field_635 = i;
                        mob.field_636 = -1;
                        mob.field_637 = this.field_106;
                        if(var19 == 0) {
                           break label1618;
                        }
                     }

                     if(updateType == 5) { // Player appearance and identity
                        if(mob != null) {
                           mob.appearanceId = class_21.readUnsignedShort(data, newIndex);
                           newIndex += 2;
                           mob.usernameHash = class_21.getUnsignedLong(data, newIndex);
                           newIndex += 8;
                           mob.username = class_21.unhashUsername(mob.usernameHash);
                           reuseableVar1 = class_21.getUnsignedByte(data[newIndex]); // how many items worn
                           ++newIndex;
                           i = 0;
                           if(var19 != 0 || i < reuseableVar1) {
                              do {
                                 mob.wornItems[i] = class_21.getUnsignedByte(data[newIndex]);
                                 ++newIndex;
                                 ++i;
                              } while(i < reuseableVar1);
                           }

                           j = reuseableVar1;
                           if(var19 != 0 || reuseableVar1 < 12) {
                              do {
                                 mob.wornItems[j] = 0;
                                 ++j;
                              } while(j < 12);
                           }

                           mob.hairColour = data[newIndex++] & 255;
                           mob.topColour = data[newIndex++] & 255;
                           mob.trouserColour = data[newIndex++] & 255;
                           mob.skinColour = data[newIndex++] & 255;
                           mob.combatLevel = data[newIndex++] & 255;
                           mob.skullType = data[newIndex++] & 255;
                           if(var19 == 0) {
                              break label1618;
                           }
                        }

                        newIndex += 14; // ???? what was skipped
                        reuseableVar1 = class_21.getUnsignedByte(data[newIndex]);
                        newIndex += reuseableVar1 + 1; // ...???? why
                        if(var19 == 0) {
                           break label1618;
                        }
                     }

                     if(updateType == 6) { // Quest chat
                        messageLength = data[newIndex];
                        ++newIndex;
                        if(mob != null) {
                           message = class_22.readChatString(data, newIndex, messageLength);
                           mob.messageTimer = 150;
                           mob.messageSent = message;
                           if(mob == this.localPlayer) {
                              this.displayMessage(mob.username + ": " + mob.messageSent, 5);
                           }
                        }

                        newIndex += messageLength;
                     }
                  }

                  ++updateIndex;
               } while(updateIndex < updateSize);

               return;
            }

            if(opcode == 249) {
               updateSize = 1;
               if(var19 == 0 && updateSize >= var2) {
                  return;
               }

               do {
                  if(class_21.getUnsignedByte(data[updateSize]) == 255) {
                     newIndex = 0;
                     updateIndex = this.localRegionX + data[updateSize + 1] >> 3;
                     userForIdx = this.localRegionY + data[updateSize + 2] >> 3;
                     updateSize += 3;
                     var8 = 0;
                     if(var19 != 0 || var8 < this.field_172) {
                        do {
                           label1688: {
                              var9 = (this.field_174[var8] >> 3) - updateIndex;
                              reuseableVar1 = (this.field_175[var8] >> 3) - userForIdx;
                              if(var9 != 0 || reuseableVar1 != 0) {
                                 if(var8 != newIndex) {
                                    this.field_173[newIndex] = this.field_173[var8];
                                    this.field_173[newIndex].field_883 = newIndex + 10000;
                                    this.field_174[newIndex] = this.field_174[var8];
                                    this.field_175[newIndex] = this.field_175[var8];
                                    this.field_176[newIndex] = this.field_176[var8];
                                    this.field_177[newIndex] = this.field_177[var8];
                                 }

                                 ++newIndex;
                                 if(var19 == 0) {
                                    break label1688;
                                 }
                              }

                              this.scene.freeModel(this.field_173[var8]);
                              this.world.method_325(this.field_174[var8], this.field_175[var8], this.field_176[var8], this.field_177[var8]);
                           }

                           ++var8;
                        } while(var8 < this.field_172);
                     }

                     this.field_172 = newIndex;
                     if(var19 == 0) {
                        continue;
                     }
                  }

                  newIndex = class_21.readUnsignedShort(data, updateSize);
                  updateSize += 2;
                  updateIndex = this.localRegionX + data[updateSize++];
                  userForIdx = this.localRegionY + data[updateSize++];
                  byte var35 = data[updateSize++];
                  var9 = 0;
                  reuseableVar1 = 0;
                  Scene var37;
                  if(var19 == 0 && reuseableVar1 >= this.field_172) {
                     this.field_172 = var9;
                     if(newIndex != '\uffff') {
                        this.world.method_324(updateIndex, userForIdx, var35, newIndex);
                        var37 = this.method_104(updateIndex, userForIdx, var35, newIndex, this.field_172);
                        this.field_173[this.field_172] = var37;
                        this.field_174[this.field_172] = updateIndex;
                        this.field_175[this.field_172] = userForIdx;
                        this.field_177[this.field_172] = newIndex;
                        this.field_176[this.field_172++] = var35;
                     }
                  } else {
                     do {
                        label1706: {
                           if(this.field_174[reuseableVar1] != updateIndex || this.field_175[reuseableVar1] != userForIdx || this.field_176[reuseableVar1] != var35) {
                              if(reuseableVar1 != var9) {
                                 this.field_173[var9] = this.field_173[reuseableVar1];
                                 this.field_173[var9].field_883 = var9 + 10000;
                                 this.field_174[var9] = this.field_174[reuseableVar1];
                                 this.field_175[var9] = this.field_175[reuseableVar1];
                                 this.field_176[var9] = this.field_176[reuseableVar1];
                                 this.field_177[var9] = this.field_177[reuseableVar1];
                              }

                              ++var9;
                              if(var19 == 0) {
                                 break label1706;
                              }
                           }

                           this.scene.freeModel(this.field_173[reuseableVar1]);
                           this.world.method_325(this.field_174[reuseableVar1], this.field_175[reuseableVar1], this.field_176[reuseableVar1], this.field_177[reuseableVar1]);
                        }

                        ++reuseableVar1;
                     } while(reuseableVar1 < this.field_172);

                     this.field_172 = var9;
                     if(newIndex != '\uffff') {
                        this.world.method_324(updateIndex, userForIdx, var35, newIndex);
                        var37 = this.method_104(updateIndex, userForIdx, var35, newIndex, this.field_172);
                        this.field_173[this.field_172] = var37;
                        this.field_174[this.field_172] = updateIndex;
                        this.field_175[this.field_172] = userForIdx;
                        this.field_177[this.field_172] = newIndex;
                        this.field_176[this.field_172++] = var35;
                     }
                  }
               } while(updateSize < var2);

               return;
            }

            if(opcode == 248) {
               this.field_151 = this.field_150;
               this.field_150 = 0;
               updateSize = 0;
               if(var19 != 0) {
                  this.field_154[updateSize] = this.field_153[updateSize];
                  ++updateSize;
               }

               while(updateSize < this.field_151) {
                  this.field_154[updateSize] = this.field_153[updateSize];
                  ++updateSize;
               }

               var22 = 8;
               updateIndex = class_21.readBits(data, var22, 8); // number of NPCs
               newIndex = var22 + 8;
               userForIdx = 0;
               if(var19 == 0 && userForIdx >= updateIndex) {
                  if(var19 == 0 && newIndex + 34 >= var2 * 8) {
                     return;
                  }

                  do {
                  	// Adding New NPC
                     var8 = class_21.readBits(data, newIndex, 12); // npc index
                     newIndex += 12;
                     var9 = class_21.readBits(data, newIndex, 5);
                     newIndex += 5;
                     if(var9 > 15) {
                        var9 -= 32;
                     }

                     reuseableVar1 = class_21.readBits(data, newIndex, 5);
                     newIndex += 5;
                     if(reuseableVar1 > 15) {
                        reuseableVar1 -= 32;
                     }

                     i = class_21.readBits(data, newIndex, 4);
                     newIndex += 4;
                     j = (this.localRegionX + var9) * this.magicLoc + 64;
                     var13 = (this.localRegionY + reuseableVar1) * this.magicLoc + 64;
                     var14 = class_21.readBits(data, newIndex, 10);
                     newIndex += 10;
                     if(var14 >= class_4.maxNpcId) {
                        var14 = 24;
                     }

                     this.method_82(var8, j, var13, i, var14);
                  } while(newIndex + 34 < var2 * 8);

                  return;
               }

               do {
                  label1044: {
                     mob = this.field_154[userForIdx];
                     var9 = class_21.readBits(data, newIndex, 1);
                     ++newIndex;
                     if(var9 != 0) {
                        label1629: {
                           reuseableVar1 = class_21.readBits(data, newIndex, 1);
                           ++newIndex;
                           if(reuseableVar1 == 0) {
                              i = class_21.readBits(data, newIndex, 3);
                              newIndex += 3;
                              j = mob.waypointCurrent;
                              var13 = mob.waypointsX[j];
                              var14 = mob.waypointsY[j];
                              if(i == 2 || i == 1 || i == 3) {
                                 var13 += this.magicLoc;
                              }

                              if(i == 6 || i == 5 || i == 7) {
                                 var13 -= this.magicLoc;
                              }

                              if(i == 4 || i == 3 || i == 5) {
                                 var14 += this.magicLoc;
                              }

                              if(i == 0 || i == 1 || i == 7) {
                                 var14 -= this.magicLoc;
                              }

                              mob.animationNext = i;
                              mob.waypointCurrent = j = (j + 1) % 10;
                              mob.waypointsX[j] = var13;
                              mob.waypointsY[j] = var14;
                              if(var19 == 0) {
                                 break label1629;
                              }
                           }

                           i = class_21.readBits(data, newIndex, 4);
                           if((i & 12) == 12) {
                              newIndex += 2;
                              if(var19 == 0) {
                                 break label1044;
                              }
                           }

                           mob.animationNext = class_21.readBits(data, newIndex, 4);
                           newIndex += 4;
                        }
                     }

                     this.field_153[this.field_150++] = mob;
                  }

                  ++userForIdx;
               } while(userForIdx < updateIndex);

               if(var19 == 0 && newIndex + 34 >= var2 * 8) {
                  return;
               }

               do {
                  var8 = class_21.readBits(data, newIndex, 12);
                  newIndex += 12;
                  var9 = class_21.readBits(data, newIndex, 5);
                  newIndex += 5;
                  if(var9 > 15) {
                     var9 -= 32;
                  }

                  reuseableVar1 = class_21.readBits(data, newIndex, 5);
                  newIndex += 5;
                  if(reuseableVar1 > 15) {
                     reuseableVar1 -= 32;
                  }

                  i = class_21.readBits(data, newIndex, 4);
                  newIndex += 4;
                  j = (this.localRegionX + var9) * this.magicLoc + 64;
                  var13 = (this.localRegionY + reuseableVar1) * this.magicLoc + 64;
                  var14 = class_21.readBits(data, newIndex, 10);
                  newIndex += 10;
                  if(var14 >= class_4.maxNpcId) {
                     var14 = 24;
                  }

                  this.method_82(var8, j, var13, i, var14);
               } while(newIndex + 34 < var2 * 8);

               return;
            }

            if(opcode == 247) {
               updateSize = class_21.readUnsignedShort(data, 1);
               newIndex = 3;
               updateIndex = 0;
               if(var19 == 0 && updateIndex >= updateSize) {
                  return;
               }

               do {
                  label987: {
                     userForIdx = class_21.readUnsignedShort(data, newIndex);
                     newIndex += 2;
                     mob = this.field_152[userForIdx];
                     var9 = class_21.getUnsignedByte(data[newIndex]);
                     ++newIndex;
                     if(var9 == 1) {
                        reuseableVar1 = class_21.readUnsignedShort(data, newIndex);
                        newIndex += 2;
                        byte var31 = data[newIndex];
                        ++newIndex;
                        if(mob != null) {
                           String var33 = class_22.readChatString(data, newIndex, var31);
                           mob.messageTimer = 150;
                           mob.messageSent = var33;
                           if(reuseableVar1 == this.localPlayer.field_608) {
                              this.displayMessage("@yel@" + class_4.field_486[mob.field_612] + ": " + mob.messageSent, 5);
                           }
                        }

                        newIndex += var31;
                        if(var19 == 0) {
                           break label987;
                        }
                     }

                     if(var9 == 2) {
                        reuseableVar1 = class_21.getUnsignedByte(data[newIndex]);
                        ++newIndex;
                        i = class_21.getUnsignedByte(data[newIndex]);
                        ++newIndex;
                        j = class_21.getUnsignedByte(data[newIndex]);
                        ++newIndex;
                        if(mob != null) {
                           mob.damageTaken = reuseableVar1;
                           mob.healthCurrent = i;
                           mob.healthMax = j;
                           mob.combatTimeout = 200;
                        }
                     }
                  }

                  ++updateIndex;
               } while(updateIndex < updateSize);

               return;
            }

            if(opcode == 246) {
               this.field_316 = true;
               updateSize = class_21.getUnsignedByte(data[1]);
               this.field_317 = updateSize;
               newIndex = 2;
               updateIndex = 0;
               if(var19 == 0 && updateIndex >= updateSize) {
                  return;
               }

               do {
                  userForIdx = class_21.getUnsignedByte(data[newIndex]);
                  ++newIndex;
                  this.field_318[updateIndex] = new String(data, newIndex, userForIdx);
                  newIndex += userForIdx;
                  ++updateIndex;
               } while(updateIndex < updateSize);

               return;
            }

            if(opcode == 245) {
               this.field_316 = false;
               return;
            }

            if(opcode == 244) {
               this.loadingArea = true;
               this.localPlayerServerIndex = class_21.readUnsignedShort(data, 1);
               this.planeWidth = class_21.readUnsignedShort(data, 3);
               this.planeHeight = class_21.readUnsignedShort(data, 5);
               this.planeIndex = class_21.readUnsignedShort(data, 7);
               this.planeMultiplier = class_21.readUnsignedShort(data, 9);
               this.planeHeight -= this.planeIndex * this.planeMultiplier;
               return;
            }

            if(opcode == 243) {
               updateSize = 1;
               newIndex = 0;
               if(var19 != 0) {
                  this.playerStatCurrent[newIndex] = class_21.getUnsignedByte(data[updateSize++]);
                  ++newIndex;
               }

               while(newIndex < 18) {
                  this.playerStatCurrent[newIndex] = class_21.getUnsignedByte(data[updateSize++]);
                  ++newIndex;
               }

               updateIndex = 0;
               if(var19 != 0) {
                  this.playerStatBase[updateIndex] = class_21.getUnsignedByte(data[updateSize++]);
                  ++updateIndex;
               }

               while(updateIndex < 18) {
                  this.playerStatBase[updateIndex] = class_21.getUnsignedByte(data[updateSize++]);
                  ++updateIndex;
               }

               userForIdx = 0;
               if(var19 != 0) {
                  this.field_191[userForIdx] = class_21.getUnsignedInt(data, updateSize);
                  updateSize += 4;
                  ++userForIdx;
               }

               while(userForIdx < 18) {
                  this.field_191[userForIdx] = class_21.getUnsignedInt(data, updateSize);
                  updateSize += 4;
                  ++userForIdx;
               }

               this.field_193 = class_21.getUnsignedByte(data[updateSize++]);
               return;
            }

            if(opcode == 242) {
               updateSize = 0;
               if(var19 == 0 && updateSize >= 5) {
                  return;
               }

               do {
                  this.field_192[updateSize] = class_21.getUnsignedByte(data[1 + updateSize]);
                  ++updateSize;
               } while(updateSize < 5);

               return;
            }

            if(opcode == 241) {
               this.deathScreenTimeout = 250;
               return;
            }

            if(opcode == 240) {
               updateSize = (var2 - 1) / 4;
               newIndex = 0;
               if(var19 == 0 && newIndex >= updateSize) {
                  return;
               }

               do {
                  updateIndex = this.localRegionX + class_21.method_450(data, 1 + newIndex * 4) >> 3;
                  userForIdx = this.localRegionY + class_21.method_450(data, 3 + newIndex * 4) >> 3;
                  var8 = 0;
                  var9 = 0;
                  if(var19 != 0) {
                     reuseableVar1 = (this.groundItemX[var9] >> 3) - updateIndex;
                     i = (this.groundItemY[var9] >> 3) - userForIdx;
                     if(reuseableVar1 != 0 || i != 0) {
                        if(var9 != var8) {
                           this.groundItemX[var8] = this.groundItemX[var9];
                           this.groundItemY[var8] = this.groundItemY[var9];
                           this.groundItemId[var8] = this.groundItemId[var9];
                           this.field_161[var8] = this.field_161[var9];
                        }

                        ++var8;
                     }

                     ++var9;
                  }

                  for(; var9 < this.psize; ++var9) {
                     reuseableVar1 = (this.groundItemX[var9] >> 3) - updateIndex;
                     i = (this.groundItemY[var9] >> 3) - userForIdx;
                     if(reuseableVar1 != 0 || i != 0) {
                        if(var9 != var8) {
                           this.groundItemX[var8] = this.groundItemX[var9];
                           this.groundItemY[var8] = this.groundItemY[var9];
                           this.groundItemId[var8] = this.groundItemId[var9];
                           this.field_161[var8] = this.field_161[var9];
                        }

                        ++var8;
                     }
                  }

                  this.psize = var8;
                  var8 = 0;
                  reuseableVar1 = 0;
                  if(var19 != 0 || reuseableVar1 < this.field_163) {
                     do {
                        label1693: {
                           i = (this.field_165[reuseableVar1] >> 3) - updateIndex;
                           j = (this.field_166[reuseableVar1] >> 3) - userForIdx;
                           if(i != 0 || j != 0) {
                              if(reuseableVar1 != var8) {
                                 this.field_164[var8] = this.field_164[reuseableVar1];
                                 this.field_164[var8].field_883 = var8;
                                 this.field_165[var8] = this.field_165[reuseableVar1];
                                 this.field_166[var8] = this.field_166[reuseableVar1];
                                 this.field_167[var8] = this.field_167[reuseableVar1];
                                 this.field_168[var8] = this.field_168[reuseableVar1];
                              }

                              ++var8;
                              if(var19 == 0) {
                                 break label1693;
                              }
                           }

                           this.scene.freeModel(this.field_164[reuseableVar1]);
                           this.world.method_327(this.field_165[reuseableVar1], this.field_166[reuseableVar1], this.field_167[reuseableVar1]);
                        }

                        ++reuseableVar1;
                     } while(reuseableVar1 < this.field_163);
                  }

                  this.field_163 = var8;
                  var8 = 0;
                  i = 0;
                  if(var19 == 0 && i >= this.field_172) {
                     this.field_172 = var8;
                     ++newIndex;
                  } else {
                     do {
                        label1694: {
                           j = (this.field_174[i] >> 3) - updateIndex;
                           var13 = (this.field_175[i] >> 3) - userForIdx;
                           if(j != 0 || var13 != 0) {
                              if(i != var8) {
                                 this.field_173[var8] = this.field_173[i];
                                 this.field_173[var8].field_883 = var8 + 10000;
                                 this.field_174[var8] = this.field_174[i];
                                 this.field_175[var8] = this.field_175[i];
                                 this.field_176[var8] = this.field_176[i];
                                 this.field_177[var8] = this.field_177[i];
                              }

                              ++var8;
                              if(var19 == 0) {
                                 break label1694;
                              }
                           }

                           this.scene.freeModel(this.field_173[i]);
                           this.world.method_325(this.field_174[i], this.field_175[i], this.field_176[i], this.field_177[i]);
                        }

                        ++i;
                     } while(i < this.field_172);

                     this.field_172 = var8;
                     ++newIndex;
                  }
               } while(newIndex < updateSize);

               return;
            }

            if(opcode == 239) {
               this.showAppearanceChange = true;
               return;
            }

            if(opcode == 238) {
               updateSize = class_21.readUnsignedShort(data, 1);
               if(this.field_141[updateSize] != null) {
                  this.field_277 = this.field_141[updateSize].username;
               }

               this.field_276 = true;
               this.field_284 = false;
               this.field_285 = false;
               this.field_278 = 0;
               this.field_281 = 0;
               return;
            }

            if(opcode == 237) {
               this.field_276 = false;
               this.field_289 = false;
               return;
            }

            if(opcode == 236) {
               this.field_281 = data[1] & 255;
               updateSize = 2;
               newIndex = 0;
               if(var19 == 0 && newIndex >= this.field_281) {
                  this.field_284 = false;
                  this.field_285 = false;
                  return;
               }

               do {
                  this.field_282[newIndex] = class_21.readUnsignedShort(data, updateSize);
                  updateSize += 2;
                  this.field_283[newIndex] = class_21.getUnsignedInt(data, updateSize);
                  updateSize += 4;
                  ++newIndex;
               } while(newIndex < this.field_281);

               this.field_284 = false;
               this.field_285 = false;
               return;
            }

            byte var38;
            if(opcode == 235) {
               var38 = data[1];
               if(var38 == 1) {
                  this.field_284 = true;
                  return;
               }

               this.field_284 = false;
               return;
            }

            if(opcode == 234) {
               this.field_297 = true;
               var21 = 1;
               updateSize = var21 + 1;
               newIndex = data[var21] & 255;
               byte var24 = data[updateSize++];
               this.field_298 = data[updateSize++] & 255;
               this.field_299 = data[updateSize++] & 255;
               userForIdx = 0;
               if(var19 != 0 || userForIdx < 40) {
                  do {
                     this.field_300[userForIdx] = -1;
                     ++userForIdx;
                  } while(userForIdx < 40);
               }

               var8 = 0;
               if(var19 != 0 || var8 < newIndex) {
                  do {
                     this.field_300[var8] = class_21.readUnsignedShort(data, updateSize);
                     updateSize += 2;
                     this.field_301[var8] = class_21.readUnsignedShort(data, updateSize);
                     updateSize += 2;
                     this.field_302[var8] = data[updateSize++];
                     ++var8;
                  } while(var8 < newIndex);
               }

               if(var24 == 1) {
                  var9 = 39;
                  reuseableVar1 = 0;
                  if(var19 != 0 || reuseableVar1 < this.inventorySize) {
                     while(var9 >= newIndex) {
                        boolean var27 = false;
                        j = 0;
                        if(var19 != 0 || j < 40) {
                           do {
                              if(this.field_300[j] == this.inventoryItemId[reuseableVar1]) {
                                 var27 = true;
                                 if(var19 == 0) {
                                    break;
                                 }
                              }

                              ++j;
                           } while(j < 40);
                        }

                        if(this.inventoryItemId[reuseableVar1] == 10) {
                           var27 = true;
                        }

                        if(!var27) {
                           this.field_300[var9] = this.inventoryItemId[reuseableVar1] & 32767;
                           this.field_301[var9] = 0;
                           this.field_302[var9] = 0;
                           --var9;
                        }

                        ++reuseableVar1;
                        if(reuseableVar1 >= this.inventorySize) {
                           break;
                        }
                     }
                  }
               }

               if(this.field_303 >= 0 && this.field_303 < 40 && this.field_300[this.field_303] != this.field_304) {
                  this.field_303 = -1;
                  this.field_304 = -2;
                  return;
               }
            } else {
               if(opcode == 233) {
                  this.field_297 = false;
                  return;
               }

               if(opcode == 232) {
                  this.field_400 = true;
                  this.field_401.updateText(this.field_403, "");
                  this.field_401.updateText(this.field_404, "");
                  this.field_401.updateText(this.field_405, "");
                  this.field_401.updateText(this.field_406, "");
                  return;
               }

               if(opcode == 229) {
                  var38 = data[1];
                  if(var38 == 1) {
                     this.field_285 = true;
                     return;
                  }

                  this.field_285 = false;
                  return;
               }

               if(opcode == 228) {
                  this.optionCAmeraModeAuto = class_21.getUnsignedByte(data[1]) == 1;
                  this.field_218 = class_21.getUnsignedByte(data[2]) == 1;
                  this.field_219 = class_21.getUnsignedByte(data[3]) == 1;
                  return;
               }

               if(opcode == 227) {
                  updateSize = 0;
                  if(var19 == 0 && updateSize >= var2 - 1) {
                     return;
                  }

                  do {
                     boolean var41 = data[updateSize + 1] == 1;
                     if(!this.field_215[updateSize] && var41) {
                        this.method_64("prayeron");
                     }

                     if(this.field_215[updateSize] && !var41) {
                        this.method_64("prayeroff");
                     }

                     this.field_215[updateSize] = var41;
                     ++updateSize;
                  } while(updateSize < var2 - 1);

                  return;
               }

               if(opcode == 226) {
                  updateSize = 0;
                  if(var19 == 0 && updateSize >= this.field_212) {
                     return;
                  }

                  do {
                     this.field_214[updateSize] = data[updateSize + 1] == 1;
                     ++updateSize;
                  } while(updateSize < this.field_212);

                  return;
               }

               if(opcode == 224) {
                  this.field_378 = true;
                  updateSize = 0;
                  if(var19 == 0 && updateSize >= 5) {
                     return;
                  }

                  do {
                     this.field_387[updateSize] = updateSize;
                     this.field_388[updateSize] = this.field_450[this.field_387[updateSize]];
                     this.field_379.updateText(this.field_384[updateSize], "");
                     this.field_379.updateText(this.field_383[updateSize], updateSize + 1 + ": " + this.field_388[updateSize]);
                     ++updateSize;
                  } while(updateSize < 5);

                  return;
               }

               if(opcode == 222) {
                  this.field_305 = true;
                  var21 = 1;
                  updateSize = var21 + 1;
                  this.field_306 = data[var21] & 255;
                  this.field_314 = data[updateSize++] & 255;
                  newIndex = 0;
                  if(var19 == 0 && newIndex >= this.field_306) {
                     this.method_83();
                     return;
                  }

                  do {
                     label753: {
                        this.field_307[newIndex] = class_21.readUnsignedShort(data, updateSize);
                        updateSize += 2;
                        this.field_308[newIndex] = class_21.readUnsignedByteInt(data, updateSize);
                        if(this.field_308[newIndex] >= 128) {
                           updateSize += 4;
                           if(var19 == 0) {
                              break label753;
                           }
                        }

                        ++updateSize;
                     }

                     ++newIndex;
                  } while(newIndex < this.field_306);

                  this.method_83();
                  return;
               }

               if(opcode == 221) {
                  this.field_305 = false;
                  return;
               }

               if(opcode == 220) {
                  updateSize = data[1] & 255;
                  this.field_191[updateSize] = class_21.getUnsignedInt(data, 2);
                  return;
               }

               if(opcode == 219) {
                  updateSize = class_21.readUnsignedShort(data, 1);
                  if(this.field_141[updateSize] != null) {
                     this.field_250 = this.field_141[updateSize].username;
                  }

                  this.field_249 = true;
                  this.field_251 = 0;
                  this.field_254 = 0;
                  this.field_257 = false;
                  this.field_258 = false;
                  this.field_259 = false;
                  this.field_260 = false;
                  this.field_261 = false;
                  this.field_262 = false;
                  return;
               }

               if(opcode == 218) {
                  this.field_249 = false;
                  this.field_263 = false;
                  return;
               }

               if(opcode == 217) {
                  this.field_289 = true;
                  this.field_290 = false;
                  this.field_276 = false;
                  var21 = 1;
                  this.field_288 = class_21.getUnsignedLong(data, var21);
                  updateSize = var21 + 8;
                  this.field_294 = data[updateSize++] & 255;
                  newIndex = 0;
                  if(var19 != 0) {
                     this.field_295[newIndex] = class_21.readUnsignedShort(data, updateSize);
                     updateSize += 2;
                     this.field_296[newIndex] = class_21.getUnsignedInt(data, updateSize);
                     updateSize += 4;
                     ++newIndex;
                  }

                  while(newIndex < this.field_294) {
                     this.field_295[newIndex] = class_21.readUnsignedShort(data, updateSize);
                     updateSize += 2;
                     this.field_296[newIndex] = class_21.getUnsignedInt(data, updateSize);
                     updateSize += 4;
                     ++newIndex;
                  }

                  this.field_291 = data[updateSize++] & 255;
                  updateIndex = 0;
                  if(var19 == 0 && updateIndex >= this.field_291) {
                     return;
                  }

                  do {
                     this.field_292[updateIndex] = class_21.readUnsignedShort(data, updateSize);
                     updateSize += 2;
                     this.field_293[updateIndex] = class_21.getUnsignedInt(data, updateSize);
                     updateSize += 4;
                     ++updateIndex;
                  } while(updateIndex < this.field_291);

                  return;
               }

               if(opcode == 216) {
                  this.field_254 = data[1] & 255;
                  updateSize = 2;
                  newIndex = 0;
                  if(var19 == 0 && newIndex >= this.field_254) {
                     this.field_257 = false;
                     this.field_258 = false;
                     return;
                  }

                  do {
                     this.field_255[newIndex] = class_21.readUnsignedShort(data, updateSize);
                     updateSize += 2;
                     this.field_256[newIndex] = class_21.getUnsignedInt(data, updateSize);
                     updateSize += 4;
                     ++newIndex;
                  } while(newIndex < this.field_254);

                  this.field_257 = false;
                  this.field_258 = false;
                  return;
               }

               if(opcode == 215) {
                  label718: {
                     if(data[1] == 1) {
                        this.field_259 = true;
                        if(var19 == 0) {
                           break label718;
                        }
                     }

                     this.field_259 = false;
                  }

                  label713: {
                     if(data[2] == 1) {
                        this.field_260 = true;
                        if(var19 == 0) {
                           break label713;
                        }
                     }

                     this.field_260 = false;
                  }

                  label708: {
                     if(data[3] == 1) {
                        this.field_261 = true;
                        if(var19 == 0) {
                           break label708;
                        }
                     }

                     this.field_261 = false;
                  }

                  label703: {
                     if(data[4] == 1) {
                        this.field_262 = true;
                        if(var19 == 0) {
                           break label703;
                        }
                     }

                     this.field_262 = false;
                  }

                  this.field_257 = false;
                  this.field_258 = false;
                  return;
               }

               if(opcode == 214) {
                  label697: {
                     var21 = 1;
                     updateSize = var21 + 1;
                     newIndex = data[var21] & 255;
                     updateIndex = class_21.readUnsignedShort(data, updateSize);
                     updateSize += 2;
                     userForIdx = class_21.readUnsignedByteInt(data, updateSize);
                     if(userForIdx >= 128) {
                        updateSize += 4;
                        if(var19 == 0) {
                           break label697;
                        }
                     }

                     ++updateSize;
                  }

                  label692: {
                     if(userForIdx == 0) {
                        --this.field_306;
                        var8 = newIndex;
                        if(var19 != 0 || newIndex < this.field_306) {
                           do {
                              this.field_307[var8] = this.field_307[var8 + 1];
                              this.field_308[var8] = this.field_308[var8 + 1];
                              ++var8;
                           } while(var8 < this.field_306);
                        }

                        if(var19 == 0) {
                           break label692;
                        }
                     }

                     this.field_307[newIndex] = updateIndex;
                     this.field_308[newIndex] = userForIdx;
                     if(newIndex >= this.field_306) {
                        this.field_306 = newIndex + 1;
                     }
                  }

                  this.method_83();
                  return;
               }

               if(opcode == 213) {
                  var21 = 1;
                  newIndex = 1;
                  updateSize = var21 + 1;
                  updateIndex = data[var21] & 255;
                  userForIdx = class_21.readUnsignedShort(data, updateSize);
                  updateSize += 2;
                  if(class_4.itemStackable[userForIdx & 32767] == 0) {
                     label676: {
                        newIndex = class_21.readUnsignedByteInt(data, updateSize);
                        if(newIndex >= 128) {
                           updateSize += 4;
                           if(var19 == 0) {
                              break label676;
                           }
                        }

                        ++updateSize;
                     }
                  }

                  this.inventoryItemId[updateIndex] = userForIdx & 32767;
                  this.inventoryEquipped[updateIndex] = userForIdx / '\u8000';
                  this.inventoryAmounts[updateIndex] = newIndex;
                  if(updateIndex >= this.inventorySize) {
                     this.inventorySize = updateIndex + 1;
                     return;
                  }
               } else {
                  if(opcode == 212) {
                     updateSize = data[1] & 255;
                     --this.inventorySize;
                     newIndex = updateSize;
                     if(var19 == 0 && updateSize >= this.inventorySize) {
                        return;
                     }

                     do {
                        this.inventoryItemId[newIndex] = this.inventoryItemId[newIndex + 1];
                        this.inventoryAmounts[newIndex] = this.inventoryAmounts[newIndex + 1];
                        this.inventoryEquipped[newIndex] = this.inventoryEquipped[newIndex + 1];
                        ++newIndex;
                     } while(newIndex < this.inventorySize);

                     return;
                  }

                  if(opcode == 211) {
                     var21 = 1;
                     updateSize = var21 + 1;
                     newIndex = data[var21] & 255;
                     this.playerStatCurrent[newIndex] = class_21.getUnsignedByte(data[updateSize++]);
                     this.playerStatBase[newIndex] = class_21.getUnsignedByte(data[updateSize++]);
                     this.field_191[newIndex] = class_21.getUnsignedInt(data, updateSize);
                     updateSize += 4;
                     return;
                  }

                  if(opcode == 210) {
                     var38 = data[1];
                     if(var38 == 1) {
                        this.field_257 = true;
                        return;
                     }

                     this.field_257 = false;
                     return;
                  }

                  if(opcode == 209) {
                     var38 = data[1];
                     if(var38 == 1) {
                        this.field_258 = true;
                        return;
                     }

                     this.field_258 = false;
                     return;
                  }

                  if(opcode == 208) {
                     this.field_263 = true;
                     this.field_264 = false;
                     this.field_249 = false;
                     var21 = 1;
                     this.field_265 = class_21.getUnsignedLong(data, var21);
                     updateSize = var21 + 8;
                     this.field_269 = data[updateSize++] & 255;
                     newIndex = 0;
                     if(var19 != 0) {
                        this.field_270[newIndex] = class_21.readUnsignedShort(data, updateSize);
                        updateSize += 2;
                        this.field_271[newIndex] = class_21.getUnsignedInt(data, updateSize);
                        updateSize += 4;
                        ++newIndex;
                     }

                     while(newIndex < this.field_269) {
                        this.field_270[newIndex] = class_21.readUnsignedShort(data, updateSize);
                        updateSize += 2;
                        this.field_271[newIndex] = class_21.getUnsignedInt(data, updateSize);
                        updateSize += 4;
                        ++newIndex;
                     }

                     this.field_266 = data[updateSize++] & 255;
                     updateIndex = 0;
                     if(var19 != 0) {
                        this.field_267[updateIndex] = class_21.readUnsignedShort(data, updateSize);
                        updateSize += 2;
                        this.field_268[updateIndex] = class_21.getUnsignedInt(data, updateSize);
                        updateSize += 4;
                        ++updateIndex;
                     }

                     while(updateIndex < this.field_266) {
                        this.field_267[updateIndex] = class_21.readUnsignedShort(data, updateSize);
                        updateSize += 2;
                        this.field_268[updateIndex] = class_21.getUnsignedInt(data, updateSize);
                        updateSize += 4;
                        ++updateIndex;
                     }

                     this.field_272 = data[updateSize++] & 255;
                     this.field_273 = data[updateSize++] & 255;
                     this.field_274 = data[updateSize++] & 255;
                     this.field_275 = data[updateSize++] & 255;
                     return;
                  }

                  if(opcode == 207) {
                     String var26 = new String(data, 1, var2 - 1);
                     this.method_64(var26);
                     return;
                  }

                  if(opcode == 206) {
                     if(this.field_443 < 50) {
                        updateSize = data[1] & 255;
                        newIndex = data[2] + this.localRegionX;
                        updateIndex = data[3] + this.localRegionY;
                        this.field_447[this.field_443] = updateSize;
                        this.field_446[this.field_443] = 0;
                        this.field_444[this.field_443] = newIndex;
                        this.field_445[this.field_443] = updateIndex;
                        ++this.field_443;
                        return;
                     }
                  } else if(opcode == 205) {
                     if(!this.field_326) {
                        this.field_330 = class_21.getUnsignedInt(data, 1);
                        this.field_331 = class_21.getUnsignedInt(data, 5);
                        this.field_328 = class_21.getUnsignedInt(data, 9);
                        this.field_332 = (int)(Math.random() * 6.0D);
                        this.showDialogServermessage = true;
                        this.field_326 = true;
                        this.field_329 = null;
                        return;
                     }
                  } else {
                     if(opcode == 204) {
                        this.field_335 = new String(data, 1, var2 - 1);
                        this.showDialogMessage = true;
                        this.field_333 = false;
                        return;
                     }

                     if(opcode == 203) {
                        this.field_335 = new String(data, 1, var2 - 1);
                        this.showDialogMessage = true;
                        this.field_333 = true;
                        return;
                     }

                     if(opcode == 202) {
                        this.field_194 = class_21.readUnsignedShort(data, 1);
                        return;
                     }

                     if(opcode == 201) {
                        if(!this.isSleeping) {
                           this.field_195 = this.field_194;
                        }

                        this.isSleeping = true;
                        super.inputTextCurrent = "";
                        super.inputTextFinal = "";
                        this.surface.method_237(this.field_103 + 1, data);
                        this.sleepingStatusText = null;
                        return;
                     }

                     if(opcode == 200) {
                        this.field_195 = class_21.readUnsignedShort(data, 1);
                        return;
                     }

                     if(opcode == 199) {
                        this.isSleeping = false;
                        return;
                     }

                     if(opcode != 198) {
                        return;
                     }

                     this.sleepingStatusText = "Incorrect - Please wait...";
                  }
               }
            }
         }

         return;
      } catch (RuntimeException var20) {
         if(this.field_90 < 3) {
            super.clientStream.newPacket(17, 743);
            super.clientStream.putUnterminatedString(var20.toString());
            super.clientStream.flushPacket_();
            super.clientStream.newPacket(17, 743);
            super.clientStream.putUnterminatedString("p-type:" + opcode + " p-size:" + var2);
            super.clientStream.flushPacket_();
            super.clientStream.newPacket(17, 743);
            super.clientStream.putUnterminatedString("rx:" + this.localRegionX + " ry:" + this.localRegionY + " num3l:" + this.field_163);
            super.clientStream.flushPacket_();
            String var5 = "";
            updateIndex = 0;
            if(var19 != 0 || updateIndex < 80 && updateIndex < var2) {
               do {
                  var5 = var5 + data[updateIndex] + " ";
                  ++updateIndex;
               } while(updateIndex < 80 && updateIndex < var2);
            }

            super.clientStream.newPacket(17, 743);
            super.clientStream.putUnterminatedString(var5);
            super.clientStream.flushPacket_();
            ++this.field_90;
         }
      }

   }

   // $FF: renamed from: V () void
   public void method_83() {
      int var6 = class_4.field_563;
      this.field_309 = this.field_306;
      int var1 = 0;
      if(var6 != 0) {
         this.field_310[var1] = this.field_307[var1];
         this.field_311[var1] = this.field_308[var1];
         ++var1;
      }

      while(var1 < this.field_306) {
         this.field_310[var1] = this.field_307[var1];
         this.field_311[var1] = this.field_308[var1];
         ++var1;
      }

      int var2 = 0;
      if(var6 != 0 || var2 < this.inventorySize) {
         while(this.field_309 < this.field_314) {
            int var3 = this.inventoryItemId[var2];
            boolean var4 = false;
            int var5 = 0;
            if(var6 != 0 || var5 < this.field_309) {
               do {
                  if(this.field_310[var5] == var3) {
                     var4 = true;
                     if(var6 == 0) {
                        break;
                     }
                  }

                  ++var5;
               } while(var5 < this.field_309);
            }

            if(!var4) {
               this.field_310[this.field_309] = var3;
               this.field_311[this.field_309] = 0;
               ++this.field_309;
            }

            ++var2;
            if(var2 >= this.inventorySize) {
               break;
            }
         }
      }

   }

   // $FF: renamed from: c (int) boolean
   public boolean method_84(int var1) {
      int var2 = this.localPlayer.currentX / 128;
      int var3 = this.localPlayer.currentY / 128;
      int var4 = 2;
      if(class_4.field_563 == 0 && var4 < 1) {
         return true;
      } else {
         do {
            if(var1 == 1 && ((this.world.objectTileDirections[var2][var3 - var4] & 128) == 128 || (this.world.objectTileDirections[var2 - var4][var3] & 128) == 128 || (this.world.objectTileDirections[var2 - var4][var3 - var4] & 128) == 128)) {
               return false;
            }

            if(var1 == 3 && ((this.world.objectTileDirections[var2][var3 + var4] & 128) == 128 || (this.world.objectTileDirections[var2 - var4][var3] & 128) == 128 || (this.world.objectTileDirections[var2 - var4][var3 + var4] & 128) == 128)) {
               return false;
            }

            if(var1 == 5 && ((this.world.objectTileDirections[var2][var3 + var4] & 128) == 128 || (this.world.objectTileDirections[var2 + var4][var3] & 128) == 128 || (this.world.objectTileDirections[var2 + var4][var3 + var4] & 128) == 128)) {
               return false;
            }

            if(var1 == 7 && ((this.world.objectTileDirections[var2][var3 - var4] & 128) == 128 || (this.world.objectTileDirections[var2 + var4][var3] & 128) == 128 || (this.world.objectTileDirections[var2 + var4][var3 - var4] & 128) == 128)) {
               return false;
            }

            if(var1 == 0 && (this.world.objectTileDirections[var2][var3 - var4] & 128) == 128) {
               return false;
            }

            if(var1 == 2 && (this.world.objectTileDirections[var2 - var4][var3] & 128) == 128) {
               return false;
            }

            if(var1 == 4 && (this.world.objectTileDirections[var2][var3 + var4] & 128) == 128) {
               return false;
            }

            if(var1 == 6 && (this.world.objectTileDirections[var2 + var4][var3] & 128) == 128) {
               return false;
            }

            --var4;
         } while(var4 >= 1);

         return true;
      }
   }

   // $FF: renamed from: W () void
   public void method_85() {
      int var3 = class_4.field_563;
      if((this.field_133 & 1) != 1 || !this.method_84(this.field_133)) {
         if((this.field_133 & 1) == 0 && this.method_84(this.field_133)) {
            if(this.method_84(this.field_133 + 1 & 7)) {
               this.field_133 = this.field_133 + 1 & 7;
            } else {
               if(this.method_84(this.field_133 + 7 & 7)) {
                  this.field_133 = this.field_133 + 7 & 7;
               }

            }
         } else {
            int[] var1 = new int[]{1, -1, 2, -2, 3, -3, 4};
            int var2 = 0;
            if(var3 != 0 || var2 < 7) {
               do {
                  if(this.method_84(this.field_133 + var1[var2] + 8 & 7)) {
                     this.field_133 = this.field_133 + var1[var2] + 8 & 7;
                     if(var3 == 0) {
                        break;
                     }
                  }

                  ++var2;
               } while(var2 < 7);
            }

            if((this.field_133 & 1) == 0 && this.method_84(this.field_133)) {
               if(this.method_84(this.field_133 + 1 & 7)) {
                  this.field_133 = this.field_133 + 1 & 7;
               } else {
                  if(this.method_84(this.field_133 + 7 & 7)) {
                     this.field_133 = this.field_133 + 7 & 7;
                  }

               }
            }
         }
      }
   }

   // $FF: renamed from: X () void
   public void drawGame() {
      int var15 = class_4.field_563;
      if(this.deathScreenTimeout != 0) {
         this.surface.fade2black();
         this.surface.drawstringCenter("Oh dear! You are dead...", this.field_96 / 2, this.gameHeight / 2, 7, 16711680);
         this.drawChatMessageTabs();
         this.surface.draw(this.graphics, 0, 0);
      } else if(this.showAppearanceChange) {
         this.handleAppearancePanelControls();
      } else if(this.field_378) {
         this.method_67();
      } else if(this.field_400) {
         this.method_70();
      } else if(this.isSleeping) {
         this.surface.fade2black();
         if(Math.random() < 0.15D) {
            this.surface.drawstringCenter("ZZZ", (int)(Math.random() * 80.0D), (int)(Math.random() * 334.0D), 5, (int)(Math.random() * 1.6777215E7D));
         }

         if(Math.random() < 0.15D) {
            this.surface.drawstringCenter("ZZZ", 512 - (int)(Math.random() * 80.0D), (int)(Math.random() * 334.0D), 5, (int)(Math.random() * 1.6777215E7D));
         }

         label210: {
            this.surface.method_227(this.field_96 / 2 - 100, 160, 200, 40, 0);
            this.surface.drawstringCenter("You are sleeping", this.field_96 / 2, 50, 7, 16776960);
            this.surface.drawstringCenter("Fatigue: " + this.field_195 * 100 / 750 + "%", this.field_96 / 2, 90, 7, 16776960);
            this.surface.drawstringCenter("When you want to wake up just use your", this.field_96 / 2, 140, 5, 16777215);
            this.surface.drawstringCenter("keyboard to type the word in the box below", this.field_96 / 2, 160, 5, 16777215);
            this.surface.drawstringCenter(super.inputTextCurrent + "*", this.field_96 / 2, 180, 5, '\uffff');
            if(this.sleepingStatusText == null) {
               this.surface.method_242(this.field_96 / 2 - 127, 230, this.field_103 + 1);
               if(var15 == 0) {
                  break label210;
               }
            }

            this.surface.drawstringCenter(this.sleepingStatusText, this.field_96 / 2, 260, 5, 16711680);
         }

         this.surface.method_228(this.field_96 / 2 - 128, 229, 257, 42, 16777215);
         this.drawChatMessageTabs();
         this.surface.drawstringCenter("If you can\'t read the word", this.field_96 / 2, 290, 1, 16777215);
         this.surface.drawstringCenter("@yel@click here@whi@ to get a different one", this.field_96 / 2, 305, 1, 16777215);
         this.surface.draw(this.graphics, 0, 0);
      } else if(this.world.playerAlive) {
         int var1 = 0;
         if(var15 != 0) {
            this.scene.freeModel(this.world.gameModelArrayArray2[this.lastHeightOffset][var1]);
            if(this.lastHeightOffset == 0) {
               this.scene.freeModel(this.world.gameModelArrayArray1[1][var1]);
               this.scene.freeModel(this.world.gameModelArrayArray2[1][var1]);
               this.scene.freeModel(this.world.gameModelArrayArray1[2][var1]);
               this.scene.freeModel(this.world.gameModelArrayArray2[2][var1]);
            }
            this.fogOfWar = true;
            if(this.lastHeightOffset == 0 && (this.world.objectTileDirections[this.localPlayer.currentX / 128][this.localPlayer.currentY / 128] & 128) == 0) {
               this.scene.method_170(this.world.gameModelArrayArray2[this.lastHeightOffset][var1]);
               if(this.lastHeightOffset == 0) {
                  this.scene.method_170(this.world.gameModelArrayArray1[1][var1]);
                  this.scene.method_170(this.world.gameModelArrayArray2[1][var1]);
                  this.scene.method_170(this.world.gameModelArrayArray1[2][var1]);
                  this.scene.method_170(this.world.gameModelArrayArray2[2][var1]);
               }

               this.fogOfWar = false;
            }

            ++var1;
         }

				 for (; var1 < 64; ++var1) {
					 this.scene.freeModel(this.world.gameModelArrayArray2[this.lastHeightOffset][var1]);
					 if (this.lastHeightOffset == 0) {
						 this.scene.freeModel(this.world.gameModelArrayArray1[1][var1]);
						 this.scene.freeModel(this.world.gameModelArrayArray2[1][var1]);
						 this.scene.freeModel(this.world.gameModelArrayArray1[2][var1]);
						 this.scene.freeModel(this.world.gameModelArrayArray2[2][var1]);
					 }

					 this.fogOfWar = true;
					 if (this.lastHeightOffset == 0 && (this.world.objectTileDirections[this.localPlayer.currentX / 128][this.localPlayer.currentY / 128] & 128) == 0) {
						 this.scene.method_170(this.world.gameModelArrayArray2[this.lastHeightOffset][var1]);
						 if (this.lastHeightOffset == 0) {
							 this.scene.method_170(this.world.gameModelArrayArray1[1][var1]);
							 this.scene.method_170(this.world.gameModelArrayArray2[1][var1]);
							 this.scene.method_170(this.world.gameModelArrayArray1[2][var1]);
							 this.scene.method_170(this.world.gameModelArrayArray2[2][var1]);
						 }

						 this.fogOfWar = false;
					 }
				 }

         int var2;
         if(this.field_108 != this.field_111) {
            this.field_111 = this.field_108;
            var2 = 0;
            if(var15 != 0 || var2 < this.field_163) {
               do {
                  if(this.field_167[var2] == 97) {
                     this.method_87(var2, "firea" + (this.field_108 + 1));
                  }

                  if(this.field_167[var2] == 274) {
                     this.method_87(var2, "fireplacea" + (this.field_108 + 1));
                  }

                  if(this.field_167[var2] == 1031) {
                     this.method_87(var2, "lightning" + (this.field_108 + 1));
                  }

                  if(this.field_167[var2] == 1036) {
                     this.method_87(var2, "firespell" + (this.field_108 + 1));
                  }

                  if(this.field_167[var2] == 1147) {
                     this.method_87(var2, "spellcharge" + (this.field_108 + 1));
                  }

                  ++var2;
               } while(var2 < this.field_163);
            }
         }

         if(this.field_109 != this.field_112) {
            this.field_112 = this.field_109;
            var2 = 0;
            if(var15 != 0 || var2 < this.field_163) {
               do {
                  if(this.field_167[var2] == 51) {
                     this.method_87(var2, "torcha" + (this.field_109 + 1));
                  }

                  if(this.field_167[var2] == 143) {
                     this.method_87(var2, "skulltorcha" + (this.field_109 + 1));
                  }

                  ++var2;
               } while(var2 < this.field_163);
            }
         }

         if(this.field_110 != this.field_113) {
            this.field_113 = this.field_110;
            var2 = 0;
            if(var15 != 0 || var2 < this.field_163) {
               do {
                  if(this.field_167[var2] == 1142) {
                     this.method_87(var2, "clawspell" + (this.field_110 + 1));
                  }

                  ++var2;
               } while(var2 < this.field_163);
            }
         }

         this.scene.reduceSprites(this.spriteCount);
         this.spriteCount = 0;
         var2 = 0;
         class_7 var3;
         int var4;
         int var5;
         int var6;
         int var7;
         if(var15 != 0) {
            var3 = this.players[var2];
            if(var3.trouserColour != 255) {
               var4 = var3.currentX;
               var5 = var3.currentY;
               var6 = -this.world.getElevation(var4, var5);
               var7 = this.scene.drawSprite(5000 + var2, var4, var6, var5, 145, 220, var2 + 10000);
               ++this.spriteCount;
               if(var3 == this.localPlayer) {
                  this.scene.setFaceSpriteLocalPlayer(var7);
               }

               if(var3.animationCurrent == 8) {
                  this.scene.setCombatXOffset(var7, -30);
               }

               if(var3.animationCurrent == 9) {
                  this.scene.setCombatXOffset(var7, 30);
               }
            }

            ++var2;
         }

         for(; var2 < this.playerCount; ++var2) {
            var3 = this.players[var2];
            if(var3.trouserColour != 255) {
               var4 = var3.currentX;
               var5 = var3.currentY;
               var6 = -this.world.getElevation(var4, var5);
               var7 = this.scene.drawSprite(5000 + var2, var4, var6, var5, 145, 220, var2 + 10000);
               ++this.spriteCount;
               if(var3 == this.localPlayer) {
                  this.scene.setFaceSpriteLocalPlayer(var7);
               }

               if(var3.animationCurrent == 8) {
                  this.scene.setCombatXOffset(var7, -30);
               }

               if(var3.animationCurrent == 9) {
                  this.scene.setCombatXOffset(var7, 30);
               }
            }
         }

         int var16 = 0;
         int var8;
         int var9;
         class_7 var18;
         if(var15 != 0 || var16 < this.playerCount) {
            do {
               class_7 var17 = this.players[var16];
               if(var17.field_637 > 0) {
                  var18 = null;
                  if(var17.field_636 != -1) {
                     var18 = this.field_152[var17.field_636];
                  } else if(var17.field_635 != -1) {
                     var18 = this.field_141[var17.field_635];
                  }

                  if(var18 != null) {
                     var6 = var17.currentX;
                     var7 = var17.currentY;
                     var8 = -this.world.getElevation(var6, var7) - 110;
                     var9 = var18.currentX;
                     int var10 = var18.currentY;
                     int var11 = -this.world.getElevation(var9, var10) - class_4.field_500[var18.field_612] / 2;
                     int var12 = (var6 * var17.field_637 + var9 * (this.field_106 - var17.field_637)) / this.field_106;
                     int var13 = (var8 * var17.field_637 + var11 * (this.field_106 - var17.field_637)) / this.field_106;
                     int var14 = (var7 * var17.field_637 + var10 * (this.field_106 - var17.field_637)) / this.field_106;
                     this.scene.drawSprite(this.field_102 + var17.field_634, var12, var13, var14, 32, 32, 0);
                     ++this.spriteCount;
                  }
               }

               ++var16;
            } while(var16 < this.playerCount);
         }

         var4 = 0;
         if(var15 != 0) {
            var18 = this.field_153[var4];
            var6 = var18.currentX;
            var7 = var18.currentY;
            var8 = -this.world.getElevation(var6, var7);
            var9 = this.scene.drawSprite(20000 + var4, var6, var8, var7, class_4.field_499[var18.field_612], class_4.field_500[var18.field_612], var4 + 30000);
            ++this.spriteCount;
            if(var18.animationCurrent == 8) {
               this.scene.setCombatXOffset(var9, -30);
            }

            if(var18.animationCurrent == 9) {
               this.scene.setCombatXOffset(var9, 30);
            }

            ++var4;
         }

         for(; var4 < this.field_150; ++var4) {
            var18 = this.field_153[var4];
            var6 = var18.currentX;
            var7 = var18.currentY;
            var8 = -this.world.getElevation(var6, var7);
            var9 = this.scene.drawSprite(20000 + var4, var6, var8, var7, class_4.field_499[var18.field_612], class_4.field_500[var18.field_612], var4 + 30000);
            ++this.spriteCount;
            if(var18.animationCurrent == 8) {
               this.scene.setCombatXOffset(var9, -30);
            }

            if(var18.animationCurrent == 9) {
               this.scene.setCombatXOffset(var9, 30);
            }
         }

         var5 = 0;
         if(var15 != 0 || var5 < this.psize) {
            do {
               var6 = this.groundItemX[var5] * this.magicLoc + 64;
               var7 = this.groundItemY[var5] * this.magicLoc + 64;
               this.scene.drawSprite('\u9c40' + this.groundItemId[var5], var6, -this.world.getElevation(var6, var7) - this.field_161[var5], var7, 96, 64, var5 + 20000);
               ++this.spriteCount;
               ++var5;
            } while(var5 < this.psize);
         }

         var6 = 0;
         if(var15 != 0) {
            var7 = this.field_444[var6] * this.magicLoc + 64;
            var8 = this.field_445[var6] * this.magicLoc + 64;
            var9 = this.field_447[var6];
            if(var9 == 0) {
               this.scene.drawSprite('\uc350' + var6, var7, -this.world.getElevation(var7, var8), var8, 128, 256, var6 + '\uc350');
               ++this.spriteCount;
            }

            if(var9 == 1) {
               this.scene.drawSprite('\uc350' + var6, var7, -this.world.getElevation(var7, var8), var8, 128, 64, var6 + '\uc350');
               ++this.spriteCount;
            }

            ++var6;
         }

         for(; var6 < this.field_443; ++var6) {
            var7 = this.field_444[var6] * this.magicLoc + 64;
            var8 = this.field_445[var6] * this.magicLoc + 64;
            var9 = this.field_447[var6];
            if(var9 == 0) {
               this.scene.drawSprite('\uc350' + var6, var7, -this.world.getElevation(var7, var8), var8, 128, 256, var6 + '\uc350');
               ++this.spriteCount;
            }

            if(var9 == 1) {
               this.scene.drawSprite('\uc350' + var6, var7, -this.world.getElevation(var7, var8), var8, 128, 64, var6 + '\uc350');
               ++this.spriteCount;
            }
         }

         this.surface.field_747 = false;
         this.surface.method_223();
         this.surface.field_747 = super.field_39;
         if(this.lastHeightOffset == 3) {
            var7 = 40 + (int)(Math.random() * 3.0D);
            var8 = 40 + (int)(Math.random() * 7.0D);
            this.scene.method_211(var7, var8, -50, -10, -50);
         }

         label434: {
            this.field_414 = 0;
            this.field_408 = 0;
            this.field_419 = 0;
            if(this.field_216) {
               if(this.optionCAmeraModeAuto && !this.fogOfWar) {
                  var7 = this.field_133;
                  this.method_85();
                  if(this.field_133 != var7) {
                     this.cameraAutoRotatePlayerY = this.localPlayer.currentX;
                     this.cameraAutoRotatePlayerX = this.localPlayer.currentY;
                  }
               }

               this.scene.field_647 = 3000;
               this.scene.field_648 = 3000;
               this.scene.field_649 = 1;
               this.scene.field_650 = 2800;
               this.field_135 = this.field_133 * 32;
               var7 = this.cameraAutoRotatePlayerY + this.field_85;
               var8 = this.cameraAutoRotatePlayerX + this.field_87;
               this.scene.method_199(var7, -this.world.getElevation(var7, var8), var8, 912, this.field_135 * 4, 0, 2000);
               if(var15 == 0) {
                  break label434;
               }
            }

            if(this.optionCAmeraModeAuto && !this.fogOfWar) {
               this.method_85();
            }

            label242: {
               if(!super.field_39) {
                  this.scene.field_647 = 2400;
                  this.scene.field_648 = 2400;
                  this.scene.field_649 = 1;
                  this.scene.field_650 = 2300;
                  if(var15 == 0) {
                     break label242;
                  }
               }

               this.scene.field_647 = 2200;
               this.scene.field_648 = 2200;
               this.scene.field_649 = 1;
               this.scene.field_650 = 2100;
            }

            var7 = this.cameraAutoRotatePlayerY + this.field_85;
            var8 = this.cameraAutoRotatePlayerX + this.field_87;
            this.scene.method_199(var7, -this.world.getElevation(var7, var8), var8, 912, this.field_135 * 4, 0, this.cameraZoom * 2);
         }

         this.scene.method_187();
         this.method_93();
         if(this.field_114 > 0) {
            this.surface.method_242(this.field_115 - 8, this.field_116 - 8, this.field_99 + 14 + (24 - this.field_114) / 6);
         }

         if(this.field_114 < 0) {
            this.surface.method_242(this.field_115 - 8, this.field_116 - 8, this.field_99 + 18 + (24 + this.field_114) / 6);
         }

         if(!this.loadingArea) {
            var7 = 2203 - (this.localRegionY + this.planeHeight + this.regionY);
            if(this.localRegionX + this.planeWidth + this.regionX >= 2640) {
               var7 = -50;
            }

            if(var7 > 0) {
               var8 = 1 + var7 / 6;
               this.surface.method_242(453, this.gameHeight - 56, this.field_99 + 13);
               this.surface.drawstringCenter("Wilderness", 465, this.gameHeight - 20, 1, 16776960);
               this.surface.drawstringCenter("Level: " + var8, 465, this.gameHeight - 7, 1, 16776960);
               if(this.field_339 == 0) {
                  this.field_339 = 2;
               }
            }

            if(this.field_339 == 0 && var7 > -10 && var7 <= 0) {
               this.field_339 = 1;
            }
         }

         if(this.messageTabSelected == 0) {
            var7 = 0;
            if(var15 != 0 || var7 < this.field_246) {
               do {
                  if(this.field_248[var7] > 0) {
                     String var19 = this.field_247[var7];
                     this.surface.method_267(var19, 7, this.gameHeight - 18 - var7 * 12, 1, 16776960);
                  }

                  ++var7;
               } while(var7 < this.field_246);
            }
         }

         label437: {
            this.panelMessageTabs.method_310(this.controlTextListChat);
            this.panelMessageTabs.method_310(this.controlTextListQuest);
            this.panelMessageTabs.method_310(this.controlTextListPrivate);
            if(this.messageTabSelected == 1) {
               this.panelMessageTabs.method_309(this.controlTextListChat);
               if(var15 == 0) {
                  break label437;
               }
            }

            if(this.messageTabSelected == 2) {
               this.panelMessageTabs.method_309(this.controlTextListQuest);
               if(var15 == 0) {
                  break label437;
               }
            }

            if(this.messageTabSelected == 3) {
               this.panelMessageTabs.method_309(this.controlTextListPrivate);
            }
         }

         class_11.field_806 = 2;
         this.panelMessageTabs.method_278();
         class_11.field_806 = 0;
         this.surface.method_244(this.surface.field_723 - 3 - 197, 3, this.field_99, 128);
         this.method_105();
         this.surface.loggedIn = false;
         this.drawChatMessageTabs();
         this.surface.draw(this.graphics, 0, 0);
      }
   }

   // $FF: renamed from: c (int, java.lang.String) void
   public void method_87(int var1, String var2) {
      int var3 = this.field_165[var1];
      int var4 = this.field_166[var1];
      int var5 = var3 - this.localPlayer.currentX / 128;
      int var6 = var4 - this.localPlayer.currentY / 128;
      byte var7 = 7;
      if(var3 >= 0 && var4 >= 0 && var3 < 96 && var4 < 96 && var5 > -var7 && var5 < var7 && var6 > -var7 && var6 < var7) {
         this.scene.freeModel(this.field_164[var1]);
         int var8 = class_4.method_135(var2);
         Scene var9 = this.field_169[var8].method_390();
         this.scene.method_170(var9);
         var9.method_371(true, 48, 48, -50, -10, -50);
         var9.method_392(this.field_164[var1]);
         var9.field_883 = var1;
         this.field_164[var1] = var9;
      }

   }

   // $FF: renamed from: Y () void
   public void drawChatMessageTabs() {
      this.surface.method_242(0, this.gameHeight - 4, this.field_99 + 23);
      int var1 = class_9.method_234(200, 200, 255);
      if(this.messageTabSelected == 0) {
         var1 = class_9.method_234(255, 200, 50);
      }

      if(this.field_236 % 30 > 15) {
         var1 = class_9.method_234(255, 50, 50);
      }

      this.surface.drawstringCenter("All messages", 54, this.gameHeight + 6, 0, var1);
      var1 = class_9.method_234(200, 200, 255);
      if(this.messageTabSelected == 1) {
         var1 = class_9.method_234(255, 200, 50);
      }

      if(this.field_237 % 30 > 15) {
         var1 = class_9.method_234(255, 50, 50);
      }

      this.surface.drawstringCenter("Chat history", 155, this.gameHeight + 6, 0, var1);
      var1 = class_9.method_234(200, 200, 255);
      if(this.messageTabSelected == 2) {
         var1 = class_9.method_234(255, 200, 50);
      }

      if(this.field_238 % 30 > 15) {
         var1 = class_9.method_234(255, 50, 50);
      }

      this.surface.drawstringCenter("Quest history", 255, this.gameHeight + 6, 0, var1);
      var1 = class_9.method_234(200, 200, 255);
      if(this.messageTabSelected == 3) {
         var1 = class_9.method_234(255, 200, 50);
      }

      if(this.field_239 % 30 > 15) {
         var1 = class_9.method_234(255, 50, 50);
      }

      this.surface.drawstringCenter("Private history", 355, this.gameHeight + 6, 0, var1);
      this.surface.drawstringCenter("Report abuse", 457, this.gameHeight + 6, 0, 16777215);
   }

   // $FF: renamed from: a (int, int, int, int, int, int, int) void
   public void method_89(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = this.field_447[var5];
      int var9 = this.field_446[var5];
      int var10;
      if(var8 == 0) {
         var10 = 255 + var9 * 5 * 256;
         this.surface.method_224(var1 + var3 / 2, var2 + var4 / 2, 20 + var9 * 2, var10, 255 - var9 * 5);
      }

      if(var8 == 1) {
         var10 = 16711680 + var9 * 5 * 256;
         this.surface.method_224(var1 + var3 / 2, var2 + var4 / 2, 10 + var9, var10, 255 - var9 * 5);
      }

   }

   // $FF: renamed from: b (int, int, int, int, int, int, int) void
   public void method_90(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = class_4.field_477[var5] + this.field_101;
      int var9 = class_4.field_482[var5];
      this.surface.method_258(var1, var2, var3, var4, var8, var9, 0, 0, false);
   }

   // $FF: renamed from: c (int, int, int, int, int, int, int) void
   public void method_91(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      class_7 var8;
      int var9;
      boolean var10;
      int var11;
      int var23;
      label172: {
         var23 = class_4.field_563;
         var8 = this.field_153[var5];
         var9 = var8.animationCurrent + (this.field_135 + 16) / 32 & 7;
         var10 = false;
         var11 = var9;
         if(var9 == 5) {
            var11 = 3;
            var10 = true;
            if(var23 == 0) {
               break label172;
            }
         }

         if(var11 == 6) {
            var11 = 2;
            var10 = true;
            if(var23 == 0) {
               break label172;
            }
         }

         if(var11 == 7) {
            var11 = 1;
            var10 = true;
         }
      }

      int var12;
      label104: {
         var12 = var11 * 3 + this.field_438[var8.field_613 / class_4.field_501[var8.field_612] % 4];
         if(var8.animationCurrent == 8) {
            var11 = 5;
            var9 = 2;
            var10 = false;
            var1 -= class_4.field_503[var8.field_612] * var7 / 100;
            var12 = var11 * 3 + this.field_439[this.field_76 / (class_4.field_502[var8.field_612] - 1) % 8];
            if(var23 == 0) {
               break label104;
            }
         }

         if(var8.animationCurrent == 9) {
            var11 = 5;
            var9 = 2;
            var10 = true;
            var1 += class_4.field_503[var8.field_612] * var7 / 100;
            var12 = var11 * 3 + this.field_440[this.field_76 / class_4.field_502[var8.field_612] % 8];
         }
      }

      int var13 = 0;
      int var14;
      int var15;
      byte var16;
      byte var17;
      int var18;
      int var19;
      int var20;
      int var21;
      int var22;
      int var24;
      int var25;
      if(var23 != 0) {
         var14 = this.field_425[var9][var13];
         var15 = class_4.field_494[var8.field_612][var14];
         if(var15 >= 0) {
            var16 = 0;
            var17 = 0;
            var18 = var12;
            if(var10 && var11 >= 1 && var11 <= 3 && class_4.field_512[var15] == 1) {
               var18 = var12 + 15;
            }

            if(var11 != 5 || class_4.field_511[var15] == 1) {
               label174: {
                  var19 = var18 + class_4.field_513[var15];
                  var24 = var16 * var3 / this.surface.field_740[var19];
                  var25 = var17 * var4 / this.surface.field_741[var19];
                  var20 = var3 * this.surface.field_740[var19] / this.surface.field_740[class_4.field_513[var15]];
                  var24 -= (var20 - var3) / 2;
                  var21 = class_4.field_509[var15];
                  var22 = 0;
                  if(var21 == 1) {
                     var21 = class_4.field_495[var8.field_612];
                     var22 = class_4.field_498[var8.field_612];
                     if(var23 == 0) {
                        break label174;
                     }
                  }

                  if(var21 == 2) {
                     var21 = class_4.field_496[var8.field_612];
                     var22 = class_4.field_498[var8.field_612];
                     if(var23 == 0) {
                        break label174;
                     }
                  }

                  if(var21 == 3) {
                     var21 = class_4.field_497[var8.field_612];
                     var22 = class_4.field_498[var8.field_612];
                  }
               }

               this.surface.method_258(var1 + var24, var2 + var25, var20, var4, var19, var21, var22, var6, var10);
            }
         }

         ++var13;
      }

      for(; var13 < 12; ++var13) {
         var14 = this.field_425[var9][var13];
         var15 = class_4.field_494[var8.field_612][var14];
         if(var15 >= 0) {
            var16 = 0;
            var17 = 0;
            var18 = var12;
            if(var10 && var11 >= 1 && var11 <= 3 && class_4.field_512[var15] == 1) {
               var18 = var12 + 15;
            }

            if(var11 != 5 || class_4.field_511[var15] == 1) {
               label179: {
                  var19 = var18 + class_4.field_513[var15];
                  var24 = var16 * var3 / this.surface.field_740[var19];
                  var25 = var17 * var4 / this.surface.field_741[var19];
                  var20 = var3 * this.surface.field_740[var19] / this.surface.field_740[class_4.field_513[var15]];
                  var24 -= (var20 - var3) / 2;
                  var21 = class_4.field_509[var15];
                  var22 = 0;
                  if(var21 == 1) {
                     var21 = class_4.field_495[var8.field_612];
                     var22 = class_4.field_498[var8.field_612];
                     if(var23 == 0) {
                        break label179;
                     }
                  }

                  if(var21 == 2) {
                     var21 = class_4.field_496[var8.field_612];
                     var22 = class_4.field_498[var8.field_612];
                     if(var23 == 0) {
                        break label179;
                     }
                  }

                  if(var21 == 3) {
                     var21 = class_4.field_497[var8.field_612];
                     var22 = class_4.field_498[var8.field_612];
                  }
               }

               this.surface.method_258(var1 + var24, var2 + var25, var20, var4, var19, var21, var22, var6, var10);
            }
         }
      }

      if(var8.messageTimer > 0) {
         this.field_412[this.field_408] = this.surface.method_271(var8.messageSent, 1) / 2;
         if(this.field_412[this.field_408] > 150) {
            this.field_412[this.field_408] = 150;
         }

         this.field_413[this.field_408] = this.surface.method_271(var8.messageSent, 1) / 300 * this.surface.method_270(1);
         this.field_410[this.field_408] = var1 + var3 / 2;
         this.field_411[this.field_408] = var2;
         this.field_409[this.field_408++] = var8.messageSent;
      }

      if(var8.animationCurrent == 8 || var8.animationCurrent == 9 || var8.combatTimeout != 0) {
         if(var8.combatTimeout > 0) {
            label73: {
               var14 = var1;
               if(var8.animationCurrent == 8) {
                  var14 = var1 - 20 * var7 / 100;
                  if(var23 == 0) {
                     break label73;
                  }
               }

               if(var8.animationCurrent == 9) {
                  var14 += 20 * var7 / 100;
               }
            }

            var15 = var8.healthCurrent * 30 / var8.healthMax;
            this.field_420[this.field_419] = var14 + var3 / 2;
            this.field_421[this.field_419] = var2;
            this.field_422[this.field_419++] = var15;
         }

         if(var8.combatTimeout > 150) {
            label67: {
               var14 = var1;
               if(var8.animationCurrent == 8) {
                  var14 = var1 - 10 * var7 / 100;
                  if(var23 == 0) {
                     break label67;
                  }
               }

               if(var8.animationCurrent == 9) {
                  var14 += 10 * var7 / 100;
               }
            }

            this.surface.method_242(var14 + var3 / 2 - 12, var2 + var4 / 2 - 12, this.field_99 + 12);
            this.surface.drawstringCenter(String.valueOf(var8.damageTaken), var14 + var3 / 2 - 1, var2 + var4 / 2 + 5, 3, 16777215);
         }
      }

   }

   // $FF: renamed from: d (int, int, int, int, int, int, int) void
   public void method_92(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var23 = class_4.field_563;
      class_7 var8 = this.players[var5];
      if(var8.trouserColour != 255) {
         int var9;
         boolean var10;
         int var11;
         label299: {
            var9 = var8.animationCurrent + (this.field_135 + 16) / 32 & 7;
            var10 = false;
            var11 = var9;
            if(var9 == 5) {
               var11 = 3;
               var10 = true;
               if(var23 == 0) {
                  break label299;
               }
            }

            if(var11 == 6) {
               var11 = 2;
               var10 = true;
               if(var23 == 0) {
                  break label299;
               }
            }

            if(var11 == 7) {
               var11 = 1;
               var10 = true;
            }
         }

         int var12;
         label170: {
            var12 = var11 * 3 + this.field_438[var8.field_613 / 6 % 4];
            if(var8.animationCurrent == 8) {
               var11 = 5;
               var9 = 2;
               var10 = false;
               var1 -= 5 * var7 / 100;
               var12 = var11 * 3 + this.field_439[this.field_76 / 5 % 8];
               if(var23 == 0) {
                  break label170;
               }
            }

            if(var8.animationCurrent == 9) {
               var11 = 5;
               var9 = 2;
               var10 = true;
               var1 += 5 * var7 / 100;
               var12 = var11 * 3 + this.field_440[this.field_76 / 6 % 8];
            }
         }

         int var13 = 0;
         int var14;
         int var15;
         byte var16;
         byte var17;
         int var18;
         int var19;
         int var20;
         int var21;
         int var22;
         int var24;
         int var25;
         if(var23 != 0) {
            var14 = this.field_425[var9][var13];
            var15 = var8.wornItems[var14] - 1;
            if(var15 >= 0) {
               var16 = 0;
               var17 = 0;
               var18 = var12;
               if(var10 && var11 >= 1 && var11 <= 3) {
                  label301: {
                     if(class_4.field_512[var15] == 1) {
                        var18 = var12 + 15;
                        if(var23 == 0) {
                           break label301;
                        }
                     }

                     if(var14 == 4 && var11 == 1) {
                        var16 = -22;
                        var17 = -3;
                        var18 = var11 * 3 + this.field_438[(2 + var8.field_613 / 6) % 4];
                        if(var23 == 0) {
                           break label301;
                        }
                     }

                     if(var14 == 4 && var11 == 2) {
                        var16 = 0;
                        var17 = -8;
                        var18 = var11 * 3 + this.field_438[(2 + var8.field_613 / 6) % 4];
                        if(var23 == 0) {
                           break label301;
                        }
                     }

                     if(var14 == 4 && var11 == 3) {
                        var16 = 26;
                        var17 = -5;
                        var18 = var11 * 3 + this.field_438[(2 + var8.field_613 / 6) % 4];
                        if(var23 == 0) {
                           break label301;
                        }
                     }

                     if(var14 == 3 && var11 == 1) {
                        var16 = 22;
                        var17 = 3;
                        var18 = var11 * 3 + this.field_438[(2 + var8.field_613 / 6) % 4];
                        if(var23 == 0) {
                           break label301;
                        }
                     }

                     if(var14 == 3 && var11 == 2) {
                        var16 = 0;
                        var17 = 8;
                        var18 = var11 * 3 + this.field_438[(2 + var8.field_613 / 6) % 4];
                        if(var23 == 0) {
                           break label301;
                        }
                     }

                     if(var14 == 3 && var11 == 3) {
                        var16 = -26;
                        var17 = 5;
                        var18 = var11 * 3 + this.field_438[(2 + var8.field_613 / 6) % 4];
                     }
                  }
               }

               if(var11 != 5 || class_4.field_511[var15] == 1) {
                  label302: {
                     var19 = var18 + class_4.field_513[var15];
                     var24 = var16 * var3 / this.surface.field_740[var19];
                     var25 = var17 * var4 / this.surface.field_741[var19];
                     var20 = var3 * this.surface.field_740[var19] / this.surface.field_740[class_4.field_513[var15]];
                     var24 -= (var20 - var3) / 2;
                     var21 = class_4.field_509[var15];
                     var22 = this.field_437[var8.skinColour];
                     if(var21 == 1) {
                        var21 = this.field_436[var8.hairColour];
                        if(var23 == 0) {
                           break label302;
                        }
                     }

                     if(var21 == 2) {
                        var21 = this.field_435[var8.topColour];
                        if(var23 == 0) {
                           break label302;
                        }
                     }

                     if(var21 == 3) {
                        var21 = this.field_435[var8.trouserColour];
                     }
                  }

                  this.surface.method_258(var1 + var24, var2 + var25, var20, var4, var19, var21, var22, var6, var10);
               }
            }

            ++var13;
         }

         for(; var13 < 12; ++var13) {
            var14 = this.field_425[var9][var13];
            var15 = var8.wornItems[var14] - 1;
            if(var15 >= 0) {
               var16 = 0;
               var17 = 0;
               var18 = var12;
               if(var10 && var11 >= 1 && var11 <= 3) {
                  label307: {
                     if(class_4.field_512[var15] == 1) {
                        var18 = var12 + 15;
                        if(var23 == 0) {
                           break label307;
                        }
                     }

                     if(var14 == 4 && var11 == 1) {
                        var16 = -22;
                        var17 = -3;
                        var18 = var11 * 3 + this.field_438[(2 + var8.field_613 / 6) % 4];
                        if(var23 == 0) {
                           break label307;
                        }
                     }

                     if(var14 == 4 && var11 == 2) {
                        var16 = 0;
                        var17 = -8;
                        var18 = var11 * 3 + this.field_438[(2 + var8.field_613 / 6) % 4];
                        if(var23 == 0) {
                           break label307;
                        }
                     }

                     if(var14 == 4 && var11 == 3) {
                        var16 = 26;
                        var17 = -5;
                        var18 = var11 * 3 + this.field_438[(2 + var8.field_613 / 6) % 4];
                        if(var23 == 0) {
                           break label307;
                        }
                     }

                     if(var14 == 3 && var11 == 1) {
                        var16 = 22;
                        var17 = 3;
                        var18 = var11 * 3 + this.field_438[(2 + var8.field_613 / 6) % 4];
                        if(var23 == 0) {
                           break label307;
                        }
                     }

                     if(var14 == 3 && var11 == 2) {
                        var16 = 0;
                        var17 = 8;
                        var18 = var11 * 3 + this.field_438[(2 + var8.field_613 / 6) % 4];
                        if(var23 == 0) {
                           break label307;
                        }
                     }

                     if(var14 == 3 && var11 == 3) {
                        var16 = -26;
                        var17 = 5;
                        var18 = var11 * 3 + this.field_438[(2 + var8.field_613 / 6) % 4];
                     }
                  }
               }

               if(var11 != 5 || class_4.field_511[var15] == 1) {
                  label308: {
                     var19 = var18 + class_4.field_513[var15];
                     var24 = var16 * var3 / this.surface.field_740[var19];
                     var25 = var17 * var4 / this.surface.field_741[var19];
                     var20 = var3 * this.surface.field_740[var19] / this.surface.field_740[class_4.field_513[var15]];
                     var24 -= (var20 - var3) / 2;
                     var21 = class_4.field_509[var15];
                     var22 = this.field_437[var8.skinColour];
                     if(var21 == 1) {
                        var21 = this.field_436[var8.hairColour];
                        if(var23 == 0) {
                           break label308;
                        }
                     }

                     if(var21 == 2) {
                        var21 = this.field_435[var8.topColour];
                        if(var23 == 0) {
                           break label308;
                        }
                     }

                     if(var21 == 3) {
                        var21 = this.field_435[var8.trouserColour];
                     }
                  }

                  this.surface.method_258(var1 + var24, var2 + var25, var20, var4, var19, var21, var22, var6, var10);
               }
            }
         }

         if(var8.messageTimer > 0) {
            this.field_412[this.field_408] = this.surface.method_271(var8.messageSent, 1) / 2;
            if(this.field_412[this.field_408] > 150) {
               this.field_412[this.field_408] = 150;
            }

            this.field_413[this.field_408] = this.surface.method_271(var8.messageSent, 1) / 300 * this.surface.method_270(1);
            this.field_410[this.field_408] = var1 + var3 / 2;
            this.field_411[this.field_408] = var2;
            this.field_409[this.field_408++] = var8.messageSent;
         }

         if(var8.bubbleTimer > 0) {
            this.field_415[this.field_414] = var1 + var3 / 2;
            this.field_416[this.field_414] = var2;
            this.field_417[this.field_414] = var7;
            this.field_418[this.field_414++] = var8.bubbleItemId;
         }

         if(var8.animationCurrent == 8 || var8.animationCurrent == 9 || var8.combatTimeout != 0) {
            if(var8.combatTimeout > 0) {
               label110: {
                  var14 = var1;
                  if(var8.animationCurrent == 8) {
                     var14 = var1 - 20 * var7 / 100;
                     if(var23 == 0) {
                        break label110;
                     }
                  }

                  if(var8.animationCurrent == 9) {
                     var14 += 20 * var7 / 100;
                  }
               }

               var15 = var8.healthCurrent * 30 / var8.healthMax;
               this.field_420[this.field_419] = var14 + var3 / 2;
               this.field_421[this.field_419] = var2;
               this.field_422[this.field_419++] = var15;
            }

            if(var8.combatTimeout > 150) {
               label104: {
                  var14 = var1;
                  if(var8.animationCurrent == 8) {
                     var14 = var1 - 10 * var7 / 100;
                     if(var23 == 0) {
                        break label104;
                     }
                  }

                  if(var8.animationCurrent == 9) {
                     var14 += 10 * var7 / 100;
                  }
               }

               this.surface.method_242(var14 + var3 / 2 - 12, var2 + var4 / 2 - 12, this.field_99 + 11);
               this.surface.drawstringCenter(String.valueOf(var8.damageTaken), var14 + var3 / 2 - 1, var2 + var4 / 2 + 5, 3, 16777215);
            }
         }

         if(var8.skullType == 1 && var8.bubbleTimer == 0) {
            label96: {
               var14 = var6 + var1 + var3 / 2;
               if(var8.animationCurrent == 8) {
                  var14 -= 20 * var7 / 100;
                  if(var23 == 0) {
                     break label96;
                  }
               }

               if(var8.animationCurrent == 9) {
                  var14 += 20 * var7 / 100;
               }
            }

            var15 = 16 * var7 / 100;
            var24 = 16 * var7 / 100;
            this.surface.method_243(var14 - var15 / 2, var2 - var24 / 2 - 10 * var7 / 100, var15, var24, this.field_99 + 13);
         }

      }
   }

   // $FF: renamed from: Z () void
   public void method_93() {
      int var12 = class_4.field_563;
      int var1 = 0;
      int var2;
      int var3;
      int var4;
      int var5;
      int var6;
      boolean var7;
      int var8;
      if(var12 != 0) {
         var2 = this.surface.method_270(1);
         var3 = this.field_410[var1];
         var4 = this.field_411[var1];
         var5 = this.field_412[var1];
         var6 = this.field_413[var1];
         var7 = true;
         if(var12 == 0 && !var7) {
            this.field_411[var1] = var4;
            this.surface.method_266(this.field_409[var1], var3, var4, 1, 16776960, 300);
            ++var1;
         } else {
            while(true) {
               var7 = false;
               var8 = 0;
               if(var12 != 0 || var8 < var1) {
                  do {
                     if(var4 + var6 > this.field_411[var8] - var2 && var4 - var2 < this.field_411[var8] + this.field_413[var8] && var3 - var5 < this.field_410[var8] + this.field_412[var8] && var3 + var5 > this.field_410[var8] - this.field_412[var8] && this.field_411[var8] - var2 - var6 < var4) {
                        var4 = this.field_411[var8] - var2 - var6;
                        var7 = true;
                     }

                     ++var8;
                  } while(var8 < var1);
               }

               if(!var7) {
                  this.field_411[var1] = var4;
                  this.surface.method_266(this.field_409[var1], var3, var4, 1, 16776960, 300);
                  ++var1;
                  break;
               }
            }
         }
      }

      while(var1 < this.field_408) {
         var2 = this.surface.method_270(1);
         var3 = this.field_410[var1];
         var4 = this.field_411[var1];
         var5 = this.field_412[var1];
         var6 = this.field_413[var1];
         var7 = true;
         if(var12 == 0 && !var7) {
            this.field_411[var1] = var4;
            this.surface.method_266(this.field_409[var1], var3, var4, 1, 16776960, 300);
            ++var1;
         } else {
            do {
               var7 = false;
               var8 = 0;
               if(var12 != 0 || var8 < var1) {
                  do {
                     if(var4 + var6 > this.field_411[var8] - var2 && var4 - var2 < this.field_411[var8] + this.field_413[var8] && var3 - var5 < this.field_410[var8] + this.field_412[var8] && var3 + var5 > this.field_410[var8] - this.field_412[var8] && this.field_411[var8] - var2 - var6 < var4) {
                        var4 = this.field_411[var8] - var2 - var6;
                        var7 = true;
                     }

                     ++var8;
                  } while(var8 < var1);
               }
            } while(var7);

            this.field_411[var1] = var4;
            this.surface.method_266(this.field_409[var1], var3, var4, 1, 16776960, 300);
            ++var1;
         }
      }

      var2 = 0;
      if(var12 != 0 || var2 < this.field_414) {
         do {
            var3 = this.field_415[var2];
            var4 = this.field_416[var2];
            var5 = this.field_417[var2];
            var6 = this.field_418[var2];
            int var13 = 39 * var5 / 100;
            var8 = 27 * var5 / 100;
            int var9 = var4 - var8;
            this.surface.method_245(var3 - var13 / 2, var9, var13, var8, this.field_99 + 9, 85);
            int var10 = 36 * var5 / 100;
            int var11 = 24 * var5 / 100;
            this.surface.method_258(var3 - var10 / 2, var9 + var8 / 2 - var11 / 2, var10, var11, class_4.field_477[var6] + this.field_101, class_4.field_482[var6], 0, 0, false);
            ++var2;
         } while(var2 < this.field_414);
      }

      var3 = 0;
      if(var12 != 0 || var3 < this.field_419) {
         do {
            var4 = this.field_420[var3];
            var5 = this.field_421[var3];
            var6 = this.field_422[var3];
            this.surface.method_225(var4 - 15, var5 - 3, var6, 5, '\uff00', 192);
            this.surface.method_225(var4 - 15 + var6, var5 - 3, 30 - var6, 5, 16711680, 192);
            ++var3;
         } while(var3 < this.field_419);

      }
   }

   // $FF: renamed from: d (int) int
   public int method_94(int var1) {
      int var4 = class_4.field_563;
      int var2 = 0;
      int var3 = 0;
      if(var4 == 0 && var3 >= this.inventorySize) {
         return var2;
      } else {
         do {
            if(this.inventoryItemId[var3] == var1) {
               label16: {
                  if(class_4.itemStackable[var1] == 1) {
                     ++var2;
                     if(var4 == 0) {
                        break label16;
                     }
                  }

                  var2 += this.inventoryAmounts[var3];
               }
            }

            ++var3;
         } while(var3 < this.inventorySize);

         return var2;
      }
   }

   // $FF: renamed from: b (int, int) boolean
   public boolean method_95(int var1, int var2) {
      return var1 == 31 && (this.method_96(197) || this.method_96(615) || this.method_96(682))?true:(var1 == 32 && (this.method_96(102) || this.method_96(616) || this.method_96(683))?true:(var1 == 33 && (this.method_96(101) || this.method_96(617) || this.method_96(684))?true:(var1 == 34 && (this.method_96(103) || this.method_96(618) || this.method_96(685))?true:this.method_94(var1) >= var2)));
   }

   // $FF: renamed from: e (int) boolean
   public boolean method_96(int var1) {
      int var2 = 0;
      if(class_4.field_563 == 0 && var2 >= this.inventorySize) {
         return false;
      } else {
         do {
            if(this.inventoryItemId[var2] == var1 && this.inventoryEquipped[var2] == 1) {
               return true;
            }

            ++var2;
         } while(var2 < this.inventorySize);

         return false;
      }
   }

   // $FF: renamed from: b (int, int, int) void
   public void method_97(int var1, int var2, int var3) {
      this.surface.method_231(var1, var2, var3);
      this.surface.method_231(var1 - 1, var2, var3);
      this.surface.method_231(var1 + 1, var2, var3);
      this.surface.method_231(var1, var2 - 1, var3);
      this.surface.method_231(var1, var2 + 1, var3);
   }

   // $FF: renamed from: a (int, int, int, int, boolean) void
   public void method_98(int var1, int var2, int var3, int var4, boolean var5) {
      this.walkTo(var1, var2, var3, var4, var3, var4, false, var5);
   }

   // $FF: renamed from: b (int, int, int, int, boolean) void
   public void method_99(int var1, int var2, int var3, int var4, boolean var5) {
      if(!this.walkTo(var1, var2, var3, var4, var3, var4, false, var5)) {
         this.walkTo(var1, var2, var3, var4, var3, var4, true, var5);
      }
   }

   // $FF: renamed from: c (int, int, int, int) void
   public void method_100(int var1, int var2, int var3, int var4) {
      int var5;
      int var6;
      label40: {
         if(var3 == 0 || var3 == 4) {
            var5 = class_4.field_520[var4];
            var6 = class_4.field_521[var4];
            if(class_4.field_563 == 0) {
               break label40;
            }
         }

         var6 = class_4.field_520[var4];
         var5 = class_4.field_521[var4];
      }

      if(class_4.field_522[var4] != 2 && class_4.field_522[var4] != 3) {
         this.walkTo(this.localRegionX, this.localRegionY, var1, var2, var1 + var5 - 1, var2 + var6 - 1, true, true);
      } else {
         if(var3 == 0) {
            --var1;
            ++var5;
         }

         if(var3 == 2) {
            ++var6;
         }

         if(var3 == 4) {
            ++var5;
         }

         if(var3 == 6) {
            --var2;
            ++var6;
         }

         this.walkTo(this.localRegionX, this.localRegionY, var1, var2, var1 + var5 - 1, var2 + var6 - 1, false, true);
      }
   }

   // $FF: renamed from: c (int, int, int) void
   public void method_101(int var1, int var2, int var3) {
      if(var3 == 0) {
         this.walkTo(this.localRegionX, this.localRegionY, var1, var2 - 1, var1, var2, false, true);
      } else if(var3 == 1) {
         this.walkTo(this.localRegionX, this.localRegionY, var1 - 1, var2, var1, var2, false, true);
      } else {
         this.walkTo(this.localRegionX, this.localRegionY, var1, var2, var1, var2, true, true);
      }
   }

   // $FF: renamed from: a (int, int, int, int, int, int, boolean, boolean) boolean
   public boolean walkTo(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7, boolean var8) {
      int var11 = class_4.field_563;
      int var9 = this.world.method_321(var1, var2, var3, var4, var5, var6, this.field_80, this.field_81, var7);
      if(var9 == -1) {
         return false;
      } else {
         label34: {
            --var9;
            var1 = this.field_80[var9];
            var2 = this.field_81[var9];
            --var9;
            if(var8) {
               super.clientStream.newPacket(215, 592);
               if(var11 == 0) {
                  break label34;
               }
            }

            super.clientStream.newPacket(194, 770);
         }

         super.clientStream.putShort(var1 + this.regionX);
         super.clientStream.putShort(var2 + this.regionY);
         int var10 = var9;
         if(var11 != 0 || var9 >= 0 && var9 > var9 - 25) {
            do {
               super.clientStream.putByte(this.field_80[var10] - var1);
               super.clientStream.putByte(this.field_81[var10] - var2);
               --var10;
            } while(var10 >= 0 && var10 > var9 - 25);
         }

         super.clientStream.flushPacket_();
         this.field_114 = -24;
         this.field_115 = super.mouseX;
         this.field_116 = super.mouseY;
         return true;
      }
   }

   // $FF: renamed from: c (int, int) boolean
   public boolean loadNextRegion(int localRegionX, int localRegionY) {
      int var19 = class_4.field_563;
      if(this.deathScreenTimeout != 0) {
         this.world.playerAlive = false;
         return false;
      } else {
         this.loadingArea = false;
         localRegionX += this.planeWidth;
         localRegionY += this.planeHeight;
         if(this.lastHeightOffset == this.planeIndex && localRegionX > this.regionToLoadXNeg && localRegionX < this.regionToLoadXPositive && localRegionY > this.regionToLoadYNeg && localRegionY < this.regionToLoadYPositive) {
            this.world.playerAlive = true;
            return false;
         } else {
            this.surface.drawstringCenter("Loading... Please wait", 256, 192, 1, 16777215);
            this.drawChatMessageTabs();
            this.surface.draw(this.graphics, 0, 0);
            int var3 = this.regionX;
            int var4 = this.regionY;
            int var5 = (localRegionX + 24) / 48;
            int var6 = (localRegionY + 24) / 48;
            this.lastHeightOffset = this.planeIndex;
            this.regionX = var5 * 48 - 48;
            this.regionY = var6 * 48 - 48;
            this.regionToLoadXNeg = var5 * 48 - 32;
            this.regionToLoadYNeg = var6 * 48 - 32;
            this.regionToLoadXPositive = var5 * 48 + 32;
            this.regionToLoadYPositive = var6 * 48 + 32;
            this.world.method_348(localRegionX, localRegionY, this.lastHeightOffset);
            this.regionX -= this.planeWidth;
            this.regionY -= this.planeHeight;
            int var7 = this.regionX - var3;
            int var8 = this.regionY - var4;
            int var9 = 0;
            int var10;
            int var11;
            int var12;
            Scene var13;
            int var14;
            int var15;
            int var16;
            int var17;
            int var18;
            if(var19 != 0) {
               this.field_165[var9] -= var7;
               this.field_166[var9] -= var8;
               var10 = this.field_165[var9];
               var11 = this.field_166[var9];
               var12 = this.field_167[var9];
               var13 = this.field_164[var9];

               try {
                  label200: {
                     var14 = this.field_168[var9];
                     if(var14 == 0 || var14 == 4) {
                        var15 = class_4.field_520[var12];
                        var16 = class_4.field_521[var12];
                        if(var19 == 0) {
                           break label200;
                        }
                     }

                     var16 = class_4.field_520[var12];
                     var15 = class_4.field_521[var12];
                  }

                  var17 = (var10 + var10 + var15) * this.magicLoc / 2;
                  var18 = (var11 + var11 + var16) * this.magicLoc / 2;
                  if(var10 >= 0 && var11 >= 0 && var10 < 96 && var11 < 96) {
                     this.scene.method_170(var13);
                     var13.method_378(var17, -this.world.getElevation(var17, var18), var18);
                     this.world.method_326(var10, var11, var12);
                     if(var12 == 74) {
                        var13.method_377(0, -480, 0);
                     }
                  }
               } catch (RuntimeException var22) {
                  System.out.println("Loc Error: " + var22.getMessage()); // authentic System.out.println
                  System.out.println("i:" + var9 + " obj:" + var13); // authentic System.out.println
                  var22.printStackTrace();
               }

               ++var9;
            }

            for(; var9 < this.field_163; ++var9) {
               this.field_165[var9] -= var7;
               this.field_166[var9] -= var8;
               var10 = this.field_165[var9];
               var11 = this.field_166[var9];
               var12 = this.field_167[var9];
               var13 = this.field_164[var9];

               try {
                  label205: {
                     var14 = this.field_168[var9];
                     if(var14 == 0 || var14 == 4) {
                        var15 = class_4.field_520[var12];
                        var16 = class_4.field_521[var12];
                        if(var19 == 0) {
                           break label205;
                        }
                     }

                     var16 = class_4.field_520[var12];
                     var15 = class_4.field_521[var12];
                  }

                  var17 = (var10 + var10 + var15) * this.magicLoc / 2;
                  var18 = (var11 + var11 + var16) * this.magicLoc / 2;
                  if(var10 >= 0 && var11 >= 0 && var10 < 96 && var11 < 96) {
                     this.scene.method_170(var13);
                     var13.method_378(var17, -this.world.getElevation(var17, var18), var18);
                     this.world.method_326(var10, var11, var12);
                     if(var12 == 74) {
                        var13.method_377(0, -480, 0);
                     }
                  }
               } catch (RuntimeException var21) {
                  System.out.println("Loc Error: " + var21.getMessage()); // authentic System.out.println
                  System.out.println("i:" + var9 + " obj:" + var13); // authentic System.out.println
                  var21.printStackTrace();
               }
            }

            var10 = 0;
            int var23;
            if(var19 != 0 || var10 < this.field_172) {
               do {
                  this.field_174[var10] -= var7;
                  this.field_175[var10] -= var8;
                  var11 = this.field_174[var10];
                  var12 = this.field_175[var10];
                  var23 = this.field_177[var10];
                  var14 = this.field_176[var10];

                  try {
                     this.world.method_324(var11, var12, var14, var23);
                     Scene var26 = this.method_104(var11, var12, var14, var23, var10);
                     this.field_173[var10] = var26;
                  } catch (RuntimeException var20) {
                     System.out.println("Bound Error: " + var20.getMessage()); // authentic System.out.println
                     var20.printStackTrace();
                  }

                  ++var10;
               } while(var10 < this.field_172);
            }

            var11 = 0;
            if(var19 != 0) {
               this.groundItemX[var11] -= var7;
               this.groundItemY[var11] -= var8;
               ++var11;
            }

            while(var11 < this.psize) {
               this.groundItemX[var11] -= var7;
               this.groundItemY[var11] -= var8;
               ++var11;
            }

            var12 = 0;
            if(var19 != 0 || var12 < this.playerCount) {
               do {
                  class_7 var24 = this.players[var12];
                  var24.currentX -= var7 * this.magicLoc;
                  var24.currentY -= var8 * this.magicLoc;

                  var14 = 0;
                  if(var19 == 0 && var14 > var24.waypointCurrent) {
                     ++var12;
                  } else {
                     do {
                        var24.waypointsX[var14] -= var7 * this.magicLoc;
                        var24.waypointsY[var14] -= var8 * this.magicLoc;
                        ++var14;
                     } while(var14 <= var24.waypointCurrent);

                     ++var12;
                  }
               } while(var12 < this.playerCount);
            }

            var23 = 0;
            if(var19 == 0 && var23 >= this.field_150) {
               this.world.playerAlive = true;
               return true;
            } else {
               do {
                  class_7 var25 = this.field_153[var23];
                  var25.currentX -= var7 * this.magicLoc;
                  var25.currentY -= var8 * this.magicLoc;
                  var15 = 0;
                  if(var19 == 0 && var15 > var25.waypointCurrent) {
                     ++var23;
                  } else {
                     do {
                        var25.waypointsX[var15] -= var7 * this.magicLoc;
                        var25.waypointsY[var15] -= var8 * this.magicLoc;
                        ++var15;
                     } while(var15 <= var25.waypointCurrent);

                     ++var23;
                  }
               } while(var23 < this.field_150);

               this.world.playerAlive = true;
               return true;
            }
         }
      }
   }

   // $FF: renamed from: b (int, int, int, int, int) a.a.f
   public Scene method_104(int var1, int var2, int var3, int var4, int var5) {
      int var6 = var1;
      int var8 = var1;
      int var9 = var2;
      int var10 = class_4.field_530[var4];
      int var11 = class_4.field_531[var4];
      int var12 = class_4.field_529[var4];
      Scene var13 = new Scene(4, 1);
      if(var3 == 0) {
         var8 = var1 + 1;
      }

      if(var3 == 1) {
         var9 = var2 + 1;
      }

      if(var3 == 2) {
         var6 = var1 + 1;
         var9 = var2 + 1;
      }

      if(var3 == 3) {
         var8 = var1 + 1;
         var9 = var2 + 1;
      }

      var6 *= this.magicLoc;
      int var7 = var2 * this.magicLoc;
      var8 *= this.magicLoc;
      var9 *= this.magicLoc;
      int var14 = var13.method_366(var6, -this.world.getElevation(var6, var7), var7);
      int var15 = var13.method_366(var6, -this.world.getElevation(var6, var7) - var12, var7);
      int var16 = var13.method_366(var8, -this.world.getElevation(var8, var9) - var12, var9);
      int var17 = var13.method_366(var8, -this.world.getElevation(var8, var9), var9);
      int[] var18 = new int[]{var14, var15, var16, var17};
      var13.method_368(4, var18, var10, var11);
      var13.method_371(false, 60, 24, -50, -10, -50);
      if(var1 >= 0 && var2 >= 0 && var1 < 96 && var2 < 96) {
         this.scene.method_170(var13);
      }

      var13.field_883 = var5 + 10000;
      return var13;
   }

   // $FF: renamed from: ba () void
   public void method_105() {
      label157: {
         int var2 = class_4.field_563;
         if(this.logoutTimeout != 0) {
            this.method_110();
            if(var2 == 0) {
               break label157;
            }
         }

         if(this.showDialogServermessage) {
            this.method_108();
            if(var2 == 0) {
               break label157;
            }
         }

         if(this.showDialogMessage) {
            this.method_109();
            if(var2 == 0) {
               break label157;
            }
         }

         if(this.field_339 == 1) {
            this.method_111();
            if(var2 == 0) {
               break label157;
            }
         }

         if(this.field_305 && this.combatTimeout == 0) {
            this.method_115();
            if(var2 == 0) {
               break label157;
            }
         }

         if(this.field_297 && this.combatTimeout == 0) {
            this.drawDialogShop();
            if(var2 == 0) {
               break label157;
            }
         }

         if(this.field_289) {
            this.method_117();
            if(var2 == 0) {
               break label157;
            }
         }

         if(this.field_276) {
            this.method_118();
            if(var2 == 0) {
               break label157;
            }
         }

         if(this.field_263) {
            this.method_119();
            if(var2 == 0) {
               break label157;
            }
         }

         if(this.field_249) {
            this.method_120();
            if(var2 == 0) {
               break label157;
            }
         }

         if(this.field_323 != 0) {
            this.method_113();
            if(var2 == 0) {
               break label157;
            }
         }

         if(this.showDialogReportAbuseStep != 0) {
            this.method_112();
            if(var2 == 0) {
               break label157;
            }
         }

         if(this.field_320 != 0) {
            this.method_114();
            if(var2 == 0) {
               break label157;
            }
         }

         if(this.field_316) {
            this.drawOptionsMenu();
         }

         if(this.localPlayer.animationCurrent == 8 || this.localPlayer.animationCurrent == 9) {
            this.drawDialogCombatStyle();
         }

         this.method_121();
         boolean var1 = !this.field_316 && !this.field_220;
         if(var1) {
            this.field_225 = 0;
         }

         if(this.field_179 == 0 && var1) {
            this.method_128();
         }

         if(this.field_179 == 1) {
            this.method_122(var1);
         }

         if(this.field_179 == 2) {
            this.method_123(var1);
         }

         if(this.field_179 == 3) {
            this.method_124(var1);
         }

         if(this.field_179 == 4) {
            this.method_125(var1);
         }

         if(this.field_179 == 5) {
            this.method_126(var1);
         }

         if(this.field_179 == 6) {
            this.method_127(var1);
         }

         if(!this.field_220 && !this.field_316) {
            this.method_130();
         }

         if(this.field_220 && !this.field_316) {
            this.method_129();
         }
      }

      this.mouseButtonClick = 0;
   }

   // $FF: renamed from: bb () void
   public void drawOptionsMenu() {
      int var3 = class_4.field_563;
      int var1;
      if(this.mouseButtonClick != 0) {
         var1 = 0;
         if(var3 != 0 || var1 < this.field_317) {
            do {
               if(super.mouseX < this.surface.method_271(this.field_318[var1], 1) && super.mouseY > var1 * 12 && super.mouseY < 12 + var1 * 12) {
                  super.clientStream.newPacket(237, 3);
                  super.clientStream.putByte(var1);
                  super.clientStream.flushPacket_();
                  if(var3 == 0) {
                     break;
                  }
               }

               ++var1;
            } while(var1 < this.field_317);
         }

         this.mouseButtonClick = 0;
         this.field_316 = false;
      } else {
         var1 = 0;
         if(var3 != 0 || var1 < this.field_317) {
            do {
               int var2 = '\uffff';
               if(super.mouseX < this.surface.method_271(this.field_318[var1], 1) && super.mouseY > var1 * 12 && super.mouseY < 12 + var1 * 12) {
                  var2 = 16711680;
               }

               this.surface.method_267(this.field_318[var1], 6, 12 + var1 * 12, 1, var2);
               ++var1;
            } while(var1 < this.field_317);

         }
      }
   }

   // $FF: renamed from: bc () void
   public void drawDialogCombatStyle() {
      int var5 = class_4.field_563;
      byte var1 = 7;
      byte var2 = 15;
      short var3 = 175;
      int var4;
      if(this.mouseButtonClick != 0) {
         var4 = 0;
         if(var5 != 0 || var4 < 5) {
            do {
               if(var4 > 0 && super.mouseX > var1 && super.mouseX < var1 + var3 && super.mouseY > var2 + var4 * 20 && super.mouseY < var2 + var4 * 20 + 20) {
                  this.field_319 = var4 - 1;
                  this.mouseButtonClick = 0;
                  super.clientStream.newPacket(231, 700);
                  super.clientStream.putByte(this.field_319);
                  super.clientStream.flushPacket_();
                  if(var5 == 0) {
                     break;
                  }
               }

               ++var4;
            } while(var4 < 5);
         }
      }

      var4 = 0;
      if(var5 != 0) {
         label47: {
            if(var4 == this.field_319 + 1) {
               this.surface.method_225(var1, var2 + var4 * 20, var3, 20, class_9.method_234(255, 0, 0), 128);
               if(var5 == 0) {
                  break label47;
               }
            }

            this.surface.method_225(var1, var2 + var4 * 20, var3, 20, class_9.method_234(190, 190, 190), 128);
         }

         this.surface.method_229(var1, var2 + var4 * 20, var3, 0);
         this.surface.method_229(var1, var2 + var4 * 20 + 20, var3, 0);
         ++var4;
      }

      while(var4 < 5) {
         label26: {
            if(var4 == this.field_319 + 1) {
               this.surface.method_225(var1, var2 + var4 * 20, var3, 20, class_9.method_234(255, 0, 0), 128);
               if(var5 == 0) {
                  break label26;
               }
            }

            this.surface.method_225(var1, var2 + var4 * 20, var3, 20, class_9.method_234(190, 190, 190), 128);
         }

         this.surface.method_229(var1, var2 + var4 * 20, var3, 0);
         this.surface.method_229(var1, var2 + var4 * 20 + 20, var3, 0);
         ++var4;
      }

      this.surface.drawstringCenter("Select combat style", var1 + var3 / 2, var2 + 16, 3, 16777215);
      this.surface.drawstringCenter("Controlled (+1 of each)", var1 + var3 / 2, var2 + 36, 3, 0);
      this.surface.drawstringCenter("Aggressive (+3 strength)", var1 + var3 / 2, var2 + 56, 3, 0);
      this.surface.drawstringCenter("Accurate   (+3 attack)", var1 + var3 / 2, var2 + 76, 3, 0);
      this.surface.drawstringCenter("Defensive  (+3 defense)", var1 + var3 / 2, var2 + 96, 3, 0);
   }

   // $FF: renamed from: bd () void
   public void method_108() {
      short var1;
      int var5;
      label113: {
         var5 = class_4.field_563;
         if(this.field_331 > 0) {
            var1 = 180;
            if(var5 == 0) {
               break label113;
            }
         }

         var1 = 100;
      }

      int var2;
      String var3;
      label116: {
         var2 = 167 - var1 / 2;
         this.surface.method_227(56, 167 - var1 / 2, 400, var1, 0);
         this.surface.method_228(56, 167 - var1 / 2, 400, var1, 16777215);
         var2 += 20;
         this.surface.drawstringCenter("Welcome to RuneScape " + this.username, 256, var2, 4, 16776960);
         var2 += 30;
         if(this.field_330 <= 0) {
            var3 = "earlier today";
            if(var5 == 0) {
               break label116;
            }
         }

         if(this.field_330 == 1) {
            var3 = "yesterday";
            if(var5 == 0) {
               break label116;
            }
         }

         var3 = this.field_330 + " days ago";
      }

      this.surface.drawstringCenter("You last logged in " + var3, 256, var2, 1, 16777215);
      var2 += 15;
      if(this.field_329 == null) {
         this.field_329 = this.method_132(this.field_328);
      }

      label117: {
         this.surface.drawstringCenter("from: " + this.field_329, 256, var2, 1, 16777215);
         var2 += 15;
         var2 += 15;
         int var4;
         if(this.field_331 > 0) {
            label119: {
               if(this.field_331 == 14) {
                  var3 = "Earlier today";
                  if(var5 == 0) {
                     break label119;
                  }
               }

               if(this.field_331 == 13) {
                  var3 = "Yesterday";
                  if(var5 == 0) {
                     break label119;
                  }
               }

               var3 = 14 - this.field_331 + " days ago";
            }

            this.surface.drawstringCenter(var3 + " you changed your recovery questions", 256, var2, 1, 16744448);
            var2 += 15;
            this.surface.drawstringCenter("If you do not remember making this change then", 256, var2, 1, 16744448);
            var2 += 15;
            this.surface.drawstringCenter("cancel it and change your password immediately!", 256, var2, 1, 16744448);
            var2 += 15;
            var2 += 15;
            var4 = 16777215;
            if(super.mouseY > var2 - 12 && super.mouseY <= var2 && super.mouseX > 106 && super.mouseX < 406) {
               var4 = 16711680;
            }

            this.surface.drawstringCenter("No that wasn\'t me - Cancel the request!", 256, var2, 1, var4);
            if(var4 == 16711680 && this.mouseButtonClick == 1) {
               super.clientStream.newPacket(196, 651);
               super.clientStream.flushPacket_();
               this.showDialogServermessage = false;
            }

            var2 += 15;
            var4 = 16777215;
            if(super.mouseY > var2 - 12 && super.mouseY <= var2 && super.mouseX > 106 && super.mouseX < 406) {
               var4 = 16711680;
            }

            this.surface.drawstringCenter("That\'s ok, activate the new questions in " + this.field_331 + " days time.", 256, var2, 1, var4);
            if(var4 != 16711680 || this.mouseButtonClick != 1) {
               break label117;
            }

            this.showDialogServermessage = false;
            if(var5 == 0) {
               break label117;
            }
         }

         var4 = 16777215;
         if(super.mouseY > var2 - 12 && super.mouseY <= var2 && super.mouseX > 106 && super.mouseX < 406) {
            var4 = 16711680;
         }

         this.surface.drawstringCenter("Click here to close window", 256, var2, 1, var4);
         if(this.mouseButtonClick == 1) {
            if(var4 == 16711680) {
               this.showDialogServermessage = false;
            }

            if((super.mouseX < 86 || super.mouseX > 426) && (super.mouseY < 167 - var1 / 2 || super.mouseY > 167 + var1 / 2)) {
               this.showDialogServermessage = false;
            }
         }
      }

      this.mouseButtonClick = 0;
   }

   // $FF: renamed from: be () void
   public void method_109() {
      short var1 = 400;
      short var2 = 100;
      if(this.field_333) {
         boolean var5 = true;
         var2 = 300;
      }

      this.surface.method_227(256 - var1 / 2, 167 - var2 / 2, var1, var2, 0);
      this.surface.method_228(256 - var1 / 2, 167 - var2 / 2, var1, var2, 16777215);
      this.surface.method_266(this.field_335, 256, 167 - var2 / 2 + 20, 1, 16777215, var1 - 40);
      int var3 = 157 + var2 / 2;
      int var4 = 16777215;
      if(super.mouseY > var3 - 12 && super.mouseY <= var3 && super.mouseX > 106 && super.mouseX < 406) {
         var4 = 16711680;
      }

      this.surface.drawstringCenter("Click here to close window", 256, var3, 1, var4);
      if(this.mouseButtonClick == 1) {
         if(var4 == 16711680) {
            this.showDialogMessage = false;
         }

         if((super.mouseX < 256 - var1 / 2 || super.mouseX > 256 + var1 / 2) && (super.mouseY < 167 - var2 / 2 || super.mouseY > 167 + var2 / 2)) {
            this.showDialogMessage = false;
         }
      }

      this.mouseButtonClick = 0;
   }

   // $FF: renamed from: bf () void
   public void method_110() {
      this.surface.method_227(126, 137, 260, 60, 0);
      this.surface.method_228(126, 137, 260, 60, 16777215);
      this.surface.drawstringCenter("Logging out...", 256, 173, 5, 16777215);
   }

   // $FF: renamed from: bg () void
   public void method_111() {
      byte var1 = 97;
      this.surface.method_227(86, 77, 340, 180, 0);
      this.surface.method_228(86, 77, 340, 180, 16777215);
      this.surface.drawstringCenter("Warning! Proceed with caution", 256, var1, 4, 16711680);
      int var3 = var1 + 26;
      this.surface.drawstringCenter("If you go much further north you will enter the", 256, var3, 1, 16777215);
      var3 += 13;
      this.surface.drawstringCenter("wilderness. This a very dangerous area where", 256, var3, 1, 16777215);
      var3 += 13;
      this.surface.drawstringCenter("other players can attack you!", 256, var3, 1, 16777215);
      var3 += 22;
      this.surface.drawstringCenter("The further north you go the more dangerous it", 256, var3, 1, 16777215);
      var3 += 13;
      this.surface.drawstringCenter("becomes, but the more treasure you will find.", 256, var3, 1, 16777215);
      var3 += 22;
      this.surface.drawstringCenter("In the wilderness an indicator at the bottom-right", 256, var3, 1, 16777215);
      var3 += 13;
      this.surface.drawstringCenter("of the screen will show the current level of danger", 256, var3, 1, 16777215);
      var3 += 22;
      int var2 = 16777215;
      if(super.mouseY > var3 - 12 && super.mouseY <= var3 && super.mouseX > 181 && super.mouseX < 331) {
         var2 = 16711680;
      }

      this.surface.drawstringCenter("Click here to close window", 256, var3, 1, var2);
      if(this.mouseButtonClick != 0) {
         if(super.mouseY > var3 - 12 && super.mouseY <= var3 && super.mouseX > 181 && super.mouseX < 331) {
            this.field_339 = 2;
         }

         if(super.mouseX < 86 || super.mouseX > 426 || super.mouseY < 77 || super.mouseY > 257) {
            this.field_339 = 2;
         }

         this.mouseButtonClick = 0;
      }

   }

   // $FF: renamed from: bh () void
   public void method_112() {
      int var4 = class_4.field_563;
      int var1;
      int var2;
      if(this.mouseButtonClick != 0) {
         this.mouseButtonClick = 0;
         if(super.mouseX < 56 || super.mouseY < 35 || super.mouseX > 456 || super.mouseY > 325) {
            this.showDialogReportAbuseStep = 0;
            return;
         }

         var1 = 140;
         var2 = 0;
         if(var4 != 0 || var2 < 9) {
            do {
               if(super.mouseX > 66 && super.mouseX < 446 && super.mouseY >= var1 - 12 && super.mouseY < var1 + 3) {
                  this.field_322 = var2;
               }

               var1 += 15;
               ++var2;
            } while(var2 < 9);
         }

         var1 += 45;
         if(super.mouseX > 196 && super.mouseX < 316 && super.mouseY > var1 - 15 && super.mouseY < var1 + 5) {
            this.showDialogReportAbuseStep = 0;
            return;
         }
      }

      if(super.inputTextFinal.length() > 0) {
         String var6 = super.inputTextFinal.trim();
         super.inputTextCurrent = "";
         super.inputTextFinal = "";
         if(var6.length() > 0) {
            long var7 = class_21.hashUsername(var6);
            super.clientStream.newPacket(51, 277);
            super.clientStream.putLong(var7);
            super.clientStream.putByte(this.field_322);
            super.clientStream.flushPacket_();
         }

         this.showDialogReportAbuseStep = 0;
      } else {
         label120: {
            this.surface.method_227(56, 35, 400, 290, 0);
            this.surface.method_228(56, 35, 400, 290, 16777215);
            byte var5 = 50;
            this.surface.drawstringCenter("This form sends a snapshot of the last 60 secs of trade/chat", 256, var5, 1, 16777215);
            var1 = var5 + 15;
            this.surface.drawstringCenter("to customer support. Please only use this for serious abuse", 256, var1, 1, 16777215);
            var1 += 15;
            this.surface.drawstringCenter("If you misuse this form, you will be banned.", 256, var1, 1, 16744448);
            var1 += 15;
            this.surface.drawstringCenter("Do not report abuse unless you were genuinely offended", 256, var1, 1, 16744448);
            var1 += 15;
            var1 += 15;
            this.surface.drawstringCenter("First indicate the type of abuse", 256, var1, 1, 16776960);
            var1 += 15;
            if(this.field_322 == 0) {
               this.surface.method_228(66, var1 - 12, 380, 15, 16777215);
               var2 = 16744448;
               if(var4 == 0) {
                  break label120;
               }
            }

            var2 = 16777215;
         }

         label115: {
            this.surface.drawstringCenter("Non-vulgar insult such as \'idiot\', \'noob\', \'loser\', etc...", 256, var1, 1, var2);
            var1 += 15;
            if(this.field_322 == 1) {
               this.surface.method_228(66, var1 - 12, 380, 15, 16777215);
               var2 = 16744448;
               if(var4 == 0) {
                  break label115;
               }
            }

            var2 = 16777215;
         }

         label110: {
            this.surface.drawstringCenter("Swearing, profanity, or racial abuse directed at me personally", 256, var1, 1, var2);
            var1 += 15;
            if(this.field_322 == 2) {
               this.surface.method_228(66, var1 - 12, 380, 15, 16777215);
               var2 = 16744448;
               if(var4 == 0) {
                  break label110;
               }
            }

            var2 = 16777215;
         }

         label105: {
            this.surface.drawstringCenter("I overheard the player being abusive to someone else", 256, var1, 1, var2);
            var1 += 15;
            if(this.field_322 == 3) {
               this.surface.method_228(66, var1 - 12, 380, 15, 16777215);
               var2 = 16744448;
               if(var4 == 0) {
                  break label105;
               }
            }

            var2 = 16777215;
         }

         label100: {
            this.surface.drawstringCenter("Trade scam - lied about trade to steal items from me", 256, var1, 1, var2);
            var1 += 15;
            if(this.field_322 == 4) {
               this.surface.method_228(66, var1 - 12, 380, 15, 16777215);
               var2 = 16744448;
               if(var4 == 0) {
                  break label100;
               }
            }

            var2 = 16777215;
         }

         label95: {
            this.surface.drawstringCenter("Asking players for their password / trying to steal accounts", 256, var1, 1, var2);
            var1 += 15;
            if(this.field_322 == 5) {
               this.surface.method_228(66, var1 - 12, 380, 15, 16777215);
               var2 = 16744448;
               if(var4 == 0) {
                  break label95;
               }
            }

            var2 = 16777215;
         }

         label90: {
            this.surface.drawstringCenter("Attempting to buy/sell a RuneScape account", 256, var1, 1, var2);
            var1 += 15;
            if(this.field_322 == 6) {
               this.surface.method_228(66, var1 - 12, 380, 15, 16777215);
               var2 = 16744448;
               if(var4 == 0) {
                  break label90;
               }
            }

            var2 = 16777215;
         }

         label85: {
            this.surface.drawstringCenter("Impersonating Jagex staff", 256, var1, 1, var2);
            var1 += 15;
            if(this.field_322 == 7) {
               this.surface.method_228(66, var1 - 12, 380, 15, 16777215);
               var2 = 16744448;
               if(var4 == 0) {
                  break label85;
               }
            }

            var2 = 16777215;
         }

         label80: {
            this.surface.drawstringCenter("Advertising scam website", 256, var1, 1, var2);
            var1 += 15;
            if(this.field_322 == 8) {
               this.surface.method_228(66, var1 - 12, 380, 15, 16777215);
               var2 = 16744448;
               if(var4 == 0) {
                  break label80;
               }
            }

            var2 = 16777215;
         }

         this.surface.drawstringCenter("Other", 256, var1, 1, var2);
         var1 += 15;
         var1 += 11;
         this.surface.drawstringCenter("Then type the name of the offending player, and press enter", 256, var1, 1, 16776960);
         var1 += 15;
         this.surface.drawstringCenter("Name: " + super.inputTextCurrent + "*", 256, var1, 4, 16777215);
         var1 += 19;
         var2 = 16777215;
         if(super.mouseX > 196 && super.mouseX < 316 && super.mouseY > var1 - 15 && super.mouseY < var1 + 5) {
            var2 = 16776960;
         }

         this.surface.drawstringCenter("Click here to cancel", 256, var1, 1, var2);
      }
   }

   // $FF: renamed from: bi () void
   public void method_113() {
      int var4 = class_4.field_563;
      if(this.mouseButtonClick != 0) {
         this.mouseButtonClick = 0;
         if(super.mouseX < 106 || super.mouseY < 150 || super.mouseX > 406 || super.mouseY > 210) {
            this.field_323 = 0;
            return;
         }
      }

      short var1 = 150;
      this.surface.method_227(106, var1, 300, 60, 0);
      this.surface.method_228(106, var1, 300, 60, 16777215);
      int var5 = var1 + 22;
      String var2;
      int var3;
      if(this.field_323 == 6) {
         this.surface.drawstringCenter("Please enter your current password", 256, var5, 4, 16777215);
         var5 += 25;
         var2 = "*";
         var3 = 0;
         if(var4 != 0 || var3 < super.inputTextCurrent.length()) {
            do {
               var2 = "X" + var2;
               ++var3;
            } while(var3 < super.inputTextCurrent.length());
         }

         this.surface.drawstringCenter(var2, 256, var5, 4, 16777215);
         if(super.inputTextFinal.length() > 0) {
            this.field_324 = super.inputTextFinal;
            super.inputTextCurrent = "";
            super.inputTextFinal = "";
            this.field_323 = 1;
            return;
         }
      } else if(this.field_323 == 1) {
         this.surface.drawstringCenter("Please enter your new password", 256, var5, 4, 16777215);
         var5 += 25;
         var2 = "*";
         var3 = 0;
         if(var4 != 0 || var3 < super.inputTextCurrent.length()) {
            do {
               var2 = "X" + var2;
               ++var3;
            } while(var3 < super.inputTextCurrent.length());
         }

         this.surface.drawstringCenter(var2, 256, var5, 4, 16777215);
         if(super.inputTextFinal.length() > 0) {
            this.field_325 = super.inputTextFinal;
            super.inputTextCurrent = "";
            super.inputTextFinal = "";
            this.field_323 = 2;
            if(this.field_325.length() < 5) {
               this.field_323 = 5;
            }

            if(this.field_325.trim().equalsIgnoreCase(this.username.trim())) {
               this.field_323 = 7;
               return;
            }
         }
      } else if(this.field_323 == 2) {
         this.surface.drawstringCenter("Enter password again to confirm", 256, var5, 4, 16777215);
         var5 += 25;
         var2 = "*";
         var3 = 0;
         if(var4 != 0 || var3 < super.inputTextCurrent.length()) {
            do {
               var2 = "X" + var2;
               ++var3;
            } while(var3 < super.inputTextCurrent.length());
         }

         this.surface.drawstringCenter(var2, 256, var5, 4, 16777215);
         if(super.inputTextFinal.length() > 0) {
            if(super.inputTextFinal.equalsIgnoreCase(this.field_325)) {
               this.field_323 = 4;
               this.changePassword(this.field_324, this.field_325);
               return;
            }

            this.field_323 = 3;
            return;
         }
      } else {
         if(this.field_323 == 3) {
            this.surface.drawstringCenter("Passwords do not match!", 256, var5, 4, 16777215);
            var5 += 25;
            this.surface.drawstringCenter("Press any key to close", 256, var5, 4, 16777215);
            return;
         }

         if(this.field_323 == 4) {
            this.surface.drawstringCenter("Ok, your request has been sent", 256, var5, 4, 16777215);
            var5 += 25;
            this.surface.drawstringCenter("Press any key to close", 256, var5, 4, 16777215);
            return;
         }

         if(this.field_323 == 5) {
            this.surface.drawstringCenter("Password must be at", 256, var5, 4, 16777215);
            var5 += 25;
            this.surface.drawstringCenter("least 5 letters long", 256, var5, 4, 16777215);
            return;
         }

         if(this.field_323 == 7) {
            this.surface.drawstringCenter("Your password must not be", 256, var5, 4, 16777215);
            var5 += 25;
            this.surface.drawstringCenter("the same as your username", 256, var5, 4, 16777215);
         }
      }

   }

   // $FF: renamed from: bj () void
   public void method_114() {
      if(this.mouseButtonClick != 0) {
         this.mouseButtonClick = 0;
         if(this.field_320 == 1 && (super.mouseX < 106 || super.mouseY < 145 || super.mouseX > 406 || super.mouseY > 215)) {
            this.field_320 = 0;
            return;
         }

         if(this.field_320 == 2 && (super.mouseX < 6 || super.mouseY < 145 || super.mouseX > 506 || super.mouseY > 215)) {
            this.field_320 = 0;
            return;
         }

         if(this.field_320 == 3 && (super.mouseX < 106 || super.mouseY < 145 || super.mouseX > 406 || super.mouseY > 215)) {
            this.field_320 = 0;
            return;
         }

         if(super.mouseX > 236 && super.mouseX < 276 && super.mouseY > 193 && super.mouseY < 213) {
            this.field_320 = 0;
            return;
         }
      }

      int var1 = 145;
      String var2;
      if(this.field_320 == 1) {
         this.surface.method_227(106, var1, 300, 70, 0);
         this.surface.method_228(106, var1, 300, 70, 16777215);
         var1 += 20;
         this.surface.drawstringCenter("Enter name to add to friends list", 256, var1, 4, 16777215);
         var1 += 20;
         this.surface.drawstringCenter(super.inputTextCurrent + "*", 256, var1, 4, 16777215);
         if(super.inputTextFinal.length() > 0) {
            var2 = super.inputTextFinal.trim();
            super.inputTextCurrent = "";
            super.inputTextFinal = "";
            this.field_320 = 0;
            if(var2.length() > 0 && class_21.hashUsername(var2) != this.localPlayer.usernameHash) {
               this.friendAdd(var2);
            }
         }
      }

      if(this.field_320 == 2) {
         this.surface.method_227(6, var1, 500, 70, 0);
         this.surface.method_228(6, var1, 500, 70, 16777215);
         var1 += 20;
         this.surface.drawstringCenter("Enter message to send to " + class_21.unhashUsername(this.field_208), 256, var1, 4, 16777215);
         var1 += 20;
         this.surface.drawstringCenter(super.field_42 + "*", 256, var1, 4, 16777215);
         if(super.field_43.length() > 0) {
            var2 = super.field_43;
            super.field_42 = "";
            super.field_43 = "";
            this.field_320 = 0;
            int var3 = class_22.prepareToSendChat(var2);
            this.sendPrivateChat(this.field_208, class_22.field_1010, var3);
            var2 = class_22.readChatString(class_22.field_1010, 0, var3);
            var2 = class_20.formatChat(var2);
            this.displayMessage("@pri@You tell " + class_21.unhashUsername(this.field_208) + ": " + var2);
         }
      }

      if(this.field_320 == 3) {
         this.surface.method_227(106, var1, 300, 70, 0);
         this.surface.method_228(106, var1, 300, 70, 16777215);
         var1 += 20;
         this.surface.drawstringCenter("Enter name to add to ignore list", 256, var1, 4, 16777215);
         var1 += 20;
         this.surface.drawstringCenter(super.inputTextCurrent + "*", 256, var1, 4, 16777215);
         if(super.inputTextFinal.length() > 0) {
            var2 = super.inputTextFinal.trim();
            super.inputTextCurrent = "";
            super.inputTextFinal = "";
            this.field_320 = 0;
            if(var2.length() > 0 && class_21.hashUsername(var2) != this.localPlayer.usernameHash) {
               this.ignoreAdd(var2);
            }
         }
      }

      int var4 = 16777215;
      if(super.mouseX > 236 && super.mouseX < 276 && super.mouseY > 193 && super.mouseY < 213) {
         var4 = 16776960;
      }

      this.surface.drawstringCenter("Cancel", 256, 208, 1, var4);
   }

   // $FF: renamed from: bk () void
   public void method_115() {
      int var14 = class_4.field_563;
      short var1 = 408;
      short var2 = 334;
      if(this.field_315 > 0 && this.field_309 <= 48) {
         this.field_315 = 0;
      }

      if(this.field_315 > 1 && this.field_309 <= 96) {
         this.field_315 = 1;
      }

      if(this.field_315 > 2 && this.field_309 <= 144) {
         this.field_315 = 2;
      }

      if(this.field_312 >= this.field_309 || this.field_312 < 0) {
         this.field_312 = -1;
      }

      if(this.field_312 != -1 && this.field_310[this.field_312] != this.field_313) {
         this.field_312 = -1;
         this.field_313 = -2;
      }

      int var3;
      int var4;
      int var5;
      int var6;
      int var7;
      int var8;
      int var9;
      if(this.mouseButtonClick != 0) {
         label666: {
            this.mouseButtonClick = 0;
            var3 = super.mouseX - (256 - var1 / 2);
            var4 = super.mouseY - (170 - var2 / 2);
            if(var3 >= 0 && var4 >= 12 && var3 < 408 && var4 < 280) {
               var5 = this.field_315 * 48;
               var6 = 0;
               if(var14 != 0 || var6 < 6) {
                  do {
                     var7 = 0;
                     if(var14 == 0 && var7 >= 8) {
                        ++var6;
                     } else {
                        do {
                           var8 = 7 + var7 * 49;
                           var9 = 28 + var6 * 34;
                           if(var3 > var8 && var3 < var8 + 49 && var4 > var9 && var4 < var9 + 34 && var5 < this.field_309 && this.field_310[var5] != -1) {
                              this.field_313 = this.field_310[var5];
                              this.field_312 = var5;
                           }

                           ++var5;
                           ++var7;
                        } while(var7 < 8);

                        ++var6;
                     }
                  } while(var6 < 6);
               }

               label581: {
                  var3 = 256 - var1 / 2;
                  var4 = 170 - var2 / 2;
                  if(this.field_312 < 0) {
                     var7 = -1;
                     if(var14 == 0) {
                        break label581;
                     }
                  }

                  var7 = this.field_310[this.field_312];
               }

               if(var7 == -1) {
                  break label666;
               }

               var5 = this.field_311[this.field_312];
               if(class_4.itemStackable[var7] == 1 && var5 > 1) {
                  var5 = 1;
               }

               if(var5 >= 1 && super.mouseX >= var3 + 220 && super.mouseY >= var4 + 238 && super.mouseX < var3 + 250 && super.mouseY <= var4 + 249) {
                  super.clientStream.newPacket(206, 655);
                  super.clientStream.putShort(var7);
                  super.clientStream.putShort(1);
                  super.clientStream.flushPacket_();
               }

               if(var5 >= 5 && super.mouseX >= var3 + 250 && super.mouseY >= var4 + 238 && super.mouseX < var3 + 280 && super.mouseY <= var4 + 249) {
                  super.clientStream.newPacket(206, 655);
                  super.clientStream.putShort(var7);
                  super.clientStream.putShort(5);
                  super.clientStream.flushPacket_();
               }

               if(var5 >= 25 && super.mouseX >= var3 + 280 && super.mouseY >= var4 + 238 && super.mouseX < var3 + 305 && super.mouseY <= var4 + 249) {
                  super.clientStream.newPacket(206, 655);
                  super.clientStream.putShort(var7);
                  super.clientStream.putShort(25);
                  super.clientStream.flushPacket_();
               }

               if(var5 >= 100 && super.mouseX >= var3 + 305 && super.mouseY >= var4 + 238 && super.mouseX < var3 + 335 && super.mouseY <= var4 + 249) {
                  super.clientStream.newPacket(206, 655);
                  super.clientStream.putShort(var7);
                  super.clientStream.putShort(100);
                  super.clientStream.flushPacket_();
               }

               if(var5 >= 500 && super.mouseX >= var3 + 335 && super.mouseY >= var4 + 238 && super.mouseX < var3 + 368 && super.mouseY <= var4 + 249) {
                  super.clientStream.newPacket(206, 655);
                  super.clientStream.putShort(var7);
                  super.clientStream.putShort(500);
                  super.clientStream.flushPacket_();
               }

               if(var5 >= 2500 && super.mouseX >= var3 + 370 && super.mouseY >= var4 + 238 && super.mouseX < var3 + 400 && super.mouseY <= var4 + 249) {
                  super.clientStream.newPacket(206, 655);
                  super.clientStream.putShort(var7);
                  super.clientStream.putShort(2500);
                  super.clientStream.flushPacket_();
               }

               if(this.method_94(var7) >= 1 && super.mouseX >= var3 + 220 && super.mouseY >= var4 + 263 && super.mouseX < var3 + 250 && super.mouseY <= var4 + 274) {
                  super.clientStream.newPacket(205, 523);
                  super.clientStream.putShort(var7);
                  super.clientStream.putShort(1);
                  super.clientStream.flushPacket_();
               }

               if(this.method_94(var7) >= 5 && super.mouseX >= var3 + 250 && super.mouseY >= var4 + 263 && super.mouseX < var3 + 280 && super.mouseY <= var4 + 274) {
                  super.clientStream.newPacket(205, 523);
                  super.clientStream.putShort(var7);
                  super.clientStream.putShort(5);
                  super.clientStream.flushPacket_();
               }

               if(this.method_94(var7) >= 25 && super.mouseX >= var3 + 280 && super.mouseY >= var4 + 263 && super.mouseX < var3 + 305 && super.mouseY <= var4 + 274) {
                  super.clientStream.newPacket(205, 523);
                  super.clientStream.putShort(var7);
                  super.clientStream.putShort(25);
                  super.clientStream.flushPacket_();
               }

               if(this.method_94(var7) >= 100 && super.mouseX >= var3 + 305 && super.mouseY >= var4 + 263 && super.mouseX < var3 + 335 && super.mouseY <= var4 + 274) {
                  super.clientStream.newPacket(205, 523);
                  super.clientStream.putShort(var7);
                  super.clientStream.putShort(100);
                  super.clientStream.flushPacket_();
               }

               if(this.method_94(var7) >= 500 && super.mouseX >= var3 + 335 && super.mouseY >= var4 + 263 && super.mouseX < var3 + 368 && super.mouseY <= var4 + 274) {
                  super.clientStream.newPacket(205, 523);
                  super.clientStream.putShort(var7);
                  super.clientStream.putShort(500);
                  super.clientStream.flushPacket_();
               }

               if(this.method_94(var7) < 2500 || super.mouseX < var3 + 370 || super.mouseY < var4 + 263 || super.mouseX >= var3 + 400 || super.mouseY > var4 + 274) {
                  break label666;
               }

               super.clientStream.newPacket(205, 523);
               super.clientStream.putShort(var7);
               super.clientStream.putShort(2500);
               super.clientStream.flushPacket_();
               if(var14 == 0) {
                  break label666;
               }
            }

            if(this.field_309 > 48 && var3 >= 50 && var3 <= 115 && var4 <= 12) {
               this.field_315 = 0;
               if(var14 == 0) {
                  break label666;
               }
            }

            if(this.field_309 > 48 && var3 >= 115 && var3 <= 180 && var4 <= 12) {
               this.field_315 = 1;
               if(var14 == 0) {
                  break label666;
               }
            }

            if(this.field_309 > 96 && var3 >= 180 && var3 <= 245 && var4 <= 12) {
               this.field_315 = 2;
               if(var14 == 0) {
                  break label666;
               }
            }

            if(this.field_309 > 144 && var3 >= 245 && var3 <= 310 && var4 <= 12) {
               this.field_315 = 3;
               if(var14 == 0) {
                  break label666;
               }
            }

            super.clientStream.newPacket(207, 886);
            super.clientStream.flushPacket_();
            this.field_305 = false;
            return;
         }
      }

      var3 = 256 - var1 / 2;
      var4 = 170 - var2 / 2;
      this.surface.method_227(var3, var4, 408, 12, 192);
      var5 = 10000536;
      this.surface.method_225(var3, var4 + 12, 408, 17, var5, 160);
      this.surface.method_225(var3, var4 + 29, 8, 204, var5, 160);
      this.surface.method_225(var3 + 399, var4 + 29, 9, 204, var5, 160);
      this.surface.method_225(var3, var4 + 233, 408, 47, var5, 160);
      this.surface.method_267("Bank", var3 + 1, var4 + 10, 1, 16777215);
      var6 = 50;
      if(this.field_309 > 48) {
         label545: {
            var7 = 16777215;
            if(this.field_315 == 0) {
               var7 = 16711680;
               if(var14 == 0) {
                  break label545;
               }
            }

            if(super.mouseX > var3 + var6 && super.mouseY >= var4 && super.mouseX < var3 + var6 + 65 && super.mouseY < var4 + 12) {
               var7 = 16776960;
            }
         }

         label540: {
            this.surface.method_267("<page 1>", var3 + var6, var4 + 10, 1, var7);
            var6 += 65;
            var7 = 16777215;
            if(this.field_315 == 1) {
               var7 = 16711680;
               if(var14 == 0) {
                  break label540;
               }
            }

            if(super.mouseX > var3 + var6 && super.mouseY >= var4 && super.mouseX < var3 + var6 + 65 && super.mouseY < var4 + 12) {
               var7 = 16776960;
            }
         }

         this.surface.method_267("<page 2>", var3 + var6, var4 + 10, 1, var7);
         var6 += 65;
      }

      if(this.field_309 > 96) {
         label533: {
            var7 = 16777215;
            if(this.field_315 == 2) {
               var7 = 16711680;
               if(var14 == 0) {
                  break label533;
               }
            }

            if(super.mouseX > var3 + var6 && super.mouseY >= var4 && super.mouseX < var3 + var6 + 65 && super.mouseY < var4 + 12) {
               var7 = 16776960;
            }
         }

         this.surface.method_267("<page 3>", var3 + var6, var4 + 10, 1, var7);
         var6 += 65;
      }

      if(this.field_309 > 144) {
         label526: {
            var7 = 16777215;
            if(this.field_315 == 3) {
               var7 = 16711680;
               if(var14 == 0) {
                  break label526;
               }
            }

            if(super.mouseX > var3 + var6 && super.mouseY >= var4 && super.mouseX < var3 + var6 + 65 && super.mouseY < var4 + 12) {
               var7 = 16776960;
            }
         }

         this.surface.method_267("<page 4>", var3 + var6, var4 + 10, 1, var7);
         var6 += 65;
      }

      var7 = 16777215;
      if(super.mouseX > var3 + 320 && super.mouseY >= var4 && super.mouseX < var3 + 408 && super.mouseY < var4 + 12) {
         var7 = 16711680;
      }

      this.surface.method_264("Close window", var3 + 406, var4 + 10, 1, var7);
      this.surface.method_267("Number in bank in green", var3 + 7, var4 + 24, 1, '\uff00');
      this.surface.method_267("Number held in blue", var3 + 289, var4 + 24, 1, '\uffff');
      var8 = 13684944;
      var9 = this.field_315 * 48;
      int var10 = 0;
      int var11;
      int var12;
      int var13;
      if(var14 != 0) {
         var11 = 0;
         if(var14 == 0 && var11 >= 8) {
            ++var10;
         } else {
            while(true) {
               label494: {
                  var12 = var3 + 7 + var11 * 49;
                  var13 = var4 + 28 + var10 * 34;
                  if(this.field_312 == var9) {
                     this.surface.method_225(var12, var13, 49, 34, 16711680, 160);
                     if(var14 == 0) {
                        break label494;
                     }
                  }

                  this.surface.method_225(var12, var13, 49, 34, var8, 160);
               }

               this.surface.method_228(var12, var13, 50, 35, 0);
               if(var9 < this.field_309 && this.field_310[var9] != -1) {
                  this.surface.method_258(var12, var13, 48, 32, this.field_101 + class_4.field_477[this.field_310[var9]], class_4.field_482[this.field_310[var9]], 0, 0, false);
                  this.surface.method_267(String.valueOf(this.field_311[var9]), var12 + 1, var13 + 10, 1, '\uff00');
                  this.surface.method_264(String.valueOf(this.method_94(this.field_310[var9])), var12 + 47, var13 + 29, 1, '\uffff');
               }

               ++var9;
               ++var11;
               if(var11 >= 8) {
                  ++var10;
                  break;
               }
            }
         }
      }

      while(var10 < 6) {
         var11 = 0;
         if(var14 == 0 && var11 >= 8) {
            ++var10;
         } else {
            do {
               label466: {
                  var12 = var3 + 7 + var11 * 49;
                  var13 = var4 + 28 + var10 * 34;
                  if(this.field_312 == var9) {
                     this.surface.method_225(var12, var13, 49, 34, 16711680, 160);
                     if(var14 == 0) {
                        break label466;
                     }
                  }

                  this.surface.method_225(var12, var13, 49, 34, var8, 160);
               }

               this.surface.method_228(var12, var13, 50, 35, 0);
               if(var9 < this.field_309 && this.field_310[var9] != -1) {
                  this.surface.method_258(var12, var13, 48, 32, this.field_101 + class_4.field_477[this.field_310[var9]], class_4.field_482[this.field_310[var9]], 0, 0, false);
                  this.surface.method_267(String.valueOf(this.field_311[var9]), var12 + 1, var13 + 10, 1, '\uff00');
                  this.surface.method_264(String.valueOf(this.method_94(this.field_310[var9])), var12 + 47, var13 + 29, 1, '\uffff');
               }

               ++var9;
               ++var11;
            } while(var11 < 8);

            ++var10;
         }
      }

      this.surface.method_229(var3 + 5, var4 + 256, 398, 0);
      if(this.field_312 == -1) {
         this.surface.drawstringCenter("Select an object to withdraw or deposit", var3 + 204, var4 + 248, 3, 16776960);
      } else {
         label458: {
            if(this.field_312 < 0) {
               var11 = -1;
               if(var14 == 0) {
                  break label458;
               }
            }

            var11 = this.field_310[this.field_312];
         }

         if(var11 != -1) {
            var9 = this.field_311[this.field_312];
            if(class_4.itemStackable[var11] == 1 && var9 > 1) {
               var9 = 1;
            }

            if(var9 > 0) {
               this.surface.method_267("Withdraw " + class_4.field_474[var11], var3 + 2, var4 + 248, 1, 16777215);
               var7 = 16777215;
               if(super.mouseX >= var3 + 220 && super.mouseY >= var4 + 238 && super.mouseX < var3 + 250 && super.mouseY <= var4 + 249) {
                  var7 = 16711680;
               }

               this.surface.method_267("One", var3 + 222, var4 + 248, 1, var7);
               if(var9 >= 5) {
                  var7 = 16777215;
                  if(super.mouseX >= var3 + 250 && super.mouseY >= var4 + 238 && super.mouseX < var3 + 280 && super.mouseY <= var4 + 249) {
                     var7 = 16711680;
                  }

                  this.surface.method_267("Five", var3 + 252, var4 + 248, 1, var7);
               }

               if(var9 >= 25) {
                  var7 = 16777215;
                  if(super.mouseX >= var3 + 280 && super.mouseY >= var4 + 238 && super.mouseX < var3 + 305 && super.mouseY <= var4 + 249) {
                     var7 = 16711680;
                  }

                  this.surface.method_267("25", var3 + 282, var4 + 248, 1, var7);
               }

               if(var9 >= 100) {
                  var7 = 16777215;
                  if(super.mouseX >= var3 + 305 && super.mouseY >= var4 + 238 && super.mouseX < var3 + 335 && super.mouseY <= var4 + 249) {
                     var7 = 16711680;
                  }

                  this.surface.method_267("100", var3 + 307, var4 + 248, 1, var7);
               }

               if(var9 >= 500) {
                  var7 = 16777215;
                  if(super.mouseX >= var3 + 335 && super.mouseY >= var4 + 238 && super.mouseX < var3 + 368 && super.mouseY <= var4 + 249) {
                     var7 = 16711680;
                  }

                  this.surface.method_267("500", var3 + 337, var4 + 248, 1, var7);
               }

               if(var9 >= 2500) {
                  var7 = 16777215;
                  if(super.mouseX >= var3 + 370 && super.mouseY >= var4 + 238 && super.mouseX < var3 + 400 && super.mouseY <= var4 + 249) {
                     var7 = 16711680;
                  }

                  this.surface.method_267("2500", var3 + 370, var4 + 248, 1, var7);
               }
            }

            if(this.method_94(var11) > 0) {
               this.surface.method_267("Deposit " + class_4.field_474[var11], var3 + 2, var4 + 273, 1, 16777215);
               var7 = 16777215;
               if(super.mouseX >= var3 + 220 && super.mouseY >= var4 + 263 && super.mouseX < var3 + 250 && super.mouseY <= var4 + 274) {
                  var7 = 16711680;
               }

               this.surface.method_267("One", var3 + 222, var4 + 273, 1, var7);
               if(this.method_94(var11) >= 5) {
                  var7 = 16777215;
                  if(super.mouseX >= var3 + 250 && super.mouseY >= var4 + 263 && super.mouseX < var3 + 280 && super.mouseY <= var4 + 274) {
                     var7 = 16711680;
                  }

                  this.surface.method_267("Five", var3 + 252, var4 + 273, 1, var7);
               }

               if(this.method_94(var11) >= 25) {
                  var7 = 16777215;
                  if(super.mouseX >= var3 + 280 && super.mouseY >= var4 + 263 && super.mouseX < var3 + 305 && super.mouseY <= var4 + 274) {
                     var7 = 16711680;
                  }

                  this.surface.method_267("25", var3 + 282, var4 + 273, 1, var7);
               }

               if(this.method_94(var11) >= 100) {
                  var7 = 16777215;
                  if(super.mouseX >= var3 + 305 && super.mouseY >= var4 + 263 && super.mouseX < var3 + 335 && super.mouseY <= var4 + 274) {
                     var7 = 16711680;
                  }

                  this.surface.method_267("100", var3 + 307, var4 + 273, 1, var7);
               }

               if(this.method_94(var11) >= 500) {
                  var7 = 16777215;
                  if(super.mouseX >= var3 + 335 && super.mouseY >= var4 + 263 && super.mouseX < var3 + 368 && super.mouseY <= var4 + 274) {
                     var7 = 16711680;
                  }

                  this.surface.method_267("500", var3 + 337, var4 + 273, 1, var7);
               }

               if(this.method_94(var11) >= 2500) {
                  var7 = 16777215;
                  if(super.mouseX >= var3 + 370 && super.mouseY >= var4 + 263 && super.mouseX < var3 + 400 && super.mouseY <= var4 + 274) {
                     var7 = 16711680;
                  }

                  this.surface.method_267("2500", var3 + 370, var4 + 273, 1, var7);
               }
            }
         }

      }
   }

   // $FF: renamed from: bl () void
   public void drawDialogShop() {
      int var11 = class_4.field_563;
      int var3;
      int var4;
      int var5;
      int var6;
      int expectedPrice;
      if(this.mouseButtonClick != 0) {
         label229: {
            this.mouseButtonClick = 0;
            int var1 = super.mouseX - 52;
            int var2 = super.mouseY - 44;
            if(var1 >= 0 && var2 >= 12 && var1 < 408 && var2 < 246) {
               var3 = 0;
               var4 = 0;
               if(var11 != 0 || var4 < 5) {
                  do {
                     var5 = 0;
                     if(var11 == 0 && var5 >= 8) {
                        ++var4;
                     } else {
                        do {
                           var6 = 7 + var5 * 49;
                           expectedPrice = 28 + var4 * 34;
                           if(var1 > var6 && var1 < var6 + 49 && var2 > expectedPrice && var2 < expectedPrice + 34 && this.field_300[var3] != -1) {
                              this.field_303 = var3;
                              this.field_304 = this.field_300[var3];
                           }

                           ++var3;
                           ++var5;
                        } while(var5 < 8);

                        ++var4;
                     }
                  } while(var4 < 5);
               }

               if(this.field_303 < 0) {
                  break label229;
               }

               var5 = this.field_300[this.field_303];
               if(var5 == -1) {
                  break label229;
               }

               if(this.field_301[this.field_303] > 0 && var1 > 298 && var2 >= 204 && var1 < 408 && var2 <= 215) {
                  var6 = this.field_299 + this.field_302[this.field_303];
                  if(var6 < 10) {
                     var6 = 10;
                  }

                  expectedPrice = var6 * class_4.field_478[var5] / 100;
                  super.clientStream.newPacket(217, 666);
                  super.clientStream.putShort(this.field_300[this.field_303]);
                  super.clientStream.putInt(expectedPrice);
                  super.clientStream.flushPacket_();
               }

               if(this.method_94(var5) <= 0 || var1 <= 2 || var2 < 229 || var1 >= 112 || var2 > 240) {
                  break label229;
               }

               var6 = this.field_298 + this.field_302[this.field_303];
               if(var6 < 10) {
                  var6 = 10;
               }

               expectedPrice = var6 * class_4.field_478[var5] / 100;
               super.clientStream.newPacket(216, 665);
               super.clientStream.putShort(this.field_300[this.field_303]);
               super.clientStream.putInt(expectedPrice);
               super.clientStream.flushPacket_();
               if(var11 == 0) {
                  break label229;
               }
            }

            super.clientStream.newPacket(218, 312);
            super.clientStream.flushPacket_();
            this.field_297 = false;
            return;
         }
      }

      byte var12 = 52;
      byte var13 = 44;
      this.surface.method_227(var12, var13, 408, 12, 192);
      var3 = 10000536;
      this.surface.method_225(var12, var13 + 12, 408, 17, var3, 160);
      this.surface.method_225(var12, var13 + 29, 8, 170, var3, 160);
      this.surface.method_225(var12 + 399, var13 + 29, 9, 170, var3, 160);
      this.surface.method_225(var12, var13 + 199, 408, 47, var3, 160);
      this.surface.method_267("Buying and selling items", var12 + 1, var13 + 10, 1, 16777215);
      var4 = 16777215;
      if(super.mouseX > var12 + 320 && super.mouseY >= var13 && super.mouseX < var12 + 408 && super.mouseY < var13 + 12) {
         var4 = 16711680;
      }

      this.surface.method_264("Close window", var12 + 406, var13 + 10, 1, var4);
      this.surface.method_267("Shops stock in green", var12 + 2, var13 + 24, 1, '\uff00');
      this.surface.method_267("Number you own in blue", var12 + 135, var13 + 24, 1, '\uffff');
      this.surface.method_267("Your money: " + this.method_94(10) + "gp", var12 + 280, var13 + 24, 1, 16776960);
      var5 = 13684944;
      var6 = 0;
      expectedPrice = 0;
      int var8;
      int var9;
      int var10;
      if(var11 != 0) {
         var8 = 0;
         if(var11 == 0 && var8 >= 8) {
            ++expectedPrice;
         } else {
            while(true) {
               label160: {
                  var9 = var12 + 7 + var8 * 49;
                  var10 = var13 + 28 + expectedPrice * 34;
                  if(this.field_303 == var6) {
                     this.surface.method_225(var9, var10, 49, 34, 16711680, 160);
                     if(var11 == 0) {
                        break label160;
                     }
                  }

                  this.surface.method_225(var9, var10, 49, 34, var5, 160);
               }

               this.surface.method_228(var9, var10, 50, 35, 0);
               if(this.field_300[var6] != -1) {
                  this.surface.method_258(var9, var10, 48, 32, this.field_101 + class_4.field_477[this.field_300[var6]], class_4.field_482[this.field_300[var6]], 0, 0, false);
                  this.surface.method_267(String.valueOf(this.field_301[var6]), var9 + 1, var10 + 10, 1, '\uff00');
                  this.surface.method_264(String.valueOf(this.method_94(this.field_300[var6])), var9 + 47, var10 + 10, 1, '\uffff');
               }

               ++var6;
               ++var8;
               if(var8 >= 8) {
                  ++expectedPrice;
                  break;
               }
            }
         }
      }

      while(expectedPrice < 5) {
         var8 = 0;
         if(var11 == 0 && var8 >= 8) {
            ++expectedPrice;
         } else {
            do {
               label132: {
                  var9 = var12 + 7 + var8 * 49;
                  var10 = var13 + 28 + expectedPrice * 34;
                  if(this.field_303 == var6) {
                     this.surface.method_225(var9, var10, 49, 34, 16711680, 160);
                     if(var11 == 0) {
                        break label132;
                     }
                  }

                  this.surface.method_225(var9, var10, 49, 34, var5, 160);
               }

               this.surface.method_228(var9, var10, 50, 35, 0);
               if(this.field_300[var6] != -1) {
                  this.surface.method_258(var9, var10, 48, 32, this.field_101 + class_4.field_477[this.field_300[var6]], class_4.field_482[this.field_300[var6]], 0, 0, false);
                  this.surface.method_267(String.valueOf(this.field_301[var6]), var9 + 1, var10 + 10, 1, '\uff00');
                  this.surface.method_264(String.valueOf(this.method_94(this.field_300[var6])), var9 + 47, var10 + 10, 1, '\uffff');
               }

               ++var6;
               ++var8;
            } while(var8 < 8);

            ++expectedPrice;
         }
      }

      this.surface.method_229(var12 + 5, var13 + 222, 398, 0);
      if(this.field_303 == -1) {
         this.surface.drawstringCenter("Select an object to buy or sell", var12 + 204, var13 + 214, 3, 16776960);
      } else {
         var8 = this.field_300[this.field_303];
         if(var8 != -1) {
            label122: {
               if(this.field_301[this.field_303] > 0) {
                  var9 = this.field_299 + this.field_302[this.field_303];
                  if(var9 < 10) {
                     var9 = 10;
                  }

                  var10 = var9 * class_4.field_478[var8] / 100;
                  this.surface.method_267("Buy a new " + class_4.field_474[var8] + " for " + var10 + "gp", var12 + 2, var13 + 214, 1, 16776960);
                  var4 = 16777215;
                  if(super.mouseX > var12 + 298 && super.mouseY >= var13 + 204 && super.mouseX < var12 + 408 && super.mouseY <= var13 + 215) {
                     var4 = 16711680;
                  }

                  this.surface.method_264("Click here to buy", var12 + 405, var13 + 214, 3, var4);
                  if(var11 == 0) {
                     break label122;
                  }
               }

               this.surface.drawstringCenter("This item is not currently available to buy", var12 + 204, var13 + 214, 3, 16776960);
            }

            if(this.method_94(var8) > 0) {
               var9 = this.field_298 + this.field_302[this.field_303];
               if(var9 < 10) {
                  var9 = 10;
               }

               var10 = var9 * class_4.field_478[var8] / 100;
               this.surface.method_264("Sell your " + class_4.field_474[var8] + " for " + var10 + "gp", var12 + 405, var13 + 239, 1, 16776960);
               var4 = 16777215;
               if(super.mouseX > var12 + 2 && super.mouseY >= var13 + 229 && super.mouseX < var12 + 112 && super.mouseY <= var13 + 240) {
                  var4 = 16711680;
               }

               this.surface.method_267("Click here to sell", var12 + 2, var13 + 239, 3, var4);
               return;
            }

            this.surface.drawstringCenter("You do not have any of this item to sell", var12 + 204, var13 + 239, 3, 16776960);
         }

      }
   }

   // $FF: renamed from: bm () void
   public void method_117() {
      int var7 = class_4.field_563;
      byte var1 = 22;
      byte var2 = 36;
      this.surface.method_227(var1, var2, 468, 16, 192);
      int var3 = 10000536;
      this.surface.method_225(var1, var2 + 16, 468, 246, var3, 160);
      this.surface.drawstringCenter("Please confirm your trade with @yel@" + class_21.unhashUsername(this.field_288), var1 + 234, var2 + 12, 1, 16777215);
      this.surface.drawstringCenter("You are about to give:", var1 + 117, var2 + 30, 1, 16776960);
      int var4 = 0;
      String var5;
      if(var7 != 0) {
         var5 = class_4.field_474[this.field_292[var4]];
         if(class_4.itemStackable[this.field_292[var4]] == 0) {
            var5 = var5 + " (" + this.field_293[var4] + ")";
         }

         this.surface.drawstringCenter(var5, var1 + 117, var2 + 42 + var4 * 12, 1, 16777215);
         ++var4;
      }

      while(var4 < this.field_291) {
         var5 = class_4.field_474[this.field_292[var4]];
         if(class_4.itemStackable[this.field_292[var4]] == 0) {
            var5 = var5 + " (" + this.field_293[var4] + ")";
         }

         this.surface.drawstringCenter(var5, var1 + 117, var2 + 42 + var4 * 12, 1, 16777215);
         ++var4;
      }

      if(this.field_291 == 0) {
         this.surface.drawstringCenter("Nothing!", var1 + 117, var2 + 42, 1, 16777215);
      }

      this.surface.drawstringCenter("In return you will receive:", var1 + 351, var2 + 30, 1, 16776960);
      int var8 = 0;
      String var6;
      if(var7 != 0) {
         var6 = class_4.field_474[this.field_295[var8]];
         if(class_4.itemStackable[this.field_295[var8]] == 0) {
            var6 = var6 + " (" + this.field_296[var8] + ")";
         }

         this.surface.drawstringCenter(var6, var1 + 351, var2 + 42 + var8 * 12, 1, 16777215);
         ++var8;
      }

      while(var8 < this.field_294) {
         var6 = class_4.field_474[this.field_295[var8]];
         if(class_4.itemStackable[this.field_295[var8]] == 0) {
            var6 = var6 + " (" + this.field_296[var8] + ")";
         }

         this.surface.drawstringCenter(var6, var1 + 351, var2 + 42 + var8 * 12, 1, 16777215);
         ++var8;
      }

      if(this.field_294 == 0) {
         this.surface.drawstringCenter("Nothing!", var1 + 351, var2 + 42, 1, 16777215);
      }

      label67: {
         this.surface.drawstringCenter("Are you sure you want to do this?", var1 + 234, var2 + 200, 4, '\uffff');
         this.surface.drawstringCenter("There is NO WAY to reverse a trade if you change your mind.", var1 + 234, var2 + 215, 1, 16777215);
         this.surface.drawstringCenter("Remember that not all players are trustworthy", var1 + 234, var2 + 230, 1, 16777215);
         if(!this.field_290) {
            this.surface.method_242(var1 + 118 - 35, var2 + 238, this.field_99 + 25);
            this.surface.method_242(var1 + 352 - 35, var2 + 238, this.field_99 + 26);
            if(var7 == 0) {
               break label67;
            }
         }

         this.surface.drawstringCenter("Waiting for other player...", var1 + 234, var2 + 250, 1, 16776960);
      }

      if(this.mouseButtonClick == 1) {
         if(super.mouseX < var1 || super.mouseY < var2 || super.mouseX > var1 + 468 || super.mouseY > var2 + 262) {
            this.field_289 = false;
            super.clientStream.newPacket(233, 235);
            super.clientStream.flushPacket_();
         }

         if(super.mouseX >= var1 + 118 - 35 && super.mouseX <= var1 + 118 + 70 && super.mouseY >= var2 + 238 && super.mouseY <= var2 + 238 + 21) {
            this.field_290 = true;
            super.clientStream.newPacket(202, 96);
            super.clientStream.flushPacket_();
         }

         if(super.mouseX >= var1 + 352 - 35 && super.mouseX <= var1 + 353 + 70 && super.mouseY >= var2 + 238 && super.mouseY <= var2 + 238 + 21) {
            this.field_289 = false;
            super.clientStream.newPacket(233, 235);
            super.clientStream.flushPacket_();
         }

         this.mouseButtonClick = 0;
      }

   }

   // $FF: renamed from: bn () void
   public void method_118() {
      int var14 = class_4.field_563;
      if(this.mouseButtonClick != 0 && this.mouseButtonItemCountIncrement == 0) {
         this.mouseButtonItemCountIncrement = 1;
      }

      int var3;
      int var5;
      int var6;
      int var7;
      int var8;
      int var17;
      if(this.mouseButtonItemCountIncrement > 0) {
         label364: {
            int var1 = super.mouseX - 22;
            int var2 = super.mouseY - 36;
            if(var1 >= 0 && var2 >= 0 && var1 < 468 && var2 < 262) {
               if(var1 > 216 && var2 > 30 && var1 < 462 && var2 < 235) {
                  var3 = (var1 - 217) / 49 + (var2 - 31) / 34 * 5;
                  if(var3 >= 0 && var3 < this.inventorySize) {
                     boolean var4 = false;
                     var5 = 0;
                     var6 = this.inventoryItemId[var3];
                     var7 = 0;
                     if(var14 != 0 || var7 < this.field_278) {
                        do {
                           if(this.field_279[var7] == var6) {
                              label327: {
                                 if(class_4.itemStackable[var6] == 0) {
                                    var8 = 0;
                                    if(var14 != 0 || var8 < this.mouseButtonItemCountIncrement) {
                                       do {
                                          if(this.field_280[var7] < this.inventoryAmounts[var3]) {
                                             ++this.field_280[var7];
                                          }

                                          var4 = true;
                                          ++var8;
                                       } while(var8 < this.mouseButtonItemCountIncrement);
                                    }

                                    if(var14 == 0) {
                                       break label327;
                                    }
                                 }

                                 ++var5;
                              }
                           }

                           ++var7;
                        } while(var7 < this.field_278);
                     }

                     if(this.method_94(var6) <= var5) {
                        var4 = true;
                     }

                     if(class_4.field_483[var6] == 1) {
                        this.displayMessage("This object cannot be traded with other players", 3);
                        var4 = true;
                     }

                     if(!var4 && this.field_278 < 12) {
                        this.field_279[this.field_278] = var6;
                        this.field_280[this.field_278] = 1;
                        ++this.field_278;
                        var4 = true;
                     }

                     if(var4) {
                        super.clientStream.newPacket(234, 500);
                        super.clientStream.putByte(this.field_278);
                        var8 = 0;
                        if(var14 != 0 || var8 < this.field_278) {
                           do {
                              super.clientStream.putShort(this.field_279[var8]);
                              super.clientStream.putInt(this.field_280[var8]);
                              ++var8;
                           } while(var8 < this.field_278);
                        }

                        super.clientStream.flushPacket_();
                        this.field_284 = false;
                        this.field_285 = false;
                     }
                  }
               }

               if(var1 > 8 && var2 > 30 && var1 < 205 && var2 < 133) {
                  var3 = (var1 - 9) / 49 + (var2 - 31) / 34 * 4;
                  if(var3 >= 0 && var3 < this.field_278) {
                     var17 = this.field_279[var3];
                     var5 = 0;
                     if(var14 != 0 || var5 < this.mouseButtonItemCountIncrement) {
                        do {
                           label391: {
                              if(class_4.itemStackable[var17] == 0 && this.field_280[var3] > 1) {
                                 --this.field_280[var3];
                                 if(var14 == 0) {
                                    break label391;
                                 }
                              }

                              --this.field_278;
                              this.mouseButtonDownTime = 0;
                              var6 = var3;
                              if(var14 != 0 || var3 < this.field_278) {
                                 do {
                                    this.field_279[var6] = this.field_279[var6 + 1];
                                    this.field_280[var6] = this.field_280[var6 + 1];
                                    ++var6;
                                 } while(var6 < this.field_278);
                              }

                              if(var14 == 0) {
                                 break;
                              }
                           }

                           ++var5;
                        } while(var5 < this.mouseButtonItemCountIncrement);
                     }

                     super.clientStream.newPacket(234, 500);
                     super.clientStream.putByte(this.field_278);
                     var6 = 0;
                     if(var14 != 0 || var6 < this.field_278) {
                        do {
                           super.clientStream.putShort(this.field_279[var6]);
                           super.clientStream.putInt(this.field_280[var6]);
                           ++var6;
                        } while(var6 < this.field_278);
                     }

                     super.clientStream.flushPacket_();
                     this.field_284 = false;
                     this.field_285 = false;
                  }
               }

               if(var1 >= 217 && var2 >= 238 && var1 <= 286 && var2 <= 259) {
                  this.field_285 = true;
                  super.clientStream.newPacket(232, 277);
                  super.clientStream.flushPacket_();
               }

               if(var1 < 394 || var2 < 238 || var1 >= 463 || var2 >= 259) {
                  break label364;
               }

               this.field_276 = false;
               super.clientStream.newPacket(233, 235);
               super.clientStream.flushPacket_();
               if(var14 == 0) {
                  break label364;
               }
            }

            if(this.mouseButtonClick != 0) {
               this.field_276 = false;
               super.clientStream.newPacket(233, 235);
               super.clientStream.flushPacket_();
            }
         }

         this.mouseButtonClick = 0;
         this.mouseButtonItemCountIncrement = 0;
      }

      if(this.field_276) {
         byte var15 = 22;
         byte var16 = 36;
         this.surface.method_227(var15, var16, 468, 12, 192);
         var3 = 10000536;
         this.surface.method_225(var15, var16 + 12, 468, 18, var3, 160);
         this.surface.method_225(var15, var16 + 30, 8, 248, var3, 160);
         this.surface.method_225(var15 + 205, var16 + 30, 11, 248, var3, 160);
         this.surface.method_225(var15 + 462, var16 + 30, 6, 248, var3, 160);
         this.surface.method_225(var15 + 8, var16 + 133, 197, 22, var3, 160);
         this.surface.method_225(var15 + 8, var16 + 258, 197, 20, var3, 160);
         this.surface.method_225(var15 + 216, var16 + 235, 246, 43, var3, 160);
         var17 = 13684944;
         this.surface.method_225(var15 + 8, var16 + 30, 197, 103, var17, 160);
         this.surface.method_225(var15 + 8, var16 + 155, 197, 103, var17, 160);
         this.surface.method_225(var15 + 216, var16 + 30, 246, 205, var17, 160);
         var5 = 0;
         if(var14 != 0 || var5 < 4) {
            do {
               this.surface.method_229(var15 + 8, var16 + 30 + var5 * 34, 197, 0);
               ++var5;
            } while(var5 < 4);
         }

         var6 = 0;
         if(var14 != 0) {
            this.surface.method_229(var15 + 8, var16 + 155 + var6 * 34, 197, 0);
            ++var6;
         }

         while(var6 < 4) {
            this.surface.method_229(var15 + 8, var16 + 155 + var6 * 34, 197, 0);
            ++var6;
         }

         var7 = 0;
         if(var14 != 0 || var7 < 7) {
            do {
               this.surface.method_229(var15 + 216, var16 + 30 + var7 * 34, 246, 0);
               ++var7;
            } while(var7 < 7);
         }

         var8 = 0;
         if(var14 != 0) {
            if(var8 < 5) {
               this.surface.method_230(var15 + 8 + var8 * 49, var16 + 30, 103, 0);
            }

            if(var8 < 5) {
               this.surface.method_230(var15 + 8 + var8 * 49, var16 + 155, 103, 0);
            }

            this.surface.method_230(var15 + 216 + var8 * 49, var16 + 30, 205, 0);
            ++var8;
         }

         while(var8 < 6) {
            if(var8 < 5) {
               this.surface.method_230(var15 + 8 + var8 * 49, var16 + 30, 103, 0);
            }

            if(var8 < 5) {
               this.surface.method_230(var15 + 8 + var8 * 49, var16 + 155, 103, 0);
            }

            this.surface.method_230(var15 + 216 + var8 * 49, var16 + 30, 205, 0);
            ++var8;
         }

         this.surface.method_267("Trading with: " + this.field_277, var15 + 1, var16 + 10, 1, 16777215);
         this.surface.method_267("Your Offer", var15 + 9, var16 + 27, 4, 16777215);
         this.surface.method_267("Opponent\'s Offer", var15 + 9, var16 + 152, 4, 16777215);
         this.surface.method_267("Your Inventory", var15 + 216, var16 + 27, 4, 16777215);
         if(!this.field_285) {
            this.surface.method_242(var15 + 217, var16 + 238, this.field_99 + 25);
         }

         this.surface.method_242(var15 + 394, var16 + 238, this.field_99 + 26);
         if(this.field_284) {
            this.surface.drawstringCenter("Other player", var15 + 341, var16 + 246, 1, 16777215);
            this.surface.drawstringCenter("has accepted", var15 + 341, var16 + 256, 1, 16777215);
         }

         if(this.field_285) {
            this.surface.drawstringCenter("Waiting for", var15 + 217 + 35, var16 + 246, 1, 16777215);
            this.surface.drawstringCenter("other player", var15 + 217 + 35, var16 + 256, 1, 16777215);
         }

         int var9 = 0;
         int var10;
         int var11;
         if(var14 != 0) {
            var10 = 217 + var15 + var9 % 5 * 49;
            var11 = 31 + var16 + var9 / 5 * 34;
            this.surface.method_258(var10, var11, 48, 32, this.field_101 + class_4.field_477[this.inventoryItemId[var9]], class_4.field_482[this.inventoryItemId[var9]], 0, 0, false);
            if(class_4.itemStackable[this.inventoryItemId[var9]] == 0) {
               this.surface.method_267(String.valueOf(this.inventoryAmounts[var9]), var10 + 1, var11 + 10, 1, 16776960);
            }

            ++var9;
         }

         for(; var9 < this.inventorySize; ++var9) {
            var10 = 217 + var15 + var9 % 5 * 49;
            var11 = 31 + var16 + var9 / 5 * 34;
            this.surface.method_258(var10, var11, 48, 32, this.field_101 + class_4.field_477[this.inventoryItemId[var9]], class_4.field_482[this.inventoryItemId[var9]], 0, 0, false);
            if(class_4.itemStackable[this.inventoryItemId[var9]] == 0) {
               this.surface.method_267(String.valueOf(this.inventoryAmounts[var9]), var10 + 1, var11 + 10, 1, 16776960);
            }
         }

         var10 = 0;
         int var12;
         if(var14 != 0 || var10 < this.field_278) {
            do {
               var11 = 9 + var15 + var10 % 4 * 49;
               var12 = 31 + var16 + var10 / 4 * 34;
               this.surface.method_258(var11, var12, 48, 32, this.field_101 + class_4.field_477[this.field_279[var10]], class_4.field_482[this.field_279[var10]], 0, 0, false);
               if(class_4.itemStackable[this.field_279[var10]] == 0) {
                  this.surface.method_267(String.valueOf(this.field_280[var10]), var11 + 1, var12 + 10, 1, 16776960);
               }

               if(super.mouseX > var11 && super.mouseX < var11 + 48 && super.mouseY > var12 && super.mouseY < var12 + 32) {
                  this.surface.method_267(class_4.field_474[this.field_279[var10]] + ": @whi@" + class_4.field_475[this.field_279[var10]], var15 + 8, var16 + 273, 1, 16776960);
               }

               ++var10;
            } while(var10 < this.field_278);
         }

         var11 = 0;
         if(var14 != 0 || var11 < this.field_281) {
            do {
               var12 = 9 + var15 + var11 % 4 * 49;
               int var13 = 156 + var16 + var11 / 4 * 34;
               this.surface.method_258(var12, var13, 48, 32, this.field_101 + class_4.field_477[this.field_282[var11]], class_4.field_482[this.field_282[var11]], 0, 0, false);
               if(class_4.itemStackable[this.field_282[var11]] == 0) {
                  this.surface.method_267(String.valueOf(this.field_283[var11]), var12 + 1, var13 + 10, 1, 16776960);
               }

               if(super.mouseX > var12 && super.mouseX < var12 + 48 && super.mouseY > var13 && super.mouseY < var13 + 32) {
                  this.surface.method_267(class_4.field_474[this.field_282[var11]] + ": @whi@" + class_4.field_475[this.field_282[var11]], var15 + 8, var16 + 273, 1, 16776960);
               }

               ++var11;
            } while(var11 < this.field_281);

         }
      }
   }

   // $FF: renamed from: bo () void
   public void method_119() {
      int var7 = class_4.field_563;
      byte var1 = 22;
      byte var2 = 36;
      this.surface.method_227(var1, var2, 468, 16, 192);
      int var3 = 10000536;
      this.surface.method_225(var1, var2 + 16, 468, 246, var3, 160);
      this.surface.drawstringCenter("Please confirm your duel with @yel@" + class_21.unhashUsername(this.field_265), var1 + 234, var2 + 12, 1, 16777215);
      this.surface.drawstringCenter("Your stake:", var1 + 117, var2 + 30, 1, 16776960);
      int var4 = 0;
      String var5;
      if(var7 != 0) {
         var5 = class_4.field_474[this.field_267[var4]];
         if(class_4.itemStackable[this.field_267[var4]] == 0) {
            var5 = var5 + " (" + this.field_268[var4] + ")";
         }

         this.surface.drawstringCenter(var5, var1 + 117, var2 + 42 + var4 * 12, 1, 16777215);
         ++var4;
      }

      while(var4 < this.field_266) {
         var5 = class_4.field_474[this.field_267[var4]];
         if(class_4.itemStackable[this.field_267[var4]] == 0) {
            var5 = var5 + " (" + this.field_268[var4] + ")";
         }

         this.surface.drawstringCenter(var5, var1 + 117, var2 + 42 + var4 * 12, 1, 16777215);
         ++var4;
      }

      if(this.field_266 == 0) {
         this.surface.drawstringCenter("Nothing!", var1 + 117, var2 + 42, 1, 16777215);
      }

      this.surface.drawstringCenter("Your opponent\'s stake:", var1 + 351, var2 + 30, 1, 16776960);
      int var8 = 0;
      String var6;
      if(var7 != 0) {
         var6 = class_4.field_474[this.field_270[var8]];
         if(class_4.itemStackable[this.field_270[var8]] == 0) {
            var6 = var6 + " (" + this.field_271[var8] + ")";
         }

         this.surface.drawstringCenter(var6, var1 + 351, var2 + 42 + var8 * 12, 1, 16777215);
         ++var8;
      }

      while(var8 < this.field_269) {
         var6 = class_4.field_474[this.field_270[var8]];
         if(class_4.itemStackable[this.field_270[var8]] == 0) {
            var6 = var6 + " (" + this.field_271[var8] + ")";
         }

         this.surface.drawstringCenter(var6, var1 + 351, var2 + 42 + var8 * 12, 1, 16777215);
         ++var8;
      }

      if(this.field_269 == 0) {
         this.surface.drawstringCenter("Nothing!", var1 + 351, var2 + 42, 1, 16777215);
      }

      label99: {
         if(this.field_272 == 0) {
            this.surface.drawstringCenter("You can retreat from this duel", var1 + 234, var2 + 180, 1, '\uff00');
            if(var7 == 0) {
               break label99;
            }
         }

         this.surface.drawstringCenter("No retreat is possible!", var1 + 234, var2 + 180, 1, 16711680);
      }

      label94: {
         if(this.field_273 == 0) {
            this.surface.drawstringCenter("Magic may be used", var1 + 234, var2 + 192, 1, '\uff00');
            if(var7 == 0) {
               break label94;
            }
         }

         this.surface.drawstringCenter("Magic cannot be used", var1 + 234, var2 + 192, 1, 16711680);
      }

      label89: {
         if(this.field_274 == 0) {
            this.surface.drawstringCenter("Prayer may be used", var1 + 234, var2 + 204, 1, '\uff00');
            if(var7 == 0) {
               break label89;
            }
         }

         this.surface.drawstringCenter("Prayer cannot be used", var1 + 234, var2 + 204, 1, 16711680);
      }

      label84: {
         if(this.field_275 == 0) {
            this.surface.drawstringCenter("Weapons may be used", var1 + 234, var2 + 216, 1, '\uff00');
            if(var7 == 0) {
               break label84;
            }
         }

         this.surface.drawstringCenter("Weapons cannot be used", var1 + 234, var2 + 216, 1, 16711680);
      }

      label79: {
         this.surface.drawstringCenter("If you are sure click \'Accept\' to begin the duel", var1 + 234, var2 + 230, 1, 16777215);
         if(!this.field_264) {
            this.surface.method_242(var1 + 118 - 35, var2 + 238, this.field_99 + 25);
            this.surface.method_242(var1 + 352 - 35, var2 + 238, this.field_99 + 26);
            if(var7 == 0) {
               break label79;
            }
         }

         this.surface.drawstringCenter("Waiting for other player...", var1 + 234, var2 + 250, 1, 16776960);
      }

      if(this.mouseButtonClick == 1) {
         if(super.mouseX < var1 || super.mouseY < var2 || super.mouseX > var1 + 468 || super.mouseY > var2 + 262) {
            this.field_263 = false;
            super.clientStream.newPacket(233, 235);
            super.clientStream.flushPacket_();
         }

         if(super.mouseX >= var1 + 118 - 35 && super.mouseX <= var1 + 118 + 70 && super.mouseY >= var2 + 238 && super.mouseY <= var2 + 238 + 21) {
            this.field_264 = true;
            super.clientStream.newPacket(198, 412);
            super.clientStream.flushPacket_();
         }

         if(super.mouseX >= var1 + 352 - 35 && super.mouseX <= var1 + 353 + 70 && super.mouseY >= var2 + 238 && super.mouseY <= var2 + 238 + 21) {
            this.field_263 = false;
            super.clientStream.newPacket(203, 266);
            super.clientStream.flushPacket_();
         }

         this.mouseButtonClick = 0;
      }

   }

   // $FF: renamed from: bp () void
   public void method_120() {
      int var14 = class_4.field_563;
      if(this.mouseButtonClick != 0 && this.mouseButtonItemCountIncrement == 0) {
         this.mouseButtonItemCountIncrement = 1;
      }

      int var3;
      int var5;
      int var6;
      int var7;
      int var8;
      int var18;
      if(this.mouseButtonItemCountIncrement > 0) {
         label470: {
            int var1 = super.mouseX - 22;
            int var2 = super.mouseY - 36;
            if(var1 >= 0 && var2 >= 0 && var1 < 468 && var2 < 262) {
               if(var1 > 216 && var2 > 30 && var1 < 462 && var2 < 235) {
                  var3 = (var1 - 217) / 49 + (var2 - 31) / 34 * 5;
                  if(var3 >= 0 && var3 < this.inventorySize) {
                     boolean var4 = false;
                     var5 = 0;
                     var6 = this.inventoryItemId[var3];
                     var7 = 0;
                     if(var14 != 0 || var7 < this.field_251) {
                        do {
                           if(this.field_252[var7] == var6) {
                              label433: {
                                 if(class_4.itemStackable[var6] == 0) {
                                    var8 = 0;
                                    if(var14 != 0 || var8 < this.mouseButtonItemCountIncrement) {
                                       do {
                                          if(this.field_253[var7] < this.inventoryAmounts[var3]) {
                                             ++this.field_253[var7];
                                          }

                                          var4 = true;
                                          ++var8;
                                       } while(var8 < this.mouseButtonItemCountIncrement);
                                    }

                                    if(var14 == 0) {
                                       break label433;
                                    }
                                 }

                                 ++var5;
                              }
                           }

                           ++var7;
                        } while(var7 < this.field_251);
                     }

                     if(this.method_94(var6) <= var5) {
                        var4 = true;
                     }

                     if(class_4.field_483[var6] == 1) {
                        this.displayMessage("This object cannot be added to a duel offer", 3);
                        var4 = true;
                     }

                     if(!var4 && this.field_251 < 8) {
                        this.field_252[this.field_251] = var6;
                        this.field_253[this.field_251] = 1;
                        ++this.field_251;
                        var4 = true;
                     }

                     if(var4) {
                        super.clientStream.newPacket(201, 53);
                        super.clientStream.putByte(this.field_251);
                        var8 = 0;
                        if(var14 != 0 || var8 < this.field_251) {
                           do {
                              super.clientStream.putShort(this.field_252[var8]);
                              super.clientStream.putInt(this.field_253[var8]);
                              ++var8;
                           } while(var8 < this.field_251);
                        }

                        super.clientStream.flushPacket_();
                        this.field_257 = false;
                        this.field_258 = false;
                     }
                  }
               }

               if(var1 > 8 && var2 > 30 && var1 < 205 && var2 < 129) {
                  var3 = (var1 - 9) / 49 + (var2 - 31) / 34 * 4;
                  if(var3 >= 0 && var3 < this.field_251) {
                     var18 = this.field_252[var3];
                     var5 = 0;
                     if(var14 != 0 || var5 < this.mouseButtonItemCountIncrement) {
                        do {
                           label515: {
                              if(class_4.itemStackable[var18] == 0 && this.field_253[var3] > 1) {
                                 --this.field_253[var3];
                                 if(var14 == 0) {
                                    break label515;
                                 }
                              }

                              --this.field_251;
                              this.mouseButtonDownTime = 0;
                              var6 = var3;
                              if(var14 != 0 || var3 < this.field_251) {
                                 do {
                                    this.field_252[var6] = this.field_252[var6 + 1];
                                    this.field_253[var6] = this.field_253[var6 + 1];
                                    ++var6;
                                 } while(var6 < this.field_251);
                              }

                              if(var14 == 0) {
                                 break;
                              }
                           }

                           ++var5;
                        } while(var5 < this.mouseButtonItemCountIncrement);
                     }

                     super.clientStream.newPacket(201, 53);
                     super.clientStream.putByte(this.field_251);
                     var6 = 0;
                     if(var14 != 0 || var6 < this.field_251) {
                        do {
                           super.clientStream.putShort(this.field_252[var6]);
                           super.clientStream.putInt(this.field_253[var6]);
                           ++var6;
                        } while(var6 < this.field_251);
                     }

                     super.clientStream.flushPacket_();
                     this.field_257 = false;
                     this.field_258 = false;
                  }
               }

               boolean var17 = false;
               if(var1 >= 93 && var2 >= 221 && var1 <= 104 && var2 <= 232) {
                  this.field_259 = !this.field_259;
                  var17 = true;
               }

               if(var1 >= 93 && var2 >= 240 && var1 <= 104 && var2 <= 251) {
                  this.field_260 = !this.field_260;
                  var17 = true;
               }

               if(var1 >= 191 && var2 >= 221 && var1 <= 202 && var2 <= 232) {
                  this.field_261 = !this.field_261;
                  var17 = true;
               }

               if(var1 >= 191 && var2 >= 240 && var1 <= 202 && var2 <= 251) {
                  this.field_262 = !this.field_262;
                  var17 = true;
               }

               if(var17) {
                  super.clientStream.newPacket(200, 285);
                  super.clientStream.putByte(this.field_259?1:0);
                  super.clientStream.putByte(this.field_260?1:0);
                  super.clientStream.putByte(this.field_261?1:0);
                  super.clientStream.putByte(this.field_262?1:0);
                  super.clientStream.flushPacket_();
                  this.field_257 = false;
                  this.field_258 = false;
               }

               if(var1 >= 217 && var2 >= 238 && var1 <= 286 && var2 <= 259) {
                  this.field_258 = true;
                  super.clientStream.newPacket(199, 564);
                  super.clientStream.flushPacket_();
               }

               if(var1 < 394 || var2 < 238 || var1 >= 463 || var2 >= 259) {
                  break label470;
               }

               this.field_249 = false;
               super.clientStream.newPacket(203, 266);
               super.clientStream.flushPacket_();
               if(var14 == 0) {
                  break label470;
               }
            }

            if(this.mouseButtonClick != 0) {
               this.field_249 = false;
               super.clientStream.newPacket(203, 266);
               super.clientStream.flushPacket_();
            }
         }

         this.mouseButtonClick = 0;
         this.mouseButtonItemCountIncrement = 0;
      }

      if(this.field_249) {
         byte var15 = 22;
         byte var16 = 36;
         this.surface.method_227(var15, var16, 468, 12, 13175581);
         var3 = 10000536;
         this.surface.method_225(var15, var16 + 12, 468, 18, var3, 160);
         this.surface.method_225(var15, var16 + 30, 8, 248, var3, 160);
         this.surface.method_225(var15 + 205, var16 + 30, 11, 248, var3, 160);
         this.surface.method_225(var15 + 462, var16 + 30, 6, 248, var3, 160);
         this.surface.method_225(var15 + 8, var16 + 99, 197, 24, var3, 160);
         this.surface.method_225(var15 + 8, var16 + 192, 197, 23, var3, 160);
         this.surface.method_225(var15 + 8, var16 + 258, 197, 20, var3, 160);
         this.surface.method_225(var15 + 216, var16 + 235, 246, 43, var3, 160);
         var18 = 13684944;
         this.surface.method_225(var15 + 8, var16 + 30, 197, 69, var18, 160);
         this.surface.method_225(var15 + 8, var16 + 123, 197, 69, var18, 160);
         this.surface.method_225(var15 + 8, var16 + 215, 197, 43, var18, 160);
         this.surface.method_225(var15 + 216, var16 + 30, 246, 205, var18, 160);
         var5 = 0;
         if(var14 != 0 || var5 < 3) {
            do {
               this.surface.method_229(var15 + 8, var16 + 30 + var5 * 34, 197, 0);
               ++var5;
            } while(var5 < 3);
         }

         var6 = 0;
         if(var14 != 0) {
            this.surface.method_229(var15 + 8, var16 + 123 + var6 * 34, 197, 0);
            ++var6;
         }

         while(var6 < 3) {
            this.surface.method_229(var15 + 8, var16 + 123 + var6 * 34, 197, 0);
            ++var6;
         }

         var7 = 0;
         if(var14 != 0 || var7 < 7) {
            do {
               this.surface.method_229(var15 + 216, var16 + 30 + var7 * 34, 246, 0);
               ++var7;
            } while(var7 < 7);
         }

         var8 = 0;
         if(var14 != 0) {
            if(var8 < 5) {
               this.surface.method_230(var15 + 8 + var8 * 49, var16 + 30, 69, 0);
            }

            if(var8 < 5) {
               this.surface.method_230(var15 + 8 + var8 * 49, var16 + 123, 69, 0);
            }

            this.surface.method_230(var15 + 216 + var8 * 49, var16 + 30, 205, 0);
            ++var8;
         }

         while(var8 < 6) {
            if(var8 < 5) {
               this.surface.method_230(var15 + 8 + var8 * 49, var16 + 30, 69, 0);
            }

            if(var8 < 5) {
               this.surface.method_230(var15 + 8 + var8 * 49, var16 + 123, 69, 0);
            }

            this.surface.method_230(var15 + 216 + var8 * 49, var16 + 30, 205, 0);
            ++var8;
         }

         this.surface.method_229(var15 + 8, var16 + 215, 197, 0);
         this.surface.method_229(var15 + 8, var16 + 257, 197, 0);
         this.surface.method_230(var15 + 8, var16 + 215, 43, 0);
         this.surface.method_230(var15 + 204, var16 + 215, 43, 0);
         this.surface.method_267("Preparing to duel with: " + this.field_250, var15 + 1, var16 + 10, 1, 16777215);
         this.surface.method_267("Your Stake", var15 + 9, var16 + 27, 4, 16777215);
         this.surface.method_267("Opponent\'s Stake", var15 + 9, var16 + 120, 4, 16777215);
         this.surface.method_267("Duel Options", var15 + 9, var16 + 212, 4, 16777215);
         this.surface.method_267("Your Inventory", var15 + 216, var16 + 27, 4, 16777215);
         this.surface.method_267("No retreating", var15 + 8 + 1, var16 + 215 + 16, 3, 16776960);
         this.surface.method_267("No magic", var15 + 8 + 1, var16 + 215 + 35, 3, 16776960);
         this.surface.method_267("No prayer", var15 + 8 + 102, var16 + 215 + 16, 3, 16776960);
         this.surface.method_267("No weapons", var15 + 8 + 102, var16 + 215 + 35, 3, 16776960);
         this.surface.method_228(var15 + 93, var16 + 215 + 6, 11, 11, 16776960);
         if(this.field_259) {
            this.surface.method_227(var15 + 95, var16 + 215 + 8, 7, 7, 16776960);
         }

         this.surface.method_228(var15 + 93, var16 + 215 + 25, 11, 11, 16776960);
         if(this.field_260) {
            this.surface.method_227(var15 + 95, var16 + 215 + 27, 7, 7, 16776960);
         }

         this.surface.method_228(var15 + 191, var16 + 215 + 6, 11, 11, 16776960);
         if(this.field_261) {
            this.surface.method_227(var15 + 193, var16 + 215 + 8, 7, 7, 16776960);
         }

         this.surface.method_228(var15 + 191, var16 + 215 + 25, 11, 11, 16776960);
         if(this.field_262) {
            this.surface.method_227(var15 + 193, var16 + 215 + 27, 7, 7, 16776960);
         }

         if(!this.field_258) {
            this.surface.method_242(var15 + 217, var16 + 238, this.field_99 + 25);
         }

         this.surface.method_242(var15 + 394, var16 + 238, this.field_99 + 26);
         if(this.field_257) {
            this.surface.drawstringCenter("Other player", var15 + 341, var16 + 246, 1, 16777215);
            this.surface.drawstringCenter("has accepted", var15 + 341, var16 + 256, 1, 16777215);
         }

         if(this.field_258) {
            this.surface.drawstringCenter("Waiting for", var15 + 217 + 35, var16 + 246, 1, 16777215);
            this.surface.drawstringCenter("other player", var15 + 217 + 35, var16 + 256, 1, 16777215);
         }

         int var9 = 0;
         int var10;
         int var11;
         if(var14 != 0) {
            var10 = 217 + var15 + var9 % 5 * 49;
            var11 = 31 + var16 + var9 / 5 * 34;
            this.surface.method_258(var10, var11, 48, 32, this.field_101 + class_4.field_477[this.inventoryItemId[var9]], class_4.field_482[this.inventoryItemId[var9]], 0, 0, false);
            if(class_4.itemStackable[this.inventoryItemId[var9]] == 0) {
               this.surface.method_267(String.valueOf(this.inventoryAmounts[var9]), var10 + 1, var11 + 10, 1, 16776960);
            }

            ++var9;
         }

         for(; var9 < this.inventorySize; ++var9) {
            var10 = 217 + var15 + var9 % 5 * 49;
            var11 = 31 + var16 + var9 / 5 * 34;
            this.surface.method_258(var10, var11, 48, 32, this.field_101 + class_4.field_477[this.inventoryItemId[var9]], class_4.field_482[this.inventoryItemId[var9]], 0, 0, false);
            if(class_4.itemStackable[this.inventoryItemId[var9]] == 0) {
               this.surface.method_267(String.valueOf(this.inventoryAmounts[var9]), var10 + 1, var11 + 10, 1, 16776960);
            }
         }

         var10 = 0;
         int var12;
         if(var14 != 0 || var10 < this.field_251) {
            do {
               var11 = 9 + var15 + var10 % 4 * 49;
               var12 = 31 + var16 + var10 / 4 * 34;
               this.surface.method_258(var11, var12, 48, 32, this.field_101 + class_4.field_477[this.field_252[var10]], class_4.field_482[this.field_252[var10]], 0, 0, false);
               if(class_4.itemStackable[this.field_252[var10]] == 0) {
                  this.surface.method_267(String.valueOf(this.field_253[var10]), var11 + 1, var12 + 10, 1, 16776960);
               }

               if(super.mouseX > var11 && super.mouseX < var11 + 48 && super.mouseY > var12 && super.mouseY < var12 + 32) {
                  this.surface.method_267(class_4.field_474[this.field_252[var10]] + ": @whi@" + class_4.field_475[this.field_252[var10]], var15 + 8, var16 + 273, 1, 16776960);
               }

               ++var10;
            } while(var10 < this.field_251);
         }

         var11 = 0;
         if(var14 != 0 || var11 < this.field_254) {
            do {
               var12 = 9 + var15 + var11 % 4 * 49;
               int var13 = 124 + var16 + var11 / 4 * 34;
               this.surface.method_258(var12, var13, 48, 32, this.field_101 + class_4.field_477[this.field_255[var11]], class_4.field_482[this.field_255[var11]], 0, 0, false);
               if(class_4.itemStackable[this.field_255[var11]] == 0) {
                  this.surface.method_267(String.valueOf(this.field_256[var11]), var12 + 1, var13 + 10, 1, 16776960);
               }

               if(super.mouseX > var12 && super.mouseX < var12 + 48 && super.mouseY > var13 && super.mouseY < var13 + 32) {
                  this.surface.method_267(class_4.field_474[this.field_255[var11]] + ": @whi@" + class_4.field_475[this.field_255[var11]], var15 + 8, var16 + 273, 1, 16776960);
               }

               ++var11;
            } while(var11 < this.field_254);

         }
      }
   }

   // $FF: renamed from: bq () void
   public void method_121() {
      if(this.field_179 == 0 && super.mouseX >= this.surface.field_723 - 35 && super.mouseY >= 3 && super.mouseX < this.surface.field_723 - 3 && super.mouseY < 35) {
         this.field_179 = 1;
      }

      if(this.field_179 == 0 && super.mouseX >= this.surface.field_723 - 35 - 33 && super.mouseY >= 3 && super.mouseX < this.surface.field_723 - 3 - 33 && super.mouseY < 35) {
         this.field_179 = 2;
         this.field_199 = (int)(Math.random() * 13.0D) - 6;
         this.field_200 = (int)(Math.random() * 23.0D) - 11;
      }

      if(this.field_179 == 0 && super.mouseX >= this.surface.field_723 - 35 - 66 && super.mouseY >= 3 && super.mouseX < this.surface.field_723 - 3 - 66 && super.mouseY < 35) {
         this.field_179 = 3;
      }

      if(this.field_179 == 0 && super.mouseX >= this.surface.field_723 - 35 - 99 && super.mouseY >= 3 && super.mouseX < this.surface.field_723 - 3 - 99 && super.mouseY < 35) {
         this.field_179 = 4;
      }

      if(this.field_179 == 0 && super.mouseX >= this.surface.field_723 - 35 - 132 && super.mouseY >= 3 && super.mouseX < this.surface.field_723 - 3 - 132 && super.mouseY < 35) {
         this.field_179 = 5;
      }

      if(this.field_179 == 0 && super.mouseX >= this.surface.field_723 - 35 - 165 && super.mouseY >= 3 && super.mouseX < this.surface.field_723 - 3 - 165 && super.mouseY < 35) {
         this.field_179 = 6;
      }

      if(this.field_179 != 0 && super.mouseX >= this.surface.field_723 - 35 && super.mouseY >= 3 && super.mouseX < this.surface.field_723 - 3 && super.mouseY < 26) {
         this.field_179 = 1;
      }

      if(this.field_179 != 0 && this.field_179 != 2 && super.mouseX >= this.surface.field_723 - 35 - 33 && super.mouseY >= 3 && super.mouseX < this.surface.field_723 - 3 - 33 && super.mouseY < 26) {
         this.field_179 = 2;
         this.field_199 = (int)(Math.random() * 13.0D) - 6;
         this.field_200 = (int)(Math.random() * 23.0D) - 11;
      }

      if(this.field_179 != 0 && super.mouseX >= this.surface.field_723 - 35 - 66 && super.mouseY >= 3 && super.mouseX < this.surface.field_723 - 3 - 66 && super.mouseY < 26) {
         this.field_179 = 3;
      }

      if(this.field_179 != 0 && super.mouseX >= this.surface.field_723 - 35 - 99 && super.mouseY >= 3 && super.mouseX < this.surface.field_723 - 3 - 99 && super.mouseY < 26) {
         this.field_179 = 4;
      }

      if(this.field_179 != 0 && super.mouseX >= this.surface.field_723 - 35 - 132 && super.mouseY >= 3 && super.mouseX < this.surface.field_723 - 3 - 132 && super.mouseY < 26) {
         this.field_179 = 5;
      }

      if(this.field_179 != 0 && super.mouseX >= this.surface.field_723 - 35 - 165 && super.mouseY >= 3 && super.mouseX < this.surface.field_723 - 3 - 165 && super.mouseY < 26) {
         this.field_179 = 6;
      }

      if(this.field_179 == 1 && (super.mouseX < this.surface.field_723 - 248 || super.mouseY > 36 + this.field_180 / 5 * 34)) {
         this.field_179 = 0;
      }

      if(this.field_179 == 3 && (super.mouseX < this.surface.field_723 - 199 || super.mouseY > 316)) {
         this.field_179 = 0;
      }

      if((this.field_179 == 2 || this.field_179 == 4 || this.field_179 == 5) && (super.mouseX < this.surface.field_723 - 199 || super.mouseY > 240)) {
         this.field_179 = 0;
      }

      if(this.field_179 == 6 && (super.mouseX < this.surface.field_723 - 199 || super.mouseY > 311)) {
         this.field_179 = 0;
      }

   }

   // $FF: renamed from: a (boolean) void
   public void method_122(boolean var1) {
      int var9 = class_4.field_563;
      int var2 = this.surface.field_723 - 248;
      this.surface.method_242(var2, 3, this.field_99 + 1);
      int var3 = 0;
      int var4;
      int var5;
      if(var9 != 0) {
         label99: {
            var4 = var2 + var3 % 5 * 49;
            var5 = 36 + var3 / 5 * 34;
            if(var3 < this.inventorySize && this.inventoryEquipped[var3] == 1) {
               this.surface.method_225(var4, var5, 49, 34, 16711680, 128);
               if(var9 == 0) {
                  break label99;
               }
            }

            this.surface.method_225(var4, var5, 49, 34, class_9.method_234(181, 181, 181), 128);
         }

         if(var3 < this.inventorySize) {
            this.surface.method_258(var4, var5, 48, 32, this.field_101 + class_4.field_477[this.inventoryItemId[var3]], class_4.field_482[this.inventoryItemId[var3]], 0, 0, false);
            if(class_4.itemStackable[this.inventoryItemId[var3]] == 0) {
               this.surface.method_267(String.valueOf(this.inventoryAmounts[var3]), var4 + 1, var5 + 10, 1, 16776960);
            }
         }

         ++var3;
      }

      for(; var3 < this.field_180; ++var3) {
         label96: {
            var4 = var2 + var3 % 5 * 49;
            var5 = 36 + var3 / 5 * 34;
            if(var3 < this.inventorySize && this.inventoryEquipped[var3] == 1) {
               this.surface.method_225(var4, var5, 49, 34, 16711680, 128);
               if(var9 == 0) {
                  break label96;
               }
            }

            this.surface.method_225(var4, var5, 49, 34, class_9.method_234(181, 181, 181), 128);
         }

         if(var3 < this.inventorySize) {
            this.surface.method_258(var4, var5, 48, 32, this.field_101 + class_4.field_477[this.inventoryItemId[var3]], class_4.field_482[this.inventoryItemId[var3]], 0, 0, false);
            if(class_4.itemStackable[this.inventoryItemId[var3]] == 0) {
               this.surface.method_267(String.valueOf(this.inventoryAmounts[var3]), var4 + 1, var5 + 10, 1, 16776960);
            }
         }
      }

      var4 = 1;
      if(var9 != 0 || var4 <= 4) {
         do {
            this.surface.method_230(var2 + var4 * 49, 36, this.field_180 / 5 * 34, 0);
            ++var4;
         } while(var4 <= 4);
      }

      var5 = 1;
      if(var9 != 0) {
         this.surface.method_229(var2, 36 + var5 * 34, 245, 0);
         ++var5;
      }

      while(var5 <= this.field_180 / 5 - 1) {
         this.surface.method_229(var2, 36 + var5 * 34, 245, 0);
         ++var5;
      }

      if(var1) {
         var2 = super.mouseX - (this.surface.field_723 - 248);
         int var6 = super.mouseY - 36;
         if(var2 >= 0 && var6 >= 0 && var2 < 248 && var6 < this.field_180 / 5 * 34) {
            int var7 = var2 / 49 + var6 / 34 * 5;
            if(var7 < this.inventorySize) {
               int var8 = this.inventoryItemId[var7];
               if(this.field_204 >= 0) {
                  if(class_4.field_547[this.field_204] == 3) {
                     this.field_228[this.field_225] = "Cast " + class_4.field_543[this.field_204] + " on";
                     this.field_227[this.field_225] = "@lre@" + class_4.field_474[var8];
                     this.field_229[this.field_225] = 600;
                     this.field_232[this.field_225] = var7;
                     this.field_233[this.field_225] = this.field_204;
                     ++this.field_225;
                     return;
                  }
               } else {
                  if(this.field_185 >= 0) {
                     this.field_228[this.field_225] = "Use " + this.field_186 + " with";
                     this.field_227[this.field_225] = "@lre@" + class_4.field_474[var8];
                     this.field_229[this.field_225] = 610;
                     this.field_232[this.field_225] = var7;
                     this.field_233[this.field_225] = this.field_185;
                     ++this.field_225;
                     return;
                  }

                  label60: {
                     if(this.inventoryEquipped[var7] == 1) {
                        this.field_228[this.field_225] = "Remove";
                        this.field_227[this.field_225] = "@lre@" + class_4.field_474[var8];
                        this.field_229[this.field_225] = 620;
                        this.field_232[this.field_225] = var7;
                        ++this.field_225;
                        if(var9 == 0) {
                           break label60;
                        }
                     }

                     if(class_4.field_481[var8] != 0) {
                        label54: {
                           if((class_4.field_481[var8] & 24) != 0) {
                              this.field_228[this.field_225] = "Wield";
                              if(var9 == 0) {
                                 break label54;
                              }
                           }

                           this.field_228[this.field_225] = "Wear";
                        }

                        this.field_227[this.field_225] = "@lre@" + class_4.field_474[var8];
                        this.field_229[this.field_225] = 630;
                        this.field_232[this.field_225] = var7;
                        ++this.field_225;
                     }
                  }

                  if(!class_4.field_476[var8].equals("")) {
                     this.field_228[this.field_225] = class_4.field_476[var8];
                     this.field_227[this.field_225] = "@lre@" + class_4.field_474[var8];
                     this.field_229[this.field_225] = 640;
                     this.field_232[this.field_225] = var7;
                     ++this.field_225;
                  }

                  this.field_228[this.field_225] = "Use";
                  this.field_227[this.field_225] = "@lre@" + class_4.field_474[var8];
                  this.field_229[this.field_225] = 650;
                  this.field_232[this.field_225] = var7;
                  ++this.field_225;
                  this.field_228[this.field_225] = "Drop";
                  this.field_227[this.field_225] = "@lre@" + class_4.field_474[var8];
                  this.field_229[this.field_225] = 660;
                  this.field_232[this.field_225] = var7;
                  ++this.field_225;
                  this.field_228[this.field_225] = "Examine";
                  this.field_227[this.field_225] = "@lre@" + class_4.field_474[var8];
                  this.field_229[this.field_225] = 3600;
                  this.field_232[this.field_225] = var8;
                  ++this.field_225;
               }
            }
         }

      }
   }

   // $FF: renamed from: b (boolean) void
   public void method_123(boolean var1) {
      int var19 = class_4.field_563;
      int var2 = this.surface.field_723 - 199;
      short var3 = 156;
      short var4 = 152;
      this.surface.method_242(var2 - 49, 3, this.field_99 + 2);
      var2 += 40;
      this.surface.method_227(var2, 36, var3, var4, 0);
      this.surface.method_220(var2, 36, var2 + var3, 36 + var4);
      int var5 = 192 + this.field_200;
      int var6 = this.field_135 + this.field_199 & 255;
      int var7 = (this.localPlayer.currentX - 6040) * 3 * var5 / 2048;
      int var8 = (this.localPlayer.currentY - 6040) * 3 * var5 / 2048;
      int var9 = class_8.field_651[1024 - var6 * 4 & 1023];
      int var10 = class_8.field_651[(1024 - var6 * 4 & 1023) + 1024];
      int var11 = var8 * var9 + var7 * var10 >> 18;
      var8 = var8 * var10 - var7 * var9 >> 18;
      this.surface.method_254(var2 + var3 / 2 - var11, 36 + var4 / 2 + var8, this.field_99 - 1, var6 + 64 & 255, var5);
      int var12 = 0;
      if(var19 != 0 || var12 < this.field_163) {
         do {
            var7 = (this.field_165[var12] * this.magicLoc + 64 - this.localPlayer.currentX) * 3 * var5 / 2048;
            var8 = (this.field_166[var12] * this.magicLoc + 64 - this.localPlayer.currentY) * 3 * var5 / 2048;
            var11 = var8 * var9 + var7 * var10 >> 18;
            var8 = var8 * var10 - var7 * var9 >> 18;
            this.method_97(var2 + var3 / 2 + var11, 36 + var4 / 2 - var8, '\uffff');
            ++var12;
         } while(var12 < this.field_163);
      }

      int var13 = 0;
      if(var19 != 0) {
         var7 = (this.groundItemX[var13] * this.magicLoc + 64 - this.localPlayer.currentX) * 3 * var5 / 2048;
         var8 = (this.groundItemY[var13] * this.magicLoc + 64 - this.localPlayer.currentY) * 3 * var5 / 2048;
         var11 = var8 * var9 + var7 * var10 >> 18;
         var8 = var8 * var10 - var7 * var9 >> 18;
         this.method_97(var2 + var3 / 2 + var11, 36 + var4 / 2 - var8, 16711680);
         ++var13;
      }

      while(var13 < this.psize) {
         var7 = (this.groundItemX[var13] * this.magicLoc + 64 - this.localPlayer.currentX) * 3 * var5 / 2048;
         var8 = (this.groundItemY[var13] * this.magicLoc + 64 - this.localPlayer.currentY) * 3 * var5 / 2048;
         var11 = var8 * var9 + var7 * var10 >> 18;
         var8 = var8 * var10 - var7 * var9 >> 18;
         this.method_97(var2 + var3 / 2 + var11, 36 + var4 / 2 - var8, 16711680);
         ++var13;
      }

      int var14 = 0;
      if(var19 != 0 || var14 < this.field_150) {
         do {
            class_7 var15 = this.field_153[var14];
            var7 = (var15.currentX - this.localPlayer.currentX) * 3 * var5 / 2048;
            var8 = (var15.currentY - this.localPlayer.currentY) * 3 * var5 / 2048;
            var11 = var8 * var9 + var7 * var10 >> 18;
            var8 = var8 * var10 - var7 * var9 >> 18;
            this.method_97(var2 + var3 / 2 + var11, 36 + var4 / 2 - var8, 16776960);
            ++var14;
         } while(var14 < this.field_150);
      }

      int var20 = 0;
      class_7 var16;
      int var17;
      int var18;
      if(var19 != 0) {
         var16 = this.players[var20];
         var7 = (var16.currentX - this.localPlayer.currentX) * 3 * var5 / 2048;
         var8 = (var16.currentY - this.localPlayer.currentY) * 3 * var5 / 2048;
         var11 = var8 * var9 + var7 * var10 >> 18;
         var8 = var8 * var10 - var7 * var9 >> 18;
         var17 = 16777215;
         var18 = 0;
         if(var19 != 0 || var18 < super.field_55) {
            do {
               if(var16.usernameHash == super.field_56[var18] && super.field_57[var18] == 99) {
                  var17 = '\uff00';
                  if(var19 == 0) {
                     break;
                  }
               }

               ++var18;
            } while(var18 < super.field_55);
         }

         this.method_97(var2 + var3 / 2 + var11, 36 + var4 / 2 - var8, var17);
         ++var20;
      }

      while(var20 < this.playerCount) {
         var16 = this.players[var20];
         var7 = (var16.currentX - this.localPlayer.currentX) * 3 * var5 / 2048;
         var8 = (var16.currentY - this.localPlayer.currentY) * 3 * var5 / 2048;
         var11 = var8 * var9 + var7 * var10 >> 18;
         var8 = var8 * var10 - var7 * var9 >> 18;
         var17 = 16777215;
         var18 = 0;
         if(var19 != 0 || var18 < super.field_55) {
            do {
               if(var16.usernameHash == super.field_56[var18] && super.field_57[var18] == 99) {
                  var17 = '\uff00';
                  if(var19 == 0) {
                     break;
                  }
               }

               ++var18;
            } while(var18 < super.field_55);
         }

         this.method_97(var2 + var3 / 2 + var11, 36 + var4 / 2 - var8, var17);
         ++var20;
      }

      this.surface.method_224(var2 + var3 / 2, 36 + var4 / 2, 2, 16777215, 255);
      this.surface.method_254(var2 + 19, 55, this.field_99 + 24, this.field_135 + 128 & 255, 128);
      this.surface.method_220(0, 0, this.field_96, this.gameHeight + 12);
      if(var1) {
         var2 = super.mouseX - (this.surface.field_723 - 199);
         int var21 = super.mouseY - 36;
         if(var2 >= 40 && var21 >= 0 && var2 < 196 && var21 < 152) {
            var3 = 156;
            var4 = 152;
            var5 = 192 + this.field_200;
            var6 = this.field_135 + this.field_199 & 255;
            var2 = this.surface.field_723 - 199;
            var2 += 40;
            var7 = (super.mouseX - (var2 + var3 / 2)) * 16384 / (3 * var5);
            var8 = (super.mouseY - (36 + var4 / 2)) * 16384 / (3 * var5);
            var9 = class_8.field_651[1024 - var6 * 4 & 1023];
            var10 = class_8.field_651[(1024 - var6 * 4 & 1023) + 1024];
            var11 = var8 * var9 + var7 * var10 >> 15;
            var8 = var8 * var10 - var7 * var9 >> 15;
            var7 = var11 + this.localPlayer.currentX;
            var8 = this.localPlayer.currentY - var8;
            if(this.mouseButtonClick == 1) {
               this.method_98(this.localRegionX, this.localRegionY, var7 / 128, var8 / 128, false);
            }

            this.mouseButtonClick = 0;
         }

      }
   }

   // $FF: renamed from: c (boolean) void
   public void method_124(boolean var1) {
      int var2;
      byte var3;
      short var4;
      short var5;
      int var6;
      int var7;
      int var14;
      label151: {
         var14 = class_4.field_563;
         var2 = this.surface.field_723 - 199;
         var3 = 36;
         this.surface.method_242(var2 - 49, 3, this.field_99 + 3);
         var4 = 196;
         var5 = 275;
         var6 = var7 = class_9.method_234(160, 160, 160);
         if(this.field_211 == 0) {
            var6 = class_9.method_234(220, 220, 220);
            if(var14 == 0) {
               break label151;
            }
         }

         var7 = class_9.method_234(220, 220, 220);
      }

      this.surface.method_225(var2, var3, var4 / 2, 24, var6, 128);
      this.surface.method_225(var2 + var4 / 2, var3, var4 / 2, 24, var7, 128);
      this.surface.method_225(var2, var3 + 24, var4, var5 - 24, class_9.method_234(220, 220, 220), 128);
      this.surface.method_229(var2, var3 + 24, var4, 0);
      this.surface.method_230(var2 + var4 / 2, var3, 24, 0);
      this.surface.drawstringCenter("Stats", var2 + var4 / 4, var3 + 16, 4, 0);
      this.surface.drawstringCenter("Quests", var2 + var4 / 4 + var4 / 2, var3 + 16, 4, 0);
      int var16;
      if(this.field_211 == 0) {
         label162: {
            byte var8 = 72;
            int var9 = -1;
            this.surface.method_267("Skills", var2 + 5, var8, 3, 16776960);
            var16 = var8 + 13;
            int var10 = 0;
            int var11;
            if(var14 != 0 || var10 < 9) {
               do {
                  var11 = 16777215;
                  if(super.mouseX > var2 + 3 && super.mouseY >= var16 - 11 && super.mouseY < var16 + 2 && super.mouseX < var2 + 90) {
                     var11 = 16711680;
                     var9 = var10;
                  }

                  this.surface.method_267(this.field_196[var10] + ":@yel@" + this.playerStatCurrent[var10] + "/" + this.playerStatBase[var10], var2 + 5, var16, 1, var11);
                  var11 = 16777215;
                  if(super.mouseX >= var2 + 90 && super.mouseY >= var16 - 13 - 11 && super.mouseY < var16 - 13 + 2 && super.mouseX < var2 + 196) {
                     var11 = 16711680;
                     var9 = var10 + 9;
                  }

                  this.surface.method_267(this.field_196[var10 + 9] + ":@yel@" + this.playerStatCurrent[var10 + 9] + "/" + this.playerStatBase[var10 + 9], var2 + var4 / 2 - 5, var16 - 13, 1, var11);
                  var16 += 13;
                  ++var10;
               } while(var10 < 9);
            }

            this.surface.method_267("Quest Points:@yel@" + this.field_193, var2 + var4 / 2 - 5, var16 - 13, 1, 16777215);
            var16 += 12;
            this.surface.method_267("Fatigue: @yel@" + this.field_194 * 100 / 750 + "%", var2 + 5, var16 - 13, 1, 16777215);
            var16 += 8;
            this.surface.method_267("Equipment Status", var2 + 5, var16, 3, 16776960);
            var16 += 12;
            var11 = 0;
            if(var14 != 0 || var11 < 3) {
               do {
                  this.surface.method_267(this.field_198[var11] + ":@yel@" + this.field_192[var11], var2 + 5, var16, 1, 16777215);
                  if(var11 < 2) {
                     this.surface.method_267(this.field_198[var11 + 3] + ":@yel@" + this.field_192[var11 + 3], var2 + var4 / 2 + 25, var16, 1, 16777215);
                  }

                  var16 += 13;
                  ++var11;
               } while(var11 < 3);
            }

            var16 += 6;
            this.surface.method_229(var2, var16 - 15, var4, 0);
            int var12;
            int var13;
            if(var9 != -1) {
               this.surface.method_267(this.field_197[var9] + " skill", var2 + 5, var16, 1, 16776960);
               var16 += 12;
               var12 = this.field_187[0];
               var13 = 0;
               if(var14 != 0 || var13 < 98) {
                  do {
                     if(this.field_191[var9] >= this.field_187[var13]) {
                        var12 = this.field_187[var13 + 1];
                     }

                     ++var13;
                  } while(var13 < 98);
               }

               this.surface.method_267("Total xp: " + this.field_191[var9] / 4, var2 + 5, var16, 1, 16777215);
               var16 += 12;
               this.surface.method_267("Next level at: " + var12 / 4, var2 + 5, var16, 1, 16777215);
               if(var14 == 0) {
                  break label162;
               }
            }

            this.surface.method_267("Overall levels", var2 + 5, var16, 1, 16776960);
            var16 += 12;
            var12 = 0;
            var13 = 0;
            if(var14 != 0 || var13 < 18) {
               do {
                  var12 += this.playerStatBase[var13];
                  ++var13;
               } while(var13 < 18);
            }

            this.surface.method_267("Skill total: " + var12, var2 + 5, var16, 1, 16777215);
            var16 += 12;
            this.surface.method_267("Combat level: " + this.localPlayer.combatLevel, var2 + 5, var16, 1, 16777215);
            var16 += 12;
         }
      }

      if(this.field_211 == 1) {
         this.field_209.method_303(this.field_210);
         this.field_209.method_305(this.field_210, 0, "@whi@Quest-list (green=completed)");
         var16 = 0;
         if(var14 != 0 || var16 < this.field_212) {
            do {
               this.field_209.method_305(this.field_210, var16 + 1, (this.field_214[var16]?"@gre@":"@red@") + this.field_213[var16]);
               ++var16;
            } while(var16 < this.field_212);
         }

         this.field_209.method_278();
      }

      if(var1) {
         var2 = super.mouseX - (this.surface.field_723 - 199);
         int var15 = super.mouseY - 36;
         if(var2 >= 0 && var15 >= 0 && var2 < var4 && var15 < var5) {
            if(this.field_211 == 1) {
               this.field_209.method_275(var2 + (this.surface.field_723 - 199), var15 + 36, super.lastMouseButtonDown, super.field_35);
            }

            if(var15 <= 24 && this.mouseButtonClick == 1) {
               if(var2 < 98) {
                  this.field_211 = 0;
                  return;
               }

               if(var2 > 98) {
                  this.field_211 = 1;
               }
            }
         }

      }
   }

   // $FF: renamed from: d (boolean) void
   public void method_125(boolean var1) {
      int var2;
      byte var3;
      short var4;
      short var5;
      int var6;
      int var7;
      int var16;
      label197: {
         var16 = class_4.field_563;
         var2 = this.surface.field_723 - 199;
         var3 = 36;
         this.surface.method_242(var2 - 49, 3, this.field_99 + 4);
         var4 = 196;
         var5 = 182;
         var6 = var7 = class_9.method_234(160, 160, 160);
         if(this.field_203 == 0) {
            var6 = class_9.method_234(220, 220, 220);
            if(var16 == 0) {
               break label197;
            }
         }

         var7 = class_9.method_234(220, 220, 220);
      }

      this.surface.method_225(var2, var3, var4 / 2, 24, var6, 128);
      this.surface.method_225(var2 + var4 / 2, var3, var4 / 2, 24, var7, 128);
      this.surface.method_225(var2, var3 + 24, var4, 90, class_9.method_234(220, 220, 220), 128);
      this.surface.method_225(var2, var3 + 24 + 90, var4, var5 - 90 - 24, class_9.method_234(160, 160, 160), 128);
      this.surface.method_229(var2, var3 + 24, var4, 0);
      this.surface.method_230(var2 + var4 / 2, var3, 24, 0);
      this.surface.method_229(var2, var3 + 113, var4, 0);
      this.surface.drawstringCenter("Magic", var2 + var4 / 4, var3 + 16, 4, 0);
      this.surface.drawstringCenter("Prayers", var2 + var4 / 4 + var4 / 2, var3 + 16, 4, 0);
      int var8;
      int var9;
      String var10;
      int var11;
      int var18;
      if(this.field_203 == 0) {
         label211: {
            this.field_201.method_303(this.field_202);
            var8 = 0;
            var9 = 0;
            int var12;
            if(var16 != 0 || var9 < class_4.field_542) {
               do {
                  var10 = "@yel@";
                  var11 = 0;
                  if(var16 != 0 || var11 < class_4.field_546[var9]) {
                     do {
                        var12 = class_4.field_548[var9][var11];
                        if(!this.method_95(var12, class_4.field_549[var9][var11])) {
                           var10 = "@whi@";
                           if(var16 == 0) {
                              break;
                           }
                        }

                        ++var11;
                     } while(var11 < class_4.field_546[var9]);
                  }

                  var12 = this.playerStatCurrent[6];
                  if(class_4.field_545[var9] > var12) {
                     var10 = "@bla@";
                  }

                  this.field_201.method_305(this.field_202, var8++, var10 + "Level " + class_4.field_545[var9] + ": " + class_4.field_543[var9]);
                  ++var9;
               } while(var9 < class_4.field_542);
            }

            this.field_201.method_278();
            var18 = this.field_201.method_313(this.field_202);
            if(var18 != -1) {
               this.surface.method_267("Level " + class_4.field_545[var18] + ": " + class_4.field_543[var18], var2 + 2, var3 + 124, 1, 16776960);
               this.surface.method_267(class_4.field_544[var18], var2 + 2, var3 + 136, 0, 16777215);
               var11 = 0;
               if(var16 != 0 || var11 < class_4.field_546[var18]) {
                  do {
                     var12 = class_4.field_548[var18][var11];
                     this.surface.method_242(var2 + 2 + var11 * 44, var3 + 150, this.field_101 + class_4.field_477[var12]);
                     int var13 = this.method_94(var12);
                     int var14 = class_4.field_549[var18][var11];
                     String var15 = "@red@";
                     if(this.method_95(var12, var14)) {
                        var15 = "@gre@";
                     }

                     this.surface.method_267(var15 + var13 + "/" + var14, var2 + 2 + var11 * 44, var3 + 150, 1, 16777215);
                     ++var11;
                  } while(var11 < class_4.field_546[var18]);
               }

               if(var16 == 0) {
                  break label211;
               }
            }

            this.surface.method_267("Point at a spell for a description", var2 + 2, var3 + 124, 1, 0);
         }
      }

      if(this.field_203 == 1) {
         label212: {
            this.field_201.method_303(this.field_202);
            var8 = 0;
            var9 = 0;
            if(var16 != 0 || var9 < class_4.field_550) {
               do {
                  var10 = "@whi@";
                  if(class_4.field_553[var9] > this.playerStatBase[5]) {
                     var10 = "@bla@";
                  }

                  if(this.field_215[var9]) {
                     var10 = "@gre@";
                  }

                  this.field_201.method_305(this.field_202, var8++, var10 + "Level " + class_4.field_553[var9] + ": " + class_4.field_551[var9]);
                  ++var9;
               } while(var9 < class_4.field_550);
            }

            this.field_201.method_278();
            var18 = this.field_201.method_313(this.field_202);
            if(var18 != -1) {
               this.surface.drawstringCenter("Level " + class_4.field_553[var18] + ": " + class_4.field_551[var18], var2 + var4 / 2, var3 + 130, 1, 16776960);
               this.surface.drawstringCenter(class_4.field_552[var18], var2 + var4 / 2, var3 + 145, 0, 16777215);
               this.surface.drawstringCenter("Drain rate: " + class_4.field_554[var18], var2 + var4 / 2, var3 + 160, 1, 0);
               if(var16 == 0) {
                  break label212;
               }
            }

            this.surface.method_267("Point at a prayer for a description", var2 + 2, var3 + 124, 1, 0);
         }
      }

      if(var1) {
         var2 = super.mouseX - (this.surface.field_723 - 199);
         int var17 = super.mouseY - 36;
         if(var2 >= 0 && var17 >= 0 && var2 < 196 && var17 < 182) {
            this.field_201.method_275(var2 + (this.surface.field_723 - 199), var17 + 36, super.lastMouseButtonDown, super.field_35);
            if(var17 <= 24 && this.mouseButtonClick == 1) {
               label128: {
                  if(var2 < 98 && this.field_203 == 1) {
                     this.field_203 = 0;
                     this.field_201.method_304(this.field_202);
                     if(var16 == 0) {
                        break label128;
                     }
                  }

                  if(var2 > 98 && this.field_203 == 0) {
                     this.field_203 = 1;
                     this.field_201.method_304(this.field_202);
                  }
               }
            }

            if(this.mouseButtonClick == 1 && this.field_203 == 0) {
               var8 = this.field_201.method_313(this.field_202);
               if(var8 != -1) {
                  label215: {
                     var9 = this.playerStatCurrent[6];
                     if(class_4.field_545[var8] > var9) {
                        this.displayMessage("Your magic ability is not high enough for this spell", 3);
                        if(var16 == 0) {
                           break label215;
                        }
                     }

                     var18 = 0;
                     if(var16 != 0 || var18 < class_4.field_546[var8]) {
                        do {
                           var11 = class_4.field_548[var8][var18];
                           if(!this.method_95(var11, class_4.field_549[var8][var18])) {
                              this.displayMessage("You don\'t have all the reagents you need for this spell", 3);
                              var18 = -1;
                              if(var16 == 0) {
                                 break;
                              }
                           }

                           ++var18;
                        } while(var18 < class_4.field_546[var8]);
                     }

                     if(var18 == class_4.field_546[var8]) {
                        this.field_204 = var8;
                        this.field_185 = -1;
                     }
                  }
               }
            }

            if(this.mouseButtonClick == 1 && this.field_203 == 1) {
               var8 = this.field_201.method_313(this.field_202);
               if(var8 != -1) {
                  label209: {
                     var9 = this.playerStatBase[5];
                     if(class_4.field_553[var8] > var9) {
                        this.displayMessage("Your prayer ability is not high enough for this prayer", 3);
                        if(var16 == 0) {
                           break label209;
                        }
                     }

                     if(this.playerStatCurrent[5] == 0) {
                        this.displayMessage("You have run out of prayer points. Return to a church to recharge", 3);
                        if(var16 == 0) {
                           break label209;
                        }
                     }

                     if(this.field_215[var8]) {
                        super.clientStream.newPacket(211, 457);
                        super.clientStream.putByte(var8);
                        super.clientStream.flushPacket_();
                        this.field_215[var8] = false;
                        this.method_64("prayeroff");
                        if(var16 == 0) {
                           break label209;
                        }
                     }

                     super.clientStream.newPacket(212, 126);
                     super.clientStream.putByte(var8);
                     super.clientStream.flushPacket_();
                     this.field_215[var8] = true;
                     this.method_64("prayeron");
                  }
               }
            }

            this.mouseButtonClick = 0;
         }

      }
   }

   // $FF: renamed from: e (boolean) void
   public void method_126(boolean var1) {
      int var2;
      byte var3;
      short var4;
      short var5;
      int var6;
      int var7;
      int var10;
      label210: {
         var10 = class_4.field_563;
         var2 = this.surface.field_723 - 199;
         var3 = 36;
         this.surface.method_242(var2 - 49, 3, this.field_99 + 5);
         var4 = 196;
         var5 = 182;
         var6 = var7 = class_9.method_234(160, 160, 160);
         if(this.field_207 == 0) {
            var6 = class_9.method_234(220, 220, 220);
            if(var10 == 0) {
               break label210;
            }
         }

         var7 = class_9.method_234(220, 220, 220);
      }

      this.surface.method_225(var2, var3, var4 / 2, 24, var6, 128);
      this.surface.method_225(var2 + var4 / 2, var3, var4 / 2, 24, var7, 128);
      this.surface.method_225(var2, var3 + 24, var4, var5 - 24, class_9.method_234(220, 220, 220), 128);
      this.surface.method_229(var2, var3 + 24, var4, 0);
      this.surface.method_230(var2 + var4 / 2, var3, 24, 0);
      this.surface.method_229(var2, var3 + var5 - 16, var4, 0);
      this.surface.drawstringCenter("Friends", var2 + var4 / 4, var3 + 16, 4, 0);
      this.surface.drawstringCenter("Ignore", var2 + var4 / 4 + var4 / 2, var3 + 16, 4, 0);
      this.field_205.method_303(this.field_206);
      int var8;
      if(this.field_207 == 0) {
         var8 = 0;
         if(var10 != 0 || var8 < super.field_55) {
            do {
               String var9;
               label214: {
                  if(super.field_57[var8] == 99) {
                     var9 = "@gre@";
                     if(var10 == 0) {
                        break label214;
                     }
                  }

                  if(super.field_57[var8] > 0) {
                     var9 = "@yel@";
                     if(var10 == 0) {
                        break label214;
                     }
                  }

                  var9 = "@red@";
               }

               this.field_205.method_305(this.field_206, var8, var9 + class_21.unhashUsername(super.field_56[var8]) + "~439~@whi@Remove         WWWWWWWWWW");
               ++var8;
            } while(var8 < super.field_55);
         }
      }

      if(this.field_207 == 1) {
         var8 = 0;
         if(var10 != 0 || var8 < super.ignoreListCount) {
            do {
               this.field_205.method_305(this.field_206, var8, "@yel@" + class_21.unhashUsername(super.ignoreListAccNames[var8]) + "~439~@whi@Remove         WWWWWWWWWW");
               ++var8;
            } while(var8 < super.ignoreListCount);
         }
      }

      this.field_205.method_278();
      int var12;
      if(this.field_207 == 0) {
         label171: {
            var8 = this.field_205.method_313(this.field_206);
            if(var8 >= 0 && super.mouseX < 489) {
               if(super.mouseX > 429) {
                  this.surface.drawstringCenter("Click to remove " + class_21.unhashUsername(super.field_56[var8]), var2 + var4 / 2, var3 + 35, 1, 16777215);
                  if(var10 == 0) {
                     break label171;
                  }
               }

               if(super.field_57[var8] == 99) {
                  this.surface.drawstringCenter("Click to message " + class_21.unhashUsername(super.field_56[var8]), var2 + var4 / 2, var3 + 35, 1, 16777215);
                  if(var10 == 0) {
                     break label171;
                  }
               }

               if(super.field_57[var8] > 0) {
                  this.surface.drawstringCenter(class_21.unhashUsername(super.field_56[var8]) + " is on world " + super.field_57[var8], var2 + var4 / 2, var3 + 35, 1, 16777215);
                  if(var10 == 0) {
                     break label171;
                  }
               }

               this.surface.drawstringCenter(class_21.unhashUsername(super.field_56[var8]) + " is offline", var2 + var4 / 2, var3 + 35, 1, 16777215);
               if(var10 == 0) {
                  break label171;
               }
            }

            this.surface.drawstringCenter("Click a name to send a message", var2 + var4 / 2, var3 + 35, 1, 16777215);
         }

         label156: {
            if(super.mouseX > var2 && super.mouseX < var2 + var4 && super.mouseY > var3 + var5 - 16 && super.mouseY < var3 + var5) {
               var12 = 16776960;
               if(var10 == 0) {
                  break label156;
               }
            }

            var12 = 16777215;
         }

         this.surface.drawstringCenter("Click here to add a friend", var2 + var4 / 2, var3 + var5 - 3, 1, var12);
      }

      if(this.field_207 == 1) {
         label146: {
            var8 = this.field_205.method_313(this.field_206);
            if(var8 >= 0 && super.mouseX < 489 && super.mouseX > 429) {
               if(super.mouseX <= 429) {
                  break label146;
               }

               this.surface.drawstringCenter("Click to remove " + class_21.unhashUsername(super.ignoreListAccNames[var8]), var2 + var4 / 2, var3 + 35, 1, 16777215);
               if(var10 == 0) {
                  break label146;
               }
            }

            this.surface.drawstringCenter("Blocking messages from:", var2 + var4 / 2, var3 + 35, 1, 16777215);
         }

         label137: {
            if(super.mouseX > var2 && super.mouseX < var2 + var4 && super.mouseY > var3 + var5 - 16 && super.mouseY < var3 + var5) {
               var12 = 16776960;
               if(var10 == 0) {
                  break label137;
               }
            }

            var12 = 16777215;
         }

         this.surface.drawstringCenter("Click here to add a name", var2 + var4 / 2, var3 + var5 - 3, 1, var12);
      }

      if(var1) {
         var2 = super.mouseX - (this.surface.field_723 - 199);
         int var11 = super.mouseY - 36;
         if(var2 >= 0 && var11 >= 0 && var2 < 196 && var11 < 182) {
            this.field_205.method_275(var2 + (this.surface.field_723 - 199), var11 + 36, super.lastMouseButtonDown, super.field_35);
            if(var11 <= 24 && this.mouseButtonClick == 1) {
               label121: {
                  if(var2 < 98 && this.field_207 == 1) {
                     this.field_207 = 0;
                     this.field_205.method_304(this.field_206);
                     if(var10 == 0) {
                        break label121;
                     }
                  }

                  if(var2 > 98 && this.field_207 == 0) {
                     this.field_207 = 1;
                     this.field_205.method_304(this.field_206);
                  }
               }
            }

            if(this.mouseButtonClick == 1 && this.field_207 == 0) {
               var8 = this.field_205.method_313(this.field_206);
               if(var8 >= 0 && super.mouseX < 489) {
                  label111: {
                     if(super.mouseX > 429) {
                        this.friendRemove(super.field_56[var8]);
                        if(var10 == 0) {
                           break label111;
                        }
                     }

                     if(super.field_57[var8] != 0) {
                        this.field_320 = 2;
                        this.field_208 = super.field_56[var8];
                        super.field_42 = "";
                        super.field_43 = "";
                     }
                  }
               }
            }

            if(this.mouseButtonClick == 1 && this.field_207 == 1) {
               var8 = this.field_205.method_313(this.field_206);
               if(var8 >= 0 && super.mouseX < 489 && super.mouseX > 429) {
                  this.ignoreRemove(super.ignoreListAccNames[var8]);
               }
            }

            if(var11 > 166 && this.mouseButtonClick == 1 && this.field_207 == 0) {
               this.field_320 = 1;
               super.inputTextCurrent = "";
               super.inputTextFinal = "";
            }

            if(var11 > 166 && this.mouseButtonClick == 1 && this.field_207 == 1) {
               this.field_320 = 3;
               super.inputTextCurrent = "";
               super.inputTextFinal = "";
            }

            this.mouseButtonClick = 0;
         }

      }
   }

   // $FF: renamed from: f (boolean) void
   public void method_127(boolean var1) {
      int var2;
      short var4;
      int var5;
      int var6;
      int var11;
      label287: {
         var11 = class_4.field_563;
         var2 = this.surface.field_723 - 199;
         byte var3 = 36;
         this.surface.method_242(var2 - 49, 3, this.field_99 + 6);
         var4 = 196;
         this.surface.method_225(var2, 36, var4, 65, class_9.method_234(181, 181, 181), 160);
         this.surface.method_225(var2, 101, var4, 65, class_9.method_234(201, 201, 201), 160);
         this.surface.method_225(var2, 166, var4, 95, class_9.method_234(181, 181, 181), 160);
         this.surface.method_225(var2, 261, var4, 40, class_9.method_234(201, 201, 201), 160);
         var5 = var2 + 3;
         var6 = var3 + 15;
         this.surface.method_267("Game options - click to toggle", var5, var6, 1, 0);
         var6 += 15;
         if(this.optionCAmeraModeAuto) {
            this.surface.method_267("Camera angle mode - @gre@Auto", var5, var6, 1, 16777215);
            if(var11 == 0) {
               break label287;
            }
         }

         this.surface.method_267("Camera angle mode - @red@Manual", var5, var6, 1, 16777215);
      }

      label282: {
         var6 += 15;
         if(this.field_218) {
            this.surface.method_267("Mouse buttons - @red@One", var5, var6, 1, 16777215);
            if(var11 == 0) {
               break label282;
            }
         }

         this.surface.method_267("Mouse buttons - @gre@Two", var5, var6, 1, 16777215);
      }

      var6 += 15;
      if(this.field_69) {
         label276: {
            if(this.field_219) {
               this.surface.method_267("Sound effects - @red@off", var5, var6, 1, 16777215);
               if(var11 == 0) {
                  break label276;
               }
            }

            this.surface.method_267("Sound effects - @gre@on", var5, var6, 1, 16777215);
         }
      }

      var6 += 15;
      var6 += 5;
      this.surface.method_267("Security settings", var5, var6, 1, 0);
      var6 += 15;
      int var7 = 16777215;
      if(super.mouseX > var5 && super.mouseX < var5 + var4 && super.mouseY > var6 - 12 && super.mouseY < var6 + 4) {
         var7 = 16776960;
      }

      this.surface.method_267("Change password", var5, var6, 1, var7);
      var6 += 15;
      var7 = 16777215;
      if(super.mouseX > var5 && super.mouseX < var5 + var4 && super.mouseY > var6 - 12 && super.mouseY < var6 + 4) {
         var7 = 16776960;
      }

      this.surface.method_267("Change recovery questions", var5, var6, 1, var7);
      var6 += 15;
      var7 = 16777215;
      if(super.mouseX > var5 && super.mouseX < var5 + var4 && super.mouseY > var6 - 12 && super.mouseY < var6 + 4) {
         var7 = 16776960;
      }

      label267: {
         this.surface.method_267("Change contact details", var5, var6, 1, var7);
         var6 += 15;
         var6 += 5;
         this.surface.method_267("Privacy settings. Will be applied to", var2 + 3, var6, 1, 0);
         var6 += 15;
         this.surface.method_267("all people not on your friends list", var2 + 3, var6, 1, 0);
         var6 += 15;
         if(super.field_60 == 0) {
            this.surface.method_267("Block chat messages: @red@<off>", var2 + 3, var6, 1, 16777215);
            if(var11 == 0) {
               break label267;
            }
         }

         this.surface.method_267("Block chat messages: @gre@<on>", var2 + 3, var6, 1, 16777215);
      }

      label262: {
         var6 += 15;
         if(super.field_61 == 0) {
            this.surface.method_267("Block private messages: @red@<off>", var2 + 3, var6, 1, 16777215);
            if(var11 == 0) {
               break label262;
            }
         }

         this.surface.method_267("Block private messages: @gre@<on>", var2 + 3, var6, 1, 16777215);
      }

      label257: {
         var6 += 15;
         if(super.field_62 == 0) {
            this.surface.method_267("Block trade requests: @red@<off>", var2 + 3, var6, 1, 16777215);
            if(var11 == 0) {
               break label257;
            }
         }

         this.surface.method_267("Block trade requests: @gre@<on>", var2 + 3, var6, 1, 16777215);
      }

      var6 += 15;
      if(this.field_69) {
         label251: {
            if(super.field_63 == 0) {
               this.surface.method_267("Block duel requests: @red@<off>", var2 + 3, var6, 1, 16777215);
               if(var11 == 0) {
                  break label251;
               }
            }

            this.surface.method_267("Block duel requests: @gre@<on>", var2 + 3, var6, 1, 16777215);
         }
      }

      var6 += 15;
      var6 += 5;
      this.surface.method_267("Always logout when you finish", var5, var6, 1, 0);
      var6 += 15;
      var7 = 16777215;
      if(super.mouseX > var5 && super.mouseX < var5 + var4 && super.mouseY > var6 - 12 && super.mouseY < var6 + 4) {
         var7 = 16776960;
      }

      this.surface.method_267("Click here to logout", var2 + 3, var6, 1, var7);
      if(var1) {
         var2 = super.mouseX - (this.surface.field_723 - 199);
         int var12 = super.mouseY - 36;
         if(var2 >= 0 && var12 >= 0 && var2 < 196 && var12 < 265) {
            int var8 = this.surface.field_723 - 199;
            byte var9 = 36;
            var4 = 196;
            var5 = var8 + 3;
            var6 = var9 + 30;
            if(super.mouseX > var5 && super.mouseX < var5 + var4 && super.mouseY > var6 - 12 && super.mouseY < var6 + 4 && this.mouseButtonClick == 1) {
               this.optionCAmeraModeAuto = !this.optionCAmeraModeAuto;
               super.clientStream.newPacket(213, 892);
               super.clientStream.putByte(0);
               super.clientStream.putByte(this.optionCAmeraModeAuto ?1:0);
               super.clientStream.flushPacket_();
            }

            var6 += 15;
            if(super.mouseX > var5 && super.mouseX < var5 + var4 && super.mouseY > var6 - 12 && super.mouseY < var6 + 4 && this.mouseButtonClick == 1) {
               this.field_218 = !this.field_218;
               super.clientStream.newPacket(213, 892);
               super.clientStream.putByte(2);
               super.clientStream.putByte(this.field_218?1:0);
               super.clientStream.flushPacket_();
            }

            var6 += 15;
            if(this.field_69 && super.mouseX > var5 && super.mouseX < var5 + var4 && super.mouseY > var6 - 12 && super.mouseY < var6 + 4 && this.mouseButtonClick == 1) {
               this.field_219 = !this.field_219;
               super.clientStream.newPacket(213, 892);
               super.clientStream.putByte(3);
               super.clientStream.putByte(this.field_219?1:0);
               super.clientStream.flushPacket_();
            }

            var6 += 15;
            var6 += 20;
            if(super.mouseX > var5 && super.mouseX < var5 + var4 && super.mouseY > var6 - 12 && super.mouseY < var6 + 4 && this.mouseButtonClick == 1) {
               this.field_323 = 6;
               super.inputTextCurrent = "";
               super.inputTextFinal = "";
            }

            var6 += 15;
            if(super.mouseX > var5 && super.mouseX < var5 + var4 && super.mouseY > var6 - 12 && super.mouseY < var6 + 4 && this.mouseButtonClick == 1) {
               super.clientStream.newPacket(197, 882);
               super.clientStream.flushPacket_();
            }

            var6 += 15;
            if(super.mouseX > var5 && super.mouseX < var5 + var4 && super.mouseY > var6 - 12 && super.mouseY < var6 + 4 && this.mouseButtonClick == 1) {
               super.clientStream.newPacket(247, 888);
               super.clientStream.flushPacket_();
            }

            var6 += 15;
            boolean var10 = false;
            var6 += 35;
            if(super.mouseX > var5 && super.mouseX < var5 + var4 && super.mouseY > var6 - 12 && super.mouseY < var6 + 4 && this.mouseButtonClick == 1) {
               super.field_60 = 1 - super.field_60;
               var10 = true;
            }

            var6 += 15;
            if(super.mouseX > var5 && super.mouseX < var5 + var4 && super.mouseY > var6 - 12 && super.mouseY < var6 + 4 && this.mouseButtonClick == 1) {
               super.field_61 = 1 - super.field_61;
               var10 = true;
            }

            var6 += 15;
            if(super.mouseX > var5 && super.mouseX < var5 + var4 && super.mouseY > var6 - 12 && super.mouseY < var6 + 4 && this.mouseButtonClick == 1) {
               super.field_62 = 1 - super.field_62;
               var10 = true;
            }

            var6 += 15;
            if(this.field_69 && super.mouseX > var5 && super.mouseX < var5 + var4 && super.mouseY > var6 - 12 && super.mouseY < var6 + 4 && this.mouseButtonClick == 1) {
               super.field_63 = 1 - super.field_63;
               var10 = true;
            }

            var6 += 15;
            if(var10) {
               this.sendPrivacySettings(super.field_60, super.field_61, super.field_62, super.field_63);
            }

            var6 += 20;
            if(super.mouseX > var5 && super.mouseX < var5 + var4 && super.mouseY > var6 - 12 && super.mouseY < var6 + 4 && this.mouseButtonClick == 1) {
               this.sendLogout();
            }

            this.mouseButtonClick = 0;
         }

      }
   }

   // $FF: renamed from: br () void
   public void method_128() {
      int var18 = class_4.field_563;
      int var1 = 2203 - (this.localRegionY + this.planeHeight + this.regionY);
      if(this.localRegionX + this.planeWidth + this.regionX >= 2640) {
         var1 = -50;
      }

      int var2 = -1;
      int var3 = 0;
      if(var18 != 0 || var3 < this.field_163) {
         do {
            this.field_170[var3] = false;
            ++var3;
         } while(var3 < this.field_163);
      }

      int var4 = 0;
      if(var18 != 0) {
         this.field_178[var4] = false;
         ++var4;
      }

      while(var4 < this.field_172) {
         this.field_178[var4] = false;
         ++var4;
      }

      int var5 = this.scene.method_179();
      Scene[] var6 = this.scene.method_181();
      int[] var7 = this.scene.method_180();
      int var8 = 0;
      if(var18 != 0 || var8 < var5) {
         while(this.field_225 <= 200) {
            int var9 = var7[var8];
            Scene var10 = var6[var8];
            if(var10.field_884[var9] <= '\uffff' || var10.field_884[var9] >= 200000 && var10.field_884[var9] <= 300000) {
               label356: {
                  int var11;
                  int var12;
                  if(var10 == this.scene.field_690) {
                     var11 = var10.field_884[var9] % 10000;
                     var12 = var10.field_884[var9] / 10000;
                     String var13;
                     int var14;
                     if(var12 == 1) {
                        var13 = "";
                        var14 = 0;
                        if(this.localPlayer.combatLevel > 0 && this.players[var11].combatLevel > 0) {
                           var14 = this.localPlayer.combatLevel - this.players[var11].combatLevel;
                        }

                        if(var14 < 0) {
                           var13 = "@or1@";
                        }

                        if(var14 < -3) {
                           var13 = "@or2@";
                        }

                        if(var14 < -6) {
                           var13 = "@or3@";
                        }

                        if(var14 < -9) {
                           var13 = "@red@";
                        }

                        if(var14 > 0) {
                           var13 = "@gr1@";
                        }

                        if(var14 > 3) {
                           var13 = "@gr2@";
                        }

                        if(var14 > 6) {
                           var13 = "@gr3@";
                        }

                        if(var14 > 9) {
                           var13 = "@gre@";
                        }

                        var13 = " " + var13 + "(level-" + this.players[var11].combatLevel + ")";
                        if(this.field_204 >= 0) {
                           if(class_4.field_547[this.field_204] != 1 && class_4.field_547[this.field_204] != 2) {
                              break label356;
                           }

                           this.field_228[this.field_225] = "Cast " + class_4.field_543[this.field_204] + " on";
                           this.field_227[this.field_225] = "@whi@" + this.players[var11].username + var13;
                           this.field_229[this.field_225] = 800;
                           this.field_230[this.field_225] = this.players[var11].currentX;
                           this.field_231[this.field_225] = this.players[var11].currentY;
                           this.field_232[this.field_225] = this.players[var11].field_608;
                           this.field_233[this.field_225] = this.field_204;
                           ++this.field_225;
                           if(var18 == 0) {
                              break label356;
                           }
                        }

                        if(this.field_185 >= 0) {
                           this.field_228[this.field_225] = "Use " + this.field_186 + " with";
                           this.field_227[this.field_225] = "@whi@" + this.players[var11].username + var13;
                           this.field_229[this.field_225] = 810;
                           this.field_230[this.field_225] = this.players[var11].currentX;
                           this.field_231[this.field_225] = this.players[var11].currentY;
                           this.field_232[this.field_225] = this.players[var11].field_608;
                           this.field_233[this.field_225] = this.field_185;
                           ++this.field_225;
                           if(var18 == 0) {
                              break label356;
                           }
                        }

                        label237: {
                           if(var1 > 0 && (this.players[var11].currentY - 64) / this.magicLoc + this.planeHeight + this.regionY < 2203) {
                              label231: {
                                 this.field_228[this.field_225] = "Attack";
                                 this.field_227[this.field_225] = "@whi@" + this.players[var11].username + var13;
                                 if(var14 >= 0 && var14 < 5) {
                                    this.field_229[this.field_225] = 805;
                                    if(var18 == 0) {
                                       break label231;
                                    }
                                 }

                                 this.field_229[this.field_225] = 2805;
                              }

                              this.field_230[this.field_225] = this.players[var11].currentX;
                              this.field_231[this.field_225] = this.players[var11].currentY;
                              this.field_232[this.field_225] = this.players[var11].field_608;
                              ++this.field_225;
                              if(var18 == 0) {
                                 break label237;
                              }
                           }

                           if(this.field_69) {
                              this.field_228[this.field_225] = "Duel with";
                              this.field_227[this.field_225] = "@whi@" + this.players[var11].username + var13;
                              this.field_230[this.field_225] = this.players[var11].currentX;
                              this.field_231[this.field_225] = this.players[var11].currentY;
                              this.field_229[this.field_225] = 2806;
                              this.field_232[this.field_225] = this.players[var11].field_608;
                              ++this.field_225;
                           }
                        }

                        this.field_228[this.field_225] = "Trade with";
                        this.field_227[this.field_225] = "@whi@" + this.players[var11].username + var13;
                        this.field_229[this.field_225] = 2810;
                        this.field_232[this.field_225] = this.players[var11].field_608;
                        ++this.field_225;
                        this.field_228[this.field_225] = "Follow";
                        this.field_227[this.field_225] = "@whi@" + this.players[var11].username + var13;
                        this.field_229[this.field_225] = 2820;
                        this.field_232[this.field_225] = this.players[var11].field_608;
                        ++this.field_225;
                        if(var18 == 0) {
                           break label356;
                        }
                     }

                     if(var12 == 2) {
                        if(this.field_204 >= 0) {
                           if(class_4.field_547[this.field_204] != 3) {
                              break label356;
                           }

                           this.field_228[this.field_225] = "Cast " + class_4.field_543[this.field_204] + " on";
                           this.field_227[this.field_225] = "@lre@" + class_4.field_474[this.groundItemId[var11]];
                           this.field_229[this.field_225] = 200;
                           this.field_230[this.field_225] = this.groundItemX[var11];
                           this.field_231[this.field_225] = this.groundItemY[var11];
                           this.field_232[this.field_225] = this.groundItemId[var11];
                           this.field_233[this.field_225] = this.field_204;
                           ++this.field_225;
                           if(var18 == 0) {
                              break label356;
                           }
                        }

                        if(this.field_185 >= 0) {
                           this.field_228[this.field_225] = "Use " + this.field_186 + " with";
                           this.field_227[this.field_225] = "@lre@" + class_4.field_474[this.groundItemId[var11]];
                           this.field_229[this.field_225] = 210;
                           this.field_230[this.field_225] = this.groundItemX[var11];
                           this.field_231[this.field_225] = this.groundItemY[var11];
                           this.field_232[this.field_225] = this.groundItemId[var11];
                           this.field_233[this.field_225] = this.field_185;
                           ++this.field_225;
                           if(var18 == 0) {
                              break label356;
                           }
                        }

                        this.field_228[this.field_225] = "Take";
                        this.field_227[this.field_225] = "@lre@" + class_4.field_474[this.groundItemId[var11]];
                        this.field_229[this.field_225] = 220;
                        this.field_230[this.field_225] = this.groundItemX[var11];
                        this.field_231[this.field_225] = this.groundItemY[var11];
                        this.field_232[this.field_225] = this.groundItemId[var11];
                        ++this.field_225;
                        this.field_228[this.field_225] = "Examine";
                        this.field_227[this.field_225] = "@lre@" + class_4.field_474[this.groundItemId[var11]];
                        this.field_229[this.field_225] = 3200;
                        this.field_232[this.field_225] = this.groundItemId[var11];
                        ++this.field_225;
                        if(var18 == 0) {
                           break label356;
                        }
                     }

                     if(var12 != 3) {
                        break label356;
                     }

                     var13 = "";
                     var14 = -1;
                     int var15 = this.field_153[var11].field_612;
                     if(class_4.field_493[var15] > 0) {
                        int var16 = (class_4.field_489[var15] + class_4.field_492[var15] + class_4.field_490[var15] + class_4.field_491[var15]) / 4;
                        int var17 = (this.playerStatBase[0] + this.playerStatBase[1] + this.playerStatBase[2] + this.playerStatBase[3] + 27) / 4;
                        var14 = var17 - var16;
                        var13 = "@yel@";
                        if(var14 < 0) {
                           var13 = "@or1@";
                        }

                        if(var14 < -3) {
                           var13 = "@or2@";
                        }

                        if(var14 < -6) {
                           var13 = "@or3@";
                        }

                        if(var14 < -9) {
                           var13 = "@red@";
                        }

                        if(var14 > 0) {
                           var13 = "@gr1@";
                        }

                        if(var14 > 3) {
                           var13 = "@gr2@";
                        }

                        if(var14 > 6) {
                           var13 = "@gr3@";
                        }

                        if(var14 > 9) {
                           var13 = "@gre@";
                        }

                        var13 = " " + var13 + "(level-" + var16 + ")";
                     }

                     if(this.field_204 >= 0) {
                        if(class_4.field_547[this.field_204] != 2) {
                           break label356;
                        }

                        this.field_228[this.field_225] = "Cast " + class_4.field_543[this.field_204] + " on";
                        this.field_227[this.field_225] = "@yel@" + class_4.field_486[this.field_153[var11].field_612];
                        this.field_229[this.field_225] = 700;
                        this.field_230[this.field_225] = this.field_153[var11].currentX;
                        this.field_231[this.field_225] = this.field_153[var11].currentY;
                        this.field_232[this.field_225] = this.field_153[var11].field_608;
                        this.field_233[this.field_225] = this.field_204;
                        ++this.field_225;
                        if(var18 == 0) {
                           break label356;
                        }
                     }

                     if(this.field_185 >= 0) {
                        this.field_228[this.field_225] = "Use " + this.field_186 + " with";
                        this.field_227[this.field_225] = "@yel@" + class_4.field_486[this.field_153[var11].field_612];
                        this.field_229[this.field_225] = 710;
                        this.field_230[this.field_225] = this.field_153[var11].currentX;
                        this.field_231[this.field_225] = this.field_153[var11].currentY;
                        this.field_232[this.field_225] = this.field_153[var11].field_608;
                        this.field_233[this.field_225] = this.field_185;
                        ++this.field_225;
                        if(var18 == 0) {
                           break label356;
                        }
                     }

                     if(class_4.field_493[var15] > 0) {
                        label221: {
                           this.field_228[this.field_225] = "Attack";
                           this.field_227[this.field_225] = "@yel@" + class_4.field_486[this.field_153[var11].field_612] + var13;
                           if(var14 >= 0) {
                              this.field_229[this.field_225] = 715;
                              if(var18 == 0) {
                                 break label221;
                              }
                           }

                           this.field_229[this.field_225] = 2715;
                        }

                        this.field_230[this.field_225] = this.field_153[var11].currentX;
                        this.field_231[this.field_225] = this.field_153[var11].currentY;
                        this.field_232[this.field_225] = this.field_153[var11].field_608;
                        ++this.field_225;
                     }

                     this.field_228[this.field_225] = "Talk-to";
                     this.field_227[this.field_225] = "@yel@" + class_4.field_486[this.field_153[var11].field_612];
                     this.field_229[this.field_225] = 720;
                     this.field_230[this.field_225] = this.field_153[var11].currentX;
                     this.field_231[this.field_225] = this.field_153[var11].currentY;
                     this.field_232[this.field_225] = this.field_153[var11].field_608;
                     ++this.field_225;
                     if(!class_4.field_488[var15].equals("")) {
                        this.field_228[this.field_225] = class_4.field_488[var15];
                        this.field_227[this.field_225] = "@yel@" + class_4.field_486[this.field_153[var11].field_612];
                        this.field_229[this.field_225] = 725;
                        this.field_230[this.field_225] = this.field_153[var11].currentX;
                        this.field_231[this.field_225] = this.field_153[var11].currentY;
                        this.field_232[this.field_225] = this.field_153[var11].field_608;
                        ++this.field_225;
                     }

                     this.field_228[this.field_225] = "Examine";
                     this.field_227[this.field_225] = "@yel@" + class_4.field_486[this.field_153[var11].field_612];
                     this.field_229[this.field_225] = 3700;
                     this.field_232[this.field_225] = this.field_153[var11].field_612;
                     ++this.field_225;
                     if(var18 == 0) {
                        break label356;
                     }
                  }

                  if(var10 != null && var10.field_883 >= 10000) {
                     var11 = var10.field_883 - 10000;
                     var12 = this.field_177[var11];
                     if(this.field_178[var11]) {
                        break label356;
                     }

                     label348: {
                        if(this.field_204 >= 0) {
                           if(class_4.field_547[this.field_204] != 4) {
                              break label348;
                           }

                           this.field_228[this.field_225] = "Cast " + class_4.field_543[this.field_204] + " on";
                           this.field_227[this.field_225] = "@cya@" + class_4.field_525[var12];
                           this.field_229[this.field_225] = 300;
                           this.field_230[this.field_225] = this.field_174[var11];
                           this.field_231[this.field_225] = this.field_175[var11];
                           this.field_232[this.field_225] = this.field_176[var11];
                           this.field_233[this.field_225] = this.field_204;
                           ++this.field_225;
                           if(var18 == 0) {
                              break label348;
                           }
                        }

                        if(this.field_185 >= 0) {
                           this.field_228[this.field_225] = "Use " + this.field_186 + " with";
                           this.field_227[this.field_225] = "@cya@" + class_4.field_525[var12];
                           this.field_229[this.field_225] = 310;
                           this.field_230[this.field_225] = this.field_174[var11];
                           this.field_231[this.field_225] = this.field_175[var11];
                           this.field_232[this.field_225] = this.field_176[var11];
                           this.field_233[this.field_225] = this.field_185;
                           ++this.field_225;
                           if(var18 == 0) {
                              break label348;
                           }
                        }

                        if(!class_4.field_527[var12].equalsIgnoreCase("WalkTo")) {
                           this.field_228[this.field_225] = class_4.field_527[var12];
                           this.field_227[this.field_225] = "@cya@" + class_4.field_525[var12];
                           this.field_229[this.field_225] = 320;
                           this.field_230[this.field_225] = this.field_174[var11];
                           this.field_231[this.field_225] = this.field_175[var11];
                           this.field_232[this.field_225] = this.field_176[var11];
                           ++this.field_225;
                        }

                        if(!class_4.field_528[var12].equalsIgnoreCase("Examine")) {
                           this.field_228[this.field_225] = class_4.field_528[var12];
                           this.field_227[this.field_225] = "@cya@" + class_4.field_525[var12];
                           this.field_229[this.field_225] = 2300;
                           this.field_230[this.field_225] = this.field_174[var11];
                           this.field_231[this.field_225] = this.field_175[var11];
                           this.field_232[this.field_225] = this.field_176[var11];
                           ++this.field_225;
                        }

                        this.field_228[this.field_225] = "Examine";
                        this.field_227[this.field_225] = "@cya@" + class_4.field_525[var12];
                        this.field_229[this.field_225] = 3300;
                        this.field_232[this.field_225] = var12;
                        ++this.field_225;
                     }

                     this.field_178[var11] = true;
                     if(var18 == 0) {
                        break label356;
                     }
                  }

                  if(var10 != null && var10.field_883 >= 0) {
                     var11 = var10.field_883;
                     var12 = this.field_167[var11];
                     if(this.field_170[var11]) {
                        break label356;
                     }

                     label350: {
                        if(this.field_204 >= 0) {
                           if(class_4.field_547[this.field_204] != 5) {
                              break label350;
                           }

                           this.field_228[this.field_225] = "Cast " + class_4.field_543[this.field_204] + " on";
                           this.field_227[this.field_225] = "@cya@" + class_4.field_515[var12];
                           this.field_229[this.field_225] = 400;
                           this.field_230[this.field_225] = this.field_165[var11];
                           this.field_231[this.field_225] = this.field_166[var11];
                           this.field_232[this.field_225] = this.field_168[var11];
                           this.field_233[this.field_225] = this.field_167[var11];
                           this.field_234[this.field_225] = this.field_204;
                           ++this.field_225;
                           if(var18 == 0) {
                              break label350;
                           }
                        }

                        if(this.field_185 >= 0) {
                           this.field_228[this.field_225] = "Use " + this.field_186 + " with";
                           this.field_227[this.field_225] = "@cya@" + class_4.field_515[var12];
                           this.field_229[this.field_225] = 410;
                           this.field_230[this.field_225] = this.field_165[var11];
                           this.field_231[this.field_225] = this.field_166[var11];
                           this.field_232[this.field_225] = this.field_168[var11];
                           this.field_233[this.field_225] = this.field_167[var11];
                           this.field_234[this.field_225] = this.field_185;
                           ++this.field_225;
                           if(var18 == 0) {
                              break label350;
                           }
                        }

                        if(!class_4.field_517[var12].equalsIgnoreCase("WalkTo")) {
                           this.field_228[this.field_225] = class_4.field_517[var12];
                           this.field_227[this.field_225] = "@cya@" + class_4.field_515[var12];
                           this.field_229[this.field_225] = 420;
                           this.field_230[this.field_225] = this.field_165[var11];
                           this.field_231[this.field_225] = this.field_166[var11];
                           this.field_232[this.field_225] = this.field_168[var11];
                           this.field_233[this.field_225] = this.field_167[var11];
                           ++this.field_225;
                        }

                        if(!class_4.field_518[var12].equalsIgnoreCase("Examine")) {
                           this.field_228[this.field_225] = class_4.field_518[var12];
                           this.field_227[this.field_225] = "@cya@" + class_4.field_515[var12];
                           this.field_229[this.field_225] = 2400;
                           this.field_230[this.field_225] = this.field_165[var11];
                           this.field_231[this.field_225] = this.field_166[var11];
                           this.field_232[this.field_225] = this.field_168[var11];
                           this.field_233[this.field_225] = this.field_167[var11];
                           ++this.field_225;
                        }

                        this.field_228[this.field_225] = "Examine";
                        this.field_227[this.field_225] = "@cya@" + class_4.field_515[var12];
                        this.field_229[this.field_225] = 3400;
                        this.field_232[this.field_225] = var12;
                        ++this.field_225;
                     }

                     this.field_170[var11] = true;
                     if(var18 == 0) {
                        break label356;
                     }
                  }

                  if(var9 >= 0) {
                     var9 = var10.field_884[var9] - 200000;
                  }

                  if(var9 >= 0) {
                     var2 = var9;
                  }
               }
            }

            ++var8;
            if(var8 >= var5) {
               break;
            }
         }
      }

      if(this.field_204 >= 0 && class_4.field_547[this.field_204] <= 1) {
         this.field_228[this.field_225] = "Cast " + class_4.field_543[this.field_204] + " on self";
         this.field_227[this.field_225] = "";
         this.field_229[this.field_225] = 1000;
         this.field_232[this.field_225] = this.field_204;
         ++this.field_225;
      }

      if(var2 != -1) {
         if(this.field_204 >= 0) {
            if(class_4.field_547[this.field_204] == 6) {
               this.field_228[this.field_225] = "Cast " + class_4.field_543[this.field_204] + " on ground";
               this.field_227[this.field_225] = "";
               this.field_229[this.field_225] = 900;
               this.field_230[this.field_225] = this.world.field_842[var2];
               this.field_231[this.field_225] = this.world.field_843[var2];
               this.field_232[this.field_225] = this.field_204;
               ++this.field_225;
               return;
            }
         } else if(this.field_185 < 0) {
            this.field_228[this.field_225] = "Walk here";
            this.field_227[this.field_225] = "";
            this.field_229[this.field_225] = 920;
            this.field_230[this.field_225] = this.world.field_842[var2];
            this.field_231[this.field_225] = this.world.field_843[var2];
            ++this.field_225;
         }
      }

   }

   // $FF: renamed from: bs () void
   public void method_129() {
      int var5 = class_4.field_563;
      int var1;
      int var2;
      int var3;
      if(this.mouseButtonClick != 0) {
         var1 = 0;
         if(var5 != 0 || var1 < this.field_225) {
            do {
               var2 = this.field_221 + 2;
               var3 = this.field_222 + 27 + var1 * 15;
               if(super.mouseX > var2 - 2 && super.mouseY > var3 - 12 && super.mouseY < var3 + 4 && super.mouseX < var2 - 3 + this.field_223) {
                  this.method_131(this.field_235[var1]);
                  if(var5 == 0) {
                     break;
                  }
               }

               ++var1;
            } while(var1 < this.field_225);
         }

         this.mouseButtonClick = 0;
         this.field_220 = false;
      } else if(super.mouseX >= this.field_221 - 10 && super.mouseY >= this.field_222 - 10 && super.mouseX <= this.field_221 + this.field_223 + 10 && super.mouseY <= this.field_222 + this.field_224 + 10) {
         this.surface.method_225(this.field_221, this.field_222, this.field_223, this.field_224, 13684944, 160);
         this.surface.method_267("Choose option", this.field_221 + 2, this.field_222 + 12, 1, '\uffff');
         var1 = 0;
         if(var5 != 0 || var1 < this.field_225) {
            do {
               var2 = this.field_221 + 2;
               var3 = this.field_222 + 27 + var1 * 15;
               int var4 = 16777215;
               if(super.mouseX > var2 - 2 && super.mouseY > var3 - 12 && super.mouseY < var3 + 4 && super.mouseX < var2 - 3 + this.field_223) {
                  var4 = 16776960;
               }

               this.surface.method_267(this.field_228[this.field_235[var1]] + " " + this.field_227[this.field_235[var1]], var2, var3, 1, var4);
               ++var1;
            } while(var1 < this.field_225);

         }
      } else {
         this.field_220 = false;
      }
   }

   // $FF: renamed from: bt () void
   public void method_130() {
      int var8 = class_4.field_563;
      if(this.field_204 >= 0 || this.field_185 >= 0) {
         this.field_228[this.field_225] = "Cancel";
         this.field_227[this.field_225] = "";
         this.field_229[this.field_225] = 4000;
         ++this.field_225;
      }

      int var1 = 0;
      if(var8 != 0 || var1 < this.field_225) {
         do {
            this.field_235[var1] = var1++;
         } while(var1 < this.field_225);
      }

      boolean var2 = false;
      int var3;
      int var4;
      int var5;
      if(var8 != 0) {
         var2 = true;
         var3 = 0;
         if(var8 != 0 || var3 < this.field_225 - 1) {
            do {
               var4 = this.field_235[var3];
               var5 = this.field_235[var3 + 1];
               if(this.field_229[var4] > this.field_229[var5]) {
                  this.field_235[var3] = var5;
                  this.field_235[var3 + 1] = var4;
                  var2 = false;
               }

               ++var3;
            } while(var3 < this.field_225 - 1);
         }
      }

      while(!var2) {
         var2 = true;
         var3 = 0;
         if(var8 != 0 || var3 < this.field_225 - 1) {
            while(true) {
               var4 = this.field_235[var3];
               var5 = this.field_235[var3 + 1];
               if(this.field_229[var4] > this.field_229[var5]) {
                  this.field_235[var3] = var5;
                  this.field_235[var3 + 1] = var4;
                  var2 = false;
               }

               ++var3;
               if(var3 >= this.field_225 - 1) {
                  break;
               }
            }
         }
      }

      if(this.field_225 > 20) {
         this.field_225 = 20;
      }

      if(this.field_225 > 0) {
         var3 = -1;
         var4 = 0;
         if(var8 != 0 || var4 < this.field_225) {
            do {
               if(this.field_227[this.field_235[var4]] != null && this.field_227[this.field_235[var4]].length() > 0) {
                  var3 = var4;
                  if(var8 == 0) {
                     break;
                  }
               }

               ++var4;
            } while(var4 < this.field_225);
         }

         String var9 = null;
         if((this.field_185 >= 0 || this.field_204 >= 0) && this.field_225 == 1) {
            var9 = "Choose a target";
         } else if((this.field_185 >= 0 || this.field_204 >= 0) && this.field_225 > 1) {
            var9 = "@whi@" + this.field_228[this.field_235[0]] + " " + this.field_227[this.field_235[0]];
         } else if(var3 != -1) {
            var9 = this.field_227[this.field_235[var3]] + ": @whi@" + this.field_228[this.field_235[0]];
         }

         if(this.field_225 == 2 && var9 != null) {
            var9 = var9 + "@whi@ / 1 more option";
         }

         if(this.field_225 > 2 && var9 != null) {
            var9 = var9 + "@whi@ / " + (this.field_225 - 1) + " more options";
         }

         if(var9 != null) {
            this.surface.method_267(var9, 6, 14, 1, 16776960);
         }

         if(!this.field_218 && this.mouseButtonClick == 1 || this.field_218 && this.mouseButtonClick == 1 && this.field_225 == 1) {
            this.method_131(this.field_235[0]);
            this.mouseButtonClick = 0;
            return;
         }

         if(!this.field_218 && this.mouseButtonClick == 2 || this.field_218 && this.mouseButtonClick == 1) {
            this.field_224 = (this.field_225 + 1) * 15;
            this.field_223 = this.surface.method_271("Choose option", 1) + 5;
            int var6 = 0;
            if(var8 != 0 || var6 < this.field_225) {
               do {
                  int var7 = this.surface.method_271(this.field_228[var6] + " " + this.field_227[var6], 1) + 5;
                  if(var7 > this.field_223) {
                     this.field_223 = var7;
                  }

                  ++var6;
               } while(var6 < this.field_225);
            }

            this.field_221 = super.mouseX - this.field_223 / 2;
            this.field_222 = super.mouseY - 7;
            this.field_220 = true;
            if(this.field_221 < 0) {
               this.field_221 = 0;
            }

            if(this.field_222 < 0) {
               this.field_222 = 0;
            }

            if(this.field_221 + this.field_223 > 510) {
               this.field_221 = 510 - this.field_223;
            }

            if(this.field_222 + this.field_224 > 315) {
               this.field_222 = 315 - this.field_224;
            }

            this.mouseButtonClick = 0;
         }
      }

   }

   // $FF: renamed from: f (int) void
   public void method_131(int var1) {
      int var2 = this.field_230[var1];
      int var3 = this.field_231[var1];
      int var4 = this.field_232[var1];
      int var5 = this.field_233[var1];
      int var6 = this.field_234[var1];
      int var7 = this.field_229[var1];
      if(var7 == 200) {
         this.method_99(this.localRegionX, this.localRegionY, var2, var3, true);
         super.clientStream.newPacket(224, 821);
         super.clientStream.putShort(var2 + this.regionX);
         super.clientStream.putShort(var3 + this.regionY);
         super.clientStream.putShort(var4);
         super.clientStream.putShort(var5);
         super.clientStream.flushPacket_();
         this.field_204 = -1;
      }

      if(var7 == 210) {
         this.method_99(this.localRegionX, this.localRegionY, var2, var3, true);
         super.clientStream.newPacket(250, 346);
         super.clientStream.putShort(var2 + this.regionX);
         super.clientStream.putShort(var3 + this.regionY);
         super.clientStream.putShort(var4);
         super.clientStream.putShort(var5);
         super.clientStream.flushPacket_();
         this.field_185 = -1;
      }

      if(var7 == 220) {
         this.method_99(this.localRegionX, this.localRegionY, var2, var3, true);
         super.clientStream.newPacket(252, 634);
         super.clientStream.putShort(var2 + this.regionX);
         super.clientStream.putShort(var3 + this.regionY);
         super.clientStream.putShort(var4);
         super.clientStream.flushPacket_();
      }

      if(var7 == 3200) {
         this.displayMessage(class_4.field_475[var4], 3);
      }

      if(var7 == 300) {
         this.method_101(var2, var3, var4);
         super.clientStream.newPacket(223, 596);
         super.clientStream.putShort(var2 + this.regionX);
         super.clientStream.putShort(var3 + this.regionY);
         super.clientStream.putByte(var4);
         super.clientStream.putShort(var5);
         super.clientStream.flushPacket_();
         this.field_204 = -1;
      }

      if(var7 == 310) {
         this.method_101(var2, var3, var4);
         super.clientStream.newPacket(239, 792);
         super.clientStream.putShort(var2 + this.regionX);
         super.clientStream.putShort(var3 + this.regionY);
         super.clientStream.putByte(var4);
         super.clientStream.putShort(var5);
         super.clientStream.flushPacket_();
         this.field_185 = -1;
      }

      if(var7 == 320) {
         this.method_101(var2, var3, var4);
         super.clientStream.newPacket(238, 212);
         super.clientStream.putShort(var2 + this.regionX);
         super.clientStream.putShort(var3 + this.regionY);
         super.clientStream.putByte(var4);
         super.clientStream.flushPacket_();
      }

      if(var7 == 2300) {
         this.method_101(var2, var3, var4);
         super.clientStream.newPacket(229, 726);
         super.clientStream.putShort(var2 + this.regionX);
         super.clientStream.putShort(var3 + this.regionY);
         super.clientStream.putByte(var4);
         super.clientStream.flushPacket_();
      }

      if(var7 == 3300) {
         this.displayMessage(class_4.field_526[var4], 3);
      }

      if(var7 == 400) {
         this.method_100(var2, var3, var4, var5);
         super.clientStream.newPacket(222, 555);
         super.clientStream.putShort(var2 + this.regionX);
         super.clientStream.putShort(var3 + this.regionY);
         super.clientStream.putShort(var6);
         super.clientStream.flushPacket_();
         this.field_204 = -1;
      }

      if(var7 == 410) {
         this.method_100(var2, var3, var4, var5);
         super.clientStream.newPacket(241, 772);
         super.clientStream.putShort(var2 + this.regionX);
         super.clientStream.putShort(var3 + this.regionY);
         super.clientStream.putShort(var6);
         super.clientStream.flushPacket_();
         this.field_185 = -1;
      }

      if(var7 == 420) {
         this.method_100(var2, var3, var4, var5);
         super.clientStream.newPacket(242, 863);
         super.clientStream.putShort(var2 + this.regionX);
         super.clientStream.putShort(var3 + this.regionY);
         super.clientStream.flushPacket_();
      }

      if(var7 == 2400) {
         this.method_100(var2, var3, var4, var5);
         super.clientStream.newPacket(230, 67);
         super.clientStream.putShort(var2 + this.regionX);
         super.clientStream.putShort(var3 + this.regionY);
         super.clientStream.flushPacket_();
      }

      if(var7 == 3400) {
         this.displayMessage(class_4.field_516[var4], 3);
      }

      if(var7 == 600) {
         super.clientStream.newPacket(220, 567);
         super.clientStream.putShort(var4);
         super.clientStream.putShort(var5);
         super.clientStream.flushPacket_();
         this.field_204 = -1;
      }

      if(var7 == 610) {
         super.clientStream.newPacket(240, 377);
         super.clientStream.putShort(var4);
         super.clientStream.putShort(var5);
         super.clientStream.flushPacket_();
         this.field_185 = -1;
      }

      if(var7 == 620) {
         super.clientStream.newPacket(248, 466);
         super.clientStream.putShort(var4);
         super.clientStream.flushPacket_();
      }

      if(var7 == 630) {
         super.clientStream.newPacket(249, 267);
         super.clientStream.putShort(var4);
         super.clientStream.flushPacket_();
      }

      if(var7 == 640) {
         super.clientStream.newPacket(246, 237);
         super.clientStream.putShort(var4);
         super.clientStream.flushPacket_();
      }

      if(var7 == 650) {
         this.field_185 = var4;
         this.field_179 = 0;
         this.field_186 = class_4.field_474[this.inventoryItemId[this.field_185]];
      }

      if(var7 == 660) {
         super.clientStream.newPacket(251, 664);
         super.clientStream.putShort(var4);
         super.clientStream.flushPacket_();
         this.field_185 = -1;
         this.field_179 = 0;
         this.displayMessage("Dropping " + class_4.field_474[this.inventoryItemId[var4]], 4);
      }

      if(var7 == 3600) {
         this.displayMessage(class_4.field_475[var4], 3);
      }

      int var8;
      int var9;
      if(var7 == 700) {
         var8 = (var2 - 64) / this.magicLoc;
         var9 = (var3 - 64) / this.magicLoc;
         this.method_98(this.localRegionX, this.localRegionY, var8, var9, true);
         super.clientStream.newPacket(225, 824);
         super.clientStream.putShort(var4);
         super.clientStream.putShort(var5);
         super.clientStream.flushPacket_();
         this.field_204 = -1;
      }

      if(var7 == 710) {
         var8 = (var2 - 64) / this.magicLoc;
         var9 = (var3 - 64) / this.magicLoc;
         this.method_98(this.localRegionX, this.localRegionY, var8, var9, true);
         super.clientStream.newPacket(243, 876);
         super.clientStream.putShort(var4);
         super.clientStream.putShort(var5);
         super.clientStream.flushPacket_();
         this.field_185 = -1;
      }

      if(var7 == 720) {
         var8 = (var2 - 64) / this.magicLoc;
         var9 = (var3 - 64) / this.magicLoc;
         this.method_98(this.localRegionX, this.localRegionY, var8, var9, true);
         super.clientStream.newPacket(245, 586);
         super.clientStream.putShort(var4);
         super.clientStream.flushPacket_();
      }

      if(var7 == 725) {
         var8 = (var2 - 64) / this.magicLoc;
         var9 = (var3 - 64) / this.magicLoc;
         this.method_98(this.localRegionX, this.localRegionY, var8, var9, true);
         super.clientStream.newPacket(195, 543);
         super.clientStream.putShort(var4);
         super.clientStream.flushPacket_();
      }

      // npc attack
      if(var7 == 715 || var7 == 2715) {
         var8 = (var2 - 64) / this.magicLoc;
         var9 = (var3 - 64) / this.magicLoc;
         this.method_98(this.localRegionX, this.localRegionY, var8, var9, true);
         super.clientStream.newPacket(244, 754);
         super.clientStream.putShort(var4);
         super.clientStream.flushPacket_();
      }

      if(var7 == 3700) {
         this.displayMessage(class_4.field_487[var4], 3);
      }

      // player cast pvp
      if(var7 == 800) {
         var8 = (var2 - 64) / this.magicLoc;
         var9 = (var3 - 64) / this.magicLoc;
         this.method_98(this.localRegionX, this.localRegionY, var8, var9, true);
         super.clientStream.newPacket(226, 117);
         super.clientStream.putShort(var4);
         super.clientStream.putShort(var5);
         super.clientStream.flushPacket_();
         this.field_204 = -1;
      }

      // player use item
      if(var7 == 810) {
         var8 = (var2 - 64) / this.magicLoc;
         var9 = (var3 - 64) / this.magicLoc;
         this.method_98(this.localRegionX, this.localRegionY, var8, var9, true);
         super.clientStream.newPacket(219, 145);
         super.clientStream.putShort(var4);
         super.clientStream.putShort(var5);
         super.clientStream.flushPacket_();
         this.field_185 = -1;
      }

      // player attack
      if(var7 == 805 || var7 == 2805) {
         var8 = (var2 - 64) / this.magicLoc;
         var9 = (var3 - 64) / this.magicLoc;
         this.method_98(this.localRegionX, this.localRegionY, var8, var9, true);
         super.clientStream.newPacket(228, 414);
         super.clientStream.putShort(var4);
         super.clientStream.flushPacket_();
      }

      // player duel
      if(var7 == 2806) {
         super.clientStream.newPacket(204, 273);
         super.clientStream.putShort(var4);
         super.clientStream.flushPacket_();
      }

      // init trade request
      if(var7 == 2810) {
         super.clientStream.newPacket(235, 636);
         super.clientStream.putShort(var4);
         super.clientStream.flushPacket_();
      }

      // follow
      if(var7 == 2820) {
         super.clientStream.newPacket(214, 596);
         super.clientStream.putShort(var4);
         super.clientStream.flushPacket_();
      }

      if(var7 == 900) {
         this.method_98(this.localRegionX, this.localRegionY, var2, var3, true);
         super.clientStream.newPacket(221, 545);
         super.clientStream.putShort(var2 + this.regionX);
         super.clientStream.putShort(var3 + this.regionY);
         super.clientStream.putShort(var4);
         super.clientStream.flushPacket_();
         this.field_204 = -1;
      }

      if(var7 == 920) {
         this.method_98(this.localRegionX, this.localRegionY, var2, var3, false);
         if(this.field_114 == -24) {
            this.field_114 = 24;
         }
      }

      if(var7 == 1000) {
         super.clientStream.newPacket(227, 411);
         super.clientStream.putShort(var4);
         super.clientStream.flushPacket_();
         this.field_204 = -1;
      }

      if(var7 == 4000) {
         this.field_185 = -1;
         this.field_204 = -1;
      }

   }

   // $FF: renamed from: a (java.lang.String, java.lang.String, int) byte[]
   public byte[] method_19(String var1, String var2, int var3) {
      if(!this.appletMode) {
         var1 = "cache/" + var1;
      }

      byte[] var4 = link.getjag(var1);
      if(var4 == null) {
         return super.method_19(var1, var2, var3);
      } else {
         int var5 = ((var4[0] & 255) << 16) + ((var4[1] & 255) << 8) + (var4[2] & 255);
         int var6 = ((var4[3] & 255) << 16) + ((var4[4] & 255) << 8) + (var4[5] & 255);
         byte[] var7 = new byte[var4.length - 6];
         int var8 = 0;
         if(class_4.field_563 != 0) {
            var7[var8] = var4[var8 + 6];
            ++var8;
         }

         while(var8 < var4.length - 6) {
            var7[var8] = var4[var8 + 6];
            ++var8;
         }

         this.method_16(var3, "Unpacking " + var2);
         if(var6 != var5) {
            byte[] var9 = new byte[var5];
            class_18.method_397(var9, var5, var7, var6, 0);
            return var9;
         } else {
            return var7;
         }
      }
   }

   // $FF: renamed from: j () int
   public int getRandomDat() {
      return link.uid;
   }

   public Graphics getGraphics() {
      return class_0.field_7 != null?class_0.field_7.getGraphics():(link.mainapp != null?link.mainapp.getGraphics():super.getGraphics());
   }

   public Image createImage(int var1, int var2) {
      return class_0.field_7 != null?class_0.field_7.createImage(var1, var2):(link.mainapp != null?link.mainapp.createImage(var1, var2):super.createImage(var1, var2));
   }

   public URL getCodeBase() {
   		URL codebase = null;
   		try {
   			codebase = new URL("http://" + super.address);
			} catch (Exception e) {
   			e.printStackTrace();
			}
      return codebase;
   		// Original Function:
   		// return link.mainapp != null?link.mainapp.getCodeBase():super.getCodeBase();
   }

   public URL getDocumentBase() {
      return link.mainapp != null?link.mainapp.getDocumentBase():super.getDocumentBase();
   }

   public String getParameter(String var1) {
      return link.mainapp != null?link.mainapp.getParameter(var1):super.getParameter(var1);
   }

   // $FF: renamed from: a (java.lang.String, int) java.net.Socket
   public Socket connect(String address, int port) throws IOException {
      Socket var3;
      if(link.mainapp != null) {
         var3 = link.opensocket(port);
         if(var3 == null) {
            throw new IOException();
         } else {
            return var3;
         }
      } else {
         label18: {
            if(this.method_8()) {
               var3 = new Socket(InetAddress.getByName(this.getCodeBase().getHost()), port);
               if(class_4.field_563 == 0) {
                  break label18;
               }
            }

            var3 = new Socket(InetAddress.getByName(address), port);
         }

         var3.setSoTimeout(30000);
         var3.setTcpNoDelay(true);
         return var3;
      }
   }

   // $FF: renamed from: a (java.lang.Runnable) void
   public void method_21(Runnable var1) {
      if(link.mainapp != null) {
         link.startthread(var1);
      } else {
         Thread var2 = new Thread(var1);
         var2.setDaemon(true);
         var2.start();
      }
   }

   // $FF: renamed from: g (int) java.lang.String
   public String method_132(int var1) {
      return link.mainapp != null?link.gethostname(class_21.method_455(var1)):class_21.method_455(var1);
   }

   // $FF: renamed from: <init> () void
   public mudclient() {
      super();
      int var1 = class_4.field_563;
      this.field_69 = false;
      this.rsaExponent = new BigInteger("18439792161837834709");
      this.rsaModulus = new BigInteger("192956484481579778191558061814292671521");
      this.field_72 = false;
      this.field_73 = false;
      this.field_74 = false;
      this.appletMode = true;
      this.field_77 = 12345678;
      this.field_79 = 8000;
      this.field_80 = new int[this.field_79];
      this.field_81 = new int[this.field_79];
      this.field_83 = new int[8192];
      this.field_84 = new int[8192];
      this.field_86 = 2;
      this.field_88 = 2;
      this.magicLoc = 128;
      this.field_96 = 512;
      this.gameHeight = 334;
      this.field_98 = 9;
      this.field_106 = 40;
      this.field_111 = -1;
      this.field_112 = -1;
      this.field_113 = -1;
      this.lastHeightOffset = -1;
      this.planeIndex = -1;
      this.cameraZoom = 550;
      this.fogOfWar = false;
      this.field_133 = 1;
      this.field_135 = 128;
      this.field_136 = 4000;
      this.field_137 = 500;
      this.field_141 = new class_7[this.field_136];
      this.players = new class_7[this.field_137];
      this.field_143 = new class_7[this.field_137];
      this.localPlayer = new class_7();
      this.localPlayerServerIndex = -1;
      this.field_148 = 5000;
      this.field_149 = 500;
      this.field_152 = new class_7[this.field_148];
      this.field_153 = new class_7[this.field_149];
      this.field_154 = new class_7[this.field_149];
      this.field_155 = new int[500];
      this.field_156 = 5000;
      this.groundItemX = new int[this.field_156];
      this.groundItemY = new int[this.field_156];
      this.groundItemId = new int[this.field_156];
      this.field_161 = new int[this.field_156];
      this.field_162 = 1500;
      this.field_164 = new Scene[this.field_162];
      this.field_165 = new int[this.field_162];
      this.field_166 = new int[this.field_162];
      this.field_167 = new int[this.field_162];
      this.field_168 = new int[this.field_162];
      this.field_169 = new Scene[1000];
      this.field_170 = new boolean[this.field_162];
      this.field_171 = 500;
      this.field_173 = new Scene[this.field_171];
      this.field_174 = new int[this.field_171];
      this.field_175 = new int[this.field_171];
      this.field_176 = new int[this.field_171];
      this.field_177 = new int[this.field_171];
      this.field_178 = new boolean[this.field_171];
      this.field_180 = 30;
      this.inventoryItemId = new int[35];
      this.inventoryAmounts = new int[35];
      this.inventoryEquipped = new int[35];
      this.field_185 = -1;
      this.field_186 = "";
      this.field_187 = new int[99];
      this.field_188 = 18;
      this.playerStatCurrent = new int[18];
      this.playerStatBase = new int[18];
      this.field_191 = new int[18];
      this.field_192 = new int[5];
      this.field_196 = new String[]{"Attack", "Defense", "Strength", "Hits", "Ranged", "Prayer", "Magic", "Cooking", "Woodcut", "Fletching", "Fishing", "Firemaking", "Crafting", "Smithing", "Mining", "Herblaw", "Agility", "Thieving"};
      this.field_197 = new String[]{"Attack", "Defense", "Strength", "Hits", "Ranged", "Prayer", "Magic", "Cooking", "Woodcutting", "Fletching", "Fishing", "Firemaking", "Crafting", "Smithing", "Mining", "Herblaw", "Agility", "Thieving"};
      this.field_198 = new String[]{"Armour", "WeaponAim", "WeaponPower", "Magic", "Prayer"};
      this.field_204 = -1;
      this.field_212 = 50;
      this.field_213 = new String[]{"Black knight\'s fortress", "Cook\'s assistant", "Demon slayer", "Doric\'s quest", "The restless ghost", "Goblin diplomacy", "Ernest the chicken", "Imp catcher", "Pirate\'s treasure", "Prince Ali rescue", "Romeo & Juliet", "Sheep shearer", "Shield of Arrav", "The knight\'s sword", "Vampire slayer", "Witch\'s potion", "Dragon slayer", "Witch\'s house (members)", "Lost city (members)", "Hero\'s quest (members)", "Druidic ritual (members)", "Merlin\'s crystal (members)", "Scorpion catcher (members)", "Family crest (members)", "Tribal totem (members)", "Fishing contest (members)", "Monk\'s friend (members)", "Temple of Ikov (members)", "Clock tower (members)", "The Holy Grail (members)", "Fight Arena (members)", "Tree Gnome Village (members)", "The Hazeel Cult (members)", "Sheep Herder (members)", "Plague City (members)", "Sea Slug (members)", "Waterfall quest (members)", "Biohazard (members)", "Jungle potion (members)", "Grand tree (members)", "Shilo village (members)", "Underground pass (members)", "Observatory quest (members)", "Tourist trap (members)", "Watchtower (members)", "Dwarf Cannon (members)", "Murder Mystery (members)", "Digsite (members)", "Gertrude\'s Cat (members)", "Legend\'s Quest (members)"};
      this.field_214 = new boolean[this.field_212];
      this.field_215 = new boolean[50];
      this.field_216 = false;
      this.optionCAmeraModeAuto = true;
      this.field_218 = false;
      this.field_219 = false;
      this.field_220 = false;
      this.field_226 = 250;
      this.field_227 = new String[this.field_226];
      this.field_228 = new String[this.field_226];
      this.field_229 = new int[this.field_226];
      this.field_230 = new int[this.field_226];
      this.field_231 = new int[this.field_226];
      this.field_232 = new int[this.field_226];
      this.field_233 = new int[this.field_226];
      this.field_234 = new int[this.field_226];
      this.field_235 = new int[this.field_226];
      this.field_246 = 5;
      this.field_247 = new String[this.field_246];
      this.field_248 = new int[this.field_246];
      this.field_249 = false;
      this.field_250 = "";
      this.field_252 = new int[8];
      this.field_253 = new int[8];
      this.field_255 = new int[8];
      this.field_256 = new int[8];
      this.field_257 = false;
      this.field_258 = false;
      this.field_259 = false;
      this.field_260 = false;
      this.field_261 = false;
      this.field_262 = false;
      this.field_263 = false;
      this.field_264 = false;
      this.field_267 = new int[8];
      this.field_268 = new int[8];
      this.field_270 = new int[8];
      this.field_271 = new int[8];
      this.field_276 = false;
      this.field_277 = "";
      this.field_279 = new int[14];
      this.field_280 = new int[14];
      this.field_282 = new int[14];
      this.field_283 = new int[14];
      this.field_284 = false;
      this.field_285 = false;
      this.field_289 = false;
      this.field_290 = false;
      this.field_292 = new int[14];
      this.field_293 = new int[14];
      this.field_295 = new int[14];
      this.field_296 = new int[14];
      this.field_297 = false;
      this.field_300 = new int[256];
      this.field_301 = new int[256];
      this.field_302 = new int[256];
      this.field_303 = -1;
      this.field_304 = -2;
      this.field_305 = false;
      this.field_307 = new int[256];
      this.field_308 = new int[256];
      this.field_310 = new int[256];
      this.field_311 = new int[256];
      this.field_312 = -1;
      this.field_313 = -2;
      this.field_314 = 48;
      this.field_316 = false;
      this.field_318 = new String[5];
      this.field_324 = "";
      this.field_325 = "";
      this.field_326 = false;
      this.showDialogServermessage = false;
      this.field_333 = false;
      this.showDialogMessage = false;
      this.field_335 = "";
      this.loadingArea = false;
      this.field_360 = "";
      this.field_361 = "";
      this.username = "";
      this.password = "";
      this.field_378 = false;
      this.field_382 = -1;
      this.field_383 = new int[5];
      this.field_384 = new int[5];
      this.field_385 = new int[5];
      this.field_386 = new int[5];
      this.field_387 = new int[]{0, 1, 2, 3, 4};
      this.field_388 = new String[5];
      this.field_389 = false;
      this.field_398 = new int[5];
      this.field_399 = new int[5];
      this.field_400 = false;
      this.field_409 = new String[50];
      this.field_410 = new int[50];
      this.field_411 = new int[50];
      this.field_412 = new int[50];
      this.field_413 = new int[50];
      this.field_415 = new int[50];
      this.field_416 = new int[50];
      this.field_417 = new int[50];
      this.field_418 = new int[50];
      this.field_420 = new int[50];
      this.field_421 = new int[50];
      this.field_422 = new int[50];
      this.field_425 = new int[][]{{11, 2, 9, 7, 1, 6, 10, 0, 5, 8, 3, 4}, {11, 2, 9, 7, 1, 6, 10, 0, 5, 8, 3, 4}, {11, 3, 2, 9, 7, 1, 6, 10, 0, 5, 8, 4}, {3, 4, 2, 9, 7, 1, 6, 10, 8, 11, 0, 5}, {3, 4, 2, 9, 7, 1, 6, 10, 8, 11, 0, 5}, {4, 3, 2, 9, 7, 1, 6, 10, 8, 11, 0, 5}, {11, 4, 2, 9, 7, 1, 6, 10, 0, 5, 8, 3}, {11, 2, 9, 7, 1, 6, 10, 0, 5, 8, 4, 3}};
      this.showAppearanceChange = false;
      this.field_428 = 1;
      this.field_429 = 2;
      this.field_430 = 2;
      this.field_431 = 8;
      this.field_432 = 14;
      this.field_434 = 1;
      this.field_435 = new int[]{16711680, 16744448, 16769024, 10543104, '\ue000', '\u8000', '\ua080', '\ub0ff', '\u80ff', 12528, 14680288, 3158064, 6307840, 8409088, 16777215};
      this.field_436 = new int[]{16760880, 16752704, 8409136, 6307872, 3158064, 16736288, 16728064, 16777215, '\uff00', '\uffff'};
      this.field_437 = new int[]{15523536, 13415270, 11766848, 10056486, 9461792};
      this.field_438 = new int[]{0, 1, 2, 1};
      this.field_439 = new int[]{0, 1, 2, 1, 0, 0, 0, 0};
      this.field_440 = new int[]{0, 0, 0, 0, 0, 1, 2, 1};
      this.field_444 = new int[50];
      this.field_445 = new int[50];
      this.field_446 = new int[50];
      this.field_447 = new int[50];
      this.isSleeping = false;
      this.field_450 = new String[]{"Where were you born?", "What was your first teachers name?", "What is your fathers middle name?", "Who was your first best friend?", "What is your favourite vacation spot?", "What is your mothers middle name?", "What was your first pets name?", "What was the name of your first school?", "What is your mothers maiden name?", "Who was your first boyfriend/girlfriend?", "What was the first computer game you purchased?", "Who is your favourite actor/actress?", "Who is your favourite author?", "Who is your favourite musician?", "Who is your favourite cartoon character?", "What is your favourite book?", "What is your favourite food?", "What is your favourite movie?"};
      if(var1 != 0) {
         int var2 = class_21.field_1009;
         ++var2;
         class_21.field_1009 = var2;
      }

   }
}
