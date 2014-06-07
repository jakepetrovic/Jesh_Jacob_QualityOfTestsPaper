library("ggplot2")
library(reshape2)
DoubleChecksoniTrust <- read.csv("/Users/kjustice/Documents/UCCS Classes/papers/Jesh_Jacob_QualityOfTestsPaper/RGraphs/Time.csv")
mydata <- DoubleChecksoniTrust

limits <- aes(ymax = mydata$upper, ymin = mydata$lower)
ggplot(data = mydata, aes(x = variable, fill = Program, y = value)) + geom_bar(position = "dodge", 
    stat = "identity") + geom_errorbar(limits, width = 0.9, position = "dodge")+ theme_minimal()+labs(title="Time of Test Generation", x = "Programs", y="Time for Generation (s)")


ggsave("/Users/kjustice/Documents/UCCS Classes/papers/Jesh_Jacob_QualityOfTestsPaper/RGraphs/TestCasesGenerated.pdf")