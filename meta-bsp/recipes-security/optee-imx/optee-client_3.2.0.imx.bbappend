SRCBRANCH = "lf-5.4.y"
SRCREV = "71a9bef78fff2d5d4db8a2307d3b91e2aa671dc9" 

SRC_URI_remove = "file://0001-libteec-refactor-_dprintf.patch"

EXTRA_OEMAKE_remove = "CFG_SECURE_DATA_PATH=y"
