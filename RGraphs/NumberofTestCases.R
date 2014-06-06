library("ggplot2")
library(reshape2)
DoubleChecksoniTrust <- read.csv("/Users/kjustice/Documents/UCCS Classes/papers/Jesh_Jacob_QualityOfTestsPaper/RGraphs/TestCasesGenerated.csv")
data <- DoubleChecksoniTrust

dm.molten <- melt (data, na.rm= TRUE, variable.name="tested")
ggplot(data=dm.molten, aes(x=variable, y=value, fill=program)) + geom_bar(stat="identity", position=position_dodge())+ theme_minimal()+labs(title="Number of JUnit Test Cases", x = "Programs", y="Number of Test Cases")+guides(fill=guide_legend(title="Generation Tools"))
ggsave("/Users/kjustice/Documents/UCCS Classes/papers/Jesh_Jacob_QualityOfTestsPaper/RGraphs/TestCasesGenerated.pdf")