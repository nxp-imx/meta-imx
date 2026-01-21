FILESEXTRAPATHS:prepend := "${THISDIR}/litert:"

require litert-${PV}.inc

SRCBRANCH_ethosu = "master"
SRCREV_ethosu = "ee3197d963c94f485faeb1a4d98b4e1e4204f8d5" 

SRC_URI:append = " file://0001-fixup-Fix-source-sha256-mismatch-issue-for-KleidiAI.patch;patchdir=../litertgit"
