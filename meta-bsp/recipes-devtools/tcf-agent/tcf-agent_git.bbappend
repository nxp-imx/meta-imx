# Fix 'systemctl stop tcf-agent' failed issue in tcf-agent.service file
#  https://patchwork.openembedded.org/patch/133588/

FILESEXTRAPATHS:prepend := "${THISDIR}/tcf-agent:"
