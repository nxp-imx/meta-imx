FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

require litert-${PV}.inc

SRC_URI:append = " file://0001-fixup-Fix-source-sha256-mismatch-issue-for-KleidiAI.patch"
