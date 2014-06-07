library("ggplot2")
#DoubleChecksoniTrust <- read.csv("/Users/kjustice/Documents/UCCS Classes/papers/Jesh_Jacob_QualityOfTestsPaper/RGraphs/LOC_versus_Mutation.csv")
DoubleChecksoniTrust <- read.csv("D:/Documents/GitHub/Paper/Jesh_Jacob_QualityOfTestsPaper/RGraphs/LOC_versus_Mutation.csv")
data <- DoubleChecksoniTrust

# CodePro ---------------------------------------------------------
p1 <- ggplot(data, aes(x=CPLOC, y=CPMutation))
p2 <- p1 + theme_bw()
p3 <- p2 + labs(title="Mutation Score versus LOC- CodePro", x = "LOC", y="Mutation Score (%)")

p4_line <- p3 + geom_smooth(method="lm",formula = y~ x)
p4_poly <- p3 + geom_smooth(method="lm",formula = y~ poly(x,2))

lm_poly_eqn = function(df){
m=lm(CPMutation ~ poly(CPLOC, 2), df)#2nd degree polynomial
eq <- substitute(italic(y) == a + b %.% italic(x)* + c %.% italic(x)^2* ","~~italic(r)^2~"="~r2,
list(a = format(coef(m)[1], digits = 2),
b = format(coef(m)[2], digits = 2),
c = format(coef(m)[3], digits = 2),
r2 = format(summary(m)$r.squared, digits = 3)))
as.character(as.expression(eq))
}

lm_line_eqn = function(df){
m=lm(CPMutation ~ CPLOC, df)#2nd degree polynomial-- need to fix
eq <- substitute(italic(y) == a + b %.% italic(x)*","~~italic(r)^2~"="~r2,
list(a = format(coef(m)[1], digits = 2),
b = format(coef(m)[2], digits = 2),
c = format(coef(m)[3], digits = 2),
r2 = format(summary(m)$r.squared, digits = 3)))
as.character(as.expression(eq))
}

p5_line <- p4_line + annotate("text", x=.5, y=50, label=lm_line_eqn(data), hjust=0, size=6, family="Times", face="italic", parse=TRUE)
p5_poly <- p4_poly + annotate("text", x=.5, y=50, label=lm_poly_eqn(data), hjust=0, size=6, family="Times", face="italic", parse=TRUE)

p5_line + geom_point()
ggsave("D:/Documents/GitHub/Paper/Jesh_Jacob_QualityOfTestsPaper/RGraphs/CodePro_LOC_versus_Mutation_line.pdf")
p5_poly + geom_point()
ggsave("D:/Documents/GitHub/Paper/Jesh_Jacob_QualityOfTestsPaper/RGraphs/CodePro_LOC_versus_Mutation_poly.pdf")

# Manual ---------------------------------------------------------
p1 <- ggplot(data, aes(x=MLOC, y=MMutation))
p2 <- p1 + theme_bw()
p3 <- p2 + labs(title="Mutation Score versus LOC- Manual", x = "LOC", y="Mutation Score (%)")

p4_line <- p3 + geom_smooth(method="lm",formula = y~ x)
p4_poly <- p3 + geom_smooth(method="lm",formula = y~ poly(x,2))

lm_poly_eqn = function(df){
m=lm(MMutation ~ poly(MLOC, 2), df)#2nd degree polynomial
eq <- substitute(italic(y) == a + b %.% italic(x)* + c %.% italic(x)^2* ","~~italic(r)^2~"="~r2,
list(a = format(coef(m)[1], digits = 2),
b = format(coef(m)[2], digits = 2),
c = format(coef(m)[3], digits = 2),
r2 = format(summary(m)$r.squared, digits = 3)))
as.character(as.expression(eq))
}

lm_line_eqn = function(df){
m=lm(MMutation ~ MLOC, df)#2nd degree polynomial-- need to fix
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
ggsave("D:/Documents/GitHub/Paper/Jesh_Jacob_QualityOfTestsPaper/RGraphs/Manual_LOC_versus_Mutation_line.pdf")
p5_poly + geom_point()
ggsave("D:/Documents/GitHub/Paper/Jesh_Jacob_QualityOfTestsPaper/RGraphs/Manual_LOC_versus_Mutation_poly.pdf")


# Evosuite ---------------------------------------------------------
p1 <- ggplot(data, aes(x=ELOC, y=EMutation))
p2 <- p1 + theme_bw()
p3 <- p2 + labs(title="Mutation Score versus LOC- Evosuite", x = "LOC", y="Mutation Score (%)")

p4_line <- p3 + geom_smooth(method="lm",formula = y~ x)
p4_poly <- p3 + geom_smooth(method="lm",formula = y~ poly(x,2))

lm_poly_eqn = function(df){
m=lm(EMutation ~ poly(ELOC, 2), df)#2nd degree polynomial
eq <- substitute(italic(y) == a + b %.% italic(x)* + c %.% italic(x)^2* ","~~italic(r)^2~"="~r2,
list(a = format(coef(m)[1], digits = 2),
b = format(coef(m)[2], digits = 2),
c = format(coef(m)[3], digits = 2),
r2 = format(summary(m)$r.squared, digits = 3)))
as.character(as.expression(eq))
}

lm_line_eqn = function(df){
m=lm(EMutation ~ ELOC, df)#2nd degree polynomial-- need to fix
eq <- substitute(italic(y) == a + b %.% italic(x)*","~~italic(r)^2~"="~r2,
list(a = format(coef(m)[1], digits = 2),
b = format(coef(m)[2], digits = 2),
c = format(coef(m)[3], digits = 2),
r2 = format(summary(m)$r.squared, digits = 3)))
as.character(as.expression(eq))
}

p5_line <- p4_line + annotate("text", x=.5, y=85, label=lm_line_eqn(data), hjust=0, size=6, family="Times", face="italic", parse=TRUE)
p5_poly <- p4_poly + annotate("text", x=.5, y=85, label=lm_poly_eqn(data), hjust=0, size=6, family="Times", face="italic", parse=TRUE)

p5_line + geom_point()
ggsave("D:/Documents/GitHub/Paper/Jesh_Jacob_QualityOfTestsPaper/RGraphs/Evosuite_LOC_versus_Mutation_line.pdf")
p5_poly + geom_point()
ggsave("D:/Documents/GitHub/Paper/Jesh_Jacob_QualityOfTestsPaper/RGraphs/Evosuite_LOC_versus_Mutation_poly.pdf")
