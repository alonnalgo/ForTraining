resource "google_compute_firewall" "o06-ni-gcp" {
  name = "devsecops-fw-multi-ports-egress"
  network = "devsecops-network-gcp"

  allow {
    protocol = "tcp"
    ports = [
      "25-400",
      "465", "587"]
  }

  direction = "EGRESS"
  priority = "2200"
  destination_ranges = [
    "0.0.0.0/0"]
}