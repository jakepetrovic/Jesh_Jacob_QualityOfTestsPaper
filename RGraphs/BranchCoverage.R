library("ggplot2")
library(reshape2)
DoubleChecksoniTrust <- read.csv("BranchCoverage.csv")
mydata <- DoubleChecksoniTrust

limits <- aes(ymax = mydata$upper, ymin = mydata$lower)
p = (ggplot(data = mydata, aes(x = variable, fill = Program, y = value)) + geom_bar(position = "dodge",
    stat = "identity") + geom_errorbar(limits, width = 0.9, position = "dodge")+ theme_minimal()+labs(title="Branch Coverage for All Test Suites", x = "Programs", y="Branch Coverage (%)"))
p = p + guides(fill=guide_legend(title="Generation Tools"))
(p = p + scale_fill_grey(start = 0, end = .9))
p = p +theme_bw()

ggsave("BranchCoverage.pdf", height = 7, width = 17)
