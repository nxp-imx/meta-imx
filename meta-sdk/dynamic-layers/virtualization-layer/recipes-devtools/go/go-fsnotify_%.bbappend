# FIXME: Add nobranch option to SRC_URI to avoid the fetch failure
# as branch master is renamed to main.

SRC_URI = "git://${PKG_NAME}.git;nobranch=1"
