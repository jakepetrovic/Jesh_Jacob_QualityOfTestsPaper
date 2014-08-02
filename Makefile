MAIN_FILE=qsic2014

all: $(MAIN_FILE).pdf

$(MAIN_FILE).pdf: $(wildcard *.tex) sample.bib
	pdflatex $(MAIN_FILE).tex
	bibtex $(MAIN_FILE)
	pdflatex $(MAIN_FILE).tex
	pdflatex $(MAIN_FILE).tex

clean:
	@rm -f *.log
	@rm -f *.out
	@rm -f *.aux
	@rm -f *.toc
	@rm -f *.bbl
	@rm -f *.blg
	@rm -f *.maf

realclean: clean
	@rm -f $(MAIN_FILE).pdf

