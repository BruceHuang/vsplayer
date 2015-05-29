package com.linux.vshow;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import android.graphics.Color;
import android.os.Environment;
import android.os.Handler;
import android.os.PowerManager;

public class Constant {

	public static String saveDIR = Environment.getExternalStorageDirectory()
			.getAbsolutePath() + File.separator + "savedir.ini";

	public static String sdcardDir = "/mnt/extsd";

	/**
	 * 4-22 V5.0.1.5�����˴���ϵͳ�˳� 5-6 V5.0.1.16��������ý�岻��ɾ����Bug 5-21 V5.0.1.18 ȡ������ͬ��
	 * 5-27 V5.0.1.20 �������Ź� �������ػ�
	 * 6.12��7����apk
	 * V.5.0.1.25,8�޸��˿��ػ�ʱ�������
	 * V29 ��̨
	 * V30��ʱ֪ͨ
	 */
	public static String version = "V5.0.1.30.0108";

	public static String mc = Environment.getExternalStorageDirectory()
			.getAbsolutePath() + File.separator + "key.ini"; // �ն�Ψһ��ʾ�����ļ���ַ
	public static String tempDir = Constant.sdcardDir + "/temp/"; // ��ʱ�ļ�Ŀ¼
	public static String fileDir = Constant.sdcardDir + "/files/"; // �����ļ�Ŀ¼
	public static String TQDIR = Constant.sdcardDir + "/tq"; // �����ļ�Ŀ¼
	public static String HLDIR = Constant.sdcardDir + "/hl";
	public static String updateDir = Constant.sdcardDir + "/update/"; // �����ļ�Ŀ¼
	public static String offDir = Constant.sdcardDir + "/off/"; // ���������ļ�Ŀ¼
	public static String novideoDir = Constant.sdcardDir + "/"; // ���ļ�����Ŀ¼
	public static String tDir = Constant.sdcardDir + "/temp"; // ��ʱĿ¼
	public static String fDir = Constant.sdcardDir + "/files"; // �ļ�Ŀ¼
	public static String uDir = Constant.sdcardDir + "/update"; // ����Ŀ¼
	public static String cDir = Constant.sdcardDir + "/camera"; // ����Ŀ¼
	public static String sdcardTemp = Constant.sdcardDir + "/temp/"; // ��ʱ�ļ�λ��
	public static String config = Constant.sdcardDir + "/config.ini"; // �������õ������ļ�
	public static String config2 = Constant.sdcardDir + "/config2.ini"; // ������IP�������ļ�
	static String config3 = Constant.sdcardDir + "/config3.ini"; // �ϵ����������ļ�
	static String config4 = Constant.offDir + "config.ini"; // �������������ļ�
	
	public static String advance = Constant.sdcardDir + "/advance.ini";//�߼����ñ���Ŀ¼

	
	public static String USBPAN = "/mnt/usbhost1/vsfile/"; // �ڶ���U��vsfileĿ¼λ��
	public static String USBPAN2 = "/mnt/usbhost0/vsfile/"; // ��һ��U��vsfileĿ¼λ��
	public static String USBUPDATE = "/mnt/usbhost1/vsupdate/"; // �ڶ���U��updateĿ¼λ��
	public static String USBUPDATE2 = "/mnt/usbhost0/vsupdate/"; // ��һ��U��updateĿ¼λ��

	public static String LogDir = Environment.getExternalStorageDirectory()
			.getAbsolutePath() + File.separator + "Log";

	public static boolean firstrun = true;
	public static boolean downfinish = false;
	public static String downstr = "";

	public static HttpDown hd = null;
	public static RandomAccessFile rss = null;
	public static Timer timer = null;
	public static Handler handler = null;
	public static TimerTask task = null;
	public static PowerManager.WakeLock WAKELOCK = null;
	public static SocketClient sc = new SocketClient();

	public static String mfile = ""; // ��ǰ���ڲ��ŵĽ�Ŀ�ļ���
	public static String SRVIP = "192.168.1.101"; // ������IP
	public static int upup = 0; // ��������ʶ,����������֮�󲻽��и���
	public static boolean guanji = false; // �Ƿ��ڴ���״̬

