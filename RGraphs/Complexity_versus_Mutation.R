library("ggplot2")
DoubleChecksoniTrust <- read.csv("/Users/kjustice/Documents/UCCS Classes/papers/Jesh_Jacob_QualityOfTestsPaper/RGraphs/Complexity_versus_Mutation.csv")
data <- DoubleChecksoniTrust

# CodePro ---------------------------------------------------------
p1 <- ggplot(data, aes(x=CPMutation, y=CPComplexity))
p2 <- p1 + theme_bw()
p3 <- p2 + labs(title="Cyclomatic Complexity vs Mutation Score- CodePro", x = "Mutation Score (%)", y="Cyclomatic Complexity")

p4_line <- p3 + geom_smooth(method="lm",formula = y~ x)
p4_poly <- p3 + geom_smooth(method="lm",formula = y~ poly(x,2))

lm_poly_eqn = function(df){
m=lm(CPComplexity ~ poly(CPMutation, 2), df)#2nd degree polynomial
eq <- substitute(italic(y) == a + b %.% italic(x)* + c %.% italic(x)^2* ","~~italic(r)^2~"="~r2,
list(a = format(coef(m)[1], digits = 2),
b = format(coef(m)[2], digits = 2),
c = format(coef(m)[3], digits = 2),
r2 = format(summary(m)$r.squared, digits = 3)))
as.character(as.expression(eq))
}

lm_line_eqn = function(df){
m=lm(CPComplexity ~ CPMutation, df)#2nd degree polynomial-- need to fix
eq <- substitute(italic(y) == a + b %.% italic(x)*","~~italic(r)^2~"="~r2,
list(a = format(coef(m)[1], digits = 2),
b = format(coef(m)[2], digits = 2),
c = format(coef(m)[3], digits = 2),
r2 = format(summary(m)$r.squared, digits = 3)))
as.character(as.expression(eq))
}

p5_line <- p4_line + annotate("text", x=.5, y=4, label=lm_line_eqn(data), hjust=0, size=6, family="Times", face="italic", parse=TRUE)
p5_poly <- p4_poly + annotate("text", x=.5, y=4, label=lm_poly_eqn(data), hjust=0, size=6, family="Times", face="italic", parse=TRUE)

p5_line + geom_point()
ggsave("/Users/kjustice/Documents/UCCS Classes/papers/Jesh_Jacob_QualityOfTestsPaper/RGraphs/CodePro_Complexity_versus_Mutation_line.pdf")
p5_poly + geom_point()
ggsave("/Users/kjustice/Documents/UCCS Classes/papers/Jesh_Jacob_QualityOfTestsPaper/RGraphs/CodePro_Complexity_versus_Mutation_poly.pdf")

# Manual ---------------------------------------------------------
p1 <- ggplot(data, aes(x=MMutation, y=MComplexity))
p2 <- p1 + theme_bw()
p3 <- p2 + labs(title="Cyclomatic Complexity vs Mutation Score- Manual", x = "Mutation Score (%)", y="Cyclomatic Complexity")

p4_line <- p3 + geom_smooth(method="lm",formula = y~ x)
p4_poly <- p3 + geom_smooth(method="lm",formula = y~ poly(x,2))

lm_poly_eqn = function(df){
m=lm(MComplexity ~ poly(MMutation, 2), df)#2nd degree polynomial
eq <- substitute(italic(y) == a + b %.% italic(x)* + c %.% italic(x)^2* ","~~italic(r)^2~"="~r2,
list(a = format(coef(m)[1], digits = 2),
b = format(coef(m)[2], digits = 2),
c = format(coef(m)[3], digits = 2),
r2 = format(summary(m)$r.squared, digits = 3)))
as.character(as.expression(eq))
}

lm_line_eqn = function(df){
m=lm(MMutation ~ MComplexity, df)#2nd degree polynomial-- need to fix
eq <- substitute(italic(y) == a + b %.% italic(x)*","~~italic(r)^2~"="~r2,
list(a = format(coef(m)[1], digits = 2),
b = format(coef(m)[2], digits = 2),
c = format(coef(m)[3], digits = 2),
r2 = format(summary(m)$r.squared, digits = 3)))
as.character(as.expression(eq))
}

p5_line <- p4_line + annotate("text", x=.5, y=4, label=lm_line_eqn(data), hjust=0, size=6, family="Times", face="italic", parse=TRUE)
p5_poly <- p4_poly + annotate("text", x=.5, y=4, label=lm_poly_eqn(data), hjust=0, size=6, family="Times", face="italic", parse=TRUE)

p5_line + geom_point()
ggsave("/Users/kjustice/Documents/UCCS Classes/papers/Jesh_Jacob_QualityOfTestsPaper/RGraphs/Manual_Complexity_versus_Mutation_line.pdf")
p5_poly + geom_point()
ggsave("/Users/kjustice/Documents/UCCS Classes/papers/Jesh_Jacob_QualityOfTestsPaper/RGraphs/Manual_Complexity_versus_Mutation_poly.pdf")


# Evosuite ---------------------------------------------------------
p1 <- ggplot(data, aes(x=EMutation, y=EComplexity))
p2 <- p1 + theme_bw()
p3 <- p2 + labs(title="Cyclomatic Complexity vs Mutation Score- Evosuite", x = "Mutation Score (%)", y="Cyclomatic Complexity")

p4_line <- p3 + geom_smooth(method="lm",formula = y~ x)
p4_poly <- p3 + geom_smooth(method="lm",formula = y~ poly(x,2))

lm_poly_eqn = function(df){
m=lm(EComplexity ~ poly(EMutation, 2), df)#2nd degree polynomial
eq <- substitute(italic(y) == a + b %.% italic(x)* + c %.% italic(x)^2* ","~~italic(r)^2~"="~r2,
list(a = format(coef(m)[1], digits = 2),
b = format(coef(m)[2], digits = 2),
c = format(coef(m)[3], digits = 2),
r2 = format(summary(m)$r.squared, digits = 3)))
as.character(as.expression(eq))
}

lm_line_eqn = function(df){
m=lm(EMutation ~ EComplexity, df)#2nd degree polynomial-- need to fix
eq <- substitute(italic(y) == a + b %.% italic(x)*","~~italic(r)^2~"="~r2,
list(a = format(coef(m)[1], digits = 2),
b = format(coef(m)[2], digits = 2),
c = format(coef(m)[3], digits = 2),
r2 = format(summary(m)$r.squared, digits = 3)))
as.character(as.expression(eq))
}

p5_line <- p4_line + annotate("text", x=.5, y=4, label=lm_line_eqn(data), hjust=0, size=6, family="Times", face="italic", parse=TRUE)
p5_poly <- p4_poly + annotate("text", x=.5, y=4, label=lm_poly_eqn(data), hjust=0, size=6, family="Times", face="italic", parse=TRUE)

p5_line + geom_point()
ggsave("/Users/kjustice/Documents/UCCS Classes/papers/Jesh_Jacob_QualityOfTestsPaper/RGraphs/Evosuite_Complexity_versus_Mutation_line.pdf")
p5_poly + geom_point()
ggsave("/Users/kjustice/Documents/UCCS Classes/papers/Jesh_Jacob_QualityOfTestsPaper/RGraphs/Evosuite_Complexity_versus_Mutation_poly.pdf")
