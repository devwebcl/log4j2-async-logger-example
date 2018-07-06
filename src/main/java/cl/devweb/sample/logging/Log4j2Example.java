package cl.devweb.sample.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*  Based on:
 *  https://memorynotfound.com/create-configure-log4j2-async-logger/
 *  https://dzone.com/articles/asynchronous-logging-with-log4j-2
 *  https://logging.apache.org/log4j/2.0/manual/async.html
 *  https://logging.apache.org/log4j/2.x/manual/appenders.html#RollingRandomAccessFileAppender
 *  
 *  VM Arguments:
 *  -DLog4jContextSelector=org.apache.logging.log4j.core.async.AsyncLoggerContextSelector
 * 
 */


public class Log4j2Example {

    private static final Logger LOG = LogManager.getLogger(Log4j2Example.class);

    
    public static void main(String[] args){
    	
        LOG.debug("This will be printed on debug");
        LOG.info("This will be printed on info");
        LOG.warn("This will be printed on warn");
        LOG.error("This will be printed on error");
        LOG.fatal("This will be printed on fatal");

        LOG.info("Appending string: {}.", "Hello, World");
        
        LOG.info("LogManager.getContext() {}", LogManager.getContext() );
        
        /*
         * [German@KDU log4j2-async-logger-example]$ cat async.log 
				DEBUG | 2018-07-03 15:09:17 | [main] ? (:) - This will be printed on debug
				INFO  | 2018-07-03 15:09:17 | [main] ? (:) - This will be printed on info
				WARN  | 2018-07-03 15:09:17 | [main] ? (:) - This will be printed on warn
				ERROR | 2018-07-03 15:09:17 | [main] ? (:) - This will be printed on error
				FATAL | 2018-07-03 15:09:17 | [main] ? (:) - This will be printed on fatal
				INFO  | 2018-07-03 15:09:17 | [main] ? (:) - Appending string: Hello, World.
				INFO  | 2018-07-03 15:09:17 | [main] ? (:) - LogManager.getContext() org.apache.logging.log4j.core.async.AsyncLoggerContext@2b1f80e2
         */
    }
}