	public static boolean G3G = false; // �Ƿ���3G U�̽ӿ����粻ͨʱ��ʱ����
	public static boolean WEB = false; // �Ƿ���������ͨʱ���س���
	public static boolean WEBGO = false; // ������ͨʱ��־
	public static int VIDEOAGAIN = 0; // �Ƿ����ϵ����� ����0������
	public static int G3GTOTAL = 0; // 3G U�̿����� ����λ

	public static String mac = ""; // Ψһ��ʶ��
	public static String msg = ""; // ��Ϣ�ַ���
	public static String downmsg = ""; // ����ʱ��Ϣ�ַ���
	public static String tempmsg = ""; // ������Ϣ�ַ���
	public static int change = 0; // ����״̬�ı��ʶ
	public static int width = 1280; // ϵͳ�ֱ��ʿ�
	public static int height = 720; // ϵͳ�ֱ��ʸ�
	public static long downtotal = 0; // ����������
	public static long alltotal = 0; // ����������
	public static ArrayList avl = new ArrayList(); // ��Ƶ���򼯺�
	public static ArrayList imglist = new ArrayList(); // ͼƬ���򼯺�
	static int total = 0; // ��ʱ���ۼ���
	static int vx = 0; // ��ƵX
	static int vy = 0; // ��ƵY
	static int vwidth = 0; // ��Ƶ��
	static int vheight = 0; // ��Ƶ��
	static String modelcontent = ""; // ���Ž�Ŀ�ļ��ַ���
	static long totalfilelen = 0; // ���Ž�Ŀ�ܳ���
	static String curmodel = ""; // ��ǰ���Ž�Ŀ�ļ��ַ���
	static String fontcontent = ""; // ������Ļ
	static String sendkey = ""; // ����Ψһ��ʾ
	static int up = 0; // ������Ļ����λ��
	static int backcolor = Color.WHITE; // ������Ļ������ɫ
	static int fonttype = 0; // ������Ļ��������
	static int fontcolor = Color.BLACK; // ������Ļ������ɫ
	static float fontspeed = 2.0f; // ������Ļ�����ٶ�
	static float fontsize = 35f; // ������Ļ���ִ�С
	public static int xiansu = 0; // ��������
	public static int lian = 10; // ��������ʱ��
	static int urltime = 0; // �������ʱ��
	static boolean chu = false; // �Ƿ����ڴ���״̬
	static int chutime = 0; // ��ǰ�����ȥʱ��
	static boolean deldo = false; // �Ƿ�����ɾ���ļ�
	static int curplay = 0; // ��ǰ���ŵĽ�Ŀλ��
	static ArrayList<PlayItem> playList = new ArrayList<PlayItem>(); // ��Ŀ����
	static int curday = -1; // �������ڼ�
	static boolean offshow = false; // �Ƿ��ǲ��Ŷ�����Ŀ
	static String nexttime = ""; // �´����¼�������ʱ��
	static boolean afvideo = false; // �ϵ�����״̬
	static boolean itemgo = false; // �㲥״̬
	static int avlcur = 0; // ��ǰ�ϵ�����λ��
	static boolean avlbian = false; // �Ƿ���½�Ŀ
	static boolean downing = false; // �Ƿ���������

	public static SeePic sPic = null;
	public static SocketCamera scamera = null;
	public static RecordVideo rcamera = null;

	public static String tqkey = "";
	public static int tqagain = 0;
	public static String tqcolor = "";
	public static String tqsize = "";
	public static String tqimgsize = "";
	public static int tqx;
	public static int tqy;
	public static int tqwidth;
	public static int tqheight;
	public static boolean tqdo = false;
	public static int tqurl = 0;

	public static String playname = "";
	public static int playtime = 0;

	public static boolean leftdown = false;
	public static int lefttotal = 0;

	public static int imgtime = 0;

	public static int camera = 0;

	public static String tuichu = "";

	public static int popTime = 30;
	public static final int NONE = 0;
	public static final int ZOOM = 1;
	public static boolean chick = true;
	public static boolean isPop = false;
	public static int mode = NONE;
	public static float oldDist = 0;

	public static int effects[] = { R.anim.fade, R.anim.my_scale_action,
			R.anim.scale_rotate, R.anim.zoom_enter, R.anim.scale_translate };
	public static int effectsId = 6;

