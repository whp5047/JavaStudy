package JavaInnerClass.Exception.Log;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class MyLogger {
	
	/*
	 * loggin 
	 * 시스템 운영에 대한 기록
	 * 오류가 발생 했을 때 그 오류에 대한 기록을 남겨 디버깅을용이하게 함
	 * 로그 파일에 기록하는 코드를 추가하여 필요한 정보가 로그로 남을 수 있도록 한다.
	 * 디버깅, 시스템 에러 추적, 성능, 문제점 향상들을 위해 사용
	 * 
	 * 어느정도까지 로그를 남길 것인가?
	 * 너무 적은 로그 : 정확한 시스템의 상황을 파악하기 어려움
	 * 너무 많은 로그 : 빈번한 file I/O의 오버헤드와 로그 파일의 백업 문제 등
	 * 
	 * util.logging
	 * 자바에서 기본적으로 제공되는 log package
	 * 파일이나 콘솔에 로그 내용을 출력할 수 있음
	 * jre/lib/logging.properties 파일을 편집하여 로그의 출력방식 로그 레벨을 변경 할 수 있음
	 * logging 패키지에서 제공하는 로그 레벨은 severe, warning, info, config, fine, finer, finest
	 * 오픈 소스로는 log4j 사용
	 *  
	 * 시나리오
	 * 학생 정보 시스템에 로그를 기록
	 * 이름에 오류가 있는경우 예외 처리하고 예외 상황을 로그로 남김
	 * 학생 이름은 null이거나 중간에 space가 3개 이상인 경우 오류가 발생한다.
	 * 
	 * 구현하기
	 * Logger 인스턴스를 생성한다
	 * 로그를 남기기 위한 FileHandler를 생성한다
	 * FileHandelr의 level을 지정하고 Logger에 생성된 add Handler()메서드로 FileHandler를 추가한다
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
