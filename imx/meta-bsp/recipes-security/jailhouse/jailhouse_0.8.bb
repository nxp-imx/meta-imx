require jailhouse.inc

SRC_URI = "git://github.com/siemens/jailhouse.git;protocol=git \
	  file://0004-no-kbuild-of-tools.patch \
	  file://0005-tools-makefile.patch \
	"

SRCREV = "07341fa315a7fabb38f07cd3c0b3fe880cffaa65"

CELLS = ""

