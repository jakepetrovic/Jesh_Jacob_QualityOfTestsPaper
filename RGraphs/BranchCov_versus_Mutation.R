library("ggplot2")
DoubleChecksoniTrust <- read.csv("/Users/kjustice/Documents/UCCS Classes/papers/Jesh_Jacob_QualityOfTestsPaper/RGraphs/BranchCov_versus_Mutation.csv")
data <- DoubleChecksoniTrust

# CodePro ---------------------------------------------------------
p1 <- ggplot(data, aes(x=CPBranchCov, y=CPMutation))
p2 <- p1 + theme_bw()
p3 <- p2 + labs(title="Branch Coverage versus Mutation Score- CodePro", x = "Branch Coverage (%)", y="Mutation Score (%)")

p4_line <- p3 + geom_smooth(method="lm",formula = y~ x)
p4_poly <- p3 + geom_smooth(method="lm",formula = y~ poly(x,2))

lm_poly_eqn = function(df){
m=lm(CPMutation ~ poly(CPBranchCov, 2), df)#2nd degree polynomial
eq <- substitute(italic(y) == a + b %.% italic(x)* + c %.% italic(x)^2* ","~~italic(r)^2~"="~r2,
list(a = format(coef(m)[1], digits = 2),
b = format(coef(m)[2], digits = 2),
c = format(coef(m)[3], digits = 2),
r2 = format(summary(m)$r.squared, digits = 3)))
as.character(as.expression(eq))
}

lm_line_eqn = function(df){
m=lm(CPMutation ~ CPBranchCov, df)#2nd degree polynomial-- need to fix
eq <- substitute(italic(y) == a + b %.% italic(x)*","~~italic(r)^2~"="~r2,
list(a = format(coef(m)[1], digits = 2),
b = format(coef(m)[2], digits = 2),
c = format(coef(m)[3], digits = 2),
r2 = format(summary(m)$r.squared, digits = 3)))
as.character(as.expression(eq))
}

p5_line <- p4_line + annotate("text", x=.5, y=45, label=lm_line_eqn(data), hjust=0, size=6, family="Times", face="italic", parse=TRUE)
p5_poly <- p4_poly + annotate("text", x=.5, y=45, label=lm_poly_eqn(data), hjust=0, size=6, family="Times", face="italic", parse=TRUE)

p5_line + geom_point()
ggsave("/Users/kjustice/Documents/UCCS Classes/papers/Jesh_Jacob_QualityOfTestsPaper/RGraphs/CodePro_BranchCov_versus_Mutation_line.pdf")
p5_poly + geom_point()
ggsave("/Users/kjustice/Documents/UCCS Classes/papers/Jesh_Jacob_QualityOfTestsPaper/RGraphs/CodePro_BranchCov_versus_Mutation_poly.pdf")

# Manual ---------------------------------------------------------
p1 <- ggplot(data, aes(x=MBranchCov, y=MMutation))
p2 <- p1 + theme_bw()
p3 <- p2 + labs(title="Branch Coverage versus Mutation Score- Manual", x = "Branch Coverage (%)", y="Mutation Score (%)")

p4_line <- p3 + geom_smooth(method="lm",formula = y~ x)
p4_poly <- p3 + geom_smooth(method="lm",formula = y~ poly(x,2))

lm_poly_eqn = function(df){
m=lm(MMutation ~ poly(MBranchCov, 2), df)#2nd degree polynomial
eq <- substitute(italic(y) == a + b %.% italic(x)* + c %.% italic(x)^2* ","~~italic(r)^2~"="~r2,
list(a = format(coef(m)[1], digits = 2),
b = format(coef(m)[2], digits = 2),
c = format(coef(m)[3], digits = 2),
r2 = format(summary(m)$r.squared, digits = 3)))
as.character(as.expression(eq))
}

lm_line_eqn = function(df){
m=lm(MMutation ~ MBranchCov, df)#2nd degree polynomial-- need to fix
eq <- substitute(italic(y) == a + b %.% italic(x)*","~~italic(r)^2~"="~r2,
list(a = format(coef(m)[1], digits = 2),
b = format(coef(m)[2], digits = 2),
c = format(coef(m)[3], digits = 2),
r2 = format(summary(m)$r.squared, digits = 3)))
as.character(as.expression(eq))
}

p5_line <- p4_line + annotate("text", x=.5, y=75, label=lm_line_eqn(data), hjust=0, size=6, family="Times", face="italic", parse=TRUE)
p5_poly <- p4_poly + annotate("text", x=.5, y=75, label=lm_poly_eqn(data), hjust=0, size=6, family="Times", face="italic", parse=TRUE)

p5_line + geom_point()
ggsave("/Users/kjustice/Documents/UCCS Classes/papers/Jesh_Jacob_QualityOfTestsPaper/RGraphs/Manual_BranchCov_versus_Mutation_line.pdf")
p5_poly + geom_point()
ggsave("/Users/kjustice/Documents/UCCS Classes/papers/Jesh_Jacob_QualityOfTestsPaper/RGraphs/Manual_BranchCov_versus_Mutation_poly.pdf")


# Evosuite ---------------------------------------------------------
p1 <- ggplot(data, aes(x=EBranchCov, y=EMutation))
p2 <- p1 + theme_bw()
p3 <- p2 + labs(title="Branch Coverage versus Mutation Score- Evosuite", x = "Branch Coverage (%)", y="Mutation Score (%)")

p4_line <- p3 + geom_smooth(method="lm",formula = y~ x)
p4_poly <- p3 + geom_smooth(method="lm",formula = y~ poly(x,2))

lm_poly_eqn = function(df){
m=lm(EMutation ~ poly(EBranchCov, 2), df)#2nd degree polynomial
eq <- substitute(italic(y) == a + b %.% italic(x)* + c %.% italic(x)^2* ","~~italic(r)^2~"="~r2,
list(a = format(coef(m)[1], digits = 2),
b = format(coef(m)[2], digits = 2),
c = format(coef(m)[3], digits = 2),
r2 = format(summary(m)$r.squared, digits = 3)))
as.character(as.expression(eq))
}

lm_line_eqn = function(df){
m=lm(EMutation ~ EBranchCov, df)#2nd degree polynomial-- need to fix
eq <- substitute(italic(y) == a + b %.% italic(x)*","~~italic(r)^2~"="~r2,
list(a = format(coef(m)[1], digits = 2),
b = format(coef(m)[2], digits = 2),
c = format(coef(m)[3], digits = 2),
r2 = format(summary(m)$r.squared, digits = 3)))
as.character(as.expression(eq))
}

p5_line <- p4_line + annotate("text", x=.5, y=80, label=lm_line_eqn(data), hjust=0, size=6, family="Times", face="italic", parse=TRUE)
p5_poly <- p4_poly + annotate("text", x=.5, y=80, label=lm_poly_eqn(data), hjust=0, size=6, family="Times", face="italic", parse=TRUE)

p5_line + geom_point()
ggsave("/Users/kjustice/Documents/UCCS Classes/papers/Jesh_Jacob_QualityOfTestsPaper/RGraphs/Evosuite_BranchCov_versus_Mutation_line.pdf")
p5_poly + geom_point()
ggsave("/Users/kjustice/Documents/UCCS Classes/papers/Jesh_Jacob_QualityOfTestsPaper/RGraphs/Evosuite_BranchCov_versus_Mutation_poly.pdf")
