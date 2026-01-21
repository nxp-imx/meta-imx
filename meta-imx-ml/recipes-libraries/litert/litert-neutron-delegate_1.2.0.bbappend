FILESEXTRAPATHS:prepend := "${THISDIR}/litert:"

require litert-${PV}.inc

SRCBRANCH_neutron = "lf-6.18.2_1.0.0"
SRCREV_neutron = "bf9fa05c2baba96d5e27b7f067521a4c4eecdaae"

SRC_URI:append = " file://0001-fixup-Fix-source-sha256-mismatch-issue-for-KleidiAI.patch;patchdir=../litertgit"