library("ggplot2")
library(reshape2)
DoubleChecksoniTrust <- read.csv("/Users/kjustice/Documents/UCCS Classes/papers/Jesh_Jacob_QualityOfTestsPaper/RGraphs/TestCasesGenerated.csv")
data <- DoubleChecksoniTrust

dm.molten <- melt (data, na.rm= TRUE, variable.name="tested")
p = (ggplot(data=dm.molten, aes(x=variable, y=value, fill=Program)) + geom_bar(stat="identity", position=position_dodge())+ theme_minimal()+labs(title="Number of JUnit Test Cases", x = "Programs", y="Number of Test Cases"))
p = p + guides(fill=guide_legend(title="Generation Tools"))
(p = p + scale_fill_grey(start = 0, end = .9))
p = p +theme_bw()

ggsave("/Users/kjustice/Documents/UCCS Classes/papers/Jesh_Jacob_QualityOfTestsPaper/RGraphs/TestCasesGenerated.pdf", height = 7, width = 11)