package JavaInnerClass.Exception.Log;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class MyLogger {
	
	/*
	 * loggin 
	 * �ý��� ��� ���� ���
	 * ������ �߻� ���� �� �� ������ ���� ����� ���� ������������ϰ� ��
	 * �α� ���Ͽ� ����ϴ� �ڵ带 �߰��Ͽ� �ʿ��� ������ �α׷� ���� �� �ֵ��� �Ѵ�.
	 * �����, �ý��� ���� ����, ����, ������ ������ ���� ���
	 * 
	 * ����������� �α׸� ���� ���ΰ�?
	 * �ʹ� ���� �α� : ��Ȯ�� �ý����� ��Ȳ�� �ľ��ϱ� �����
	 * �ʹ� ���� �α� : ����� file I/O�� �������� �α� ������ ��� ���� ��
	 * 
	 * util.logging
	 * �ڹٿ��� �⺻������ �����Ǵ� log package
	 * �����̳� �ֿܼ� �α� ������ ����� �� ����
	 * jre/lib/logging.properties ������ �����Ͽ� �α��� ��¹�� �α� ������ ���� �� �� ����
	 * logging ��Ű������ �����ϴ� �α� ������ severe, warning, info, config, fine, finer, finest
	 * ���� �ҽ��δ� log4j ���
	 *  
	 * �ó�����
	 * �л� ���� �ý��ۿ� �α׸� ���
	 * �̸��� ������ �ִ°�� ���� ó���ϰ� ���� ��Ȳ�� �α׷� ����
	 * �л� �̸��� null�̰ų� �߰��� space�� 3�� �̻��� ��� ������ �߻��Ѵ�.
	 * 
	 * �����ϱ�
	 * Logger �ν��Ͻ��� �����Ѵ�
	 * �α׸� ����� ���� FileHandler�� �����Ѵ�
	 * FileHandelr�� level�� �����ϰ� Logger�� ������ add Handler()�޼���� FileHandler�� �߰��Ѵ�
	 * 
	 * */
	
	Logger logger = Logger.getLogger("mylogger");
	private static MyLogger instance = new MyLogger();
	
	public static final String errorLog = "log.txt";
	public static final String warningLog = "warning.txt";
	public static final String fineLog = "fine.txt";
	
	private FileHandler logFile = null;
	private FileHandler warningFile = null;
	private FileHandler fineFile = null;

	private MyLogger(){
	
			try {
				logFile = new FileHandler(errorLog, true);
				warningFile = new FileHandler(warningLog, true);
				fineFile = new FileHandler(fineLog, true);
				
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
			logFile.setFormatter(new SimpleFormatter());
			warningFile.setFormatter(new SimpleFormatter());
			fineFile.setFormatter(new SimpleFormatter());
			
			logger.setLevel(Level.ALL);
			fineFile.setLevel(Level.FINE);
			warningFile.setLevel(Level.WARNING);
			
			logger.addHandler(logFile);
			logger.addHandler(warningFile);
			logger.addHandler(fineFile);
	}	
	
	
	public static MyLogger getLogger(){
		return instance;
	}

	
	public void log(String msg){
		
		logger.finest(msg);
		logger.finer(msg);
		logger.fine(msg);
		logger.config(msg);
		logger.info(msg);
		logger.warning(msg);
		logger.severe(msg);
		
	}
	
	public void fine(String msg){
		logger.fine(msg);
	}
	
	public void warning(String msg){
		logger.warning(msg);
	}
	
}
