PRINC := "${@int(PRINC) + 1}"

# Use the latest version at 26 Oct, 2013
SRCREV = "dcea43eba91642939c82739387147da26d572758"
SRC_URI = "git://git.infradead.org/mtd-utils.git \
		file://add-exclusion-to-mkfs-jffs2-git-2.patch \
"


