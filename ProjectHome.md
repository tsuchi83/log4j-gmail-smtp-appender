# Abstract #
Log4j gives SMTPAppender for sending emails on logging. This SMTP Appender works good in  most of the cases, except TLS/SSL SMTP setups. Gmail works on the same SSL/TLS setup, so any one who wants to configure the default log4j SMTPAppender with Gmail will be troubled with strange Java Mail errors.

Though this problem can be easily solved by writing a Log4j Custom Appender. This project provides the same i.e. a Custom Gmail SMTPAppender

# Why another Appender for Gmail ? #
You must be wondering that why I wrote this appender, though you will get few if you will google around "Gmail Smpt Appender". Here are the reasons
  * Many of those suggest to write SMTPAppender and use an Email Utility class internally for sending emails. But this defeats the power of log4j configuration driven appenders. This Gmail Appender is having no extra configuration params and just uses the same standard SMTP Appender configurations.
  * Simple Extension and provides further extensibility. This appender extends the log4j's SMTPAppender and overrides the minimal required methods. Even the logic to prepare and transport the email is available for further specialized overriding if required.

# How to install and configure #
All the details can be found [here](http://www.tgerm.com/2010/05/log4j-smtpappender-gmail-custom.html)