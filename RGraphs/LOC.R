library("ggplot2")
library(reshape2)
DoubleChecksoniTrust <- read.csv("LOC.csv")
mydata <- DoubleChecksoniTrust

limits <- aes(ymax = mydata$upper, ymin = mydata$lower)
p = (ggplot(data = mydata, aes(x = variable, fill = Program, y = value)) + geom_bar(position = "dodge",
    stat = "identity") + geom_errorbar(limits, width = 0.9, position = "dodge")+ theme_bw()+labs(title="LOC of Test Suites and Source Code", x = "Programs", y="LOC"))
p = p + guides(fill=guide_legend(title="Code Considered"))
(p = p + scale_fill_grey(start = 0, end = .9))

ggsave("LOC.pdf", height = 7, width = 17)
