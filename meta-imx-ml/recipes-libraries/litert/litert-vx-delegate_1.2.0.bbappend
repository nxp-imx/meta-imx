FILESEXTRAPATHS:prepend := "${THISDIR}/litert:"

require litert-${PV}.inc

SRCBRANCH_vx = "imx-v2.18.0"
SRCREV_vx = "b8c95c9a1b22461307b280f90618d879b547491e"

SRC_URI:append = " file://0001-fixup-Fix-source-sha256-mismatch-issue-for-KleidiAI.patch;patchdir=../litertgit"
