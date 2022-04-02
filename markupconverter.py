import re
print("Please select a markup file to convert (include file extension): ")
fileselect = input()
inputmarkup = open("markup//" + fileselect, "r", encoding="utf8")
outputmarkup = open("output//" + fileselect, "w")

#Strings can be both bold and italic
#Internal links are double bracket wrapped
#External links are single bracket wrapped

def formatLines():
    for line in inputmarkup:

        bold = re.sub("'''", "**", line) 
        line = bold
        #Check if line has bolded start text


        #Check if line starts a link
        start_link = re.sub("\[\[", "[title](link) ", line)
        line = start_link

        #Check if line is a link and delete the ending tag
        end_link = re.sub("\]\]", "", line)
        line = end_link

        #Check if line is in italics
        italics = re.sub("''", "_", line)
        line = italics

        #Check if line is both bold and in italics
        start_bolditalics = re.sub("'''''", "_**", line, 1)
        line = start_bolditalics
        
        end_bolditalics = re.sub("'''''", "**_", line, 1)
        line = end_bolditalics
        

        outputmarkup.write(line)
formatLines()
input("Finished. Press Enter to continue...")
