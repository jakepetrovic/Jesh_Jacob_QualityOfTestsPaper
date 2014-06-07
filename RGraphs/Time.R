library("ggplot2")
library(reshape2)
DoubleChecksoniTrust <- read.csv("/Users/kjustice/Documents/UCCS Classes/papers/Jesh_Jacob_QualityOfTestsPaper/RGraphs/Time.csv")
data <- DoubleChecksoniTrust

dm.molten <- melt (data, na.rm= TRUE, variable.name="tested")
ggplot(data=dm.molten, aes(x=variable, y=value, fill=Program)) + geom_bar(stat="identity", position=position_dodge())+ theme_minimal()+labs(title="Time of Test Case Generation", x = "Programs", y="Time to Generate (s)")
#+guides(fill=guide_legend(title="Generation Tools"))+ 
#    geom_bar(position=position_dodge(), stat="identity") +
#    geom_errorbar(aes(ymin=len-se, ymax=len+se),
#                  width=.2,                    # Width of the error bars
#                  position=position_dodge(.9))

ggsave("/Users/kjustice/Documents/UCCS Classes/papers/Jesh_Jacob_QualityOfTestsPaper/RGraphs/TestCasesGenerated.pdf")