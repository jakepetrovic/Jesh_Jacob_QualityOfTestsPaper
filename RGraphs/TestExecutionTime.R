library("ggplot2")
library(reshape2)
DoubleChecksoniTrust <- read.csv("/Users/kjustice/Documents/UCCS Classes/papers/Jesh_Jacob_QualityOfTestsPaper/execution_time.csv")

mydata <- DoubleChecksoniTrust
limits <- aes(ymax = mydata$upper, ymin = mydata$lower)
p = (ggplot(data = mydata, aes(x = variable, fill = program, y = value)) + geom_bar(position = "dodge", 
    stat = "identity") + geom_errorbar(limits, width = 0.9, position = "dodge")+ theme_minimal()+labs(title="Execution Time of JUnit Test Cases", x = "Programs", y="Execution Time (s)"))
p = p + guides(fill=guide_legend(title="Generation Tools"))
(p = p + scale_fill_grey(start = 0, end = .9))
p = p +theme_bw()

ggsave("/Users/kjustice/Documents/UCCS Classes/papers/Jesh_Jacob_QualityOfTestsPaper/RGraphs/TestExecutionTime.pdf", height = 7, width = 11)