	public static boolean isChange = false;
	public static String hour = "00";
	public static String minute = "00";
	public static String initTime = "00:00";
	public static String shut = "";
	public static String getOpenTime1 = "00";
	public static String getOpenTime1_2 = "00";
	public static String getColseTime1 = "00";
	public static String getColseTime1_2 = "00";
	public static String getOpenTime2 = "00";
	public static String getOpenTime2_2 = "00";
	public static String getColseTime2 = "00";
	public static String getColseTime2_2 = "00";
	public static String getOpenTime3 = "00";
	public static String getOpenTime3_2 = "00";
	public static String getColseTime3 = "00";
	public static String getColseTime3_2 = "00";

	public static String setOpenTime1 = "00:00";
	public static String setColseTime1 = "00:00";
	public static String setOpenTime2 = "00:00";
	public static String setColseTime2 = "00:00";
	public static String setOpenTime3 = "00:00";
	public static String setColseTime3 = "00:00";

	public static int firstDay = 0;
	public static int secondDay = 0;
	public static int thirdDay = 0;

	public static int day = 0;

	public static boolean oneTime = false;
	public static boolean twoTime = false;
	public static boolean threeTime = false;

	public static int scale = 0;

	public static int vpX = 0;
	public static int vpY = 0;

	public static int light = 0;
	public static int lighttime = 60;
	public static boolean dodod = false;
	public static int currs = 0;

	public static String CloseTime = "";
	public static int CloseTimes = 0;
	public static int dayStr = 0;

	public static float downX = 0;
	public static float moveX = 0;

	public static boolean interval = true;
	public static int cameraType = 0;

	public static boolean outsideCount1 = false;
	public static boolean outsideCount2 = false;
	public static boolean outsideCount3 = false;
	public static boolean outsideCount4 = false;
	public static int ix = 0;
	public static int iy = 0;
	public static int iw = 1;
	public static int ih = 1;

	public static String hlkey = "";
	public static int hltime = 0;
	public static int hlx;
	public static int hly;
	public static int hlwidth;
	public static int hlheight;
	public static boolean hldo = false;

	public static String tkey = "";
	public static int tx;
	public static int ty;
	public static int twidth;
	public static int theight;
	public static boolean tdo = false;

	public static String worktime = "";
	public static String starttime = "";
	public static String endtime = "";

	public static int sync = 0;
	// public static boolean firstsync = true;

	public static boolean openurl = false;
	public static int syncTime = 0;
	public static int allTime = 0;
	public static int nowTime = 0;
	public static int nowPlays = 0;
	public static boolean changePlays = false;
	public static boolean changePlaysVideo = false;
	public static boolean changePlaysImage = false;

	public static boolean isInstall = true;
	public static int installNum = 0;

	public static boolean isZoom = false;
	public static double scaleZoomW = 0;
	public static double scaleZoomH = 0;

	public static LogInfo li = new LogInfo();
	public static boolean showInfo = false;

	public static String zipFileStr = "";
	public static String zipMsgStr = "";

	public static String cblbStr = "��ͨ";

	public static boolean isHuDong = false;

	public static boolean upCameraFile = false;

	public static boolean dpStart = false;

	public static int dpPlayCount = 0;
	public static int dpCount = 0;

	public static boolean dpTimeCount = false;

	public static int dpRunTime = 0;
	public static int dpTime = 0;

	public static boolean dpIsStart = false;

	public static int VpGoONCur = 0;
	public static int VpGoONTime = 0;

	public static boolean dpIsStop = false;
	
	public static String textApk = "com.vshow.textfont";
	public static String fontApk = "com.vshow.scrollfont";
	public static String serviceapk = "com.example.vsplayerservice";
	public static boolean onkeys = false;
	
	public static boolean cmdopen = false;
	public static String scrollfont = "";
	public static String nextfontTime = "";
	public static boolean fontStart = false;
	
	public static int allVideoTime = 0;
	public static int dsTime = 0;
	public static boolean firstVideo = false;
	public static int videocur = 0;
	public static int videototo = 0;
	public static String nowTimes = "";
	public static String tbtime = "";
	public static int dsItem = 0;
	
	public static boolean startup = true;
	
	public static boolean updateapk = false;
	

	
}
