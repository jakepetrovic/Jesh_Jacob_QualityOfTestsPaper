library("ggplot2")
DoubleChecksoniTrust <- read.csv("/Users/kjustice/Documents/UCCS Classes/papers/Jesh_Jacob_QualityOfTestsPaper/RGraphs/TCcountLOC.csv")
data <- DoubleChecksoniTrust

# CodePro ---------------------------------------------------------
p1 <- ggplot(data, aes(x=CPTestCases, y=CPLOC))
p2 <- p1 + theme_bw()
p3 <- p2 + labs(title="Number of Test Cases versus LOC- CodePro", x = "Number of Generated Test Cases", y="Number of LOC")

p4_line <- p3 + geom_smooth(method="lm",formula = y~ x)
p4_poly <- p3 + geom_smooth(method="lm",formula = y~ poly(x,2))

lm_poly_eqn = function(df){
m=lm(CPLOC ~ poly(CPTestCases, 2), df)#2nd degree polynomial
eq <- substitute(italic(y) == a + b %.% italic(x)* + c %.% italic(x)^2* ","~~italic(r)^2~"="~r2,
list(a = format(coef(m)[1], digits = 2),
b = format(coef(m)[2], digits = 2),
c = format(coef(m)[3], digits = 2),
r2 = format(summary(m)$r.squared, digits = 3)))
as.character(as.expression(eq))
}

lm_line_eqn = function(df){
m=lm(CPLOC ~ CPTestCases, df)#2nd degree polynomial-- need to fix
eq <- substitute(italic(y) == a + b %.% italic(x)*","~~italic(r)^2~"="~r2,
list(a = format(coef(m)[1], digits = 2),
b = format(coef(m)[2], digits = 2),
c = format(coef(m)[3], digits = 2),
r2 = format(summary(m)$r.squared, digits = 3)))
as.character(as.expression(eq))
}

p5_line <- p4_line + annotate("text", x=.5, y=18500, label=lm_line_eqn(data), hjust=0, size=6, family="Times", face="italic", parse=TRUE)
p5_poly <- p4_poly + annotate("text", x=.5, y=18500, label=lm_poly_eqn(data), hjust=0, size=6, family="Times", face="italic", parse=TRUE)

p5_line + geom_point()
ggsave("/Users/kjustice/Documents/UCCS Classes/papers/Jesh_Jacob_QualityOfTestsPaper/RGraphs/CodePro_TestsVersusLOC_line.pdf")
p5_poly + geom_point()
ggsave("/Users/kjustice/Documents/UCCS Classes/papers/Jesh_Jacob_QualityOfTestsPaper/RGraphs/CodePro_TestsVersusLOC_poly.pdf")

# Manual ---------------------------------------------------------
p1 <- ggplot(data, aes(x=MTestCases, y=MLOC))
p2 <- p1 + theme_bw()
p3 <- p2 + labs(title="Number of Test Cases versus LOC- Manual", x = "Number of Written Test Cases", y="Number of LOC")

p4_line <- p3 + geom_smooth(method="lm",formula = y~ x)
p4_poly <- p3 + geom_smooth(method="lm",formula = y~ poly(x,2))

lm_poly_eqn = function(df){
m=lm(MLOC ~ poly(MTestCases, 2), df)#2nd degree polynomial
eq <- substitute(italic(y) == a + b %.% italic(x)* + c %.% italic(x)^2* ","~~italic(r)^2~"="~r2,
list(a = format(coef(m)[1], digits = 2),
b = format(coef(m)[2], digits = 2),
c = format(coef(m)[3], digits = 2),
r2 = format(summary(m)$r.squared, digits = 3)))
as.character(as.expression(eq))
}

lm_line_eqn = function(df){
m=lm(MLOC ~ MTestCases, df)#2nd degree polynomial-- need to fix
eq <- substitute(italic(y) == a + b %.% italic(x)*","~~italic(r)^2~"="~r2,
list(a = format(coef(m)[1], digits = 2),
b = format(coef(m)[2], digits = 2),
c = format(coef(m)[3], digits = 2),
r2 = format(summary(m)$r.squared, digits = 3)))
as.character(as.expression(eq))
}

p5_line <- p4_line + annotate("text", x=.5, y=3000, label=lm_line_eqn(data), hjust=0, size=6, family="Times", face="italic", parse=TRUE)
p5_poly <- p4_poly + annotate("text", x=.5, y=3000, label=lm_poly_eqn(data), hjust=0, size=6, family="Times", face="italic", parse=TRUE)

p5_line + geom_point()
ggsave("/Users/kjustice/Documents/UCCS Classes/papers/Jesh_Jacob_QualityOfTestsPaper/RGraphs/Manual_TestsVersusLOC_line.pdf")
p5_poly + geom_point()
ggsave("/Users/kjustice/Documents/UCCS Classes/papers/Jesh_Jacob_QualityOfTestsPaper/RGraphs/Manual_TestsVersusLOC_poly.pdf")


# Evosuite ---------------------------------------------------------
p1 <- ggplot(data, aes(x=ETestCases, y=ELOC))
p2 <- p1 + theme_bw()
p3 <- p2 + labs(title="Number of Test Cases versus LOC- Evosuite", x = "Number of Generated Test Cases", y="Number of LOC")

p4_line <- p3 + geom_smooth(method="lm",formula = y~ x)
p4_poly <- p3 + geom_smooth(method="lm",formula = y~ poly(x,2))

lm_poly_eqn = function(df){
m=lm(ELOC ~ poly(ETestCases, 2), df)#2nd degree polynomial
eq <- substitute(italic(y) == a + b %.% italic(x)* + c %.% italic(x)^2* ","~~italic(r)^2~"="~r2,
list(a = format(coef(m)[1], digits = 2),
b = format(coef(m)[2], digits = 2),
c = format(coef(m)[3], digits = 2),
r2 = format(summary(m)$r.squared, digits = 3)))
as.character(as.expression(eq))
}

lm_line_eqn = function(df){
m=lm(ELOC ~ ETestCases, df)#2nd degree polynomial-- need to fix
eq <- substitute(italic(y) == a + b %.% italic(x)*","~~italic(r)^2~"="~r2,
list(a = format(coef(m)[1], digits = 2),
b = format(coef(m)[2], digits = 2),
c = format(coef(m)[3], digits = 2),
r2 = format(summary(m)$r.squared, digits = 3)))
as.character(as.expression(eq))
}

p5_line <- p4_line + annotate("text", x=.5, y=4000, label=lm_line_eqn(data), hjust=0, size=6, family="Times", face="italic", parse=TRUE)
p5_poly <- p4_poly + annotate("text", x=.5, y=4000, label=lm_poly_eqn(data), hjust=0, size=6, family="Times", face="italic", parse=TRUE)

p5_line + geom_point()
ggsave("/Users/kjustice/Documents/UCCS Classes/papers/Jesh_Jacob_QualityOfTestsPaper/RGraphs/Evosuite_TestsVersusLOC_line.pdf")
p5_poly + geom_point()
ggsave("/Users/kjustice/Documents/UCCS Classes/papers/Jesh_Jacob_QualityOfTestsPaper/RGraphs/Evosuite_TestsVersusLOC_poly.pdf")
